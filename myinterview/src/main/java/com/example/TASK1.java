package com.example;

/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

	
	public static boolean veirficaPalavra(String palavra){
		
		//Inverte a palavra e guarda em uma varivel do tipo String
		String palavraPalindrome = new StringBuilder(palavra).reverse().toString();
		
		//Verifica se a palavra invertida é igual a palavra que veio por paramentro
		if(palavraPalindrome.equals(palavra)){
			return true;
		}		
		return false;
	}
	
	
	public static void main(String[] args){
		if(veirficaPalavra("natan")){
			System.out.println("A Palavra é palindrome ");
		}else{
			System.out.println("A Palavra não é palindrome ");
		}
	}
}
