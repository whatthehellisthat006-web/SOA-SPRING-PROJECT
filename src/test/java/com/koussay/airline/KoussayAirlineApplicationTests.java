package com.koussay.airline;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

import com.koussay.airline.entities.Compagnie;
import com.koussay.airline.entities.Vol;
import com.koussay.airline.repos.VolRepository;
@SpringBootTest
class KoussayAirlineApplicationTests {
	@Autowired
	private VolRepository volRepository;
	@Test
	public void testCreateVol() {
	    Date depart = new Date();
	    Date arrivee = new Date(depart.getTime() + 7200000);

	    Vol vol = new Vol("TU101", "Tunis", "AMERCA", depart, arrivee);
	    volRepository.save(vol);
	}
	@Test
	public void testUpdateVol() {
	    Date depart = new Date();
	    Vol nouveauVol = volRepository.save(new Vol("TU201", "Tunis", "Paris", depart, new Date(depart.getTime() + 7200000)));
	    Vol vol = volRepository.findById(nouveauVol.getIdVol()).get();
	    vol.setDestination("AZIZ");
	    volRepository.save(vol);
	}
	@Test
	public void testFindVol() {
	    Date depart = new Date();
	    Vol nouveauVol = volRepository.save(new Vol("TU202", "Tunis", "Paris", depart, new Date(depart.getTime() + 7200000)));
	    Vol vol = volRepository.findById(nouveauVol.getIdVol()).get();
	    System.out.println(vol);
	}
	@Test
	public void testDeleteVol() {
	    Date depart = new Date();
	    Vol vol = volRepository.save(new Vol("TU203", "Tunis", "Paris", depart, new Date(depart.getTime() + 7200000)));
	    volRepository.deleteById(vol.getIdVol());
	}

	@Test
	public void testListerTousVols() {
	    List<Vol> vols = volRepository.findAll();

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}
	@Test
	public void testFindVolByNumero() {
	    List<Vol> vols = volRepository.findVolByNumero("TU101");

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}
	@Test
	public void testFindVolByNumeroContains() {
	    List<Vol> vols = volRepository.findVolByNumeroContains("TU");

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}
	@Test
	public void testFindByNumeroDestination() {
	    List<Vol> vols =
	        volRepository.findByNumeroDestination("TU101", "Paris");

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}

	@Test
	public void testFindByNumeroDestination1() {
	    List<Vol> vols = volRepository.findByNumeroDestination1("TU101", "Paris");

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}

	@Test
	public void testFindByCompagnie() {
	
	    Compagnie compagnie = new Compagnie();
	    compagnie.setIdCompagnie(1L);
	
	    List<Vol> vols = volRepository.findByCompagnie(compagnie);
	
	    for (Vol v : vols) {
	        System.out.println(v);
	    }
	}

	@Test
	public void testFindByCompagnieIdCompagnie() {
	
	    List<Vol> vols = volRepository.findByCompagnieIdCompagnie(1L);
	
	    for (Vol v : vols) {
	        System.out.println(v.getNumero());
	    }
}
	@Test
	public void testFindByOrderByNumeroAsc() {
	    List<Vol> vols = volRepository.findByOrderByNumeroAsc();

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}
	@Test
	public void testTrierVolsNumeroDateDepart() {
	    List<Vol> vols = volRepository.trierVolsNumeroDateDepart();

	    for (Vol vol : vols) {
	        System.out.println(vol);
	    }
	}

}
