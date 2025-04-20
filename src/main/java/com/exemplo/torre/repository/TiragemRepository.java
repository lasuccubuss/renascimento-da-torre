package com.exemplo.torre.repository;

import com.exemplo.torre.model.Tiragem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TiragemRepository extends JpaRepository<Tiragem, Long> {
    List<Tiragem> findByCartasContainingIgnoreCase(String carta);

    List<Tiragem> findByReflexaoContainingIgnoreCase(String palavra);

    List<Tiragem> findByCategoriaContainingIgnoreCase(String categoria);
}