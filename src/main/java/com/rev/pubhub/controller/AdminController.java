package com.rev.pubhub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rev.pubhub.repo.OrderItemRepository;
//import com.rev.pubhub.jsp.UserRepository;
import com.rev.pubhub.model.Order;
import com.rev.pubhub.model.OrderItem;
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
	@Autowired
	OrderItemService orderIService;
	
	@Autowired
	OrderItemRepository itrepo;

	@GetMapping("/home")
	public String reReturn(ModelMap modelMap) {
		Long countValueUser = userService.userCount();
		Long countValueBook = bookService.bookCount();
		Long countValueOrder = orderService.orderCount();
		Long countValueOrderItem = orderIService.orderItemCount();
		List<Order> listOfOrders = orderService.orderList();
		modelMap.addAttribute("DELIVERED_ITEM", listOfOrders);

		modelMap.addAttribute("USER_COUNT", countValueUser);
		modelMap.addAttribute("BOOK_COUNT", countValueBook);
		modelMap.addAttribute("ORDER_COUNT", countValueOrder);
		modelMap.addAttribute("ORDER_ITEM_COUNT", countValueOrderItem);
		return "adminpages/admin";
	}

	@GetMapping("/userList")
	public String userList(ModelMap modelMap, HttpSession session) {
		Long countValueUser = userService.userCount();
		List<User> listOfUsers = userService.adminUserList();
		modelMap.addAttribute("LIST_USER", listOfUsers);
		modelMap.addAttribute("USER_COUNT", countValueUser);

		return "adminpages/admin_user";

	}
	
	@GetMapping("/orderList")
	public String orderList(ModelMap modelMap, HttpSession session) {
		Long countValueOrder = orderService.orderCount();
		List<Order> listOfOrder = orderService.adminOrderList();
		modelMap.addAttribute("ORDER_USER", listOfOrder);
		modelMap.addAttribute("ORDER_COUNT", countValueOrder);

		return "adminpages/admin_order";

	}
	
	@GetMapping("/orderItemList")
	public String orderItemList(ModelMap modelMap, HttpSession session) {
		Long countValueOrderItem = orderIService.orderItemCount();
		List<OrderItem> listOfOrderItems = orderIService.orderItemList();
		modelMap.addAttribute("ORDER_ITEM", listOfOrderItems);
		modelMap.addAttribute("ORDER_ITEM_COUNT", countValueOrderItem);

		return "adminpages/admin_order_item";

	}

	
	@GetMapping("/salesReport")
	public String sales(ModelMap modelMap) {
		Long countValueUser = userService.userCount();
		Long countValueBook = bookService.bookCount();
		Long countValueOrder = orderService.orderCount();
		Long countValueOrderItem = orderIService.orderItemCount();
	Long maxBookSold =  itrepo.getMaxId();
		
		
		modelMap.addAttribute("USER_COUNT", countValueUser);
		modelMap.addAttribute("BOOK_COUNT", countValueBook);
		modelMap.addAttribute("ORDER_COUNT", countValueOrder);
		modelMap.addAttribute("ORDER_ITEM_COUNT", countValueOrderItem);
		modelMap.addAttribute("MAX_BOOK", maxBookSold);
		
		return "adminpages/admin_analysis";

	}

}
