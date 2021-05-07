package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
	
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	
	public static void renderizar(){
		System.out.println("\n".repeat(10));
		funcionario = new Funcionario();
		System.out.println("\n-- CADASTRAR FUNCIONÁRIO --\n");
		System.out.println("\nInforme o nome do funcionário");
		funcionario.setNome(sc.next());
		System.out.println("\nInforme o nome da empresa");
		funcionario.setEmpresa(sc.next());
		System.out.println("\nInforme o cargo do funcionário");
		funcionario.setCargo(sc.next());
		System.out.println("\nInforme o setor do funcionário");
		funcionario.setSetor(sc.next());
		System.out.println("\nInforme o PIS do funcionário");
		funcionario.setPis(sc.nextInt());
		System.out.println("\nDigite a data de admissão do funcionário");
		
		
		String dataAdm = sc.next(); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = formatter.parse(dataAdm);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		funcionario.setDataAdm(dataAdm);
		
		if(FuncionarioController.cadastrar(funcionario.getPis(), funcionario)) {
			System.out.println("Funcionário cadastrado com sucesso");
		}else {
			System.out.println("Funcionário já existe");
		}
		System.out.println("----------------------------------");
	}
	
}
