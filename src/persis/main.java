package persis;

import persis.persistencia.Json;

public class main {
	public static void main(String[] args) {
		Contatos contato = new Contatos();
		contato.setNome("Maria");
		contato.setEmail("joao@ao.com");
		contato.setTelefone("123456789");
		contato.setDataNascimento(new java.util.Date());

		Importing<Json> json = new Importing<Json>(new Json());

		json.gravar(contato);

	}
}
