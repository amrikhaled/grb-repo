package tn.gov.cni.dpp.repository;

import org.springframework.data.rest.core.config.Projection;

import tn.gov.cni.dpp.domain.Bien;

@Projection(name = "p1", types = Bien.class)
public interface BienProjection {
	public String getCode();
}
