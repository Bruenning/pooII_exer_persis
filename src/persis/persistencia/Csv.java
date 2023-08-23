package persis.persistencia;

import persis.Contatos;
import persis.Imports;

import java.io.*;
import java.util.Date;
import java.util.List;

public class Csv implements Imports {

	private List<Contatos> contatos;

	@Override
	public boolean gravar(Contatos contato) {

		return false;
	}

	@Override
	public boolean lerArquivo() {
		try {
			File caminho = new File("src/persis/files/Contatos.json");

			BufferedReader csvReader = new BufferedReader(new FileReader(caminho));

			String row;

			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				// do something with the data

				Contatos contato = new Contatos();

				contato.setNome(data[0]);
				contato.setTelefone(data[1]);
				contato.setEmail(data[2]);
				contato.setDataNascimento(new Date(data[3]));

				contatos.add(contato);
			}


			csvReader.close();

			return true;
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public boolean apagar(Contatos contato) {
		System.out.println("Apagando contato em CSV");
	}

	@Override
	public boolean alterar(Contatos contato) {
		System.out.println("Alterando contato em CSV");
	}

	@Override
	public List<Contatos> mostrarContatos() {
		return null;
	}


}
