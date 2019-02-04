package com.f5promotora.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5promotora.cursomc.domain.Pagamento;
import com.f5promotora.cursomc.exceptions.ObjectNotFoundException;
import com.f5promotora.cursomc.repositories.PagamentoRepository;
@Service
public class PagamentoService {

	@Autowired
	PagamentoRepository repo;

	public Pagamento find(Integer id) {
		Optional<Pagamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pagamento.class.getName(), null));
	}

}
