package com.exemplo.torre.service;

import com.exemplo.torre.model.Tiragem;
import com.exemplo.torre.repository.TiragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiragemService {

    @Autowired
    private TiragemRepository repository;

    public List<Tiragem> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tiragem> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tiragem salvar(Tiragem tiragem) {
        return repository.save(tiragem);
    }

    public Tiragem atualizar(Long id, Tiragem nova) {
        return repository.findById(id).map(t -> {
            t.setData(nova.getData());
            t.setTitulo(nova.getTitulo());
            t.setPergunta(nova.getPergunta());
            t.setCartas(nova.getCartas());
            t.setReflexao(nova.getReflexao());
            t.setCategoria(nova.getCategoria());
            return repository.save(t);
        }).orElseThrow();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Tiragem> buscarPorCarta(String carta) {
        return repository.findByCartasContainingIgnoreCase(carta);
    }

    public List<Tiragem> buscarPorTexto(String palavra) {
        return repository.findByReflexaoContainingIgnoreCase(palavra);
    }

    public List<Tiragem> buscarPorCategoria(String categoria) {
        return repository.findByCategoriaContainingIgnoreCase("Trabalho");
    }

    public Tiragem atualizarTiragem(Long id, Tiragem novaTiragem) {
        Tiragem existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tiragem não encontrada"));

        existente.setData(novaTiragem.getData());
        existente.setTitulo(novaTiragem.getTitulo());
        existente.setPergunta(novaTiragem.getPergunta());
        existente.setCartas(novaTiragem.getCartas());
        existente.setReflexao(novaTiragem.getReflexao());
        existente.setCategoria(novaTiragem.getCategoria());

        return repository.save(existente);
    }
}
