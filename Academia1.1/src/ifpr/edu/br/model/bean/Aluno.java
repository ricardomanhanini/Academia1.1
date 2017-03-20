package ifpr.edu.br.model.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{

	private Date vencimentoMensalidade;
	private String professor;
	private Double valorMensalidade;
	
	
	public Aluno(String nome, String sobrenome, String telefone, String endereco, String cidade, 
			String dataNascimento, String vencimentoMensalidade, String professor, Double valorMensalidade) {
		super(nome, sobrenome, telefone, endereco, cidade, dataNascimento);
		try {
			this.valorMensalidade = valorMensalidade;
			this.professor = professor;
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			this.vencimentoMensalidade = df.parse(vencimentoMensalidade);
			System.out.println("Aluno Criado com Sucesso!");
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Getters e Setters
	 */
	public Date getVencimentoMensalidade() {
		return vencimentoMensalidade;
	}
	public void setVencimentoMensalidade(Date vencimentoMensalidade) {
		this.vencimentoMensalidade = vencimentoMensalidade;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Double getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
}