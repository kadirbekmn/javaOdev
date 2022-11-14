package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.softwareLanguages.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageRepository extends JpaRepository<SoftwareLanguage, Integer>{

}
