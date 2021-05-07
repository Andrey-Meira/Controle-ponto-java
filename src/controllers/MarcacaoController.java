package controllers;

import java.util.ArrayList;

import models.Marcacao;

public class MarcacaoController {

	private static ArrayList<Marcacao> marcacoes = new ArrayList<Marcacao>();

	public static ArrayList<Marcacao> listarMarcacoes(){
		return marcacoes;
	}
	
	public static boolean cadastrar(Marcacao marcacao){
		
		marcacoes.add(marcacao);
		return true;
		
	}
		public static double calculo(Marcacao calculo) {
					
					
			double horasDia = (calculo.getSaidaAlmoco() - calculo.getEntrada()) + (calculo.getSaida() - calculo.getVoltaAlmoco());
//			// 9
//			double Auxiliar1 = 0;
//			double Auxiliar2;
//			
//			Auxiliar2 = Auxiliar1 + horasDia;
			return horasDia;
			
		
		}
	
}
     
	
	
	
	
