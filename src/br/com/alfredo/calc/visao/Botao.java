package br.com.alfredo.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

//@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		setText(texto);//texto que vem da função na classe calculadora
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setBackground(cor);//cor de vem da função na classe calculadora
		setForeground(Color.WHITE);//cor de todos os numeros dos botões
		setBorder(BorderFactory.createLineBorder(Color.BLACK));//bordas de todos os botões
	}
}
