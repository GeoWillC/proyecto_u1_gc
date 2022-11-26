package com.example.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class PacienteTerceraEdadSB extends PacienteSB {
	private String codIess;

	public String getCodIess() {
		return codIess;
	}

	public void setCodIess(String codIess) {
		this.codIess = codIess;
	}

	public Integer calcularDescuento() {
		System.out.println("Paciente TE con el descuento del 20%");
		return 20;
	}
}
