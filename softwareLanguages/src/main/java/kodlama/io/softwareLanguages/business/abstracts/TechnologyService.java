package kodlama.io.softwareLanguages.business.abstracts;

import java.util.List;

import kodlama.io.softwareLanguages.business.request.technologyRequests.CreateTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.softwareLanguages.business.responses.technologyResponses.GetAllTechnologyResponses;

public interface TechnologyService {

	List<GetAllTechnologyResponses> getAll();

	void add(CreateTechnologyRequest createTechnologyRequest);

	void delete(DeleteTechnologyRequest deleteTechnologyRequest);

	void update(int id, UpdateTechnologyRequest updateTechnologyRequest);

}
