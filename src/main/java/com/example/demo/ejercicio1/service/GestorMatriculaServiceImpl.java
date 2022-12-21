package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaServicePesado;

	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void matricular(String cedula, String placa) {
		BigDecimal valor = null;
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		Propietario propietario = this.iPropietarioRepository.buscar(cedula);

		// TODO Auto-generated method stub

		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);

		if (vehiculo.getTipo().equals("P")) {
			valor = this.iMatriculaServicePesado.matricular( vehiculo.getPrecio());
			System.out.println("Se vehiculo es PESADO");
		} else {
			valor = this.iMatriculaServiceLiviano.matricular(vehiculo.getPrecio());
			System.out.println("Se vehiculo es LIVIANO");
		}
		// Programo descuento
		if (valor.compareTo(new BigDecimal(2000)) > 1) {
			BigDecimal descuento = valor.multiply(new BigDecimal(0.7));
			valor = valor.subtract(descuento);
		}
		matricula.setValor(valor);

		this.iMatriculaRepository.insertar(matricula);
		
		System.out.println("Se matriculo el vehiculo "+matricula);
		System.out.println("El valor es "+valor);
	}
}