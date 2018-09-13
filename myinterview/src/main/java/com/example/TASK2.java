package com.example;


/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 * 
 */

/***
 *
 * Essa Tarefa não foi implementada por completo, implementei apenas o que consegui entender. 
 */
public class TASK2 {


	private Elememnto primeiro = null;
	private Elememnto ultimo = null;
	
	
	//Insere elemento na primeira posição da lista
	public void inserirPrimeiro(String valor){
		//Cria elemento
		Elememnto elememnto = new Elememnto();
		elememnto.setValor(valor);
		
		//Verifica se a lista esta vazia
		if(vazia()){
			//lista esta vazia, o ultimo esta como nulo, ele vai receber o elemento.
			this.ultimo = elememnto;
		}
		// o novo elemento define o pimeiro como o seu proximo elemento.
		elememnto.setProximo(this.primeiro);
		// o primeiro passa a ser o novo elemento.
		this.primeiro = elememnto;				
	}
	
	//Insere elemento na ultima posição da lista
	public void inserirUltimo(String valor){
		//Cria o elemento
		Elememnto elememnto = new Elememnto();
		elememnto.setValor(valor);
		
		//Verifica se a lista esta vazia
		if(vazia()){
			//true - o primeiro recebe o novo elemento
			this.primeiro = elememnto;
		}else{
			//false - o ultimo define o proximo como o novo elemento
			this.ultimo.setProximo(elememnto);
		}
		// Ultimo passa o ser o novo elemento
		this.ultimo = elememnto; 	
	}
	
	//Metodo para verificar se a lista esta vazia
	public boolean vazia(){
		return this.primeiro == null;
	}
	
	public Elememnto getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elememnto primeiro) {
		this.primeiro = primeiro;
	}

	public Elememnto getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elememnto ultimo) {
		this.ultimo = ultimo;
	}



	//Calsse Elemento
	public class Elememnto{
		private Elememnto anterior;
		private Elememnto proximo;
		private String valor;
		
		
		public Elememnto getAnterior() {
			return anterior;
		}
		public void setAnterior(Elememnto anterior) {
			this.anterior = anterior;
		}
		public Elememnto getProximo() {
			return proximo;
		}
		public void setProximo(Elememnto proximo) {
			this.proximo = proximo;
		}
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
			
	}
	 
}

