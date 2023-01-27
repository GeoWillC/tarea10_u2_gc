package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cuenta.modelo.Cuenta;
import com.example.demo.cuenta.modelo.Usuario;
import com.example.demo.cuenta.service.ICuentaService;
import com.example.demo.cuenta.service.IUsuarioService;

@SpringBootApplication
public class Tarea10U2GcApplication implements CommandLineRunner{

	@Autowired
	private IUsuarioService iUsuarioService;
	
	@Autowired
	private ICuentaService iCuentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea10U2GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuario =new  Usuario();
		usuario.setCedula("175121321");
		usuario.setFechaNacimiento(LocalDateTime.of(1999,12,21,1,1));
		List<Cuenta> cuentas=new ArrayList<>();
		Cuenta cuenta1=new Cuenta();
		cuenta1.setMonto(new BigDecimal(120));
		cuenta1.setNumero("A10");
		cuenta1.setUsuario(usuario);
		
		Cuenta cuenta2=new Cuenta();
		cuenta2.setMonto(new BigDecimal(120));
		cuenta2.setNumero("A10");
		cuenta2.setUsuario(usuario);
		
		Cuenta cuenta3=new Cuenta();
		cuenta3.setMonto(new BigDecimal(120));
		cuenta3.setNumero("A10");
		cuenta3.setUsuario(usuario);
		
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		
		usuario.setCuenta(cuentas);
		
		this.iUsuarioService.crear(usuario);
		System.out.println(this.iUsuarioService.encontrar(2));
		
		usuario.setFechaNacimiento(LocalDateTime.of(1999,12,21,1,21));
		this.iUsuarioService.modificar(usuario);
		System.out.println(this.iUsuarioService.encontrar(2));

		this.iUsuarioService.eliminar(2);
		
		
	}

}
