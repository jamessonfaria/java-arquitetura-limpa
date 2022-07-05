package br.com.jamesson.controller;

import br.com.jamesson.aluno.contract.RegistroAlunoBorda;
import br.com.jamesson.aluno.entity.Aluno;
import br.com.jamesson.converter.AlunoRequestConverter;
import br.com.jamesson.request.AlunoRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final RegistroAlunoBorda registroAluno;
    private final AlunoRequestConverter requestConverter;

    public AlunoController(RegistroAlunoBorda registroAluno, AlunoRequestConverter requestConverter) {
        this.registroAluno = registroAluno;
        this.requestConverter = requestConverter;
    }

    @GetMapping("status")
    public String doYouHearMe(){
        return "I Hear you :)";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request){
        Aluno aluno = requestConverter.toAluno(request);
        this.registroAluno.save(aluno);
    }

    @GetMapping
    public List<Aluno> list(){
        return this.registroAluno.list();
    }

}
