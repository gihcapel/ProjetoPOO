package ComposicaoFerroviaria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JanelaVagao extends JFrame {
	
	//Componentes da classe JanelaVagao
	private JTextField ttipo, tsubtipo, tpesomaxebitola, tproprietario, tcomprimentovagao;
	private JButton blimpar, bsalvar;
	private JPanel c;
	
	public JanelaVagao(ActionListener e){
		super("JanelaVagao");
		
		//Instanciação dos componentes
		ttipo = new JTextField();
		tsubtipo = new JTextField();
		tpesomaxebitola = new JTextField();
		tproprietario = new JTextField();
		tcomprimentovagao = new JTextField();
		blimpar = new JButton("Limpar");
		bsalvar = new JButton ("Salvar");
		
		//Organizando layout dos componentes
		this.setLayout(new GridLayout(6, 2, 5, 5));
		add(new JLabel("Tipo"));
		add(new JLabel("Subtipo"));
		add(new JLabel("Peso máximo admissível e bitola"));
		add(new JLabel("Proprietário"));
		add(new JLabel("Comprimento do vagão"));
		add(blimpar);
		add(bsalvar);
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Colocando os listeners
		blimpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				bsalvar_click(e);
			}	
		});
		
		blimpar.addActionListener(e){
			ttipo.setText("");
			tsubtipo.setText("");
			tpesomaxebitola.setText("");
			tproprietario.setText("");
			tcomprimentovagao.setText("");
		}	
			
	}
	//Método para salvar as inforações sobre o vagão
	private void bsalvar_click(ActionEvent e) {
		
		
	}
