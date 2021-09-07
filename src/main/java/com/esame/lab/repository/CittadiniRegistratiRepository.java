package com.esame.lab.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.*;

import com.esame.lab.domain.CittadiniRegistrati;

@Repository
public interface CittadiniRegistratiRepository extends JpaRepository<CittadiniRegistrati,Integer> {

	
	CittadiniRegistrati findByUserId(String userId);
}
