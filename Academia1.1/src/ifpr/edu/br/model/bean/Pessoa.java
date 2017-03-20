package ifpr.edu.br.model.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String endereco;
	private String cidade;
	private Date dataNascimento;


	public Pessoa (String nome, String sobrenome, String telefone, String endereco, String cidade, String dataNascimento){
		try {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.telefone = telefone;
			this.endereco = endereco;
			this.cidade = cidade;
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			this.dataNascimento = df.parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Pessoa Criada com Sucesso");
	}

	/*Getters e Setters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
