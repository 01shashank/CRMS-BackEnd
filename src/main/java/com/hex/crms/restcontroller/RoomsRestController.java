package com.hex.crms.restcontroller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.crms.model.Rooms;
import com.hex.crms.service.RoomsService;


@RestController
@RequestMapping("/room")
public class RoomsRestController {

	@Autowired
	private RoomsService RoomsService;

	@RequestMapping(value = "/GetRooms", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Rooms> getAllRoomss() {

		// write your code here.

  		return null;
	}
	@RequestMapping(value = "/GetActiveRooms", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Rooms> getActiveRoomss() {

		// write your code here.

  		return null;
	}
	@RequestMapping(value = "/GetRoomsLookup", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<?> getAllRoomsLookUp() {

		// write your code here.

  		return null;
	}
	@RequestMapping(value = "/Save", method = RequestMethod.POST, headers = "Accept=application/json")
	public Rooms addRooms(@RequestBody Rooms r ) throws ParseException {
       
        
// write your code here.

  		return null;
	}
}
