package minha.cidade.java;

public class Edificio extends Edificacao {
	public int quantosElevadores;
	public int quantasVagasBox;
	public Edificio(int quantosElevadores, int quantasVagasBox, int andares, double areaConstruida, String material){
		super(areaConstruida, material, andares);
		this.quantosElevadores=quantosElevadores;
		this.quantasVagasBox=quantasVagasBox;
	}
	
	public int getQuantosElevadores() {
		return quantosElevadores;
	}

	public void setQuantosElevadores(int quantosElevadores) {
		this.quantosElevadores = quantosElevadores;
	}

	public int getQuantasVagasBox() {
		return quantasVagasBox;
	}

	public void setQuantasVagasBox(int quantasVagasBox) {
		this.quantasVagasBox = quantasVagasBox;
	}

	public void showEdificacao(){
		System.out.printf(getQuantosElevadores()+" "+getQuantasVagasBox()+"|" );
		super.showEdificacao();
	}
	
}
