package tn.gov.cni.dpp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.gov.cni.dpp.service.interfaces.BienService;

@RestController
public class BienResource {
	@Autowired
	private BienService bienService;

	@GetMapping("/hatelport")
	public String sallem() {
		return bienService.sayAhla();
	}

}
