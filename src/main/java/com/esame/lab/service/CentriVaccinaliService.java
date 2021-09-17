package com.esame.lab.service;

import com.esame.lab.repository.CentriVaccinaliRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.*;

/**
 * CentriVaccinaliService è una classe costruita 
 * con lo scopo  di archiviare, recuperare, aggiornare ed eliminare le risorse del progetto
 * @author Eric Marins
 *
 */
@Service
public class CentriVaccinaliService {

	
	/**
	 * l'attributo permette la dependency injection permette di instanziare e passare 
	 * oggetti in modo esplicito
	 */
	@Autowired
	private CentriVaccinaliRepository centriVaccinaliRepository ;
	
	
	/**
	 * il seguente metodo ritorna la lista dei centri vaccinali archiviati
	 * @return
	 */

	//Return list of CentriVaccinali
	public List<CentriVaccinali> getCentriVaccinali(){
		return centriVaccinaliRepository.findAll();
	}
	/**
	 * il seguente metodo salva un nuovo centro vaccinale 
	 * @param CentriVaccinali
	 */
	//SAve new CentriVaccinali
	public void save(CentriVaccinali CentriVaccinali) {
		centriVaccinaliRepository.save(CentriVaccinali);
	}
	
	/**
	 * il seguente metodo recupera un determinato oggetto di tipo centri vaccinali per il suo id
	 * @param id
	 * @return
	 */
	//get by id 
	public Optional<CentriVaccinali> findById(int id) {
		return centriVaccinaliRepository.findById(id);
	}
/**
 * il seguente metodo cancella determinato un oggeto di tipo centri vaccianli tramite il suo id
 * @param id
 */
	public void delete(Integer id) {
		centriVaccinaliRepository.deleteById(id);
	}
	
	
	/**
	 * il seguente metodo recupera un determinato oggetto di tipo centri vaccinali secondo  parola chiave
	 * @param keyword
	 * @return
	 */
	
	//Get centrivaccinali by keyword
		public List<CentriVaccinali> findByKeyword(String keyword){
			return centriVaccinaliRepository.findByKeyword(keyword);
			
		}
}
