package com.github.lazaro.agendaapi.api.rest.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.lazaro.agendaapi.dto.EnderecoRequest;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import com.github.lazaro.agendaapi.services.EnderecoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/enderecos")
@RequiredArgsConstructor
public class EnderecoController {

	private final EnderecoService enderecoService;

	@GetMapping(value = "/endereco/{id}")
	public ResponseEntity<List<Endereco>> findAllByIdContato(@PathVariable Long id) {
		return ResponseEntity.ok(enderecoService.findAllByIdContato(id));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> getById(@PathVariable Long id) {
		Optional<Endereco> byId = enderecoService.findById(id);
		return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> save(@Valid @RequestBody EnderecoRequest enderecoRequest) {
		enderecoService.salvarEndereco(enderecoRequest);
		return ResponseEntity.ok().build();
	}

	@PutMapping
	public ResponseEntity<?> update(@Valid @RequestBody EnderecoRequest enderecoRequest) {
		enderecoService.update(enderecoRequest);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		enderecoService.delete(id);
	}
}
