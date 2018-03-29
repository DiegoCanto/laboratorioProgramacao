package edu.unisinos;

public class Planilha {
Celula [][]cell; 
public Planilha (int line, int column) {
	cell = new Celula[line][column];
}
public void setCell(double value, int line, int column) {
	if (line < cell.length && column < cell[line].length) {
		cell[line][column] = new Celula (value, line, column);
	}
}
public void setCell(String string, int line, int column) {
	if (line < cell.length && column < cell[line].length) {
		cell[line][column] = new Celula (string, line, column);
	}
}
public void setCell(Formula formula, int line, int column) {
	if (line < cell.length && column < cell[line].length) {
		cell[line][column] = new Celula (formula, line, column);
	}
}

public void mostraPlanilha(int linI, int linF, int colI, int colF, Planilha plan) {
	for(int count=linI; count<linF; count++) {
		System.out.print("\n");
		for(int count1=colI; count1<colF; count1++) {
			if(cell[count][count1].getValue() != null) {
			System.out.print("|"+cell[count][count1].getValue()+"|");
			}
			if(cell[count][count1].getString() != null) {
			System.out.print("|"+cell[count][count1].getString()+"|");
			}
			if(cell[count][count1].getFormula() != null) {
			System.out.print("|"+cell[count][count1].getFormula().operatecell(plan)+"|");
			}else {
				System.out.print("| VAZIA |");
			}
		}
	}
}

public void limpaCell(int linI, int linF, int colI, int colF) {
	
	for(;linI<=linF;linI++) {
		System.out.print("\n"+linI);
		for(int co=colI;co<=colF;co++) {
			System.out.print("\ncoluna "+co);
			getCell()[linI][co] = new Celula();
		}
	}
}


public void instanciaPlanilha() {
	for(int count=0; count<cell.length; count++) {
		for(int count1=0; count1<cell[count].length; count1++) {
			getCell()[count][count1]= new Celula();
			}
		}
}



public Celula[][] getCell() {
	return (this.cell);
}

}
