package br.com.jamesson.repository;

import br.com.jamesson.aluno.contract.AlunoRepository;
import br.com.jamesson.aluno.entity.Aluno;
import br.com.jamesson.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;

    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));
    }
}
