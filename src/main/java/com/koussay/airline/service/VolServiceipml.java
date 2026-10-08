package com.koussay.airline.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koussay.airline.entities.Compagnie;
import com.koussay.airline.entities.Vol;
import com.koussay.airline.repos.VolRepository;
@Service 
public class VolServiceipml implements  VolService {
	private final VolRepository volrepository;

	public VolServiceipml(VolRepository volrepository) {
		this.volrepository = volrepository;
	}
	@Override
	public Vol saveVol(Vol v) {
		return volrepository.save(v);
	}

	@Override
	public Vol updateVol(Vol v) {
		return volrepository.save(v);
	}

	@Override
	public void deleteVol(Vol v) {
		volrepository.delete(v);
	}

	@Override
	public void deleteVolById(Long id) {
		volrepository.deleteById(id);
		
	}

	@Override
	public Vol getVol(Long id) {
		 return volrepository.findById(id).get();
	}

	@Override
	public List<Vol> getAllVols() {
		return volrepository.findAll();
	}
	@Override
	public List<Vol> findVolByNumero(String numero) {
	    return volrepository.findVolByNumero(numero);
	}

	@Override
	public List<Vol> findByNumeroContains(String numero) {
	    return volrepository.findVolByNumeroContains(numero);
	}

	@Override
	public List<Vol> findByNumeroDestination(String numero, String destination) {
	    return volrepository.findByNumeroDestination(numero, destination);
	}

	@Override
	public List<Vol> findByCompagnie(Compagnie compagnie) {
	    return volrepository.findByCompagnie(compagnie);
	}

	@Override
	public List<Vol> findByCompagnieIdCompagnie(Long id) {
	    return volrepository.findByCompagnieIdCompagnie(id);
	}

	@Override
	public List<Vol> findByOrderByNumeroAsc() {
	    return volrepository.findByOrderByNumeroAsc();
	}

	@Override
	public List<Vol> trierVolsNumeroDateDepart() {
	    return volrepository.trierVolsNumeroDateDepart();
	}
	}
