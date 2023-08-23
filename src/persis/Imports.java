package persis;

import java.util.List;

public interface Imports{

	public boolean gravar(Contatos contato);
	public boolean lerArquivo();
	public boolean apagar(Contatos contato);
	public boolean alterar(Contatos contato);

	public List<Contatos> mostrarContatos();
}
