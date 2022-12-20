package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {


	@Autowired
	public IVehiculoService iVehiculoService;
	
	@Autowired
	public IPropietarioService iPropietarioService;
	
	@Autowired
	public IMatriculaService iMatriculaService;
	
	@Autowired
	@Qualifier("pesado")
	public IMatriculaNuevaService iMatriculaNuevaService;
	
	@Autowired
	@Qualifier("liviano")
	public IMatriculaNuevaService iMatriculaNuevaServiceLiviano;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vehiculo vehi=new Vehiculo();
		vehi.setMarca("Tocyota");
		vehi.setPlaca("PSGD2312");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		
		this.iVehiculoService.crear(vehi);
		
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		
		this.iVehiculoService.modificar(vehi);
		
		Propietario propietario=new Propietario();
		propietario.setApellido("Conlago"); 
		propietario.setCedula("1241241241");
		propietario.setFechaNacimiento(LocalDateTime.of(1999,12,12,12,12 ));
		propietario.setNombre("Willian");
		
		this.iPropietarioService.guardar(propietario);
		
		
		
		if (vehi.getTipo().equals("P")) {
			this.iMatriculaNuevaService.matricular("1241241241", "PSGD2312");
		}else {
			this.iMatriculaNuevaServiceLiviano.matricular("1241241241", "PSGD2312");
		}
		
	}

}