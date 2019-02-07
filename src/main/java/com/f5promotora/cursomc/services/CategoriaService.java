package com.f5promotora.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5promotora.cursomc.domain.Categoria;
import com.f5promotora.cursomc.repositories.CategoriaRepository;
import com.f5promotora.cursomc.exceptions.ObjectNotFoundException;
@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj); 
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj); 
	}

}
