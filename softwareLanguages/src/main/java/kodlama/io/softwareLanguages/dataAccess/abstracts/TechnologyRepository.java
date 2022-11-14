package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.softwareLanguages.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
