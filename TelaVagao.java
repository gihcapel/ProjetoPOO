
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaVagao extends JFrame {
	
	//Componentes da classe JanelaVagao
		private JTextField ttipo, tsubtipo, tbitola, tproprietario, tcomprimento;
		private JButton badicionar, bsalvar, bexcluir, bconsultar;
		private JPanel c;
		
		public TelaVagao(){
			super("TelaVagao");
			
			//Instanciação dos componentes
			ttipo = new JTextField();
			tsubtipo = new JTextField();
			tbitola = new JTextField();
			tproprietario = new JTextField();
			tcomprimento = new JTextField();
			badicionar = new JButton("Adicionar");
			bsalvar = new JButton ("Salvar");
			bexcluir = new JButton ("Excluir");
			bconsultar = new JButton ("Consultar");
			
			//Organizando layout dos componentes
                        JPanel painel = new JPanel();
			this.setLayout(new GridLayout(7, 2, 5, 5));
			painel.add(new JLabel("Tipo"));
			painel.add(new JLabel("Subtipo"));
			painel.add(new JLabel("Bitola"));
			painel.add(new JLabel("Proprietário"));
			painel.add(new JLabel("Comprimento do vagão"));
			painel.add(badicionar);
			painel.add(bsalvar);
                        painel.add(bexcluir);
			painel.add(bconsultar);
                        
                        badicionar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                adicionar();
                            }                            
                        });
                        
                        bsalvar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                salvar();
                            }                            
                        });
                        
                        bexcluir.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                excluir();
                            }                            
                        });
                        
                        bconsultar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                consultar();
                            }                            
                        });
                        
                        
                        setContentPane(painel);
			pack();
                        setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
                  
                   }     
                               
			
                }

    
