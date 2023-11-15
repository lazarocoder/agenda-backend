package com.github.lazaro.agendaapi.services;

import com.github.lazaro.agendaapi.dto.ContatoRequest;
import com.github.lazaro.agendaapi.model.entity.Contato;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import com.github.lazaro.agendaapi.model.repository.ContatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContatoService {
    private final ContatoRepository repository;

    public void salvarContato(ContatoRequest contatoRequest) {

        Contato novoContato = Contato.parseContato(contatoRequest);
        repository.save(novoContato);
    }

    public List<Contato> findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "nome");
        return repository.findAll(sort);
    }

    public Optional<Contato> findById(Long id) {
        return repository.findById(id);
    }

    public Optional<List<Endereco>> findByIdContato(Long id) {
       //return repository.findByIdEndereco(id);
       return  null;
    }

    public void update(ContatoRequest contatoRequest) {
        Contato update = Contato.parseContato(contatoRequest);
        repository.save(update);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
