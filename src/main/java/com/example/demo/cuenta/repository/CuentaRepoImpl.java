package com.example.demo.cuenta.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.cuenta.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepoImpl implements ICuentaRepo{

	@PersistenceContext 
	private EntityManager entityManager;
	
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Cuenta cuenta=this.buscar(id);
		this.entityManager.remove(cuenta);
	}

}
