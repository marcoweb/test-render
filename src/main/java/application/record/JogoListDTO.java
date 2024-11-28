package application.record;

import application.model.Jogo;

public record JogoListDTO(long id, String titulo) {
    public JogoListDTO(Jogo jogo) {
        this(jogo.getId(), jogo.getTitulo());
    }
}
