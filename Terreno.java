package minha.cidade.java;

public class Terreno {
	public double area;
	public  Edificacao edif;
	public Terreno(double area, Edificacao edif) {
		setArea(area);
		setEdificacao(edif);
	}
	public Terreno(double area) {
		setArea(area);
		setEdificacao(null);
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

	public void showTerreno(){
		System.out.printf("| "+getArea()+" ");
		if(this.edif instanceof Edificio){
			((Edificacao)this.edif).showEdificacao();
		}else if(this.edif instanceof Casa){
			((Casa)this.edif).showEdificacao();
		}else{
			System.out.print("No Construction |");
		}
	}


}
