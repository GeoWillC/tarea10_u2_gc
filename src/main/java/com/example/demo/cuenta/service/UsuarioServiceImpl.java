package com.example.demo.cuenta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cuenta.modelo.Usuario;
import com.example.demo.cuenta.repository.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepo iUsuarioRepo;

	@Override
	public void crear(Usuario usuario) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.insertar(usuario);
	}

	@Override
	public void modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.actualizar(usuario);
	}

	@Override
	public Usuario encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iUsuarioRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.borrar(id);
	}
	


}
