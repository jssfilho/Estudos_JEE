package br.com.agendajsf.Bean;


import java.io.IOException;

import javax.annotation.ManagedBean;

import javax.faces.bean.ViewScoped;

import br.com.agendajsf.dao.DAO;
import br.com.agendajsf.model.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void create() throws IOException {

		new DAO<Pessoa>(Pessoa.class).adiciona(this.pessoa);
	}
}