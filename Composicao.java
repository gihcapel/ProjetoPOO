package poo;

 
import java.util.ArrayList;

public class Composicao {
	private String nome;

    Composicao() {
        
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	protected ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
	protected ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
	
	public Composicao(String nome, ArrayList<Locomotiva> locomotivas, ArrayList<Vagao> vagoes) {
		this.nome = nome;
		this.locomotivas = locomotivas;
		this.vagoes = vagoes;
	}
	public ArrayList<Locomotiva> getLocomotivas() {
		return locomotivas;
	}
	public void setLocomotivas(ArrayList<Locomotiva> locomotivas) {
		this.locomotivas = locomotivas;
	}
	public ArrayList<Vagao> getVagoes() {
		return vagoes;
	}
	public void setVagoes(ArrayList<Vagao> vagoes) {
		this.vagoes = vagoes;
	}
	@Override
	public String toString() {
		return "Composicao [nome=" + nome + ", locomotivas=" + locomotivas + ", vagoes=" + vagoes + "]";
	}

}
