package com.hex.crms.service;

//CHECKSTYLE:OFF 
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hex.crms.model.User;
import com.hex.crms.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao UserDao;

	
	public void addUser(User u) {
        
		// write your code here.
    }
    
    public User getUser(String username){
       // write your code here.
        return null;
    }
    @Override
    public  User getUserById(int userId){
      // write your code here.
        return null;
    }

}