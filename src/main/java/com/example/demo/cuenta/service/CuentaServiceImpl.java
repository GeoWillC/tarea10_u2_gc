package com.example.demo.cuenta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cuenta.modelo.Cuenta;
import com.example.demo.cuenta.repository.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService{

	@Autowired
	private ICuentaRepo iCuentaRepo;
	
	@Override
	public void crear(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.insertar(cuenta);
	}

	@Override
	public void modificar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.actualizar(cuenta);
	}

	@Override
	public Cuenta encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCuentaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.borrar(id);
	}

}
