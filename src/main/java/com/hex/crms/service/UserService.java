package com.hex.crms.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.stereotype.Service;

import com.hex.crms.model.User;

@Service
public interface UserService {
	
    void addUser(User u);
    User getUser(String username);
    User getUserById(int userId);
    
}