package com.github.lazaro.agendaapi.model.repository;

import com.github.lazaro.agendaapi.model.entity.Endereco;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

	List<Endereco> findAllByIdContato(Long id);
}
