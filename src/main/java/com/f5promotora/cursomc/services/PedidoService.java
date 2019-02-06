package com.f5promotora.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5promotora.cursomc.domain.Pedido;
import com.f5promotora.cursomc.repositories.PedidoRepository;
import com.f5promotora.cursomc.exceptions.ObjectNotFoundException;
@Service
public class PedidoService {

	@Autowired
	PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
	}

}
