package minha.cidade.java;

public class Edificacao {
public int andares;
public double areaConstruida; 
public String material;
public Edificacao(double areaConstruida, String material, int andares){
	this.areaConstruida=areaConstruida;
	this.material=material;
	this.andares=andares;
}
public int getAndares() {
	return andares;
}
public void setAndares(int andares) {
	this.andares = andares;
}
public double getAreaConstruida() {
	return areaConstruida;
}
public void setAreaConstruida(double areConstruida) {
	this.areaConstruida = areConstruida;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}

}
