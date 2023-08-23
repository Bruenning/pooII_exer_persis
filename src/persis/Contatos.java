package persis;

import java.util.Date;

public class Contatos {
	private String nome;
	private String telefone;
	private String email;
	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("persis.Contatos{");
		sb.append("nome='").append(nome).append('\'');
		sb.append(", telefone='").append(telefone).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", dataNascimento=").append(dataNascimento);
		sb.append('}');
		return sb.toString();
	}
}
