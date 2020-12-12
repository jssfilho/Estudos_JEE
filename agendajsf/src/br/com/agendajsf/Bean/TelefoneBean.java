package br.com.agendajsf.Bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.agendajsf.dao.DAO;
import br.com.agendajsf.dto.ContatoDTO;
import br.com.agendajsf.model.Telefone;

import br.com.agendajsf.model.Pessoa;

@ManagedBean
@ViewScoped
public class TelefoneBean {
	
	private Telefone telefone = new Telefone();
	private Integer pessoaId;


	
	public Telefone getTelefone() {
		return telefone;
	}
	public List<Pessoa> getPessoas() {
		return new DAO<Pessoa>(Pessoa.class).listaTodos();
	}
	public Pessoa getPessoa() {
		return new DAO<Pessoa>(Pessoa.class).buscaPorId(this.pessoaId);
	}
	public Integer getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(Integer pessoaId) {
		this.pessoaId = pessoaId;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public List<Pessoa> getPessoasTelefone() {
		return this.telefone.getPessoas();
	}
	public List<Telefone> getTelefones() {
		return new DAO<Telefone>(Telefone.class).listaTodos();
	}

	public void adicionarPessoa() {

		Pessoa pessoa = new DAO<Pessoa>(Pessoa.class).buscaPorId(this.pessoaId);
		this.telefone.adicionaPessoa(pessoa);
		
	}
	public void create() throws IOException {
		this.adicionarPessoa();
		new DAO<Telefone>(Telefone.class).adiciona(this.telefone);
		FacesContext.getCurrentInstance().getExternalContext().redirect("contatos.xhtml");
		
	}
	
	public List<ContatoDTO> getContatos(){
		List<ContatoDTO> contatos = new ArrayList<ContatoDTO>();
		Iterator<Telefone> telefones = this.getTelefones().iterator();
		Telefone tel = null;
		Pessoa pe = null;
		while(telefones.hasNext()) {
			tel = telefones.next();
			Iterator<Pessoa> pessoas = tel.getPessoas().iterator();
			while(pessoas.hasNext()) {
				
				pe = pessoas.next();
				
				contatos.add(new ContatoDTO(pe.getNome(),tel.getDdd(),tel.getNumero()));
			}
		}
		
		return contatos;
	}
	
}
