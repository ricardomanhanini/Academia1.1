package ifpr.edu.br.model.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import ifpr.edu.br.model.bean.Equipamento;
import ifpr.edu.br.model.dao.EquipamentoDAO;

public class CriarTabelas {


	public static void main(String[] args) {
		criarTabelaEquipamentos();
		populaTabelaEquipamento();
	}
			
	private static void criarTabelaEquipamentos() {
		try {
			Connection conexao = FabricaDeConexoes.getConexao();
			Statement stmt = conexao.createStatement();
			String sql = "CREATE TABLE equipamento " +
						 "(ID INTEGER PRIMARY KEY AUTOINCREMENT,"  +
						 "NOMEEQUIPAMENTO		TEXT,"  +
						 "PESOSUPORTADO	INT," +
						 "NUMERODESERIE	TEXT)";
			stmt.executeUpdate(sql);
			stmt.close();
			} catch (SQLException e) {
					e.printStackTrace();
					}
		System.out.println("Tabela criada com sucesso!");	
		}
	
	private static void populaTabelaEquipamento() {
		Equipamento e1 = new Equipamento();
		e1.setNomeEquipamento("Bicicleta");
		e1.setPesoSuportado(100);
		e1.setNumeroSerie("123");
		
			
		Equipamento e2 = new Equipamento();
		e2.setNomeEquipamento("Esterira");
		e2.setPesoSuportado(100);
		e2.setNumeroSerie("321");
		
	
		EquipamentoDAO equipamentoDAO = new EquipamentoDAO(FabricaDeConexoes.getConexao());
		equipamentoDAO.criar(e1);
		//equipamentoDAO.criar(e2);
	
	}
	
}
