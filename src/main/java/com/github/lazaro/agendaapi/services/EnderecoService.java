package com.github.lazaro.agendaapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.lazaro.agendaapi.dto.EnderecoRequest;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import com.github.lazaro.agendaapi.model.repository.EnderecoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnderecoService {

	private final EnderecoRepository repository;

	public List<Endereco> findAllByIdContato(Long id) {
		return repository.findAllByIdContato(id);
	}

	public Optional<Endereco> findById(Long id) {
		return repository.findById(id);
	}

	public void salvarEndereco(EnderecoRequest enderecoRequest) {
		Endereco novoEndereco = Endereco.parseEndereco(enderecoRequest);
		repository.save(novoEndereco);
	}

	public void update(EnderecoRequest enderecoRequest) {
		Endereco update = Endereco.parseEndereco(enderecoRequest);
		repository.save(update);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
