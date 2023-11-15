package com.github.lazaro.agendaapi.model.repository;

import com.github.lazaro.agendaapi.model.entity.Contato;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {


    List<Contato> findByNomeAndSobreNomeAndCpf(String nome, String sobreNome, String cpf);

    List<Contato> findByNomeAndSobreNome(String nome, String sobreNome);

    List<Contato> findByNome(String nome);

    List<Contato> findBySobreNome(String sobreNome);

    List<Contato> findByCpf(String cpf);

    Optional<Contato> findById(Long codigo);

    void deleteById(Long codigo);
    /*Optional<List<Endereco>> findByIdEndereco(Long id);*/
}
