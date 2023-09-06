package persis.persistencia;

import persis.Contatos;
import persis.Imports;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;


public class Csv implements Imports {

	private List<Contatos> contatos;

	public Csv() {
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
			File caminho = new File("src/persis/files/contatos.csv");

			writer = new FileWriter(caminho.getAbsolutePath());

			writer.write(Arrays.toString(new String[]{"nome", "telefone", "email", "dataNascimento"})+"\n");

			for(Contatos pessoa : contatos){
				StringBuilder linha = new StringBuilder();

				linha.append(pessoa.getNome());
				linha.append(",");
				linha.append(pessoa.getTelefone());
				linha.append(",");
				linha.append(pessoa.getEmail());
				linha.append(",");
				linha.append(String.valueOf(pessoa.getDataNascimento()));

				writer.write(linha.toString() + "\n");
				System.out.println(linha.toString());

			}
			isvalid = true;

		} catch (IOException e) {
			isvalid = false;
		}

		return isvalid;
	}

	@Override
	public boolean lerArquivo() {
		try {
			File caminho = new File("../files/contatos.csv");

			BufferedReader csvReader = new BufferedReader(new FileReader(caminho.getAbsolutePath()));

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
		return false;
	}

	@Override
	public boolean alterar(Contatos contato) {
		System.out.println("Alterando contato em CSV");
		return false;
	}

	@Override
	public List<Contatos> mostrarContatos() {
		return null;
	}


}
