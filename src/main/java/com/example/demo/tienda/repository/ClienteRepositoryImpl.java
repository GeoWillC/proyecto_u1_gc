package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository{

	private static List<Cliente> baseDeDatos=new ArrayList<>();
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Se ha agregado el cliente"+cliente);
		baseDeDatos.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente cli = null;
				for (Cliente cb : baseDeDatos) {
					if (cb.getCedula().equals(cliente.getCedula())) {
						cli=cb;
					}
				}
				baseDeDatos.remove(cli);
				baseDeDatos.add(cliente);

			}


	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli = null;
		for (Cliente cb : baseDeDatos) {
			if (cb.getCedula().equals(cedula)) {
				cli=cb;
			}
		}
		return cli;
	}
	

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli=buscar(cedula);
		baseDeDatos.remove(cli);
	}

}
