package tn.gov.cni.dpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.gov.cni.dpp.dto.BienDto;
import tn.gov.cni.dpp.proxy.BienServiceProxy;

@RestController
public class TaxeServiceController {
	@Autowired
	private BienServiceProxy bienServiceProxy;

	@RequestMapping("/taxes/calcul/{id}")
	public String calculerTaxe(@PathVariable Long id) {
		BienDto bienDto = bienServiceProxy.chargerBien(id);
		if (bienDto.getCode().equals("b1")) {
			return "T1";
		} else {
			return "T2";
		}

	}

	@GetMapping("/hatou")
	public String doHatElPort() {
		return bienServiceProxy.jibliElPort();

	}

}
