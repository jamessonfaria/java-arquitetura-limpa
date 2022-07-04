package br.com.jamesson.aluno.entity;

import java.util.UUID;

public class Aluno {

    private final UUID registrationNumber;
    private final String name;

    public Aluno(String name) {
        this.registrationNumber = UUID.randomUUID();
        this.name = name;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }
}
