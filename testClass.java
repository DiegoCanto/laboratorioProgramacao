package minha.cidade.java;

import minha.cidade.java.Cidade;
public class testClass {
	
	public static void main(String[] args) {
		Cidade cidade = new Cidade (5, 5);
		Casa casa = new Casa (true, false, 3, 60, "Alvenaria");
		Edificio edificio = new Edificio(3,10,12, 100, "Alvenaria");
		double tamanho=0;
		
		for (int countX=0; countX<cidade.getMapa().length; countX++) {
			for(int countY=0; countY<cidade.getMapa()[countX].length; countY++) {
				tamanho=(200);
				cidade.instanciaTerreno(countX,countY, tamanho);

			}
			
		}
		
		System.out.print("IPTU WITHOUT EDIF "+cidade.calculaIptu(0, 0, 4, 4));
		
		System.out.print("\n");
		
		cidade.adicionaEdificacao(0, 0, casa);
		cidade.adicionaEdificacao(1, 0, edificio);
		
		cidade.mostraMapa();
		System.out.print("IPTU WITH EDIF -  "+cidade.calculaIptu(0, 0, 4, 4));
		System.out.print("\n");
		cidade.removeEdificacao(1, 0);
		cidade.mostraMapa();
		System.out.print("IPTU WITH EDIF 2  - "+cidade.calculaIptu(0, 0, 4, 4));

		
	
		
	}

}
