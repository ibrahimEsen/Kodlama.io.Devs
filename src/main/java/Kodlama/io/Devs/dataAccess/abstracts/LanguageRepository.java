package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import Kodlama.io.Devs.entities.concretes.Language;


public interface LanguageRepository {
	
	List<Language> getAll();
	Language getById(int id) throws Exception;
	
	void addLanguage(Language language, String newLanguageName) throws Exception;
	void updateLanguage(Language language, int id) throws Exception;
	void deleteLanguage(int id) throws Exception;

}
