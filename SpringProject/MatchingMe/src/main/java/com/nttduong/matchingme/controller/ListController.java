package com.nttduong.matchingme.controller;
//

//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nttduong.matchingme.model.User;
import com.nttduong.matchingme.service.UserService;

@Controller
public class ListController {

	@Autowired
	private UserService userService;

	// SIGN UP
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doSignUp(HttpServletRequest req, HttpServletResponse resp, Model model)
			throws ServletException, IOException, ParseException {
		String username = req.getParameter("usrn");
		String password = req.getParameter("pass");
		String name = req.getParameter("name");
		String birth = req.getParameter("year") + "-" + req.getParameter("month") + "-" + req.getParameter("day");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String right = req.getParameter("right");

		int i = 0;
		switch (right) {
		case "Host":
			i = 3;
			break;
		case "Tutor":
			i = 2;
			break;
		}

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy"); // New Pattern
		java.util.Date date = sdf1.parse(birth); // Returns a Date format object with the pattern
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println(sqlDate); // Outputs : 2013-02-01
		user.setBirthDay(sqlDate);

		user.setEmail(email);
		user.setPhone(Integer.parseInt(phone));
		user.setGender(gender);
		user.setIdRight(i);

		if (userService.findByUsername(username) != null) {
			userService.saveUser(user);
			model.addAttribute("message", "Đăng ký thành công! Mời bạn đăng nhập.");
			return "LoginPage";
		}
		req.getRequestDispatcher("/signup?error=0").forward(req, resp);
		return "SignUp";

	}

	//Display List User 
	@RequestMapping(value = "/admin/list")
	public ModelAndView listOfTeams() {
		ModelAndView modelAndView = new ModelAndView("DisplayUser");

		List<User> users = userService.findAll();
		modelAndView.addObject("users", users);

		System.out.println("LIST USER:");
		for (User u : users) {
			System.out.println(u.getName());
		}
		return modelAndView;
	}

	// Delete User
	@GetMapping(value = "/user/delete/{id}")
	public void deleteUserById(@PathVariable("id") int id, HttpServletResponse response) {
		userService.deleteById(id);
		try {
			response.sendRedirect("/MatchingMe/admin/list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Link to Form Edit user for user
	@RequestMapping("/user/update/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("Test");
		
		User user = userService.findById(id);
		modelAndView.addObject("user", user);
		
		System.out.println("User ID: " + id);
		return modelAndView;
	}
	//Link to Form Edit user for admin
	@RequestMapping("/admin/update/{id}")
	public ModelAndView updateAd(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("FormEdit");
		
		User user = userService.findById(id);
		modelAndView.addObject("user", user);
		
		System.out.println("User ID: " + id);
		return modelAndView;
	}
	
	// Update
		/**
		 * @param req
		 * @param resp
		 * @return
		 * @throws ServletException
		 * @throws IOException
		 * @throws ParseException
		 */
		@RequestMapping(value = "/admin/update", method = RequestMethod.POST)
		public String doUpdate(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException, ParseException {
			int id = Integer.parseInt(req.getParameter("id"));
			String password = req.getParameter("pass");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String gender = req.getParameter("gender");
			
			User user = userService.findById(id);
			
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			user.setPhone(Integer.parseInt(phone));
			user.setGender(gender);
			
			System.out.println("USER_update: "+ user.getName());
			userService.updateUser(user);
			resp.sendRedirect("/MatchingMe/admin/list");
			return "LoginPage";
		}
		//User Update
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String doUpdateUser(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException, ParseException {
			int id = Integer.parseInt(req.getParameter("id"));
			String password = req.getParameter("pass");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String gender = req.getParameter("gender");
			
			User user = userService.findById(id);
			
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			user.setPhone(Integer.parseInt(phone));
			user.setGender(gender);
			
			System.out.println("USER_update: "+ user.getName());
			userService.updateUser(user);
			
				switch(user.getIdRight()) {
				case 1:
//					resp.sendRedirect("/MatchingMe/admin");
					return "WelcomeAdmin";
				case 2:
					return "Welcomegs";
				case 3:
					return "Welcomegc";
				
			}
			return "LoginPage";
		}

		//Controller Link to EDIT PROFILE User
		@RequestMapping(value = "/profile", method = RequestMethod.GET)
		public ModelAndView update(HttpServletRequest req) {
			ModelAndView modelAndView = new ModelAndView("Test");
			
			String username = req.getParameter("usrn");
			System.out.println("Username: -- " + username);
			
			User user = userService.findByUsername(username);
			modelAndView.addObject("user", user);
			
			System.out.println("Edit Profile: "+ user.getName());
			return modelAndView;
		}
		
//			@RequestMapping("/user/edit/{id}")
//			public ModelAndView editUser(@PathVariable("id") int id) {
//				ModelAndView modelAndView = new ModelAndView("FormEdit");
//				// Sau khi user login thanh cong se co principal
//				
//				User user = userService.findById(id);
//				modelAndView.addObject("user", user);
//				
//				System.out.println("User ID: " + id);
//				return modelAndView;
//			}
}
