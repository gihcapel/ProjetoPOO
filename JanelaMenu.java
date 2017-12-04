package interfacagrafica;

import java.awt.*;
import javax.swing.*;

public class JanelaMenu extends JFrame{ 
    
	JPanel painel= new JPanel();
	private JButton btnCadastrarLocomotiva, btnCadastrarVagao, btnComposicao, btnListaLocomotiva, btnListaVagao;
        
	JanelaMenu(){
		super("Composição Ferroviária");
		btnLocomotiva = new JButton("Locomotiva");
		btnVagao = new JButton("Vagão");
		btnComposicao = new JButton("Composição");
		btnListaLocomotiva = new JButton("Consultar/Remover Locomotiva");
		
		painel.setLayout(new GridLayout(7, 2, 5, 5));
                painel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
                painel.setBackground(Color.WHITE);
		
		painel.add(btnLocomotiva);
		painel.add(btnVagao);
		painel.add(btnComposicao);
		pack();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(painel);
		
		btnLocomotiva.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JanelaLocomotiva l = new JanelaLocomotiva();
        		l.setVisible(true);
        		l.setSize(680,480);
                        l.setLocation(300,300);
            }                            
        });
		btnListaLocomotiva.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
		btnVagao.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JanelaVagao v = new JanelaVagao();
                        v.setVisible(true);
                        v.setSize(680,480);
                        v.setLocation(300,300);
            	
            }                            
        });
		btnComposicao.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
	}
}
