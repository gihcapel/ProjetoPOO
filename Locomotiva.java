
package ComposicaoFerroviaria;
  
  public class Locomotiva {
 -	
 -	//Componentes da classe locomotiva
  	private int classe;
  	private String descricao;
 -	private double pesoMaxRebocavel;
 -	private double bitola;
 -	private double comprimentoLocomotiva;
 +	private double pesoMaxLoc, bitolaLoc, comprimentoLoc;
  	
 -	//Métodos getters e setters da classe locomotiva
  	public int getClasse() {
  		return classe;
  	}
 @@ -22,25 +16,38 @@ public String getDescricao() {
  	public void setDescricao(String descricao) {
  		this.descricao = descricao;
  	}
 -	public double getPesoMaxRebocavel() {
 -		return pesoMaxRebocavel;
 +	public double getPesoMaxLoc() {
 +		return pesoMaxLoc;
  	}
 -	public void setPesoMaxRebocavel(double pesoMaxRebocavel) {
 -		this.pesoMaxRebocavel = pesoMaxRebocavel;
 +	public void setPesoMaxLoc(double pesoMaxLoc) {
 +		this.pesoMaxLoc = pesoMaxLoc;
  	}
 -	public double getBitola() {
 -		return bitola;
 +	public double getBitolaLoc() {
 +		return bitolaLoc;
  	}
 -	public void setBitola(double bitola) {
 -		this.bitola = bitola;
 +	public void setBitolaLoc(double bitolaLoc) {
 +		this.bitolaLoc = bitolaLoc;
  	}
 -	public double getComprimentoLocomotiva() {
 -		return comprimentoLocomotiva;
 +	public double getComprimentoLoc() {
 +		return comprimentoLoc;
  	}
 -	public void setComprimentoLocomotiva(double comprimentoLocomotiva) {
 -		this.comprimentoLocomotiva = comprimentoLocomotiva;
 +	public void setComprimentoLoc(double comprimentoLoc) {
 +		this.comprimentoLoc = comprimentoLoc;
  	}
  	
 +	public Locomotiva(int classe, String descricao, double pesoMaxLoc, double bitolaLoc, double comprimentoLoc) {
 +		this.classe = classe;
 +		this.descricao = descricao;
 +		this.pesoMaxLoc = pesoMaxLoc;
 +		this.bitolaLoc = bitolaLoc;
 +		this.comprimentoLoc = comprimentoLoc;
 +	}
 +	@Override
 +	public String toString() {
 +		return "Locomotiva [classe=" + classe + ", descricao=" + descricao + ", pesoMaxLoc=" + pesoMaxLoc
 +				+ ", bitolaLoc=" + bitolaLoc + ", comprimentoLoc=" + comprimentoLoc + "]";
 +	}
 +
  	
  
  }

