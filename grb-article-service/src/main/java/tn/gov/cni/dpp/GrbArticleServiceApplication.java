package tn.gov.cni.dpp;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.gov.cni.dpp.domain.Bien;
import tn.gov.cni.dpp.repository.BienRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableSwagger2
public class GrbArticleServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GrbArticleServiceApplication.class, args);
		BienRepository bienRepository = applicationContext.getBean(BienRepository.class);

		Stream.of("b1", "b2", "b3").forEach(b -> bienRepository.save(new Bien(b)));

	}

}
