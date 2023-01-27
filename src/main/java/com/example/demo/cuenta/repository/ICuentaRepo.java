package com.example.demo.cuenta.repository;

import com.example.demo.cuenta.modelo.Cuenta;

public interface ICuentaRepo {
	//CRUD
	public void insertar(Cuenta cuenta);

	public void actualizar(Cuenta cuenta);

	public Cuenta buscar(Integer id);

	public void borrar(Integer id);

}
