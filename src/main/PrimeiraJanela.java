package main;

import javax.swing.*;
public class PrimeiraJanela extends JFrame{
	public PrimeiraJanela() {
		super("Nossa Primeira Janela");
		setResizable(false);
		setSize(450,250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		PrimeiraJanela app = new PrimeiraJanela();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
