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
 	private char tipo, subtipo, bitola;
 	private double pesoMax, bitolaMetro, comprimento;
 	private String proprietario;
 	public char getTipo() {
  		return tipo;
  	}
 	public void setTipo(String tipo) {
 	public void setTipo(char tipo) {
 		this.tipo = tipo;
  	}
 	public String getSubtipo() {
 	public char getSubtipo() {
  		return subtipo;
  	}
 	public void setSubtipo(String subtipo) {
 	public void setSubtipo(char subtipo) {
  		this.subtipo = subtipo;
  	}
 	public String getPesoMaxEBitola() {
 		return pesoMaxEBitola;
 	public char getBitola() {
 		return bitola;
  	}
 	public void setPesoMaxEBitola(String pesoMaxEBitola) {
 		this.pesoMaxEBitola = pesoMaxEBitola;
 	public void setBitola(char bitola) {
 		this.bitola = bitola;
  	}
 	public int getProprietario() {
 		return proprietario;
 	public double getPesoMax() {
 		return pesoMax;
 	}
 	public void setPesoMax(double pesoMax) {
		this.pesoMax= pesoMax;
 	}
 
 	public double getBitolaMetro() {
 		return bitolaMetro;
  	}
 	public void setProprietario(int proprietario) {
 	public void setBitolaMetro(double bitolaMetro) {
 			this.bitolaMetro = bitolaMetro;
 		}
 		
 	public double getComprimento() {
 		return comprimento;
 	}
 	public void setComprimento(double comprimento) {
 		this.comprimento = comprimento;
 	}
 	public Vagao(char tipo, char subtipo, char bitola, double comprimento, String proprietario) {
 		this.tipo = tipo;
		this.subtipo = subtipo;
 		this.bitola = bitola;
 		this.comprimento = comprimento;
  		this.proprietario = proprietario;
 		if (bitola=='A') {
 			setPesoMax(30);
 		}
 		else if (bitola=='B' || bitola=='P') {
 			setPesoMax(47);
 		}
 		else if (bitola=='C' || bitola=='Q') {
 			setPesoMax(64);
 		}
 		else if (bitola=='D' || bitola=='R') {
 			setPesoMax(80);
 		}
 		else if (bitola=='E' || bitola=='S') {
 			setPesoMax(100);
 		}
 		else if (bitola=='F' || bitola=='T') {
 			setPesoMax(119);
 		}
		else if (bitola=='G' || bitola=='U') {
 			setPesoMax(143);
 		}
 		if (bitola=='A' || bitola=='B' || bitola=='C' || bitola=='D' || bitola=='E' || bitola=='F'
 				 || bitola=='G'  ) {
 			setBitolaMetro(1);
 		}
 		else {
 			setBitolaMetro(1.6);
 		}
 	}
 	public String getProprietario() {
 		return proprietario;
  	}
 	public double getComprimentoVagao() {
 		return comprimentoVagao;
 	public void setProprietario(String proprietario) {
 		this.proprietario = proprietario;
  	}
 	public void setComprimentoVagao(double comprimentoVagao) {
 		this.comprimentoVagao = comprimentoVagao;
 	@Override
 	public String toString() {
 		return "Vagao [tipo=" + tipo + ", subtipo=" + subtipo + ", bitola=" + bitola + ", pesoMax=" + pesoMax
 				+ ", bitolaMetro=" + bitolaMetro + ", comprimento=" + comprimento + ", proprietario=" + proprietario
 				+ "]";
  	}
 	
 	
 	
 
  }

