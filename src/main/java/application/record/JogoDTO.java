package application.record;

import java.util.Set;

import application.model.Jogo;
import application.model.Plataforma;

public record JogoDTO(long id, String titulo, Set<Plataforma> plataformas) {
    public JogoDTO(Jogo jogo) {
        this(jogo.getId(), jogo.getTitulo(), jogo.getPlataformas());
    }
}
