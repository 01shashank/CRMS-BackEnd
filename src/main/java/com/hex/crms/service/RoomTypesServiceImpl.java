package com.hex.crms.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hex.crms.model.RoomTypes;
import com.hex.crms.dao.RoomTypesDao;

@Service
public class RoomTypesServiceImpl implements RoomTypesService {

	@Autowired
	private RoomTypesDao RoomTypesDao;

	@Override
	public List<RoomTypes> getAll() {
		// write your code here.
		return null;
	}


}