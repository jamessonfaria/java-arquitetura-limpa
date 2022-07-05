package br.com.jamesson.aluno.contract;

import br.com.jamesson.aluno.entity.Aluno;

import java.util.List;

public interface RegistroAlunoBorda {

    void save(Aluno aluno);

    List<Aluno> list();

}
