package com.java.customercrud.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.java.customercrud.ajaxresponse.CustomerErrorResponse;
import com.java.customercrud.exception.CustomerNotFoundException;
import com.java.customercrud.model.Customer;
import com.java.customercrud.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String viewCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("customerList", customerService.viewCustomer());
		return "customerhome";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@Validated @ModelAttribute("customer") Customer customer,
			RedirectAttributes redirectAttributes) {
		if (customer.getId() != 0) {
			Long updateId = customer.getId();
			customerService.saveAndUpdateCustomer(customer);
			String message = "Record with id : '" + updateId + "' is updated successfully!";
			redirectAttributes.addFlashAttribute("message", message);
		}
		if (customer.getId() == 0) {
			customerService.saveAndUpdateCustomer(customer);
			String message = "Record is saved successfully!";
			redirectAttributes.addFlashAttribute("message", message);
		}
		return "redirect:view";
	}

	@RequestMapping(value = "/checkEmail", method = RequestMethod.POST)
	@ResponseBody
	public String checkCustomerEmail(@Param("id") Long id, @Param("email") String email) {
		if (customerService.checkEmail(id, email)) {
			return "duplicate";
		} else {
			return "ok";
		}
	}

	@RequestMapping(value = "/checkMobileNumber", method = RequestMethod.POST)
	@ResponseBody
	public String checkCustomerMobileNumber(@Param("id") Long id, @Param("mobileNumber") String mobileNumber) {
		if (customerService.checkMobileNumber(id, mobileNumber)) {
			return "duplicate";
		} else {
			return "ok";
		}
	}

	private static List<String> mergeEntriesWithDuplicatedKeys(List<String> existingResults, List<String> newResults) {
		List<String> mergedResults = new ArrayList<>();
		mergedResults.addAll(existingResults);
		mergedResults.addAll(newResults);
		return mergedResults;
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	@ResponseBody
	public CustomerErrorResponse checkCustomer(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		CustomerErrorResponse response = new CustomerErrorResponse();

		if (!bindingResult.hasErrors()) {
			response.setValidated(true);
		} else {
			response.setValidated(false);
			Map<Object, List<String>> errors = bindingResult.getFieldErrors().stream()
					.collect(Collectors.toMap(FieldError::getField,
							fieldError -> Collections.singletonList(fieldError.getDefaultMessage()),
							CustomerController::mergeEntriesWithDuplicatedKeys));
			response.setErrorMessages(errors);
		}
		return response;
	}

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public Customer getCustomer(@ModelAttribute("id") Long id) {
		return customerService.getCustomerById(id);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
		try {
			Long deleteId = customer.getId();
			customerService.deleteCustomerById(deleteId);
			String message = "Record with id : '" + deleteId + "' is deleted successfully!";
			redirectAttributes.addFlashAttribute("message", message);
		} catch (CustomerNotFoundException exception) {
			exception.printStackTrace();
			redirectAttributes.addFlashAttribute("message", exception.getMessage());
		}
		return "redirect:view";
	}

}