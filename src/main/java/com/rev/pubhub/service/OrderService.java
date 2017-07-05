package com.rev.pubhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.pubhub.jsp.OrderRepository;
import com.rev.pubhub.model.Order;
import com.rev.pubhub.model.User;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	

	public Order insertToTable(Order order) {
		return orderRepository.save(order);
		
		
	}
	public List<Order> findAllOrderList( Integer userId){
		System.out.println("Service Reached ======");
		//Order order = 
       return 	orderRepository.findByUserIdOrderByIdDesc(userId);
	}
	public Order findOne(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findOne(orderId);
	}
	public Order save(Order order) {
		return orderRepository.save(order);
		
	}
	public Long orderCount(){
		if(orderRepository.countByStatus("DELIVERED")!=null){
		
			 return	orderRepository.countByStatus("DELIVERED");
		}
		else{
			return 0l;
				
		}
		
		}
	
	public List<Order> orderList(){
		
		if(orderRepository.countByStatus("DELIVERED")!=null){
			
			return orderRepository.findByStatus("DELIVERED");
		}
		else{
			return null;
				
		}
		
		
	}
	public List<Order> adminOrderList() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
	

	
	
}
