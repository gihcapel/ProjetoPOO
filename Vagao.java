package ComposicaoFerroviaria;

public class Vagao {
	//Componentes da classe vagão
	private String tipo;
	private String subtipo;
	private String pesoMaxEBitola;
	private int proprietario;
	private double comprimentoVagao;
	
	//Métodos getters e setters da classe vagão
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}
	public String getPesoMaxEBitola() {
		return pesoMaxEBitola;
	}
	public void setPesoMaxEBitola(String pesoMaxEBitola) {
		this.pesoMaxEBitola = pesoMaxEBitola;
	}
	public int getProprietario() {
		return proprietario;
	}
	public void setProprietario(int proprietario) {
		this.proprietario = proprietario;
	}
	public double getComprimentoVagao() {
		return comprimentoVagao;
	}
	public void setComprimentoVagao(double comprimentoVagao) {
		this.comprimentoVagao = comprimentoVagao;
	}
	
	
	

}

