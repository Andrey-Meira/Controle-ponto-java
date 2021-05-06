package controllers;

import java.util.ArrayList;

import models.Marcacao;

public class MarcacaoController {

	private static ArrayList<Marcacao> marcacoes = new ArrayList<Marcacao>();
	
	public static ArrayList<Marcacao> listarMarcacoes(int pis){
		
		ArrayList<Marcacao> listaTemp = new ArrayList<Marcacao>();
		
		for(Marcacao marcCad : marcacoes) {
			
			if(marcCad.getPis() == pis) {
				listaTemp.add(marcCad);
			}
		}
		return listaTemp;
		
	}
	
	public static boolean cadastrar(Marcacao marcacao){
		
		marcacoes.add(marcacao);
		return true;
		
	}
		public static double calculo(Marcacao calculo) {
			double horast = (calculo.getSaidaAlmoco() - calculo.getEntrada()) + (calculo.getSaida() - calculo.getVoltaAlmoco());
			
			return horast;
		
		}
	
}
     
	
	
	
	
