package view;

import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
		int totalNos = (int)((Math.random() * 10) + 1);
		for (int i = 0 ; i < totalNos ;i++) { //Empilha valores
			int e = (int)((Math.random() * 100) + 1);
			p.push(e);
		}
		int tamanho = p.size();
		System.out.println("Tamanho da pilha:" + tamanho);
		
		int top = 0;
		try {
			top = p.top();
			System.out.println("Top: " + top);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0 ; i < totalNos ; i++) {//Desempilhando todos os valores
			try {
				int valor = p.pop();
				System.out.println("Pop: "+valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("Vazia: "+vazia);
		}
		try {
			p.pop(); //Desempilhar em uma pilha vazia
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		p.push(1);
//		p.push(2);
//		p.push(3);
	}

}
