package com.hex.crms.restcontroller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
//CHECKSTYLE:OFF 
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hex.crms.dao.UserDao;
import com.hex.crms.dao.UserDaoImpl;
import com.hex.crms.model.Bookings;
import com.hex.crms.model.User;
import com.hex.crms.model.Rooms;
import com.hex.crms.service.*;

@RestController
@RequestMapping("/booking")
public class BookingsRestController {

	@Autowired
	private BookingsService BookingsService;
	@Autowired
	private UserService userService;
	@Autowired
	private RoomsService roomsService;

	@RequestMapping(value = "/getbookings", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Bookings> getAllBookings() {

		// write your code here.

		return null;
	}

	@RequestMapping(value = "/GetCurrentMonthBookings", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Bookings> getBookings() {
		// write your code here.
		return null;
	}

	@RequestMapping(value = "/GetCurrentMonthBookings", params = "userId", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Bookings> getBookingsofCuurentMonthByUser(@RequestParam("userId") int id) {
// write your code here.
		return null;
	}

	@RequestMapping(value = "/GetBookingsByUser", params = "userId", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Bookings> getBookingsofUser(@RequestParam("userId") int id) {
// write your code here.

		return null;
	}

	@RequestMapping(value = "/Save", method = RequestMethod.POST, headers = "Accept=application/json")
	public Bookings addBookings(@RequestBody Bookings r) {
// write your code here.
		return null;
	}

	@RequestMapping(value = "/CancelBooking", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void cancelBooking(@RequestBody Bookings r) {

		// write your code here.

	}
}
