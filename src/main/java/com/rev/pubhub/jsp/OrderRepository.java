package com.rev.pubhub.jsp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rev.pubhub.model.Order;
import com.rev.pubhub.model.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

	public List<Order> findByUserIdOrderByIdDesc(Integer userId);

	public Long countByStatus(String status);

	public List<Order> findByStatus(String string);
	
	
	public List<Order>  findUserIdDistinctAll();



}
