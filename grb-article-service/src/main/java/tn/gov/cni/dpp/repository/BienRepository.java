package tn.gov.cni.dpp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.gov.cni.dpp.domain.Bien;
@RepositoryRestResource
public interface BienRepository extends JpaRepository<Bien, Long> {

	

}
