package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean (name = "pessoasBean")
public class PessoaBean {

	public String nome;
	public List<String>nomes = new ArrayList<String>();
	
	private HtmlCommandButton commandButton;
	
	
	public String addNome() {
		nomes.add(nome);
		
		if(nomes.size() > 3) {
			commandButton.setDisabled(true);
		}
		
		return "";
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getNomes() {
		return nomes;
	}
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}	
	
	
}
