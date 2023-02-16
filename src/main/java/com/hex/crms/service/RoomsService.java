package com.hex.crms.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.stereotype.Service;

import com.hex.crms.model.Rooms;

@Service
public interface RoomsService {
	
	List<Rooms> getAll();
	void addRoom(Rooms r);
	List<LookUp> getLookUp();
	Rooms getRoomById(int id);
}
