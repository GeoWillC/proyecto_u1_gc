package com.example.demo.herencia;

import java.time.LocalDateTime;

public class Mainframework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PacienteTerceraEdadH pacienteTE=new PacienteTerceraEdadH();
//		pacienteTE.setCedula("17231232");
//		pacienteTE.setCodIess("1421421");
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("Tercera Edad");
		
//		PacienteNinoH pacienteTE=new PacienteNinoH();
//		pacienteTE.setCedula("17231232");
//		pacienteTE.setPesonacimiento(8);
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("Niño");
		
		PacienteCancerH pacienteTE=new PacienteCancerH();
		pacienteTE.setCedula("17231232");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("Cancer");
		
		MedicoH medicoH=new MedicoH();
		medicoH.setCedula("1751241411");
		medicoH.setNombre("Diana");
		
		CitaMedicaH cita=new CitaMedicaH();
		cita.agendar("12324124",LocalDateTime.of(2022, 12,2,8,30), pacienteTE, medicoH);
	}

}
