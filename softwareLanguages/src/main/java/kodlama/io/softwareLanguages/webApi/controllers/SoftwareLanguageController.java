package kodlama.io.softwareLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.softwareLanguages.business.abstracts.SoftwareLanguageService;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.CreateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.DeleteSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.request.softwareLanguageRequests.UpdateSoftwareLanguageRequest;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetAllSoftwareLanguageResponses;
import kodlama.io.softwareLanguages.business.responses.softwareLanguageResponses.GetBySoftwareLanguageResponses;

@RestController
@RequestMapping("/api/softwarelanguage")

public class SoftwareLanguageController {

	private SoftwareLanguageService softwareLanguageService;

	@Autowired
	public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {

		this.softwareLanguageService = softwareLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllSoftwareLanguageResponses> getAll() {
		return softwareLanguageService.getAll();

	}

	@GetMapping("/{id}")
	public GetBySoftwareLanguageResponses getById(int id) {
		return softwareLanguageService.getById(id);

	}

	@PostMapping
	public void add(CreateSoftwareLanguageRequest createLanguageRequest) throws Exception {

		this.softwareLanguageService.add(createLanguageRequest);

	}

	@DeleteMapping("/{id}")

	public void deleteById(DeleteSoftwareLanguageRequest deleteLanguageRequest) {
		softwareLanguageService.delete(deleteLanguageRequest);
	}

	@PutMapping("/{id}")
	public void updateById(int id, UpdateSoftwareLanguageRequest updateLanguageRequest) {
		softwareLanguageService.update(id, updateLanguageRequest);
	}

}
