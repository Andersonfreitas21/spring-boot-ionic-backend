package com.f5promotora.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.f5promotora.cursomc.domain.Categoria;
import com.f5promotora.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática","R. Elisa Maciel Santiago, 1989");
		Categoria cat2 = new Categoria(null,"Escritório","R. Elisa Maciel Santiago, 1989");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}

