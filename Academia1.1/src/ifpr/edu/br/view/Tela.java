package ifpr.edu.br.view;

import java.sql.Connection;

import ifpr.edu.br.model.bean.Aluno;
import ifpr.edu.br.model.conexao.Conexao;
import ifpr.edu.br.model.dao.AlunoDAO;


public class Tela {

	public static void main(String[] args) {

		Aluno rick = new Aluno("ricardo", "sobrenome", "telefone", "endereco", "cidade", "dataNascimento", "vencimentoMensalidade", "professor", 100.0);
		Connection con = Conexao.getConexao();
		AlunoDAO alunodao = new AlunoDAO(con);
		
		/**
		 * Criar um Equipamento no banco de Dados.
		 */
		alunodao.criar(rick);
		//equipamentoDAO.criar(eq1);
	}

}
