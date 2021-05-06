package models;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private int pis;
	private String empresa;
	private String cargo;
	private String setor;
	private String dataAdm;
			
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	public String getDataAdm() {
		return dataAdm;
	}
	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}
	
	@Override
	public String toString() {
		return "Funcionário : " + getNome() + 
				" | PIS: " + getPis() + 
				" | Empresa: " + getEmpresa() +
				" | Cargo: " + getCargo() +
				" | Setor: " + getSetor() +
				" | Admissão: " + dataAdm;
	}
	
}
