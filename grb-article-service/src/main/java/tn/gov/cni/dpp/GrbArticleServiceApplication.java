package tn.gov.cni.dpp;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import tn.gov.cni.dpp.domain.Bien;
import tn.gov.cni.dpp.repository.BienRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class GrbArticleServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GrbArticleServiceApplication.class, args);
		BienRepository bienRepository = applicationContext.getBean(BienRepository.class);

		Stream.of("b1", "b2", "b3").forEach(b -> bienRepository.save(new Bien(b)));

	}

}
