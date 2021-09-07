package com.esame.lab.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.*;

import com.esame.lab.domain.CentriVaccinali;

@Repository
public interface CentriVaccinaliRepository extends JpaRepository<CentriVaccinali,Integer> {

	@Query(value="select * from Centri_Vaccinali e where e.comune like %:keyword% or e.tipologia like %:keyword%",nativeQuery=true)
	List<CentriVaccinali> findByKeyword(@Param("keyword") String keyword);
}
