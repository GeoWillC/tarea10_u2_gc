package com.example.demo.cuenta.repository;

import com.example.demo.cuenta.modelo.Usuario;

public interface IUsuarioRepo {
	//CRUD
	public void insertar(Usuario usuario);

	public void actualizar(Usuario usuario);

	public Usuario buscar(Integer id);

	public void borrar(Integer id);
}
