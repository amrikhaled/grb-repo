package tn.gov.cni.dpp.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.gov.cni.dpp.dto.BienDto;

@FeignClient(name = "grb-article-service")
@RibbonClient(name = "grb-article-service")
public interface BienServiceProxy {
	@RequestMapping("/biens/{id}")
	BienDto chargerBien(@PathVariable(value = "id") Long id);
	
	@RequestMapping("/hatelport")
	String jibliElPort();
}