package desafios;

public class FatorialDe1A10 {
	// imprimir os fatoriais de 1 a 10.
	public static void main(String[] args) {
		
	

	int fatorial = 1;
	for(int n = 1; n < 11; n++) {
		fatorial *= n;
		System.out.println(fatorial);
		}
	}
}
