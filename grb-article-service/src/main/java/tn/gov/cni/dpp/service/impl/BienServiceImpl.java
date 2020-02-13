package tn.gov.cni.dpp.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import tn.gov.cni.dpp.service.interfaces.BienService;

@Service
public class BienServiceImpl implements BienService {
	@Value("${server.port}")
	private int port;

	@Override
	public String sayAhla() {
		return "i'am server port= " + port;
	}

}
