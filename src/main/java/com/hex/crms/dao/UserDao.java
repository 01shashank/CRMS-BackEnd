package com.hex.crms.dao;
//CHECKSTYLE:OFF 
import java.util.List;

import com.hex.crms.model.User;

public interface UserDao {
  void addUser(User u);
  User getUserByID(int usedID);
  User getUser(String username);
}