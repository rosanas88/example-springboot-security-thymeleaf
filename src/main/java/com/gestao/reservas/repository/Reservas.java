package com.gestao.reservas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestao.reservas.model.Reserva;

public interface Reservas extends JpaRepository<Reserva, Long> {
	List<Reserva> findAll();
}
