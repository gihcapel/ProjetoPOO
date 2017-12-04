package interfacagrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import ClassesPrincipais.Vagao;

import javax.swing.*;


public class JanelaVagao extends JFrame {
	
                /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
				//Componentes da classe JanelaVagao
                private JLabel ltipo, lsubtipo, lbitola, lproprietario, lcomprimento, lpesomax, lbitolametro;
		private JTextField ttipo, tsubtipo, tbitola, tproprietario, tcomprimento, tpesomax, tbitolametro;
		private JButton btnadicionar, btnsalvar, btnexcluir, btnconsultar;
		JPanel painel = new JPanel();
		ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
		public JanelaVagao(){
			super("Janela Vagão");
                        
                        ltipo = new JLabel("Tipo de vagão:");
                        lsubtipo = new JLabel("Subtipo do vagão:");
                        lbitola = new JLabel("Bitola:");
                        lproprietario = new JLabel("Proprietario:");
                        lcomprimento = new JLabel("Comprimento:");
                        lpesomax = new JLabel("Peso máximo:");
                        lbitolametro = new JLabel("Tamanho da bitola:");
			
			ttipo = new JTextField();
			tsubtipo = new JTextField();
			tbitola = new JTextField();
			tproprietario = new JTextField();
			tcomprimento = new JTextField();
                        tpesomax = new JTextField();
                        tpesomax.setEditable(false);
                        tbitolametro = new JTextField();
                        tbitolametro.setEditable(false);
                        
			btnadicionar = new JButton("Adicionar");
			btnsalvar = new JButton ("Salvar");
			btnexcluir = new JButton ("Excluir");
			btnconsultar = new JButton ("Consultar");
			
			                        
			painel.setLayout(new GridLayout(9, 2, 5, 5));
			painel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
                        painel.setBackground(Color.WHITE);
                        
                        painel.add(ltipo);
                        painel.add(ttipo);
                        painel.add(lsubtipo);
                        painel.add(tsubtipo);
                        painel.add(lbitola);
                        painel.add(tbitola);
                        painel.add(lproprietario);
                        painel.add(tproprietario);
                        painel.add(lcomprimento);
                        painel.add(tcomprimento);
                        painel.add(lpesomax);
                        painel.add(tpesomax);
                        painel.add(lbitolametro);
                        painel.add(tbitolametro);
			painel.add(btnadicionar);
			painel.add(btnsalvar);
                        painel.add(btnexcluir);
			painel.add(btnconsultar);
                        pack();
                        
                        setResizable(false);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setContentPane(painel);                        
			 
                   
                        btnadicionar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            	
                            	ttipo.setText("");
                            	tsubtipo.setText("");
                            	tbitola.setText("");
                            	tpesomax.setText("");
                            	tbitolametro.setText("");
                            	tcomprimento.setText("");
                            	tproprietario.setText("");
                            }                            
                        });
                        
                        btnsalvar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            	String nome= tproprietario.getText();
                            	char tipo= ttipo.getText().charAt(0), subtipo= tsubtipo.getText().charAt(0),
                            			bitola= tbitola.getText().charAt(0);
                            	double comprimento=Double.parseDouble(tcomprimento.getText());
                            	Vagao vagao = new Vagao(tipo, subtipo, bitola, comprimento, nome);
                            	vagoes.add(vagao);
                            	tpesomax.setText(String.valueOf(vagao.getPesoMax()));
                            	tbitolametro.setText(String.valueOf(vagao.getBitolaMetro()));
                            	
                            }                            
                        });
                        
                        btnexcluir.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                            }                            
                        });
                        
                        btnconsultar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            	System.out.println(vagoes);
                            }                            
                        });
                        
                        
                                     
                  
                   }     
                               
			
                }
