package desafios;
import java.util.Scanner;

public class Jogada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Jogo j1= new Jogo();
	       int j=0;
	       String resp="S";
	       Scanner ent = new Scanner(System.in);
	       while (resp.equalsIgnoreCase("S")){
	           j1.inicio(j);
	        j1.nJogada(); 
	     //    j1.digitaLetra();
	      j++;
	      System.out.println(j);
	      if (j<5){
	      System.out.println("Deseja jogar novamente?");
	      resp=ent.next();
	          j1.k=1;}
	      else {resp="N";
	      }
	      }
	       System.out.println("FIM DO JOGO");

	}

}
