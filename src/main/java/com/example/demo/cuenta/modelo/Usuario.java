package com.example.demo.cuenta.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usua_sec")
	@SequenceGenerator(name = "usua_sec", sequenceName = "usua_sec", allocationSize = 1)
	@Column(name="usua_id")
	private Integer id;
	@Column(name="usua_cedula")
	private String cedula;
	@Column(name="usua_fehca_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Cuenta> Cuenta;

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public List<Cuenta> getCuenta() {
		return Cuenta;
	}

	public void setCuenta(List<Cuenta> cuenta) {
		Cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", Cuenta="
				+ Cuenta + "]";
	}
}
