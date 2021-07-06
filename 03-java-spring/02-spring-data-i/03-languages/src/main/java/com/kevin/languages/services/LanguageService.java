package com.kevin.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.languages.models.Language;
import com.kevin.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	
// Find all	
	public List<Language> allLanguages() {
		return this.lRepo.findAll();
	}
// Create	
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
// Read
	public Language getOneLanguage(Long id)	{
		return this.lRepo.findById(id).orElse(null);
	}
// Delete
	public String deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
		return "Language " + id + " has been deleted.";
	}
// Update
	public Language updateLanguage(Long id, Language language) {
		return this.lRepo.save(language);
	}
	
}
