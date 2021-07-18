package com.kevin.overflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevin.overflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
	
}
