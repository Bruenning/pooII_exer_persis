package persis;

import java.io.IOException;
import java.util.List;

public interface Imports{

	public boolean gravar(Contatos contato) throws IOException;
	public boolean lerArquivo();
	public boolean apagar(Contatos contato);
	public boolean alterar(Contatos contato);

	public List<Contatos> mostrarContatos();
}
