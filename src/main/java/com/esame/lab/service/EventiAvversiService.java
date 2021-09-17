package com.esame.lab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.CentriVaccinali;
import com.esame.lab.domain.EventiAvversi;
import com.esame.lab.repository.EventiAvversiRepository;
/**
 * EventiAvversiService è una classe costruita 
 * con lo scopo  di archiviare, recuperare, aggiornare ed eliminare le risorse del progetto
 * @author Eric Marins
 *
 */
@Service
public class EventiAvversiService {

	
	/**
	 * l'attributo permette la dependency injection permette di instanziare e passare 
	 * oggetti in modo esplicito
	 */
	@Autowired
	private EventiAvversiRepository eventiAvversiRepository ;
	
	
	
/**
 * il seguente metodo ritorna la lista degli eventi avversi archiviati
 * @return
 */
	//Return list of EventiAvversi
	public List<EventiAvversi> getEventiAvversi(){
		return eventiAvversiRepository.findAll();
	}
	/**
	 * il seguente metodo salva un oggetto di tipo eventi avversi 
	 * @param EventiAvversi
	 */
	//SAve new EventiAvversi
	public void save(EventiAvversi EventiAvversi) {
		eventiAvversiRepository.save(EventiAvversi);
	}
	/**
	 * il seguente metodo recupera un determinato oggetto di tipo eventi avversi per il suo id
	 * @param id
	 * @return
	 */
	//get by id 
	public Optional<EventiAvversi> findById(int id) {
		return eventiAvversiRepository.findById(id);
	}
/**
 * il seguente metodo cancella un determinato oggetto di tipo eventi avverso per il suo id
 * @param id
 */
	public void delete(Integer id) {
		eventiAvversiRepository.deleteById(id);
	}
	
	
	
	
	public List<EventiAvversi> findByCentro(String centro){
		return eventiAvversiRepository.findByCentro(centro);
		
	}
	
	
	
	
	
}
