package minha.cidade.java;

public class Cidade {
	 private Terreno mapa[][];
  public Cidade (int cordX, int cordY){
	  Terreno mapa [][] = new Terreno [cordX][cordY];
  }
public Terreno[][] getMapa() {
	return mapa;
}
public void setMapa(Terreno[][] mapa) {
	this.mapa = mapa;
}

public void adicionaEdificacao(char tipo, int x, int y, char type, double area, Edificacao edif){
	 x=5;
	 y=6;
	 area=200;
	if(x<=mapa.length && y<=mapa[x].length){
		 mapa[x][y]=new Terreno(area, edif);
		
	}else{
		System.out.print("Coordinates out of bounds");
	}
}
  
}
