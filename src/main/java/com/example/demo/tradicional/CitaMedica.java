package com.example.demo.tradicional;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;

	public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico, String cedulaMedico,
			String nombrePaciente, String cedulaPaciente,String tipo) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechaAgenda=LocalDateTime.now();
		
		Medico medicoObjeto=new Medico();
		medicoObjeto.setCedula(cedulaMedico);
		medicoObjeto.setNombre(nombreMedico);
		
		this.medico=medicoObjeto;
		
		//tercera edad (TE) y niño (N)
		if(tipo.equals("TE")) {
			PacienteTerceraEdad pacienteTE=new PacienteTerceraEdad();
			pacienteTE.setCodIess("234234");
			pacienteTE.setTipo("TE");
			
			this.paciente=pacienteTE;
			System.out.println("Paciente con descuento");
		}else {
			
			PacienteNino pacienteNino= new PacienteNino();
			pacienteNino.setPesonacimiento(5);
			pacienteNino.setTipo("N");
			
			this.paciente=pacienteNino;
			System.out.println("Paciente niño sin descuento");
		}
		
		this.paciente.setCedula(cedulaPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		this.guardarCita(this);
		
	}
	
	private void guardarCita(CitaMedica cita) {
		//Insert en la base de datos, guardar la cita
		System.out.println("se ha generado la citamedico");
		System.out.println(cita);
	}

	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	// GET Y SET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
