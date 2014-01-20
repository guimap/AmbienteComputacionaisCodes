package br.senai.sp.cfp132.busca;

public class Caixa {
	private long lote;
	private double peso;
	private String cor;
	
	public Caixa(){
		
	}
	
	public Caixa(String cor,long lote,double peso){
		this.lote = lote;
		this.peso = peso;
		this.cor = cor;
		
	}
	
	public long getLote() {
		return lote;
	}
	public void setLote(long lote) {
		this.lote = lote;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != this.getClass()){
			return false;
		}
		
		Caixa c = (Caixa) obj;
		if(this.cor.equals(c.getCor()) && this.peso == c.getPeso()){
			return true;
		}else { 
			return false;
		}
		
		
	}

}
