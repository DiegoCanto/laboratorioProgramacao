package minha.cidade.java;

public class Cidade {
	 private Terreno mapa[][];
	 
  public Cidade (int cordX, int cordY){
	  mapa = new Terreno [cordX][cordY];
  }
  
  
public Terreno[][] getMapa() {
	return mapa;
}
public void setMapa(Terreno[][] mapa) {
	this.mapa = mapa;
}
public void adicionaEdificacao(int x, int y, Edificacao edif){
	if(x<mapa.length && y<mapa[x].length){
		 mapa[x][y].setEdificacao(edif);
	}else{
		System.out.print("Coordinates out of bounds");
	}
}
public void mostraMapa(){
	int x, y;
	for (x=0; x<mapa.length; x++){
		for (y=0; y<mapa[x].length; y++){
			this.mapa[x][y].showTerreno();
		}
		System.out.print("\n");
	}
}

public double calculaIptu(int x1, int y1, int x2, int y2){
	int menorX, menorY, maiorX, maiorY;
	double totalIPTU=0;
	if (x1<x2){
		menorX=x1;
		maiorX=x2;
	}else{
		menorX=x2;
		maiorX=x1;
	}
	if(y1<y2){
		menorY=y1;
		maiorY=y2;
	}else{
		menorY=y2;
		maiorY=y1;
	}
	
	
	if (x1<getMapa().length){
		if(y1<getMapa()[x1].length){
			if (x2<getMapa().length){
				if(y2<getMapa()[x2].length){
						for(;menorX<=maiorX;menorX++){
							for(;menorY<=maiorY;menorY++){
								if(getMapa()[menorX][menorY].getEdificacao() instanceof Casa){
									//calculo de iptu para casa
									if(getMapa()[menorX][menorY].getEdificacao().getMaterial()=="Alvenaria" && ((Casa)getMapa()[menorX][menorY].getEdificacao()).isComPiscina()==true ){
										//calculo iptu casa alvenaria com piscina
										totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.5 + (getMapa()[menorX][menorY].getEdificacao().getAreaConstruida() * 1.12 + 2.3);
									}else{
										//calculo iptu casa alvenaria sem piscina
										totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.5 + (getMapa()[menorX][menorY].getEdificacao().getAreaConstruida() * 1.12);
									} 
									if (getMapa()[menorX][menorY].getEdificacao().getMaterial()=="Madeira" && ((Casa)getMapa()[menorX][menorY].getEdificacao()).isComPiscina()==true){
										//calculo iptu casa madeira com piscina
										totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.5 + (getMapa()[menorX][menorY].getEdificacao().getAreaConstruida() * 1.04 + 2.3);
									}else{
										//calculo iptu casa madeira sem piscina
										totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.5 + (getMapa()[menorX][menorY].getEdificacao().getAreaConstruida() * 1.04);
									}
								}else if(getMapa()[menorX][menorY].getEdificacao() instanceof Edificio){
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("BOLEIA");
									System.out.print("\n");
									System.out.print("\n");
									System.out.print("\n");
									//calculo iptu edificio
										totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.4 + (getMapa()[menorX][menorY].getEdificacao().getAndares()*0.3) + ((((Edificio)getMapa()[menorX][menorY].getEdificacao()).getQuantosElevadores() * 0.2) +(getMapa()[menorX][menorY].getEdificacao().getAreaConstruida() * 1.3))+(((Edificio)getMapa()[menorX][menorY].getEdificacao()).getQuantasVagasBox() * 0.15);
								}else{
									//calculo iptu sem edificacao
									totalIPTU = totalIPTU + getMapa()[menorX][menorY].getArea() * 1.75;
								}
							}
						}
					}
				}
			}
		}
	
	return (totalIPTU);
	}

public void removeEdificacao(int x, int y){
	if (x<getMapa().length){
		if(y<getMapa()[x].length){
			getMapa()[x][y].setEdificacao(null);
	}
}
}

public void instanciaTerreno(int colunas, int linhas, double tamanho){
	
			this.mapa[linhas][colunas] = new Terreno (tamanho);
		
}
	
}	
	




