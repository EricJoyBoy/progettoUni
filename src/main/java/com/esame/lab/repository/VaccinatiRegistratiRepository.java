package com.esame.lab.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.esame.lab.domain.VaccinatiRegistrati;

@Repository
public interface VaccinatiRegistratiRepository extends JpaRepository<VaccinatiRegistrati,Integer> {

	
}
