package br.com.jamesson.aluno.contract;

import br.com.jamesson.aluno.entity.Aluno;

import java.util.List;

public interface AlunoRepository {

    void save(Aluno aluno);

    List<Aluno> list();

}
