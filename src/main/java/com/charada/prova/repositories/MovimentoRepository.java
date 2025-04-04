package com.charada.prova.repositories;

import com.charada.prova.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {

}
