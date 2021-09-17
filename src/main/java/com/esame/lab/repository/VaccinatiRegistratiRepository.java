package com.esame.lab.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.esame.lab.domain.VaccinatiRegistrati;

/**
 * VaccinatiRegistratiRepository è un interfaccia delegata alla comunicazione con la sorgente dati
 * permette di definire  Query Method o implementare esplicitamente metodi custom.
 * @author Eric Marins
 *
 */
@Repository
public interface VaccinatiRegistratiRepository extends JpaRepository<VaccinatiRegistrati,Integer> {

	
}
