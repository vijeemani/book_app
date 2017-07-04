package com.rev.pubhub.jsp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rev.pubhub.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
	public User findByEmailAndPassword(String email ,String password);

	public User findByEmail(String emailId);
	
	
}
