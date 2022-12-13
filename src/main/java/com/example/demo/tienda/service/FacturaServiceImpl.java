package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Detalle;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepository iFacturaRepository;

	@Override
	public void generar(String cedula, List<ItemTO> detalle) {
		// TODO Auto-generated method stub
		
	}


	
}
