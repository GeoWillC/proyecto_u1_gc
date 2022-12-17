package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;


@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	private static List <Propietario> baseDeDatos=new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDeDatos.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(cedula));
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario=null;
		
		for (Propietario p : baseDeDatos) {
			if(p.getCedula().equals(cedula)) {
				propietario=p;
			}
		}
		return propietario;
	}

	
}
