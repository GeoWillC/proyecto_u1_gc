package com.example.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinoSB extends PacienteSB {
	private int pesonacimiento;

	public int getPesonacimiento() {
		return pesonacimiento;
	}

	public void setPesonacimiento(int pesonacimiento) {
		this.pesonacimiento = pesonacimiento;
	}

	public Integer calcularDescuento() {
		System.out.println("Paciente niño con el 10% de descuento");
		return 10;
	}
}
