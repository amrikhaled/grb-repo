package tn.gov.cni.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GrbTaxeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrbTaxeServiceApplication.class, args);
	}

}
