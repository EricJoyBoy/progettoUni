package com.esame.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.domain.UserPrincipal;
import com.esame.lab.repository.CittadiniRegistratiRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {

	
	@Autowired CittadiniRegistratiRepository cittadini;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		CittadiniRegistrati user = cittadini.findByUserId(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		
		return new UserPrincipal(user);
}
}
