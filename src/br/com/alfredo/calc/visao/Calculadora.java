package br.com.alfredo.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

//@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {

		organizarLayout();
		
		setSize(238, 322);//definir o tamanho da janela
		setDefaultCloseOperation(EXIT_ON_CLOSE); //sair da aplicação ao fechar a janela
		setLocationRelativeTo(null);//abrir janela no centro da tela
		setVisible(true); //janela visível
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());//BorderLayout -> gerenciador de Layout
		
		Display display = new Display();//instanciando um novo display
		display.setPreferredSize(new Dimension(233, 60));//dimensão do display
		add(display, BorderLayout.NORTH);// display localizada ao norte da janela
		
		Teclado teclado = new Teclado();//instanciando um novo teclado
		add(teclado, BorderLayout.CENTER);// teclado no centro da janela
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
