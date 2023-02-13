package desafios;

import java.util.Scanner;

public class Facil1 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		String texto1;
		int numero;
		double valor;
		Scanner texto = new Scanner(System.in);
		
		//lendo um inteiro
		System.out.println("Digite um núemro:");
		numero = texto.nextInt();
		texto.nextLine();
		
		//lendo um texto
		System.out.println("Digite um texto:");
		texto1 = texto.nextLine();
		
		System.out.println(numero);
		System.out.println(texto1);
		
		
		
	}

}
