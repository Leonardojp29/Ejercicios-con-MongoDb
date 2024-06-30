package com.example.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.examen.entity.Bogota;
import com.example.examen.service.BogotaService;

@RestController
@RequestMapping("/rest/bogota")
public class BogotaController {

    @Autowired
    private BogotaService service;

    @GetMapping("/lista")
    @ResponseBody
    public List<Bogota> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Bogota obtenerPorId(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping("/guardar")
    @ResponseBody
    public Bogota guardar(@RequestBody Bogota bogota) {
        return service.save(bogota);
    }

    @PutMapping("/actualizar")
    @ResponseBody
    public Bogota actualizar(@RequestBody Bogota bogota) {
        return service.save(bogota);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseBody
    public void eliminar(@PathVariable("id") String id) {
        service.deleteById(id);
    }

    @GetMapping("/tipoDePaIn")
    @ResponseBody
    public List<Bogota> listaPorTiposDePa(@RequestParam List<String> tiposDePa) {
        return service.findByTipoDePaIn(tiposDePa);
    }

    @GetMapping("/nombreRegex")
    @ResponseBody
    public List<Bogota> listaPorNombreRegex(@RequestParam String regex) {
        return service.findByNombreRegex(regex);
    }
}
