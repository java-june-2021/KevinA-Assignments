package com.kevin.dojoandninja.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevin.dojoandninja.models.Dojo;
import com.kevin.dojoandninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
	List<Ninja> findByDojo(Dojo dojo);
	Optional<Ninja> findById(Long id);
}
