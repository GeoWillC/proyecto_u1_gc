package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
	
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Autowired
	private ICuentaBancariaService bancariaService;

	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscarTodo();
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//Origen
		//Paso 1: Buscar cuenta origen
		CuentaBancaria origen= this.bancariaService.busrcarPorNumero(numeroOrigen);
		//Paso 2: Consultar el saldo de la cuenta origen
		BigDecimal saldoOrigen= origen.getSaldo();
		//Paso 3: Operacion (Resta en el origen)
		//Nuebo saldo=saldoorigen-monto
		BigDecimal nuevoSaldo=saldoOrigen.subtract(monto);
		//Paso 4: Actualizacion en la cuenta origen
		origen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(origen);
		
		//Destino
		//Paso 1: Buscar cuenta destino
		CuentaBancaria destino=this.bancariaService.busrcarPorNumero(numeroDestino);
		//Paso 2: Consultar el saldo de la cuenta destino
		BigDecimal saldoDestino= destino.getSaldo();
		//Paso 3: Operacion (Suma en el destino)
		BigDecimal nuevoSaldoDestino=saldoDestino.add(monto);
		//Paso 4: Actualizacion en la cuenta destino
		destino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(destino);
		
	}

}
