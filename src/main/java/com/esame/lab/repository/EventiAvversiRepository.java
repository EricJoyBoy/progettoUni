package com.esame.lab.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.esame.lab.domain.EventiAvversi;

@Repository
public interface EventiAvversiRepository extends JpaRepository<EventiAvversi,Integer>{

}
