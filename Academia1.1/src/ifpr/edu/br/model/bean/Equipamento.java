package ifpr.edu.br.model.bean;

public class Equipamento {
	private int codigo;
	private String nomeEquipamento;
	private int pesoSuportado;
	private String numeroSerie;
	
	/**
	 * Getters e Setters do Equipamento
	 */
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public final String getNomeEquipamento() {
		return nomeEquipamento;
	}
	public final void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}
	public final int getPesoSuportado() {
		return pesoSuportado;
	}
	public final void setPesoSuportado(int pesosuportado) {
		this.pesoSuportado = pesosuportado;
	}
	public final String getNumeroSerie() {
		return numeroSerie;
	}
	public final void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
}
