package com.example.demo.cuenta.service;

import com.example.demo.cuenta.modelo.Usuario;

public interface IUsuarioService {
	//CRUD
	public void crear(Usuario usuario);

	public void modificar(Usuario usuario);

	public Usuario encontrar(Integer id);

	public void eliminar(Integer id);
}
