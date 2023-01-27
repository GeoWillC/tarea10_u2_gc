package com.example.demo.cuenta.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.cuenta.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	@Override
	public Usuario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Usuario.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario=this.buscar(id);
		this.entityManager.remove(usuario);
	}

}
