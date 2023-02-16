package com.hex.crms.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.stereotype.Service;

import com.hex.crms.model.Bookings;

@Service
public interface BookingsService {
	
    List<Bookings> getAll();
    Bookings addBooking(Bookings b);
    void cancelBooking(int id, String name);
    Bookings getBooking(int i);
}
