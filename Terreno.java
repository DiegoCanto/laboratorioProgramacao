package minha.cidade.java;

public class Terreno {
	public double area;
	public  Edificacao edif;
	public Terreno(double area, Edificacao edif) {
		this.area = area;
		this.edif = edif;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Edificacao getEdificacao() {
		return this.edif;
	}
	public void setEdificacao(Edificacao edificacao) {
		this.edif = edificacao;
	}
	
	

}
