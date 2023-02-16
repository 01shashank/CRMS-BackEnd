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

import com.hex.crms.model.RoomTypes;
import com.hex.crms.service.RoomTypesService;

@RestController
@RequestMapping("/roomtype")
public class RoomTypesRestController {

	@Autowired
	private RoomTypesService RoomTypesService;

	@RequestMapping(value = "/GetRoomTypes", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<RoomTypes> getAllRoomTypess() {

		// write your code here.

  		return null;
	}

}
