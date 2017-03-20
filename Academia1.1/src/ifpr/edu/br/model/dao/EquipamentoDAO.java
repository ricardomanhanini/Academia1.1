package ifpr.edu.br.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ifpr.edu.br.model.bean.Equipamento;

public class EquipamentoDAO {
	private Connection conexao;
	
	public EquipamentoDAO(Connection conexao){
		this.conexao = conexao;
	}
	
	/**
	 * Criar um Equipamento no Banco de Dados.
	 */
	public void criar (Equipamento equipamento){
		try {
			String sql = "insert into equipamento (nomeequipamento, pesosuportado, numerodeserie) values (?,?,?);";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, equipamento.getNomeEquipamento());
			ps.setInt(2, equipamento.getPesoSuportado());
			ps.setString(3, equipamento.getNumeroSerie());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Apaga um Equipamento no Banco de Dados pelo Numero de Serie.
	 */
	public void delete (String ns){
		try {
			String sql = "delete from equipamento where numerodeserie = ?;";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, ns);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Busca um Equipamento no Banco de Dados pelo Numero de Serie
	 */
	public Equipamento busca (String ns){
		Equipamento equipamento = new Equipamento();
		try {
			String sql = "select * from equipamento where numerodeserie = '" + ns + "';";
			Statement query = conexao.createStatement();
			ResultSet rs = query.executeQuery(sql);
			while (rs.next()){
				equipamento.setCodigo(rs.getInt("codigo"));
				equipamento.setNomeEquipamento(rs.getString("nomeEquipamento"));
				equipamento.setPesoSuportado(rs.getInt("pesoSuportado"));
				equipamento.setNumeroSerie(rs.getString("numerodeSerie"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return equipamento;
	}

	/**
	 * Busca uma Lista de Todos os Equipamentos no Banco de Dados.
	 */
	public List<Equipamento> lista(){
		ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
		try {
			String sql = "select * from equipamento;";
			Statement query = conexao.createStatement();
			ResultSet rs = query.executeQuery(sql);
			while (rs.next()){
				Equipamento equipamento = new Equipamento();
				equipamento.setCodigo(rs.getInt("Codigo"));
				equipamento.setNomeEquipamento(rs.getString("NomeEquipamento"));
				equipamento.setPesoSuportado(rs.getInt("pesosuportado"));
				equipamento.setNumeroSerie(rs.getString("PesoSuportado"));
				equipamentos.add(equipamento);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return equipamentos;
	}
	
	/**
	 * Lista de Todos os Equipamentos por Nome.
	 */

	public List<Equipamento> listanome(String nomeEquip){
		ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
		try {
			/**
			 * 
			 */
			String sql = "select * from equipamento where nomeequipamento = ?;";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, nomeEquip);
			ps.executeUpdate();
			ps.close();
			
			/**
			 * 
			 */
			Statement query = conexao.createStatement();
			ResultSet rs = query.executeQuery(sql);
			while (rs.next()){
				Equipamento equipamento = new Equipamento();
				equipamento.setCodigo(rs.getInt("Codigo"));
				equipamento.setNomeEquipamento(rs.getString("NomeEquipamento"));
				equipamento.setPesoSuportado(rs.getInt("pesosuportado"));
				equipamento.setNumeroSerie(rs.getString("PesoSuportado"));
				equipamentos.add(equipamento);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return equipamentos;
	}
	/**
	 * Atualiza um Equipamento no Banco de Dados
	 */
	public void atualiza(Equipamento equipamento){
		try {
			String sql = "update equipamento set codigo = ?, nomeequipamento = ?, pesosuportado = ? where numerodeserie = ?;";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, equipamento.getCodigo());
			ps.setString(2, equipamento.getNomeEquipamento());
			ps.setInt(3, equipamento.getPesoSuportado());
			ps.setString(4, equipamento.getNumeroSerie());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}

