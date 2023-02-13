package desafios;
import java.util.ArrayList;
import java.util.Scanner;


public class Crime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner resposta = new Scanner(System.in);
		
		ArrayList lista = new ArrayList();
				
		lista.add("Telefonou para a vítima? 1/Sim ou 0/Não: ");
		lista.add("Esteve no local do crime? 1/Sim ou 0/Não: ");
		lista.add("Mora perto da vítima? 1/Sim ou 0/Não: ");
		lista.add("Devia para a vítima? 1/Sim ou 0/Não: ");
		lista.add("Já trabalhou com a vítima? 1/Sim ou 0/Não: ");
		
		int numero = 0;
		int soma_resposta = 0;
		String resp;
		for(int i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i));
			numero = resposta.nextInt();
			resposta.nextLine();
			soma_resposta += numero;			
		}
		if(soma_resposta < 2) {
			System.out.println("Inocente");
		} else if(soma_resposta == 2) {
			System.out.println("Suspeita");
		} else if(soma_resposta <= 4) {
			System.out.println("Cúmplice");
		} else if(soma_resposta == 5){
			System.out.println("Culpado");
		} else {
			System.out.println("Por favor responda a pergunta com Sim ou Não.");
		}
		
		
		
	
		
		
		

	}

}


/*
 * Exercício: Crime
● Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
○ “Telefonou para a vítima?”
○ “Esteve no local do crime?”
○ “Mora perto da vítima?”
○ “Devia para a vítima?”
○ “Já trabalhou com a vítima?”
● Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como
“Assassino”. Caso contrário, ele será classificado como “Inocente”.*/
