/**********************************************************************************************
 *
 * 1/3 - Exibindo Números Pares
 *
 ******************************** Desafio:
 *
 * Crie um programa que leia um número e mostre os números pares até esse
 * número, inclusive ele mesmo.
 *
 ******************************** Entrada:
 *
 * Você receberá 1 valor inteiro N, onde N > 0.
 *
 ******************************** Saída:
 *
 * Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 *
 **********************************************************************************************/


package desafios;

public class pergunta2 {
	public static void main(String[] args) {
		int numero = 8;
		for (var i = 2; i <= numero; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
