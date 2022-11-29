package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	//
	public CuentaBancaria busrcarPorNumero(String numeroCuenta);
//	public void actualizar(CuentaBancaria cuentaBancaria);
		
	//CRUD
	public CuentaBancaria buscar(Integer id); //Primary key
	//
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}