package com.esame.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.repository.CittadiniRegistratiRepository;

@Service
public class CittadiniRegistratiService {

@Autowired private BCryptPasswordEncoder encoder;
	
	@Autowired private CittadiniRegistratiRepository cittadini;
	
public void save(CittadiniRegistrati user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		
		cittadini.save(user);
	}
}
