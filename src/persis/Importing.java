package persis;

import java.io.IOException;
import java.util.List;

public class Importing<T extends Imports> implements Imports{

	private T imports;

	public Importing(T imports) {
		this.imports = imports;
	}

	@Override
	public boolean gravar(Contatos contato) throws IOException {
		return imports.gravar(contato);
	}

	@Override
	public boolean lerArquivo() {
		return false;
	}

	@Override
	public boolean apagar(Contatos contato) {
		return false;
	}

	@Override
	public boolean alterar(Contatos contato) {
		return false;
	}

	@Override
	public List<Contatos> mostrarContatos() {
		return null;
	}
}
