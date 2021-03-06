package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean (name = "frutaBean")
public class FrutasBean {

	private String nome;
	private List<String>listaFrutas = new ArrayList<String>();
	private HtmlCommandButton htmlCommandButton;
	
	public String addFrutas() {
		listaFrutas.add(nome);
		if(listaFrutas.size() > 2) {
			htmlCommandButton.setDisabled(true);
			return "listaFru?faces-redirect=true";
		}
		return "";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getListaFrutas() {
		return listaFrutas;
	}
	public void setListaFrutas(List<String> listaFrutas) {
		this.listaFrutas = listaFrutas;
	}


	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}
	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}
	
	
	
	
	
	
	
	
	
	
}
