package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		// super();
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Phyton"));
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

	@Override
	public void create(Language language) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Language language, int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
