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
	private MedicoSB medicoSB;
	
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
		this.pacienteTE.setTipo("");
		this.pacienteTE.setCedula("17512421412");
	
		
		System.out.println(pacienteTE);
		citaMedicaSB.agendar("12324124",LocalDateTime.of(2022, 12,2,8,30), pacienteTE, medicoSB);
	}

}
