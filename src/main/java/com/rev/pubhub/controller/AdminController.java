package com.rev.pubhub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rev.pubhub.jsp.UserRepository;
import com.rev.pubhub.model.User;
import com.rev.pubhub.service.*;

@Controller
@RequestMapping("/admin")

public class AdminController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	@Autowired 
	OrderService orderService;
	
	@GetMapping("/userList")
	public String userList(ModelMap modelMap,HttpSession session)
	{
		List<User> listOfUsers = userService.adminUserList();
	     modelMap.addAttribute("LIST_USER",listOfUsers);
		
		return null;

	}
	
	@GetMapping("/salesReport")
	public String sales()
	{
	
		return null;
	
	}
	
	
	

}
