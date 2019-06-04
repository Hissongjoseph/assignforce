package com.revature.assignforce.service;

import com.revature.assignforce.beans.Building;
import com.revature.assignforce.repos.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingServiceImpl implements BuildingService {

	
	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<Building> getAll() {
		return buildingRepository.findAll();
	}

	@Override
	public Optional<Building> findById(int id) {
		return buildingRepository.findById(id);
	}

	@Override
	public Building update(Building t) {
		return buildingRepository.save(t);
	}

	@Override
	public Building create(Building t) {
		return buildingRepository.save(t);
	}

	@Override
	public void delete(int id) {
		buildingRepository.deleteById(id);
	}
}
