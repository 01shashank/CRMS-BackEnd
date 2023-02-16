package com.hex.crms.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.stereotype.Service;

import com.hex.crms.model.RoomTypes;

@Service
public interface RoomTypesService {
	
	List<RoomTypes> getAll();

}
