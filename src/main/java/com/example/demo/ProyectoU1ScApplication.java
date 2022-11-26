package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.CitaMedicaSB;
import com.example.demo.spring.MedicoSB;
import com.example.demo.spring.PacienteCancerSB;
import com.example.demo.spring.PacienteTerceraEdadSB;
import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.PacienteTerceraEdad;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private CitaMedicaSB citaMedicaSB;

	@Autowired
	private MedicoSB medicoSB;

	@Autowired
	private PacienteCancerSB cancerSB;

	@Autowired
	private PacienteTerceraEdadSB pacienteTE;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot");

		this.pacienteTE.setCodIess("sdfsdfsdfsdf");
		this.pacienteTE.setNombre("Edison");
		this.pacienteTE.setTipo("Cancer");
		this.pacienteTE.setCedula("17512421412");
		

		System.out.println(pacienteTE);

		this.cancerSB.setCedula("123214124");
		this.cancerSB.setNombre("aniel");
		this.cancerSB.setTipo("C");

		citaMedicaSB.agendar("12324124", LocalDateTime.of(2022, 12, 2, 8, 30), this.cancerSB, medicoSB);
	}

}