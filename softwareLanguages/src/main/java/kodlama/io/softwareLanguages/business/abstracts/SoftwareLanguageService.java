package kodlama.io.softwareLanguages.business.abstracts;

import java.util.List;

import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.CreateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.DeleteSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.UpdateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetAllSoftwareLanguageResponses;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetBySoftwareLanguageResponses;

public interface SoftwareLanguageService {

	List<GetAllSoftwareLanguageResponses> getAll();

	GetBySoftwareLanguageResponses getById(int id);

	void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest)throws Exception;

	void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);

	void update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);

}
