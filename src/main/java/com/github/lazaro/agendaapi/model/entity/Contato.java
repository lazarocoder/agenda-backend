package com.github.lazaro.agendaapi.model.entity;

import com.github.lazaro.agendaapi.dto.ContatoRequest;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobreNome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column
    private String email;

    @OneToMany(mappedBy = "idContato", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Endereco> endereco;

    public static Contato parseContato(ContatoRequest contatoRequest) {
        return Contato.builder()
                .id(contatoRequest.getId())
                .cpf(contatoRequest.getCpf())
                .nome(contatoRequest.getNome())
                .sobreNome(contatoRequest.getSobreNome())
                .email(contatoRequest.getEmail()).build();
    }

}
