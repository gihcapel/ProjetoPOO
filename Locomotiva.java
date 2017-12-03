
public class Locomotiva {
	private int classe;
	private String descricao;
	private double pesoMaxLoc, bitolaLoc, comprimentoLoc;
	
	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPesoMaxLoc() {
		return pesoMaxLoc;
	}
	public void setPesoMaxLoc(double pesoMaxLoc) {
		this.pesoMaxLoc = pesoMaxLoc;
	}
	public double getBitolaLoc() {
		return bitolaLoc;
	}
	public void setBitolaLoc(double bitolaLoc) {
		this.bitolaLoc = bitolaLoc;
	}
	public double getComprimentoLoc() {
		return comprimentoLoc;
	}
	public void setComprimentoLoc(double comprimentoLoc) {
		this.comprimentoLoc = comprimentoLoc;
	}
	
	public Locomotiva(int classe, String descricao, double pesoMaxLoc, double bitolaLoc, double comprimentoLoc) {
		this.classe = classe;
		this.descricao = descricao;
		this.pesoMaxLoc = pesoMaxLoc;
		this.bitolaLoc = bitolaLoc;
		this.comprimentoLoc = comprimentoLoc;
	}
	@Override
	public String toString() {
		return "Locomotiva [classe=" + classe + ", descricao=" + descricao + ", pesoMaxLoc=" + pesoMaxLoc
				+ ", bitolaLoc=" + bitolaLoc + ", comprimentoLoc=" + comprimentoLoc + "]";
	}

	

}
