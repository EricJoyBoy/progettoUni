package com.esame.lab.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.*;

import com.esame.lab.domain.CentriVaccinali;
import com.esame.lab.domain.EventiAvversi;

/**
 * EventiAvversiRepository è un interfaccia delegata alla comunicazione con la sorgente dati
 * permette di definire  Query Method o implementare esplicitamente metodi custom.
 * @author Eric Marins
 *
 */
@Repository
public interface EventiAvversiRepository extends JpaRepository<EventiAvversi,Integer>{

	
	@Query(value="select * from Eventi_Avversi e where e.centro like %:Centro% ",nativeQuery=true)
	List<EventiAvversi> findByCentro(@Param("Centro") String centro);
}
