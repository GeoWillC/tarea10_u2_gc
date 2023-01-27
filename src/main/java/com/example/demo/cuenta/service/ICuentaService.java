package com.example.demo.cuenta.service;

import com.example.demo.cuenta.modelo.Cuenta;

public interface ICuentaService {
	public void crear(Cuenta cuenta);

	public void modificar(Cuenta cuenta);

	public Cuenta encontrar(Integer id);

	public void eliminar(Integer id);

}
