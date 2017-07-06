package com.rev.pubhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.pubhub.repo.OrderItemRepository;

import com.rev.pubhub.model.Book;
import com.rev.pubhub.model.OrderItem;

@Service
public class OrderItemService {
	@Autowired
	OrderItemRepository orderItemRepo;
	
	
/*	public String remove(){
		
	}*/
	public Long orderItemCount(){
		 return	orderItemRepo.count();
		}
	public List<OrderItem> orderItemList(){
		return orderItemRepo.findAll();
	}

}
