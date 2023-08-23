package persis.persistencia;

import persis.Contatos;
import persis.Imports;

import java.util.List;

public class Xml implements Imports {

	@Override
	public boolean gravar(Contatos contato) {
		System.out.println("Gravando contato em XML");
		return false;
	}

	@Override
	public boolean lerArquivo() {
		System.out.println("Lendo contato em XML");
		return false;
	}

	@Override
	public boolean apagar(Contatos contato) {
		System.out.println("Apagando contato em XML");
		return false;
	}

	@Override
	public boolean alterar(Contatos contato) {
		System.out.println("Alterando contato em XML");
		return false;
	}

	@Override
	public List<Contatos> mostrarContatos() {
		return null;
	}
}
