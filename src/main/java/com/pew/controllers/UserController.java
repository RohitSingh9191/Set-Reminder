package com.pew.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pew.entities.Users;
import com.pew.services.ReminderService;
import com.pew.services.UserService;

@Controller
@RequestMapping("Sing-up")
public class UserController
{
	
	@Autowired private UserService userService;
	@RequestMapping("")
	public String getHomeView(Model model)
	{
		return "home/sing-up";
	}
	
	@RequestMapping("save-user")
	public String saveForm(Users user,Model model)
	{
		userService.saveRecordOfUser(user);
		model.addAttribute("msg","Sing up successfully");
		return "home/sing-up";
	}

	
	
}
