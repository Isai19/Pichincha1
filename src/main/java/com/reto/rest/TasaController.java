package com.reto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reto.modelo.Tasa;
import com.reto.repository.TasaRepository;
import com.reto.repository.TasaService;

@RestController
@RequestMapping("/tasa")
public class TasaController {
	
	@GetMapping("/buscar")
	public ResponseEntity<?> findTasa(@RequestParam String moneda_origen, String moneda_destino) throws Exception{
		try {
			
			//Tasa tasa = TasaService.class
			
		}catch(Exception e) {
		
			throw new Exception(e.getMessage());
		}
		
		return null;
		
	}
	

/*
	@GetMapping
	public List<Tasa> tasas() {
		return (List<Tasa>) itasa.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Tasa tasa) {
		itasa.save(tasa);
	}
	
	@PutMapping
	public void modificar(@RequestBody Tasa tasa) {
		itasa.save(tasa);
	}*/
}
