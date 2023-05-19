package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean")
@ApplicationScoped
public class PessoaBean {
	
	private String nome;
	private List<String> nomes = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	public String addNome() {
		nomes.add(nome);
		return "";
	}
	
}
