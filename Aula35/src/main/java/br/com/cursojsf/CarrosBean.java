package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean (name = "carroBean")
public class CarrosBean {
	
	private String nome;
	private List<String>carros = new ArrayList<String>();
	
	private HtmlCommandButton htmlc;
	
	public String addCarros() {
		carros.add(nome);
		if(carros.size() > 10) {
			htmlc.setDisabled(true);
			return "listaCarros?faces-redirect=true";
		}
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getCarros() {
		return carros;
	}

	public void setCarros(List<String> carros) {
		this.carros = carros;
	}
	public HtmlCommandButton getHtmlc() {
		return htmlc;
	}
	public void setHtmlc(HtmlCommandButton htmlc) {
		this.htmlc = htmlc;
	}
		
	
}
