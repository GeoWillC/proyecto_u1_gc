package com.example.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB {
	public Integer calcularDescuento() {
		System.out.println("Paciente cancer con el 30% de descuento");
		return 30;
	}
}
