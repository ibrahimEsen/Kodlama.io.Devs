package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
				
		return languageRepository.getAll();
	}

}
