package br.com.agendajsf.dto;

public class ContatoDTO {
	
	private String nome;
	private String ddd;
	private String numero;
	
	
	
	public ContatoDTO() {
	}
	public ContatoDTO(String name, String ddd, String numero) {
		this.nome = name;
		this.ddd = ddd;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
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
