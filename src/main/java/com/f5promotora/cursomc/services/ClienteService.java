package com.f5promotora.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5promotora.cursomc.domain.Cliente;
import com.f5promotora.cursomc.repositories.ClienteRepository;
import com.f5promotora.cursomc.exceptions.ObjectNotFoundException;
@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
	}

}
