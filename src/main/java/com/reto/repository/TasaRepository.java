package com.reto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reto.modelo.Tasa;

@Repository
public interface TasaRepository extends JpaRepository<Tasa, Integer>{

	@Query(value="select * from tasa where tasa.moneda_origen like %:moneda_origen% and tasa.moneda_destino like %:moneda_destino%")
	public List<Tasa> findTasa(String moneda_origen, String moneda_destino) throws Exception;
}
