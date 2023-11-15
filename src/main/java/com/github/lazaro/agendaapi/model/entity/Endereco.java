package com.github.lazaro.agendaapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.lazaro.agendaapi.dto.EnderecoRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;

    private Long idContato;
    
    public static Endereco parseEndereco(EnderecoRequest enderecoRequest) {
        return Endereco.builder()
                .id(enderecoRequest.getId())
                .logradouro(enderecoRequest.getLogradouro())
                .cidade(enderecoRequest.getCidade())
                .estado(enderecoRequest.getEstado())
                .cep(enderecoRequest.getCep())
                .idContato(enderecoRequest.getIdContato()).build();
    }

}