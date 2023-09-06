package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entities.UserForm;

@Controller
@RequestMapping("userForm")
public class UserController {

	@ModelAttribute("userForm")
	public UserForm getUserForm() {
		return new UserForm();
	}

	@GetMapping
	public String showUserForm() {
		return "userForm";
	}

	@PostMapping
	public String processUserForm(@ModelAttribute("userForm") UserForm userForm, Model model) {

		model.addAttribute("message", userForm.getEmail());
		model.addAttribute("message1", userForm.getUsername());
		return "userForm"; // Return the same form page
	}
}
