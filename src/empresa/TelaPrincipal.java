package empresa;

import java.util.Scanner;

public class TelaPrincipal {
	
	public static void main(String[] args) {

		Scanner digite = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		Moeda moeda = null;
		
		int opcao, escolha;
		double quantidade;
		boolean pergunta;
		
		System.out.println("\nMenu inicial");
		System.out.println("01 - Adicionar Moeda");
		System.out.println("02 - Remover Moeda");
		System.out.println("03 - Listar Moedas");
		System.out.println("04 - Converter Moeda");
		System.out.println("00 - Sair");
		
		opcao = digite.nextInt();
		
		
		while(opcao != 0) {
			
			switch(opcao) {
			
			case 1:
				pergunta = false;
				escolha = 0;
				
				String perguntaPrint = "1 - Real\n2 - Dolar\n3 - Euro";
				
				while(pergunta == false) {
					System.out.println(perguntaPrint);
					escolha = digite.nextInt();
					pergunta = true;
				}

				String quantidadePrint = "Qual a quantidadade ?";
				
				if(escolha == 1) {
					System.out.println(quantidadePrint);
					quantidade = digite.nextDouble();
					moeda = new Real(quantidade);
					
				} else if(escolha == 2) {
					System.out.println(quantidadePrint);
					quantidade = digite.nextDouble();
					moeda = new Dolar(quantidade);
					
				} else if (escolha == 3) {
					System.out.println(quantidadePrint);
					quantidade = digite.nextDouble();
					moeda = new Euro(quantidade);
				} else {
					System.out.println("Tipo de moeda invalido, digite novamente");
				}
				
				cofrinho.adicionar(moeda);
							
			break;
				
			case 2:
				
				System.out.println("Qual moeda deseja remover?");
				System.out.println("1 - Real\n2 - Dolar\n3 - Euro");
				
				escolha = digite.nextInt();
				
				if(escolha == 1) {
					System.out.println("Qual a quantidadade ?");
					quantidade = digite.nextDouble();
					moeda = new Real(quantidade);
					cofrinho.remover(moeda);
					System.out.println("Moeda removida");
					
				} else if(escolha == 2) {
					System.out.println("Qual a quantidadade ?");
					quantidade = digite.nextDouble();
					moeda = new Dolar(quantidade);
					cofrinho.remover(moeda);
					System.out.println("Moeda removida");
					
					
				} else if (escolha == 3) {
					System.out.println("Qual a quantidadade ?");
					quantidade = digite.nextDouble();
					moeda = new Dolar(quantidade);
					cofrinho.remover(moeda);
					System.out.println("Moeda removida");
				}
				
				break;
				
			case 3:
				cofrinho.listar();
				
			case 4:
				cofrinho.valorConvertido();
				
			default:
				break;
			}
			
			System.out.println("\nMenu inicial");
			System.out.println("01 - Adicionar Moeda");
			System.out.println("02 - Remover Moeda");
			System.out.println("03 - Listar Moedas");
			System.out.println("04 - Converter Moeda");
			System.out.println("00 - Sair");
			
			opcao = digite.nextInt();
		}	
	}
}