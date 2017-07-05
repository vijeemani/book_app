package com.rev.pubhub.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rev.pubhub.model.Book;
import com.rev.pubhub.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	
	@Query("SELECT max(book_id) FROM OrderItem ")
	Integer getMaxId();
	
}