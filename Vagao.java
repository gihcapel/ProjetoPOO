public class Vagao {
	private char tipo, subtipo, bitola;
	private double pesoMax, bitolaMetro, comprimento;
	private String proprietario;
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getSubtipo() {
		return subtipo;
	}
	public void setSubtipo(char subtipo) {
		this.subtipo = subtipo;
	}
	public char getBitola() {
		return bitola;
	}
	public void setBitola(char bitola) {
		this.bitola = bitola;
	}
	public double getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(double pesoMax) {
		this.pesoMax= pesoMax;
	}

	public double getBitolaMetro() {
		return bitolaMetro;
	}
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
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "Vagao [tipo=" + tipo + ", subtipo=" + subtipo + ", bitola=" + bitola + ", pesoMax=" + pesoMax
				+ ", bitolaMetro=" + bitolaMetro + ", comprimento=" + comprimento + ", proprietario=" + proprietario
				+ "]";
	}
}
