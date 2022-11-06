package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> languages;
	
	InMemoryProgrammingLanguageRepository(){
		languages = new ArrayList<ProgrammingLanguage>();
		
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "JavaScript"));
		languages.add(new ProgrammingLanguage(3, "Phyton"));

	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
			this.languages.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
			this.languages.removeIf(lang -> lang.getId() == programmingLanguage.getId());
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		for(ProgrammingLanguage language : languages) {
			if(language.getId() == programmingLanguage.getId()) {
				language.setName(programmingLanguage.getName());
			}
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
