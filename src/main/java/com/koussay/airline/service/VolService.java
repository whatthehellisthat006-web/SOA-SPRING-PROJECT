package com.koussay.airline.service;

import java.util.List;

import com.koussay.airline.entities.Compagnie;
import com.koussay.airline.entities.Vol;

public interface VolService {

    Vol saveVol(Vol vol);

    Vol updateVol(Vol vol);

    void deleteVol(Vol vol);

    void deleteVolById(Long id);

    Vol getVol(Long id);

    List<Vol> getAllVols();
    
    List<Vol> findVolByNumero(String numero);

    List<Vol> findByNumeroContains(String numero);

    List<Vol> findByNumeroDestination(String numero, String destination);

    List<Vol> findByCompagnie(Compagnie compagnie);

    List<Vol> findByCompagnieIdCompagnie(Long id);

    List<Vol> findByOrderByNumeroAsc();

    List<Vol> trierVolsNumeroDateDepart();
}