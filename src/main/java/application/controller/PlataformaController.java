package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.PlataformaDTO;
import application.service.PlataformaService;

@RestController
@RequestMapping("/plataformas")
public class PlataformaController {
    @Autowired
    private PlataformaService plataformaSrv;

    @GetMapping
    public Iterable<PlataformaDTO> list() {
        return plataformaSrv.getAll();
    }

    @PostMapping
    public PlataformaDTO insert(@RequestBody PlataformaDTO plataforma) {
        return plataformaSrv.insertOne(plataforma);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        plataformaSrv.removeById(id);
    }

    @PutMapping("/{id}")
    public PlataformaDTO update(@PathVariable long id, @RequestBody PlataformaDTO plataforma) {
        return plataformaSrv.update(id, plataforma);
    }
}
