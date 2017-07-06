package com.rev.pubhub.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.rev.pubhub.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	
	@Query("SELECT max(book.id) FROM OrderItem ")
	Long getMaxId();
	
	@Query("SELECT min(book.id) FROM OrderItem ")
	Long getMinId();
	
}
