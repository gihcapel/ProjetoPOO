package interfacagrafica;


package poo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import poo.Locomotiva;

public class JanelaLocomotiva extends JFrame{
    private static final long serialVersionUID = 1L;
	private JLabel lvazia,lclasse,ldescricao,lbitola,lpesomax,lpesoadm,lcomprimento;
	private JTextField tclasse,tdescricao,tbitola,tpesomax,tpesoadm,tcomprimento;
	private JButton btnAdicionar, btnSalvar, btnExcluir, btnConsultar;
        
	JPanel painel1= new JPanel();
        
        ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
		public ArrayList<Locomotiva> getLocomotivas() {
			return locomotivas;
		}
		public void setLocomotivas(ArrayList<Vagao> vagoes) {
			this.locomotivas = locomotivas;
		}
	JanelaLocomotiva(){
		super("CadastroLocomotiva");
		lvazia= new JLabel("");
		lclasse = new JLabel("Tipo:");
		ldescricao = new JLabel("Subtipo:");
		lbitola = new JLabel("Proprietário:");
		lpesomax = new JLabel("Pesoadm:");
		lcomprimento = new JLabel("Comprimento:");

		tclasse = new JTextField();
		tdescricao = new JTextField();
		tbitola = new JTextField();
		tpesomax = new JTextField();
		tcomprimento = new JTextField();
		
		btnAdicionar = new JButton("Adicionar");
		btnSalvar = new JButton("Salvar");
                btnExcluir = new JButton ("Excluir");
		btnConsultar = new JButton ("Consultar");
		
		painel1.setLayout(new GridLayout(7, 2, 5, 5));
                painel1.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
                painel1.setBackground(Color.WHITE);
		
		painel1.add(lclasse);
		painel1.add(tclasse);
		painel1.add(ldescricao);
		painel1.add(tdescricao);
		painel1.add(lbitola);
		painel1.add(tbitola);
		painel1.add(lpesomax);
		painel1.add(tpesomax);
		painel1.add(lcomprimento);
		painel1.add(tcomprimento);
		painel1.add(btnAdicionar);
		painel1.add(btnSalvar);
                painel1.add(btnExcluir);
                painel1.add(btnConsultar);
		pack();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(painel1);
		
		btnAdicionar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            	
                            	tclasse.setText("");
                                tdescricao.setText("");
                            	tbitola.setText("");
                            	tpesomax.setText("");
                            	tcomprimento.setText("");
                            	                            }                            
                        });
                        
                        btnSalvar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                                int classe = Integer.parseInt(tbitola.getText());
                                String descricao = tdescricao.getText();
                                double bitola = Double.parseDouble(tbitola.getText());
                                double pesomax = Double.parseDouble(tpesomax.getText());
                                double comprimento = Double.parseDouble(tcomprimento.getText());
                                Locomotiva locomotiva = new Locomotiva(classe, descricao, bitola, pesomax, comprimento);
                                locomotivas.add(locomotiva);
                                                          	
                            }                            
                        });
                        
                        btnExcluir.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                            }                            
                        });
                        
                        btnConsultar.addActionListener(new java.awt.event.ActionListener(){
                            @Override
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                
                                JPanel panel = new JPanel();      
                                JTable table = new JTable();  
                                JFrame frame = new JFrame();   
                                /* 
                                 * Adicionar na o table model no Panel*/  
                                TableModelLocomotivas ntm = new TableModelLocomotivas(locomotivas);  
                                table.setBorder(new LineBorder(Color.black));  
                                table.setGridColor(Color.black);  
                                table.setShowGrid(true);  
                                table.setModel(ntm);  
                                panel.add(table);  
                                  
                                frame.add(panel);  
                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                                frame.pack();  
                                frame.setSize(540, 540);  
                                frame.setVisible(true);  
                          
                            }  
                        
                            	
                                                        
                        });
		}	
	}
