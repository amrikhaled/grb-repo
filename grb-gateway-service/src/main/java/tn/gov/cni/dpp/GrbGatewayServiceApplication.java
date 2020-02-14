package tn.gov.cni.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GrbGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrbGatewayServiceApplication.class, args);
	}

}
