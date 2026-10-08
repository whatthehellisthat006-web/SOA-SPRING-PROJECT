package com.koussay.airline.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.koussay.airline.entities.Vol;
import com.koussay.airline.service.VolService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class VolRESTController {
	private  final VolService volService;
	 @GetMapping
	    public List<Vol> getAllVols() {
	        return volService.getAllVols();
	    }

	    @GetMapping("/{id}")
	    public Vol getVolById(@PathVariable("id") Long id) {
	        return volService.getVol(id);
	    }

	    @PostMapping
	    public Vol createVol(@RequestBody Vol vol) {
	        return volService.saveVol(vol);
	    }

	    @PutMapping
	    public Vol updateVol(@RequestBody Vol vol) {
	        return volService.updateVol(vol);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteVol(@PathVariable("id") Long id) {
	        volService.deleteVolById(id);
	    }

	    @GetMapping("/volcompagnie/{idCompagnie}")
	    public List<Vol> getVolsByCompagnieId(@PathVariable("idCompagnie") Long idCompagnie) {
	        return volService.findByCompagnieIdCompagnie(idCompagnie);
	    }
}
