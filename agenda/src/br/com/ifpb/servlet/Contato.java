package br.com.ifpb.servlet;

import java.util.Date;

public class Contato {
	private String name;
	private String phone;
	private Date dataDeCadastro = new Date();
	
	public Contato() {
		
	}
	public Contato(String name,String phone) {
		this.name=name;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
	
}
