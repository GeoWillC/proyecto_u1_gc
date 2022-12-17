package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Detalle;

@Repository
public class DetalleRepositoryImpl implements IDetalleRepository {

	private static List<Detalle> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub

		baseDeDatos.add(detalle);
	}

}
