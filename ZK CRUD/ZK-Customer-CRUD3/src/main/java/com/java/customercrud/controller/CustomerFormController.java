package com.java.customercrud.controller;

import java.util.Date;
import java.util.Set;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import com.java.customercrud.model.Customer;
import com.java.customercrud.service.CustomerService;
import com.java.customercrud.service.CustomerServiceImpl;

public class CustomerFormController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;

	private CustomerService customerService = new CustomerServiceImpl();

	@Wire
	private Grid customerForm;

	@Wire
	private Label customerFormLabel;

	@Wire
	private Textbox idTextBox;

	@Wire
	private Textbox firstNameTextBox;

	@Wire
	private Textbox lastNameTextBox;

	@Wire
	private Datebox dateOfBirthTextBox;

	@Wire
	private Textbox mobileNumberTextBox;

	@Wire
	private Textbox addressOneTextBox;

	@Wire
	private Textbox addressTwoTextBox;

	@Wire
	private Textbox ageTextBox;

	@Wire
	private Listbox genderListBox;

	@Wire
	private Textbox emailTextBox;

	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		ListModelList<String> genderModel = new ListModelList<String>(customerService.getGenderList());
		genderListBox.setModel(genderModel);
		String customerId = idTextBox.getText();
		if (!customerId.equals("0")) {
			customerFormLabel.setValue("Update Customer");
			Long customerNumber = Long.parseLong(customerId);
			Customer customerData = customerService.getCustomerById(customerNumber);
			((ListModelList) genderListBox.getModel()).addToSelection(customerData.getGender());
			String oldDate = customerData.getDateOfBirth();
			Date newDate = new Date(oldDate);
			dateOfBirthTextBox.setValue(newDate);
		} else {
			customerFormLabel.setValue("Create Customer");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Listen("onClick = #saveCustomer")
	public void saveCustomer() {
		Set<String> selection = ((ListModelList) genderListBox.getModel()).getSelection();
		if (firstNameTextBox.getText().isEmpty()) {
			Clients.showNotification("First Name can't be empty!", firstNameTextBox);
			return;
		} else if (lastNameTextBox.getText().isEmpty()) {
			Clients.showNotification("Last Name can't be empty!", lastNameTextBox);
			return;
		} else if (dateOfBirthTextBox.getText().isEmpty()) {
			Clients.showNotification("Date Of Birth can't be empty!", dateOfBirthTextBox);
			return;
		} else if (mobileNumberTextBox.getText().isEmpty()) {
			Clients.showNotification("Mobile Number can't be empty!", mobileNumberTextBox);
			return;
		} else if (addressOneTextBox.getText().isEmpty()) {
			Clients.showNotification("Address can't be empty!", addressOneTextBox);
			return;
		} else if (ageTextBox.getText().isEmpty()) {
			Clients.showNotification("Age can't be empty!", ageTextBox);
			return;
		} else if (Integer.parseInt(ageTextBox.getValue()) > 200) {
			Clients.showNotification("Please enter age between 0 and 200!", ageTextBox);
			return;
		} else if (Integer.parseInt(ageTextBox.getValue()) < 0) {
			Clients.showNotification("Please enter age between 0 and 200!", ageTextBox);
			return;
		} else if (selection.isEmpty()) {
			Clients.showNotification("Please choose a gender from list!", genderListBox);
			return;
		} else if (emailTextBox.getText().isEmpty()) {
			Clients.showNotification("Email can't be empty!", emailTextBox);
			return;
		} else {
			String customerId = idTextBox.getText();
			if (!customerId.equals("0")) {
				Long customerNumber = Long.parseLong(customerId);
				Customer customerData = customerService.getCustomerById(customerNumber);
				customerData.setFirstName(firstNameTextBox.getValue());
				customerData.setLastName(lastNameTextBox.getValue());
				customerData.setDateOfBirth(dateOfBirthTextBox.getText());
				customerData.setMobileNumber(mobileNumberTextBox.getValue());
				customerData.setAddressOne(addressOneTextBox.getValue());
				customerData.setAddressTwo(addressTwoTextBox.getValue());
				customerData.setAge(ageTextBox.getValue());
				customerData.setGender(selection.iterator().next());
				customerData.setEmail(emailTextBox.getValue());
				customerService.updateCustomer(customerData);
				Messagebox.show("Customer record is updated successfully!!!", "ATTENTION",
						new Messagebox.Button[] { Messagebox.Button.YES }, new String[] { "OK" }, Messagebox.QUESTION,
						null, new EventListener() {
							public void onEvent(Event event) throws Exception {
								if (((Messagebox.Button) event.getData()) == Messagebox.Button.YES) {
									Executions.sendRedirect("/customer/view");
								}
							}
						});
			} else {
				Customer customer = new Customer();
				customer.setFirstName(firstNameTextBox.getValue());
				customer.setLastName(lastNameTextBox.getValue());
				customer.setDateOfBirth(dateOfBirthTextBox.getText());
				customer.setMobileNumber(mobileNumberTextBox.getValue());
				customer.setAddressOne(addressOneTextBox.getValue());
				customer.setAddressTwo(addressTwoTextBox.getValue());
				customer.setAge(ageTextBox.getValue());
				customer.setGender(selection.iterator().next());
				customer.setEmail(emailTextBox.getValue());
				customerService.saveCustomer(customer);
				Messagebox.show("Customer record is saved successfully!!!", "ATTENTION",
						new Messagebox.Button[] { Messagebox.Button.YES }, new String[] { "OK" }, Messagebox.QUESTION,
						null, new EventListener() {
							public void onEvent(Event event) throws Exception {
								if (((Messagebox.Button) event.getData()) == Messagebox.Button.YES) {
									Executions.sendRedirect("/customer/view");
								}
							}
						});
			}
		}
	}

	@Listen("onClick = #cancelCustomer")
	public void cancelCustomer() {
		String customerId = idTextBox.getValue();
		if (customerId == null) {
			Executions.sendRedirect("/customer/form");
		} else {
			Executions.sendRedirect("/customer/form");
		}
	}

}