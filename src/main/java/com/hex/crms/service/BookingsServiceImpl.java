package com.hex.crms.service;

import java.util.Date;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hex.crms.model.Bookings;
import com.hex.crms.dao.BookingsDao;
import com.hex.crms.model.Rooms;

@Service
public class BookingsServiceImpl implements BookingsService {

	@Autowired
	private BookingsDao BookingsDao;
	@Autowired
	private RoomsService roomsService;

	@Override
	public List<Bookings> getAll() {
		// write your code here.
		return null;
	}

	@Override
	public Bookings addBooking(Bookings b) {
		// write your code here.
		return null;

	}

	@Override
	public void cancelBooking(int i, String name) {
		// write your code here.
	}

	@Override
	public Bookings getBooking(int i) {
		return null;
	}

}