package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoasBean {

	private String nome;
	private List<String> nomes = new ArrayList<String>();
	private HtmlCommandButton comHtmlCommandButton;
	
	
	
	public HtmlCommandButton getComHtmlCommandButton() {
		return comHtmlCommandButton;
	}

	public void setComHtmlCommandButton(HtmlCommandButton comHtmlCommandButton) {
		this.comHtmlCommandButton = comHtmlCommandButton;
	}

	public String addNome() {
		nomes.add(nome);
		if(nomes.size() >3) {
			comHtmlCommandButton.setDisabled(true);
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
	
	
}
