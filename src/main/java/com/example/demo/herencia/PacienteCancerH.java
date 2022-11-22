package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{
	public Integer calcularDescuento() {
		System.out.println("Paciente cancer con el 30% de descuento");
		return 30;
	}
}
