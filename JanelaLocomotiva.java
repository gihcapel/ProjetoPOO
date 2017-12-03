package interfacagrafica;

import javax.swing.*;
import java.awt.*;

public class JanelaLocomotiva extends JFrame{
	private JLabel llocomotivaId,lvazia,lclasse,ldescricao,lbitola,lpesomax,lpesoadm,lcomprimento;
	private JTextField tlocomotivaId,tclasse,tdescricao,tbitola,tpesomax,tpesoadm,tcomprimento;
	private JButton btnCadastrar,btnLimpar;
	JPanel painel1= new JPanel();
	JanelaLocomotiva(){
		super("CadastroLocomotiva");
		llocomotivaId = new JLabel("IDVagao");
		lvazia= new JLabel("");
		lclasse = new JLabel("Tipo:");
		ldescricao = new JLabel("Subtipo:");
		lbitola = new JLabel("Proprietário:");
		lpesomax = new JLabel("Pesoadm:");
		lcomprimento = new JLabel("Comprimento:");

		tlocomotivaId = new JTextField();
		tclasse = new JTextField();
		tdescricao = new JTextField();
		tbitola = new JTextField();
		tpesomax = new JTextField();
		tcomprimento = new JTextField();
		
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Alterar");
		
		painel1.setLayout(new GridLayout(7, 2, 5, 5));
		
		painel1.add(llocomotivaId);
		painel1.add(tlocomotivaId);
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
		painel1.add(btnCadastrar);
		painel1.add(btnLimpar);
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}	
	}
}
