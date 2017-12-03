import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Vagao vagao1= new Vagao('A', 'B', 'C', 30, "125640");
		Vagao vagao2= new Vagao('B', 'D', 'E', 40, "256871");
		Locomotiva locomotiva1= new Locomotiva (1, "Loc1",30, 1, 2 );
		ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
		ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
		locomotivas.add(locomotiva1);
		vagoes.add(vagao1);
		vagoes.add(vagao2);
		Vagao vagaook = vagoes.get(1);
		Composicao composicao1 = new Composicao("composicao1",  (locomotivas), (vagoes));
		System.out.println(composicao1);
		System.out.println(vagaook);
	}
}
