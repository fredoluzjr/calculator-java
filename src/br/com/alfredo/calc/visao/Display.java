package br.com.alfredo.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;//gerenciador de layout usado para direcionamento
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.alfredo.calc.modelo.Memoria;
import br.com.alfredo.calc.modelo.MemoriaObservador;

//@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));//cor de fundo do display
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);//cor da fonte dos números no display
		label.setFont(new Font("courier", Font.PLAIN, 30));//fonte e tamanho dos números do display
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));//direcionando os números para a direita
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);	
	}
}
