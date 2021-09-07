package com.esame.lab.service;

import com.esame.lab.repository.CentriVaccinaliRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.*;


@Service
public class CentriVaccinaliService {

	
	
	@Autowired
	private CentriVaccinaliRepository centriVaccinaliRepository ;
	
	
	

	//Return list of CentriVaccinali
	public List<CentriVaccinali> getCentriVaccinali(){
		return centriVaccinaliRepository.findAll();
	}
	
	//SAve new CentriVaccinali
	public void save(CentriVaccinali CentriVaccinali) {
		centriVaccinaliRepository.save(CentriVaccinali);
	}
	
	//get by id 
	public Optional<CentriVaccinali> findById(int id) {
		return centriVaccinaliRepository.findById(id);
	}

	public void delete(Integer id) {
		centriVaccinaliRepository.deleteById(id);
	}
	
	
	
	
	//Get centrivaccinali by keyword
		public List<CentriVaccinali> findByKeyword(String keyword){
			return centriVaccinaliRepository.findByKeyword(keyword);
			
		}
}
