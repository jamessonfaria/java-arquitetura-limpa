package br.com.jamesson.controller;

import br.com.jamesson.aluno.entity.Aluno;
import br.com.jamesson.aluno.usecase.RegistroAluno;
import br.com.jamesson.converter.AlunoRequestConverter;
import br.com.jamesson.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private RegistroAluno registroAluno;
    @Autowired
    private AlunoRequestConverter requestConverter;

    @GetMapping
    public String doYouHearMe(){
        return "I Hear you :)";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request){
        Aluno aluno = requestConverter.toAluno(request);
        this.registroAluno.save(aluno);
    }

}
