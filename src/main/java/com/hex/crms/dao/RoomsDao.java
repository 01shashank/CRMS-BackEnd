package com.hex.crms.dao;
//CHECKSTYLE:OFF 
import java.util.List;

import com.hex.crms.model.Rooms;

public interface RoomsDao {
  List<Rooms> getAll();
  void addRoom(Rooms r);
  Rooms getRoomById(int id);
  
}
