package com.nttduong.matchingme.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {
	@RequestMapping("/")
	public ModelAndView welcome() {
		String message = "TEST FIRST PAGE";
		return new ModelAndView("FirstPage", "message", message);
	}

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) final String error, final Model model) {
		if (error != null) {
			model.addAttribute("message", "Login Failed!");
		}
		return "LoginPage";
	}

	@RequestMapping("/logout")
	public String logout(final Model model) {
		model.addAttribute("message", "Logged out!");
		return "LoginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "FirstPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}

	@RequestMapping("/tutor")
	public String welcomgs(Principal principal) {
		// Sau khi user login thanh cong se co principal
		String userName = principal.getName();		

		System.out.println("Tutor Name: " + userName);
		return "Welcomegs";
	}

	@RequestMapping("/host")
	public String welcomgc(Principal principal) {
		// Sau khi user login thanh cong se co principal
		String userName = principal.getName();

		System.out.println("Host Name: " + userName);
		return "Welcomegc";
	}
	
	@RequestMapping(value= "/admin")
	public String welcomeAdmin(Principal principal) {
		// Sau khi user login thanh cong se co principal
		String userName = principal.getName();

		System.out.println("Admin Name: " + userName);
		return "WelcomeAdmin";
	}

	@RequestMapping("/signup")
	public ModelAndView SignUp() {
		return new ModelAndView("SignUp");
	}

}
/*
 * import org.springframework.ui.Model;
 * 
 * @RequestMapping("/first") public String hello(Model model) {
 * model.addAttribute("greeting", "TEST FIRST PAGE"); return "FirstPage"; }
 */