package com.gestao.reservas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestao.reservas.model.Reserva;
import com.gestao.reservas.repository.Reservas;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
	
	@Autowired
	private Reservas reservas;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView view = new ModelAndView("listarReservas");
		view.addObject("reservas",reservas.findAll());
		view.addObject(new Reserva());
		return view;
	}
	
	@PostMapping
	public String salvar(Reserva novaReserva) {
		this.reservas.save(novaReserva);
		return "redirect:/reservas";
	}
	
	@DeleteMapping
	public String excluir(Reserva reserva) {
		this.reservas.delete(reserva);
		return "redirect:/reservas";
	}
}
