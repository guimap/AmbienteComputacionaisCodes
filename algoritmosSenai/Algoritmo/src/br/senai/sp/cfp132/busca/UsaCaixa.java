package br.senai.sp.cfp132.busca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsaCaixa {
	public static void main(String[] args) {
		
		Caixa[] caixas = new Caixa[3];
		
		Caixa caixa1 = new Caixa("Marrom", 1450, 50.0);
		Caixa caixa2 = new Caixa("Amarela", 1450, 25.0);
		Caixa caixa3 = new Caixa("Verde",1450,70.0);
		
		caixas[0] = caixa1;
		caixas[1] = caixa2;
		caixas[2] = caixa3;
		
		System.out.println(caixa1.equals(caixa2));
		
		for (int i = 0;i < caixas.length; i++ ){
			System.out.println(caixas[i].getPeso());
		}
		
		Arrays.sort(caixas);
		System.out.println("==");
		for (int i = 0;i < caixas.length; i++ ){
			System.out.println(caixas[i].getPeso());
		}
	}
}
