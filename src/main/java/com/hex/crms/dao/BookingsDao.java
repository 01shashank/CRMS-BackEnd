package com.hex.crms.dao;
//CHECKSTYLE:OFF 
import java.util.List;

import com.hex.crms.model.Bookings;

public interface BookingsDao {
  List<Bookings> getAll();
  void addBooking(Bookings b);
  void cancelBooking(int i, String name);
  Bookings getBooking(int id);
}