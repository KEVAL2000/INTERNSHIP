package com.java.customercrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Messagebox;
import com.java.customercrud.model.Customer;
import com.java.customercrud.service.CustomerService;
import com.java.customercrud.service.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerHomeController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;

	private CustomerService customerService = new CustomerServiceImpl();

	private ListModelList<Customer> customerListModel;

	@Wire
	private Listbox customerListBox;

	private Session session = Sessions.getCurrent();

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		refreshCustomerListBox();
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String viewCustomer() {
		return "customerhome";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String showForm() {
		return "customerform";
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Listen("onDeleteCustomer = #customerListBox")
	public void deleteCustomer(final Event event) {
		Customer customer = (Customer) event.getData();
		Messagebox.show("Are you sure you want to delete this customer ?", "CONFIRMATION",
				new Messagebox.Button[] { Messagebox.Button.YES, Messagebox.Button.NO },
				new String[] { "Delete", "Cancel" }, Messagebox.QUESTION, null, new EventListener() {
					public void onEvent(Event event) throws Exception {
						if (((Messagebox.Button) event.getData()) == Messagebox.Button.YES) {
							customerService.deleteCustomerById(customer.getId());
							refreshCustomerListBox();
							Messagebox.show("Customer record is deleted successfully!!!", "ATTENTION", Messagebox.OK,
									Messagebox.INFORMATION);
						}
					}
				});
	}

	@Listen("onUpdateCustomer = #customerListBox")
	public void updateCustomer(final Event event) {
		Customer customer = (Customer) event.getData();
		Map<String, String> args = new HashMap<>();
		args.put("customerId", customer.getId().toString());
		args.put("customerFirstName", customer.getFirstName());
		args.put("customerLastName", customer.getLastName());
		args.put("customerDateOfBirth", customer.getDateOfBirth());
		args.put("customerMobileNumber", customer.getMobileNumber());
		args.put("customerAddressOne", customer.getAddressOne());
		args.put("customerAddressTwo", customer.getAddressTwo());
		args.put("customerAge", customer.getAge());
		args.put("customerGender", customer.getGender());
		args.put("customerEmail", customer.getEmail());
		session.setAttribute("args", args);
		Executions.sendRedirect("/customer/form");
	}

	@Listen("onClick = #createCustomer")
	public void createCustomer() {
		Map<String, String> args = new HashMap<>();
		args.put("customerId", "0");
		args.put("customerFirstName", null);
		args.put("customerLastName", null);
		args.put("customerDateOfBirth", null);
		args.put("customerMobileNumber", null);
		args.put("customerAddressOne", null);
		args.put("customerAddressTwo", null);
		args.put("customerAge", null);
		args.put("customerGender", null);
		args.put("customerEmail", null);
		session.setAttribute("args", args);
		Executions.sendRedirect("/customer/form");
	}

	public String refreshCustomerListBox() {
		List<Customer> customerList = customerService.viewCustomer();
		customerListModel = new ListModelList<Customer>(customerList);
		customerListBox.setModel(customerListModel);
		return "customerhome";
	}

}