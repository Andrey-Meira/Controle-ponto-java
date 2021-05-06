package views;


import java.util.Scanner;

import controllers.MarcacaoController;
import models.Marcacao;

public class ListaMarcacao {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		System.out.println("\n-------- RELATORIO DE HORAS TRABALHADAS --------\n");
		
		System.out.println("Entre com o PIS no funcionario");
		int pis = sc.nextInt();
		
		for(Marcacao marcacaoCadastrada : MarcacaoController.listarMarcacoes(pis)) {
			
			
				System.out.println(marcacaoCadastrada);
				System.out.println("\nHoras Trabalhadas: " + MarcacaoController.calculo(marcacaoCadastrada));
				System.out.println("--------------------------------------------------------------------");		
		}	
	}  
	

}
