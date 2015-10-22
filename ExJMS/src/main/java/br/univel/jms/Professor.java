package br.univel.jms;

import java.io.Serializable;

public class Professor implements Serializable{

	private long Matricula;
	private String Nome;
	
	
	public long getMatricula() {
		return Matricula;
	}
	public void setMatricula(long matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	

}

