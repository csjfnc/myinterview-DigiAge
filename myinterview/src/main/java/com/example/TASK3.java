package com.example;

import java.util.ArrayList;
import java.util.List; 

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {
	
	//Metodo que imprime uma lista de Strings
	public static void inserirString(){
		List<String> lista = new ArrayList<String>();
		lista.add("Produtos");
		lista.add("Preços");
		lista.add("integração");
		lista.add("Analises");
		lista.add("Banco de Dados");
		lista.add("Java");
		lista.add("Sistemas");
		lista.add("Postgress");
		lista.add("Mysql");
		
		for(String i : lista){
			System.out.println(i);
		}
	}

	public static void main(String[] args){

		//Execução		
		inserirString();
	}
}
