package br.com.ifpb.servlet;
import java.util.ArrayList;
import java.util.List;
public class SimuladorBD {

	private static List<Contato> lista = new ArrayList<>();

	static {
		Contato c1 = new Contato("Joao", "(83)9999-9999");
		Contato c2 = new Contato("Maria", "(85)98887-3333");
		Contato c3 = new Contato("Jose", "(85)97777-4331");
		Contato c4 = new Contato("Roberta", "(85)98667-2222");
		SimuladorBD.lista.add(c1);
		SimuladorBD.lista.add(c2);
		SimuladorBD.lista.add(c3);
		SimuladorBD.lista.add(c4);
	}

	public void adiciona(Contato contato) {
		SimuladorBD.lista.add(contato);
	}

	public List<Contato> getContatos() {
		List<Contato> listaContato = SimuladorBD.lista;
		return listaContato;
	}
	public void deleta(String name) {
		
		for(int i =0; i<SimuladorBD.lista.size();i++) {
			if(SimuladorBD.lista.get(i).getName().equals(name)) {
				SimuladorBD.lista.remove(SimuladorBD.lista.get(i));
				break;
			}
		}
		
	}

}

