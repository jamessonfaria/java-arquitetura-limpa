package br.com.jamesson.repository;

import br.com.jamesson.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {
}
