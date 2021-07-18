package com.kevin.overflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.overflow.models.Answer;
import com.kevin.overflow.models.Question;
import com.kevin.overflow.models.Tag;
import com.kevin.overflow.repositories.AnswerRepository;
import com.kevin.overflow.repositories.QuestionRepository;
import com.kevin.overflow.repositories.TagRepository;

@Service
public class OverflowService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	
		public Tag getOneTag(String subject) {
			return this.tRepo.findBySubject(subject);
		}
	
		public ArrayList<Tag> splitTags(String tags) {
			ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
			//instructor, matt, is, the, best
			String[] tagsToProcess = tags.split(", ");
			for(String s : tagsToProcess) {
				if(this.tRepo.existsBySubject(s)) {
					Tag tagToAdd = this.getOneTag(s);
			    	tagsForQ.add(tagToAdd);
			} else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQ.add(this.getOneTag(s));
			}
		}
		return tagsForQ;
	}
	
		public Question createQuestion(Question question) {
			question.setQtags(this.splitTags(question.getFrontEndTags()));
			return this.qRepo.save(question);
		}
		
		public Answer createAnswer(Answer answer) {
			return this.aRepo.save(answer);
		}
		
		public List<Question> getAllQuestions() {
			return this.qRepo.findAll();
		}
		
		public Question findOneQuestion(Long id) {
			return this.qRepo.findById(id).orElse(null);
		}
	
	
}
