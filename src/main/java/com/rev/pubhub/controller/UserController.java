package com.rev.pubhub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rev.pubhub.form.RegistrationValidation;
import com.rev.pubhub.model.Order;
import com.rev.pubhub.model.User;
import com.rev.pubhub.service.BookService;
import com.rev.pubhub.service.OrderItemService;
import com.rev.pubhub.service.OrderService;
import com.rev.pubhub.service.UserService;
import com.rev.pubhub.util.EmailUtil;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	@Autowired
	OrderService orderService;
	@Autowired
	OrderItemService orderIService;
	
	User user = new User();
	@Autowired
	EmailUtil eMail;
	
	private static final Logger LOGGER = Logger.getLogger(UserController.class);


	@GetMapping("/register")
	public String login() {
		return "auth/register";
	}

	@PostMapping("/save")
	public String add_user(@ModelAttribute @Valid RegistrationValidation user, BindingResult result,ModelMap modelMap, 
			HttpSession session){
		try {

			System.out.println("Registraion Form :" + user);
			
			if (result.hasErrors()) {
				modelMap.addAttribute("errors", result.getAllErrors());
				modelMap.addAttribute("regFormData", user );
				return "auth/register";
			}else {
				userService.save(user);
				
				return "auth/login";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.addAttribute("regFormData", user );
			modelMap.addAttribute("ERROR_MESSAGE", e.getMessage());
			return "auth/register";
		}
 
		
	}


	@GetMapping("/login")
	public String login_user() {
		return "auth/login";
	}

	@PostMapping("/validate")
	public String authorize(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap,HttpSession session) {

		LOGGER.info("Entering Login " + email + "-"+ password );
		LOGGER.debug(new Object[] { email, password });

		if(email.equals("admin@mail.com")&& password.equals("admin123")){
			Long countValueUser =userService.userCount();
			Long countValueBook =bookService.bookCount();
			Long countValueOrder =orderService.orderCount();
			Long countValueOrderItem =orderIService.orderItemCount();
			List<Order> listOfOrders = orderService.orderList();
			modelMap.addAttribute("DELIVERED_ITEM", listOfOrders);
			
			 modelMap.addAttribute("USER_COUNT",countValueUser);
			 modelMap.addAttribute("BOOK_COUNT",countValueBook);
			 modelMap.addAttribute("ORDER_COUNT",countValueOrder);
			 modelMap.addAttribute("ORDER_ITEM_COUNT",countValueOrderItem);
			
			return"adminpages/admin";
		}
		
		User user = userService.findByEmailAndPassword(email, password);
		LOGGER.info("User:" + user);
		if (user != null) {
			session.setAttribute("LOGGED_IN_USER", user);
			LOGGER.info("Login Success");
		
			return "bookDisplay/board";
		} else {
			modelMap.addAttribute("ERROR_MESSAGE", "Invalid Email Id/Password");
			LOGGER.error("Login Failure");
			return "auth/login";
		}
		

	}

	@GetMapping("/logout")
	public String signOut(HttpSession session) {
		session.invalidate();
		session.removeAttribute("LOGGED_IN_USER");
		return "redirect:/";

	}

}
