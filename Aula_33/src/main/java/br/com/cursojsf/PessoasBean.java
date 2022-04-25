package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean(name = "pessoasBean")
public class PessoasBean {

	private String nome;
	private List<String> nomes = new ArrayList<String>();

	private HtmlCommandButton commandButton;

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	public String addNome() {
		nomes.add(nome);
		if (nomes.size() > 3) {
			commandButton.setDisabled(true);
			return "paginanavegada";
		}
		return ""; // null ou vazio fica na mesma pagina -> outcome
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
