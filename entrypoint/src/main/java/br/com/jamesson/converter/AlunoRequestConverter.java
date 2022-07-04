package br.com.jamesson.converter;

import br.com.jamesson.aluno.entity.Aluno;
import br.com.jamesson.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {

    public Aluno toAluno(AlunoRequest alunoRequest){
        return new Aluno((alunoRequest.getName()));
    }

}
