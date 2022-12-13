package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository iClienteRepository;
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertar(cliente);
	}

}
