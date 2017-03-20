package ifpr.edu.br.view;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import ifpr.edu.br.model.bean.Aluno;
import ifpr.edu.br.model.bean.Equipamento;
import ifpr.edu.br.model.bean.Pessoa;
import ifpr.edu.br.model.bean.Professor;
import ifpr.edu.br.model.conexao.Conexao;
import ifpr.edu.br.model.dao.EquipamentoDAO;
import ifpr.edu.br.model.regrasDeNegocio.EquipamentoRegras;

public class TelaTeste {

	public static void main(String[] args) {
		/**
		 *  Criar um Equipamento:
		 */
		//Equipamento eq1 = new Equipamento();
		/**
		 * Setar os dados do Equipamento:
		 */
		//eq1.setNomeEquipamento("teste equipamento");
		//eq1.setPesoSuportado(100);
		//eq1.setNumeroSerie("q12");
		
		/**
		 * Conexao com o Banco de Dados
		 */
		Connection con = Conexao.getConexao();
		EquipamentoDAO equipamentoDAO = new EquipamentoDAO(con);
		
		/**
		 * Criar um Equipamento no banco de Dados.
		 */
		//equipamentoDAO.criar(eq1);
		/**
		 * Deletar o Equipamento no Banco de Dados
		 */
		//equipamentoDAO.delete("q122");
		
		/**
		 * Buscar um Equipamento pelo ns dentro do Banco de Dados
		 */
		Equipamento equipamento = equipamentoDAO.busca("q12");
		System.out.println("Busca Nome Equipamento:  = " + equipamento.getNomeEquipamento());

		/**
		 *  para Trocar o nome do equipamento
		 */
		//eq1.setNomeEquipamento("ola");
		
		/**
		 * Atualiza o Dados deste equipamento no Banco de Dados
		 */
		//equipamentoDAO.atualiza(eq1);
		
		/** 
		 * Imprime os dados do Equipamento ja Alterados
		 */
		System.out.println("Codigo Equipamento:  = " + equipamento.getCodigo());
		System.out.println("Nome Equipamento:  = " + equipamento.getNomeEquipamento());
		System.out.println("PesoSuportado Equipamento:  = " + equipamento.getPesoSuportado());
		System.out.println("Numero de Serie Equipamento:  = " + equipamento.getNumeroSerie());
		System.out.println("_________________________________"+ '\n');
		/**
		 * Listar os objetos.
		 */
		List<Equipamento> lista = equipamentoDAO.lista();
		for (Equipamento equipamento2 : lista) {
			System.out.println(equipamento.getNomeEquipamento());
		}		
		System.out.println("___________________" + '\n');
		/*
		 * Criar Aluno.
		 */
		Aluno rick = new Aluno("Ricardo", "Alexandre", "(44)99928-9910", "Rua Carlos Drumont de Andrade, 417", "Goioere", 
				"20/07/1977", "20/07/1977", "Nori", 1500.00);
		try {
			SimpleDateFormat dn = new SimpleDateFormat("dd/MM/yyyy");
			Date dataNascimento = dn.parse("20/07/1977");
			SimpleDateFormat vm = new SimpleDateFormat("dd/MM");
			Date vencimentoMensalidade = vm.parse("20/07");
		System.out.println("Nome: " + rick.getNome());
		System.out.println("Sobrenome: " + rick.getSobrenome());
		System.out.println("Celular: " + rick.getTelefone());
		System.out.println("Endereco: " + rick.getEndereco());
		System.out.println("Cidade: " + rick.getCidade());
		System.out.println("Nascimento: " + dn.format(dataNascimento));
		System.out.println("Vencimento Mensalidade: " + vm.format(vencimentoMensalidade));
		System.out.println("Professor: " + rick.getProfessor());
		System.out.println("Mensalidade: R$ " + rick.getValorMensalidade());
		} catch (ParseException e) {
			e.printStackTrace();
		}
 
		
	/**
	 * 
	 */
		System.out.println("________________________________________");
		
		
	/**
	 *  Criar Professor:
	 */
	Professor nori = new Professor("Nori", "Bueno", "(44)99999-9999", "casa dele", "goioere", "01/01/1978", 
			"Educacao Fisica", "musculacao", "08:00", 1500.00, "01/02", "nori", "bueno");
	try {
		SimpleDateFormat dn = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento = dn.parse("01/01/1978");
		
		SimpleDateFormat hr = new SimpleDateFormat("hh:mm");
		Date horario = hr.parse("08:00");
	
		SimpleDateFormat vencsal = new SimpleDateFormat("dd/MM");
		Date vencimentoSalario = vencsal.parse("01/02");
		

	
	System.out.println("Nome: " + nori.getNome());
	System.out.println("Sobrenome: " + nori.getSobrenome());
	System.out.println("Celular: " + nori.getTelefone());
	System.out.println("Endereco: " + nori.getEndereco());
	System.out.println("Cidade: " + nori.getCidade());
	System.out.println("Nascimento: " + dn.format(dataNascimento));
	System.out.println("Formacao: " + nori.getFormacao());
	System.out.println("Especializacao: " + nori.getEspecializacao());
	System.out.println("Horario: " + hr.format(horario));
	System.out.println("Salario: " + nori.getSalario());
	System.out.println("Vencimento Salario: " + vencsal.format(vencimentoSalario));
	System.out.println("Login: " + nori.getLogin());
	System.out.println("Senha: " + nori.getSenha());
	} catch (ParseException e) {
		e.printStackTrace();
	}
	}
	

	
}