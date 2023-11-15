package com.github.lazaro.agendaapi.api.rest.controller;

import com.github.lazaro.agendaapi.dto.ContatoRequest;
import com.github.lazaro.agendaapi.model.entity.Contato;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import com.github.lazaro.agendaapi.services.ContatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contatos")
@RequiredArgsConstructor
public class ContatoController {

    private final ContatoService contatoService;

    @GetMapping
    public ResponseEntity<List<Contato>> getTenFist() {
        return ResponseEntity.ok(contatoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Contato> getById(@PathVariable Long id) {
        Optional<Contato> byId = contatoService.findById(id);
        return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping(value = "/{id}/enderecos")
    public ResponseEntity<List<Endereco>> getEnderecoByIdContato(@PathVariable Long id) {
        Optional<List<Endereco>> byId = contatoService.findByIdContato(id);
        return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> save(@Valid @RequestBody ContatoRequest contatoRequest) {
        contatoService.salvarContato(contatoRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> update(@Valid @RequestBody ContatoRequest contatoRequest) {
        contatoService.update(contatoRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        contatoService.delete(id);

    }
}
