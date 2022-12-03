package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository //sinifin data acces nesnesi oldugu durumu
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		// super();
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Pyhton"));
		languages.add(new Language(3, "Java"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getById(int id) throws Exception {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		throw new Exception("Belirtilen ID icin kayit bulunamadi");
	}
	
    
	public void addLanguage(Language language, String newLanguageName) throws Exception {
		for (Language language1 : languages) {
			if (language1.getName() == newLanguageName) {
				throw new Exception("Belirtilen programlama dili sistemde mevcut");
			}
		}
		languages.add(language);
	}

	@Override
	public void updateLanguage(Language language, int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLanguage(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
