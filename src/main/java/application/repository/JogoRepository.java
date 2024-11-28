package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    
}
