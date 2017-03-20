package ifpr.edu.br.model.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor extends Pessoa {

	private String formacao;
	private String especializacao;
	private Date horario;
	private Double salario;
	private Date vencimentoSalario;
	private String login;
	private String senha;
	
	public Professor(String nome, String sobrenome, String telefone, String endereco, String cidade,
			String dataNascimento, String formacao, String especializacao, String horario, Double salario,
			String vencimentoSalario, String login, String senha) {
		super(nome, sobrenome, telefone, endereco, cidade, dataNascimento);
		
	try {
		this.formacao = formacao;
		this.especializacao = especializacao;
		this.salario = salario;
		this.login = login;
		this.senha = senha;
		SimpleDateFormat hr = new SimpleDateFormat("HH:MM");
		this.horario = hr.parse(horario);
		SimpleDateFormat vencsal = new SimpleDateFormat("dd/MM");
		this.vencimentoSalario = vencsal.parse(vencimentoSalario);
		System.out.println("Professor Criado com Sucesso!");
	}catch (ParseException e) {
		e.printStackTrace();}
	}
	/**
	 * Getters e Setters
	 */
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Date getVencimentoSalario() {
		return vencimentoSalario;
	}
	public void setVencimentoSalario(Date vencimentoSalario) {
		this.vencimentoSalario = vencimentoSalario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
