package persis.persistencia;

import persis.Contatos;
import persis.Imports;

import java.util.List;

public class MySql implements Imports {


	@Override
	public boolean gravar(Contatos contato) {
		System.out.println("Gravando contato em MySql");
		return false;
	}

	@Override
	public boolean lerArquivo() {
		System.out.println("Lendo contato em MySql");
		return false;
	}

	@Override
	public boolean apagar(Contatos contato) {
		System.out.println("Apagando contato em MySql");
		return false;
	}

	@Override
	public boolean alterar(Contatos contato) {
		System.out.println("Alterando contato em MySql");
		return false;
	}

	@Override
	public List<Contatos> mostrarContatos() {
		return null;
	}
}
