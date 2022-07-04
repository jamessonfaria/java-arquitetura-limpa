package br.com.jamesson.aluno.usecase;

import br.com.jamesson.aluno.contract.AlunoRepository;
import br.com.jamesson.aluno.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {
    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno){
        alunoRepository.save(aluno);
    }
}
