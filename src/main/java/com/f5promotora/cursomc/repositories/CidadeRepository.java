package com.f5promotora.cursomc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.f5promotora.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Integer>{

}
