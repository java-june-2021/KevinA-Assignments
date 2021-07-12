package com.kevin.dojoandninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.dojoandninja.models.Dojo;
import com.kevin.dojoandninja.models.Ninja;
import com.kevin.dojoandninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	//find all ninjas
	public List<Ninja> allNinjas() {
		return this.nRepo.findAll();
	}
	
	//Create a Ninja
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//Find ninja
	public Ninja getOneNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	//Find Ninjas By Dojo
	public List<Ninja> ninjasByDojo(Dojo dojo) {
		return this.nRepo.findByDojo(dojo);
	}
}
