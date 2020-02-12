package tn.gov.cni.dpp.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.gov.cni.dpp.dto.BienDto;

@FeignClient(name = "grb-article-service", url = "http://localhost:8881")
public interface BienServiceProxy {
	@RequestMapping("/biens/{id}")
	BienDto chargerBien(@PathVariable(value = "id") Long id);
}
