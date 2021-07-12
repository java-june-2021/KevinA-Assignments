package com.kevin.dojoandninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.dojoandninja.models.Dojo;
import com.kevin.dojoandninja.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	
	//find all Dojos
	public List<Dojo> allDojos() {
		return this.dRepo.findAll();
	}
	
	//create
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//find one Dojo by id
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	
}
