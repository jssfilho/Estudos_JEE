package br.com.agendajsf.model;



import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;



@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Integer Id; 
	
	@NotNull
	private String nome;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Genero genero; 
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date data_nascimento;
	
	
	public Pessoa() {
		
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
	
}
