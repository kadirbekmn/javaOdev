package kodlama.io.softwareLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstracts.TechnologyService;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.CreateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.DeleteSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.technologyRequests.CreateTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.softwareLanguages.business.responses.technologyResponses.GetAllTechnologyResponses;
import kodlama.io.softwareLanguages.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.softwareLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.softwareLanguages.entities.concretes.SoftwareLanguage;
import kodlama.io.softwareLanguages.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private SoftwareLanguageRepository softwareLanguageREpository;

	public TechnologyManager(TechnologyRepository technologyRepository,
			SoftwareLanguageRepository softwareLanguageREpository) {
		this.technologyRepository = technologyRepository;
		this.softwareLanguageREpository = softwareLanguageREpository;
	}

	@Override
	public List<GetAllTechnologyResponses> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponses> responses = new ArrayList<>();
		for (Technology technology : technologies) {
			GetAllTechnologyResponses response = new GetAllTechnologyResponses();
			response.setLanguageName(technology.getSoftwareLanguage().getName());
			response.setName(technology.getName());
			responses.add(response);
		}

		return responses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		SoftwareLanguage softwareLanguage = softwareLanguageREpository.findById(createTechnologyRequest.getLanguageId()).get();
		technology.setName(createTechnologyRequest.getName());
		technology.setSoftwareLanguage(softwareLanguage);
		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());

	}

	@Override
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = technologyRepository.findById(id).get();
		SoftwareLanguage softwareLanguage = softwareLanguageREpository.findById(id).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setSoftwareLanguage(softwareLanguage);
		technologyRepository.save(technology);
	}

}
