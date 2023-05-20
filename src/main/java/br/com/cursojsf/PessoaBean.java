package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {
	
	private String nome;
	private List<String> nomes = new ArrayList<>();
	private HtmlCommandButton commandButton;
	
	private String senha;
	private String texto;
	
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

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
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
			return "paginanavegada?faces-redirect=true"; //retorna para a paginanavegada (URL)
		}
		return ""; //null ou vazio fica na mesma página
	}
	
	public String entrada() {
		System.out.println(nome);
		System.out.println(senha);
		System.out.println(this.texto);
		return ""; //null ou vazio fica na mesma página
	}
	
}
