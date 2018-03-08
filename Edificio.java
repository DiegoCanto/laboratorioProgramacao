package minha.cidade.java;

public class Edificio extends Edificacao {
	public int quantosElevadores;
	public int quantasVagasBox;
	public Edificio(int quantosElevadores, int quantasVagasBox, int andares, double areaConstruida, String material){
		super(areaConstruida, material, andares);
		this.quantosElevadores=quantosElevadores;
		this.quantasVagasBox=quantasVagasBox;
	}
	
	
	
}
