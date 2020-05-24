package br.com.fredericoahb.cm;

import br.com.fredericoahb.cm.modelo.Tabuleiro;
import br.com.fredericoahb.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
