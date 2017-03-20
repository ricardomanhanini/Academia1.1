package ifpr.edu.br.model.regrasDeNegocio;

import ifpr.edu.br.model.bean.Equipamento;
import ifpr.edu.br.model.conexao.Conexao;
import ifpr.edu.br.model.dao.EquipamentoDAO;

/**
 * sddfgdfdf
 * 
 * @author Ricardo Manhanini
 *
 */
public class EquipamentoRegras {
	
	/**
	 * Cria equipamento a partir dos dados de um equipamento
	 * 
	 * @param nomeEquipamento
	 * @param pesoSuportado
	 * @param numeroSerie
	 * @return Equipamento
	 */
	public Equipamento criarEquipamento(String nomeEquipamento, int pesoSuportado, String numeroSerie) {
		Equipamento equipamento = new Equipamento();
		equipamento.setNomeEquipamento(nomeEquipamento);
		equipamento.setPesoSuportado(pesoSuportado);
		equipamento.setNumeroSerie(numeroSerie);
		return equipamento;
	}
	
	/**
	 * Cadastra o equipamento no banco de dados e retorna se o equipamento
	 * foi cadastrado com sucesso (O equipamento foi persistido no banco de dados)
	 * ou não foi cadastrado (O possível persistir o equipamento no banco dados)
	 * 
	 * @param equipamento
	 * @return String
	 */
	public String cadastrasEquipamento(Equipamento equipamento) {
		EquipamentoDAO equipamentoDAO = new EquipamentoDAO(Conexao.getConexao());
		Equipamento eqRetorno = equipamentoDAO.busca(equipamento.getNumeroSerie());
		if (eqRetorno != null) {
			equipamentoDAO.criar(equipamento);
			return "Equipamento cadastro com sucesso!";
		} else {
			return "Equipamento com este número de série já está cadastra do sistema.";			
		}
	}	
}
