package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Detalle;

public class DetalleRepositoryImpl implements IDetalleRepository {

	private static List<Detalle> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub

		baseDeDatos.add(detalle);
	}

}
