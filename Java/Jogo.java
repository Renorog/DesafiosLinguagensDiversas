package desafios;

import java.util.Scanner;

public class Jogo {
	   int j, pontuacao, erros, pl,c=0, k=1, qL=1;
	   String l;
	   String[]palavra = {"OSSO", "BISCOITO", "FABULAS", "DINHEIRO", "COMPUTADOR"};
	   char[] letras=new char[10]; //letras da palavra
	   char[] letraDigitada=new char[20]; //letras digitadas
	   char[] vResposta=new char[10];
	   
	   public void inicio(int j){
	  System.out.println("\n"+palavra[j]);
	 letras = palavra[j].toCharArray();  
	 for (int i=0; i<letras.length;i++){
	 System.out.print("_ ");
	 vResposta[i]='_';
	 }

	   }
	   
	   public void digitaLetra(){
	   Scanner ent=new Scanner(System.in);
	   if (qL<=6){
	   System.out.println("\nDigite uma letra: ");
	   l=ent.next();
	   l=l.toUpperCase();//converte para maiúsculo
	   letraDigitada[c]=l.charAt(0); 
	   verificaLetra(letraDigitada[c]);
	   }
	   }
	   
	   public void verificaLetra(char le){
	   for (int j=0; j< letras.length; j++){
	   if (letras[j]== le){
	  vResposta[j]=le;
	  qL--;
	  k++;
	   }
	      }
	   }
	   
	   public void exibeLetras(){
	  for(int i=0; i<letras.length;i++){
	  System.out.print(vResposta[i]+" ");
	 
	   }}
	  
	      public void nJogada(){
	         while (k<=letras.length){
	          digitaLetra();
	          exibeLetras();
	          
	         }
	      }
	 
	}
	
