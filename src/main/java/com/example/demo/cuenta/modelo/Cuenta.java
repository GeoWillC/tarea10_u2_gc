package com.example.demo.cuenta.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuen_sec")
	@SequenceGenerator(name = "cuen_sec", sequenceName = "cuen_sec", allocationSize = 1)
	@Column(name="cuen_id")
	private Integer id;
	
	@Column(name="cuen_numero")
	private String numero;
	
	@Column(name="cuen_monto")
	private BigDecimal monto;
	
	@ManyToOne
	@JoinColumn(name="cuen_id_usuario")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numero=" + numero + ", monto=" + monto + "]";
	}
	
}
