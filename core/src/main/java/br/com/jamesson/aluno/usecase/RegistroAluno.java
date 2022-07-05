package br.com.jamesson.aluno.usecase;

import br.com.jamesson.aluno.contract.AlunoRepository;
import br.com.jamesson.aluno.contract.RegistroAlunoBorda;
import br.com.jamesson.aluno.entity.Aluno;

import java.util.List;
import java.util.UUID;


public class RegistroAluno implements RegistroAlunoBorda {

    private final AlunoRepository alunoRepository;

    public RegistroAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public void save(Aluno aluno){
        aluno.setRegistrationNumber(UUID.randomUUID());
        alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> list() {
        return alunoRepository.list();
    }


}
