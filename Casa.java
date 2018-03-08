package minha.cidade.java;

public class Casa extends Edificacao {
	
	private boolean comGaragem;
	private boolean comPiscina;
	
	public Casa (boolean comGaragem, boolean comPiscina, int andares, double areaConstruida, String material){
		super(areaConstruida, material, andares);
		this.comGaragem=comGaragem;
		this.comPiscina=comPiscina;	
	}

	public boolean isComGaragem() {
		return comGaragem;
	}

	public void setComGaragem(boolean comGaragem) {
		this.comGaragem = comGaragem;
	}

	public boolean isComPiscina() {
		return comPiscina;
	}

	public void setComPiscina(boolean comPiscina) {
		this.comPiscina = comPiscina;
	}
	
	

}
