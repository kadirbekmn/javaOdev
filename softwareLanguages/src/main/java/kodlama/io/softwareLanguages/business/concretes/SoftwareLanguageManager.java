package kodlama.io.softwareLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstracts.SoftwareLanguageService;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.CreateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.DeleteSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.UpdateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetAllSoftwareLanguageResponses;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetBySoftwareLanguageResponses;
import kodlama.io.softwareLanguages.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.softwareLanguages.entities.concretes.SoftwareLanguage;
import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {

	private SoftwareLanguageRepository softwareLanguageRepository;

	@Autowired
	public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
		this.softwareLanguageRepository = softwareLanguageRepository;
	}

	@Override
	public List<GetAllSoftwareLanguageResponses> getAll() {

		List<SoftwareLanguage> softwareLanguages = softwareLanguageRepository.findAll();
		List<GetAllSoftwareLanguageResponses> softwareLanguageResponses = new ArrayList<>();

		for (SoftwareLanguage softwareLanguage : softwareLanguages) {
			GetAllSoftwareLanguageResponses response = new GetAllSoftwareLanguageResponses();
			response.setName(softwareLanguage.getName());

			softwareLanguageResponses.add(response);
		}

		return softwareLanguageResponses;
	}

	@Override
	public GetBySoftwareLanguageResponses getById(int id) {
		SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(id).get();
		GetBySoftwareLanguageResponses response = new GetBySoftwareLanguageResponses();
		response.setName(softwareLanguage.getName());
		return response;
	}

	@Override
	public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) throws Exception {

		SoftwareLanguage softwareLanguage = new SoftwareLanguage();

		if (createSoftwareLanguageRequest.getName().isBlank()) {
			throw new Exception("Lütfen bir isim giriniz.");
		}

		else {
			for (SoftwareLanguage softwareLanguages : softwareLanguageRepository.findAll()) {
				if (softwareLanguages.getName().equalsIgnoreCase(createSoftwareLanguageRequest.getName())) {
					throw new Exception("Bu isim zaten mevcut.");
				} else {
					softwareLanguage.setName(createSoftwareLanguageRequest.getName());
				}
			}
			softwareLanguageRepository.save(softwareLanguage);
		}
	}

	@Override
	public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {

		softwareLanguageRepository.deleteById(deleteSoftwareLanguageRequest.getId());
	}

	@Override
	public void update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {

		if (!updateSoftwareLanguageRequest.getName().isEmpty()) {
			SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(id).get();
			softwareLanguage.setName(updateSoftwareLanguageRequest.getName());
			softwareLanguageRepository.save(softwareLanguage);
		}

	}

}
