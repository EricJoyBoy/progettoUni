package com.esame.lab.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.*;

import com.esame.lab.domain.CittadiniRegistrati;

/**
 * CittadiniRepository è un interfaccia delegata alla comunicazione con la sorgente dati
 * permette di definire  Query Method o implementare esplicitamente metodi custom.
 * @author Eric Marins
 *
 */
@Repository
public interface CittadiniRegistratiRepository extends JpaRepository<CittadiniRegistrati,Integer> {

	
	CittadiniRegistrati findByUserId(String userId);
}
