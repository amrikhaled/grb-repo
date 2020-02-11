package tn.gov.cni.dpp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestClientService {
	@Value("${me}")
	private String me;

	@GetMapping("/me")
	public String tellMe() {
		return me;
	}

	@Value("${test}")
	private String test;

	@GetMapping("/test")
	public String tellTest() {
		return test;
	}
}