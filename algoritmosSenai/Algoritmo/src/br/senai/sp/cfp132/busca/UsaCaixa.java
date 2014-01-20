package br.senai.sp.cfp132.busca;

public class UsaCaixa {
	public static void main(String[] args) {
		Caixa caixa1 = new Caixa("Marrom", 1450, 50.0);
		Caixa caixa2 = new Caixa("Marrom", 1450, 50.0);
		
		System.out.println(caixa1.equals(caixa2));
	}
}
