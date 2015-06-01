package com.lineadecodigo.java.basico;

/**
 * @file NumeroAleatorio.java
 * @version 1.2
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25-marzo-2007
 * @url    http://lineadecodigo.com/java/numero-aleatorio-en-java/
 * @description C�digo para generar n�mero aleatorios en Java entre 1 y 25 
 */


public class NumeroAleatorio {

	public static void main(String[] args) {

		int numeroAleatorio = (int) (Math.random()*25+1);
		System.out.println("El n�mero aleatorio entre 1 y 25 es: " + numeroAleatorio);
			
	}

}
