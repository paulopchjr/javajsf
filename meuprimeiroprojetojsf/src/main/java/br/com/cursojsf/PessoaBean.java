package br.com.cursojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "pessoaBean")
@RequestScoped 
public class PessoaBean {

	private String nome;
	private String sobrenome;
	private int idade;
	private String nomeCompleto;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	
	
	public String mostrarNome() {
		nomeCompleto = nome + " " + sobrenome;
		return "";
	}
}


