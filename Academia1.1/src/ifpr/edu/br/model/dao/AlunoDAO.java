package ifpr.edu.br.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ifpr.edu.br.model.bean.Aluno;

public class AlunoDAO {
	private Connection conexao;
	
	public AlunoDAO(Connection conexao){
		this.conexao = conexao;
	}
	
	public void criar (Aluno aluno){
		try {
			String sql = "insert into aluno (nome, sobrenome, telefone, endereco, cidade, datanascimento, vencmensalidade, professor, valormensalidade values (?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getSobrenome());
			ps.setString(3, aluno.getTelefone());
			ps.setString(4, aluno.getEndereco());
			ps.setString(5, aluno.getCidade());
			ps.setDate(6, (Date) aluno.getDataNascimento());
			ps.setDate(7, (Date) aluno.getVencimentoMensalidade());
			ps.setString(8, aluno.getProfessor());
			ps.setDouble(9, aluno.getValorMensalidade());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
}
