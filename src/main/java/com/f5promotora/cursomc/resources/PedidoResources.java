package com.f5promotora.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f5promotora.cursomc.domain.Pedido;
import com.f5promotora.cursomc.services.PedidoService;


@RestController
@RequestMapping(value ="/pedidos")
public class PedidoResources {
	
	@Autowired
	private PedidoService service; 

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		
		Pedido obj = null;
		obj = service.find(id);
				
		return ResponseEntity.ok().body(obj);
	}
}
