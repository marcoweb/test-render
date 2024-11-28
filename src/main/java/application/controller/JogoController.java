package application.controller;

import org.springframework.web.bind.annotation.RestController;

import application.record.JogoDTO;
import application.record.JogoListDTO;
import application.service.JogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    private JogoService jogoSrv;

    @GetMapping
    public Iterable<JogoListDTO> list() {
        return jogoSrv.getAllOnlyTitulo();
    }
    // public Iterable<JogoDTO> list() {
    //     return jogoSrv.getAll();
    // }

    @PostMapping
    public JogoDTO insert(@RequestBody JogoDTO jogo) {
        return jogoSrv.add(jogo);
    }

    @GetMapping("/{id}")
    public JogoDTO getOne(@PathVariable long id) {
        return jogoSrv.getOneById(id);
    }
}
