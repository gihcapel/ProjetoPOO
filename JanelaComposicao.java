package poo;

import java.awt.*;
import javax.swing.*;

public class JanelaComposicao extends JFrame{
    
        private JList listaVagoes, listaLocomotivas;
        private JLabel lVagao, lLocomotiva;
        private JButton btnCadastrar,btnLimpar;
        DefaultListModel modelv = new DefaultListModel();
        DefaultListModel modell = new DefaultListModel();
        JPanel painelComp = new JPanel();
        Composicao c = new Composicao();     
            
        JanelaComposicao(){
            super("Composição");
            lVagao = new JLabel("Vagões disponíveis");
            lLocomotiva = new JLabel("Locomotivas disponíveis");
            
            btnCadastrar = new JButton("Cadastrar");
            btnLimpar = new JButton("Limpar");
            
            listaVagoes = new JList(modelv);
            listaLocomotivas = new JList(modell);
                        
            painelComp.setLayout(new GridLayout(10, 1, 5, 5));
            painelComp.setBackground(Color.WHITE);
            
            painelComp.add(lVagao);
            modelv.addElement(c.getVagoes());
            for(int i = 0; i<c.getVagoes().size() ; i++){
                modelv.addElement(c.getVagoes().get(i));
            }            
            painelComp.add(listaVagoes);
            
            painelComp.add(lLocomotiva);
            modell.addElement(c.getVagoes());
            for(int i = 0; i<c.getVagoes().size() ; i++){
                modell.addElement(c.getVagoes().get(i));
            }            
            painelComp.add(listaLocomotivas);
            
            painelComp.add(btnCadastrar);
            painelComp.add(btnLimpar);            
            
            pack();	
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(painelComp);
            
                       
        }  
           
}
