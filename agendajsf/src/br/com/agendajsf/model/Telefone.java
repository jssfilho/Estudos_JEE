package br.com.agendajsf.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;





@Entity
public class Telefone {
	
	@Id
	@GeneratedValue
	private Integer id; 
	
	@NotNull
	private String ddd;
	
	@NotNull
	private String numero; 
	
	@ManyToMany( fetch = FetchType.EAGER)
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	
	public Telefone() {
		
	}
	
	public void adicionaPessoa (Pessoa pessoa) {
		if (!this.pessoas.contains(pessoa)) {
			this.pessoas.add(pessoa);
		}
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
