package desafios;
import java.util.List;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new ArrayList();
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add("Maria");
		
		lista.remove(1);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		System.out.println(lista.contains("Manoel"));
		System.out.println(lista.size());
	}

}
