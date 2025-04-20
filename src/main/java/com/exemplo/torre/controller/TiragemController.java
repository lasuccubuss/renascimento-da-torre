package com.exemplo.torre.controller;

import com.exemplo.torre.model.Tiragem;
import com.exemplo.torre.service.TiragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiragens")
public class TiragemController {

    @Autowired
    private TiragemService service;

    @GetMapping
    public List<Tiragem> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tiragem> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tiragem criar(@RequestBody Tiragem tiragem) {
        return service.salvar(tiragem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tiragem> editarTiragem(@PathVariable Long id, @RequestBody Tiragem novaTiragem) {
        try {
            Tiragem atualizada = service.atualizarTiragem(id, novaTiragem);
            return ResponseEntity.ok(atualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar/carta")
    public List<Tiragem> buscarPorCarta(@RequestParam String carta) {
        return service.buscarPorCarta(carta);
    }

    @GetMapping("/buscar/reflexao")
    public List<Tiragem> buscarPorReflexao(@RequestParam String palavra) {
        return service.buscarPorTexto(palavra);
    }

    @GetMapping("/buscar/categoria")
    public List<Tiragem> buscarPorCategoria(@RequestParam String categoria) {
        System.out.println("Buscando por categoria: [" + categoria + "]");
        List<Tiragem> resultado = service.buscarPorCategoria(categoria);
        System.out.println("Resultado encontrado: " + resultado.size() + " tiragem(ns)");
        return resultado;
    }


}
