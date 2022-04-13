package com.trabajo1.complementos;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implementacion implements Dependencia{

	@Override
	public void salida_mensaje(String mensaje) {
	System.out.println("La respuesta es:");
	System.out.println(mensaje);
		
	}

	@Override
	public int leer_teclado() {
		System.out.println("Ingrese un valor:");
		Scanner leer=new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		int suma=a+b;
		return String.valueOf(suma);
	}

	@Override
	public String resta(int a, int b) {
		int resta=a-b;
		return String.valueOf(resta);
	}

	@Override
	public String multiplica(int a, int b) {
		int mult=a*b;
		return String.valueOf(mult);
	}

	@Override
	public String division(int a, int b) {
		int division=a+b;
		return String.valueOf(division);
	}

	@Override
	public String mayor(int a, int b) {
		if (a>b) {
			return("a es mayor q b");
		}else {
			return ("b es mayor q a");
		}
	}
	

	@Override
	public ArrayList<String> tabla(int tabladel) {
		ArrayList<String> lista=new ArrayList<>();
		for (int i = 0; i<10 ; i++) {
		
			lista.add(String.valueOf(i*tabladel));
			
		}
		return lista;
	}



	

}
