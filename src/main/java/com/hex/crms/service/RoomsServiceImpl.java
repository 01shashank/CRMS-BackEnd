package com.hex.crms.service;

import java.util.ArrayList;
import java.util.HashMap;
//CHECKSTYLE:OFF 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hex.crms.model.Rooms;
import com.hex.crms.dao.RoomsDao;

@Service
public class RoomsServiceImpl implements RoomsService {

	@Autowired
	private RoomsDao RoomsDao;

	@Override
	public List<Rooms> getAll() {
		// write your code here.
		return null;
	}

	@Override
	public void addRoom(Rooms r) {
		// write your code here.
	}

	@Override
	public List<LookUp> getLookUp() {
		// write your code here.

		return null;
	}

	@Override
	public Rooms getRoomById(int id) {
		// write your code here.
		return null;
	}

}

class LookUp {
	public int key;
	public String value;
}
