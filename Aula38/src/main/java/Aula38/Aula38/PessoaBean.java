package Aula38.Aula38;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;


@ViewScoped
@ManagedBean (name = "pessoaBean")
public class PessoaBean {
	
	private String nome;
	private String senha;
	private String texto;
	private List<String> lNomes = new ArrayList<String>();
	private HtmlCommandButton htmlCommandButton;
	
	public String addNome() {
		lNomes.add(nome);
		
		if(lNomes.size() > 3) {
			htmlCommandButton.setDisabled(true);
			return "pag?faces-redirect=true";
		
		}
		
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getlNomes() {
		return lNomes;
	}

	public void setlNomes(List<String> lNomes) {
		this.lNomes = lNomes;
	}

	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}

	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
