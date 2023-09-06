package persis.persistencia;

import persis.Contatos;
import persis.Imports;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Json implements Imports {

	private List<Contatos> contatos;

	public Json() {
		contatos = new ArrayList<Contatos>();
	}

	@Override
	public boolean gravar(Contatos contato) throws IOException {
		if(contatos.isEmpty())
			this.lerArquivo();

		boolean isvalid = false;


		contatos.add(contato);
		FileWriter writer = null;

		try {
			File caminho = new File("src/persis/files/contatos.json");

			writer = new FileWriter(caminho.getAbsolutePath());

			Gson gson = new Gson();

			String teste = gson.toJson(contatos);

			writer.write(teste);


			contatos = null;

			isvalid = true;

			writer.close();


		} catch (IOException e) {
			isvalid = false;
		} finally {

			return isvalid;
		}
	}

	@Override
	public boolean lerArquivo() {
		try {
			File caminho = new File("src/persis/files/contatos.json");

			FileReader fileReader = new FileReader(caminho);

			Gson gson = new Gson();

			Contatos[] contatos = gson.fromJson(fileReader, Contatos[].class);

			for (Contatos contato : contatos) {
				this.contatos.add(contato);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
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
		if(contatos.isEmpty())
			this.lerArquivo();

		return contatos;
	}
}
