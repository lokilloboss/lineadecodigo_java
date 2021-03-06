package com.lineadecodigo.java.string;

/**
 * @file PalabraMasLarga.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26-agosto-2007
 * @url    http://lineadecodigo.com/2007/08/26/java-y-la-palabra-mas-larga-de-una-frase/
 * @description Programa que calcula cual es la palabra m�s larga de una frase.  
 */


import java.util.StringTokenizer;

public class PalabraMasLarga {

	public static void main(String[] args) {

		// Cadena de texto
	    String sTexto = "En un lugar de la mancha de cuyo nombre no quiero acordarme";

	    // Particionador
	    StringTokenizer stTexto = new StringTokenizer(sTexto);

	    
	    String sCadena;	    
	    String palabraMasGrande = "";
	    int palabraMasGrandeSize = 0;
	    
	    int palabras = stTexto.countTokens();
	    
	    for (int x=0;x<palabras;x++){
	    	sCadena = stTexto.nextToken();
	    	if (sCadena.length() > palabraMasGrandeSize){
	    		palabraMasGrande = sCadena;
	    		palabraMasGrandeSize = sCadena.length();
	    	}
	      	System.out.println(sCadena);
	    }
	    
	    System.out.println("La palabra m�s larga de la cadena es: " + palabraMasGrande + ", con " + palabraMasGrandeSize + " caracteres");
	    
	}

}
