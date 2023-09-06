package persis;

import persis.persistencia.Csv;
import persis.persistencia.Json;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		Contatos contato = new Contatos();
		contato.setNome("Maria");
		contato.setEmail("joao@ao.com");
		contato.setTelefone("123456789");
		contato.setDataNascimento(new java.util.Date());

		Importing<Csv> dependencia = new Importing<Csv>(new Csv());

		dependencia.gravar(contato);

		System.out.println(dependencia.mostrarContatos());


	}
}
