package com.example.demo.banco.service;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public CuentaBancaria busrcarPorNumero(String numeroCuenta);


	public CuentaBancaria buscar(Integer id); //Primary key
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}
