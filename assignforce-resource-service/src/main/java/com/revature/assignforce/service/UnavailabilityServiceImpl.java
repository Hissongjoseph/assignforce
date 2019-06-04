package com.revature.assignforce.service;

import com.revature.assignforce.beans.LocationUnavailability;
import com.revature.assignforce.repos.UnavailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnavailabilityServiceImpl  implements UnavailabilityService {

	
	@Autowired
	private UnavailabilityRepository unavailabilityRepository;
	
	@Autowired
	private RoomService roomService;


	@Override
	public List<LocationUnavailability> getAll() {
		return unavailabilityRepository.findAll();
	}
	
	
	@Override
	public Optional<LocationUnavailability> findById(int id) {
		return unavailabilityRepository.findById(id);
	}
	@Override
	public LocationUnavailability update(LocationUnavailability t) {
		return unavailabilityRepository.save(t);
	}

	@Override
	public LocationUnavailability create(LocationUnavailability t) {
		return unavailabilityRepository.save(t);
	}

	@Override
	public void delete(int id) {
		unavailabilityRepository.deleteById(id);
	}
	
	public LocationUnavailability addUnavailability(LocationUnavailability t) {
//		Room theRoom = (roomService.findById(roomId).orElse(null));
		return create(t);

	}
	
	public LocationUnavailability updateUnavailability(LocationUnavailability t) {
//		Room theRoom = (roomService.findById(roomId).orElse(null));
		return update(t);
		
	}
	
	
}
