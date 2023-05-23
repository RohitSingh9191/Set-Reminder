package com.pew.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pew.entities.Reminder;
import com.pew.services.ReminderService;

@Controller
@RequestMapping("Reminder")
public class HomeController
{
	int c=0;
	@Autowired private ReminderService reminderService;
	@RequestMapping("")
	public String getHomeView(Model model)
	{
		return "home/login";
	}
	@RequestMapping("authenticate")
	public String getLoginView(String username,String password,Model model, HttpSession ses)
	{
		if(username.equals("user") && password.equals("user"))
		{
			ses.setAttribute("name","user");
			return "redirect:home";
		}
		model.addAttribute("user",username);
		model.addAttribute("msg","Username or password is incorrect");
		return "home/login.html";
	}
	@RequestMapping("home")
	public String getHomeView()
	{
		return "home/home-page.html";
	}
	@RequestMapping("setReminder")
	public String getAddCustomerView()
	{
	
		return "home/setreminder.html";
	}
	@RequestMapping("save-record")
	public String saveForm(Reminder studentReg)
	{
		reminderService.saveRecord(studentReg);
		
		return "home/home-page.html";
	}

	@RequestMapping("delete-reminder")
	public String getReminder(Model model,int sid)
	{
		Reminder rem=reminderService.getRecord(sid);
		if(rem==null)
		{
			model.addAttribute("sid",sid);
			model.addAttribute("msg","Reminder not found");
			return "home/home-page.html";
		}
		model.addAttribute("reminder",rem);
		return "home/show-reminder";
		
	
		
	}
	//@RequestMapping("delete-reminder")
	public String getRemindehbr()
	{
		return "home/show-reminder";
		
	}
	
	@RequestMapping("update")
	public String updateReminder()
	{
	
		return "home/update.html";
	}
	
	@RequestMapping("loghome")
	public String getHome()
	{
		return "redirect:/Reminder";
	}
	
	
	
}
