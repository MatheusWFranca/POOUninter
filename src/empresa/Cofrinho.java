package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	void listar() {
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda);
		}
	}
	
	public void valorConvertido() {
		double valorTotal = 0;
		
		for(Moeda moeda : listaMoedas) {
			valorTotal += moeda.converter();
		}
		
		System.out.print("O valor convertido para real é " + valorTotal);
	}
}	
