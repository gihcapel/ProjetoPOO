package ComposicaoFerroviaria;

import java.awt.*;

import javax.swing.*;


public class JanelaVagao extends JFrame {
	
	//Atributos da classe JanelaVagao
	private JLabel ltipo, lsubtipo, lpesomaxebitola, lproprietario, lcomprimentovagao;
	private JTextField ttipo, tsubtipo, tpesomaxebitola, tproprietario, tcomprimentovagao;
	private JButton blimpar, bsalvar;
	private JPanel c;
	
	public JanelaVagao(){
		super("JanelaVagao");
		
		//Instanciação dos atributos
		ltipo = new JLabel("Tipo");
		lsubtipo = new JLabel ("Subtipo");
		lpesomaxebitola = new JLabel ("Peso máximo admissível e bitola");
		lproprietario = new JLabel ("Proprietário");
		lcomprimentovagao = new JLabel ("Comprimento do vagão");
		ttipo = new JTextField();
		tsubtipo = new JTextField();
		tpesomaxebitola = new JTextField();
		tproprietario = new JTextField();
		tcomprimentovagao = new JTextField();
		blimpar = new JButton("Limpar");
		bsalvar = new JButton ("Salvar");
		
		c = new JPanel();
		c.setLayout(new GridLayout(2,2));
		c.add(ltipo); c.add(ttipo);
		c.add(lsubtipo); c.add(tsubtipo);
		c.add(lpesomaxebitola); c.add(tpesomaxebitola);
		c.add(lproprietario); c.add(tproprietario);
		c.add(lcomprimentovagao); c.add(tcomprimentovagao);
		c.add(blimpar); c.add(bsalvar);
		pack();
	}
	
	
	
	
	
}
