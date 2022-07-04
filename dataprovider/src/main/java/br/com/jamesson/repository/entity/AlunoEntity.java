package br.com.jamesson.repository.entity;

import br.com.jamesson.aluno.entity.Aluno;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "ALUNO")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID registrationNumber;
    private String name;

    public AlunoEntity() {
    }

    public AlunoEntity(Long id, UUID registrationNumber, String name) {
        this(registrationNumber, name);
        this.id = id;
    }

    public AlunoEntity(UUID registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public static AlunoEntity from(Aluno aluno) {
        return new AlunoEntity(aluno.getRegistrationNumber(), aluno.getName());
    }
}
