package edu.unisinos;

public class Formula {
int cellOneC, cellOneL, cellTwoC, cellTwoL;
char operacao;

public Formula(int cellOneC, int cellOneL, int cellTwoC, int cellTwoL, char operacao){
	setCellOneC(cellOneC);
	setCellOneL(cellOneL);
	setCellTwoC(cellTwoC);
	setCellTwoL(cellTwoL);
	setOperation(operacao);
}



public double sumCell(Planilha plan) {
	double result=0;
	result = plan.getCell()[this.cellOneL][this.cellOneC].getValue()+plan.getCell()[this.cellTwoL][this.cellTwoC].getValue();
	return (result);
}
public double subtractCell(Planilha plan) {
	double result=0;
	result = plan.getCell()[this.cellOneL][this.cellOneC].getValue()-plan.getCell()[this.cellTwoL][this.cellTwoC].getValue();
	return (result);
}
public double multiplyCell(Planilha plan) {
	double result=0;
	result = plan.getCell()[this.cellOneL][this.cellOneC].getValue()*plan.getCell()[this.cellTwoL][this.cellTwoC].getValue();
	return (result);
}
public double divideCell(Planilha plan) {
	double result=0;
	result = plan.getCell()[this.cellOneL][this.cellOneC].getValue()/plan.getCell()[this.cellTwoL][this.cellTwoC].getValue();
	return (result);
}

public double operatecell(Planilha plan) {
	double result=0;
	if (getOperation() == '+') {
		result = sumCell(plan);
	}
	if (getOperation() == '-') {
		result = subtractCell(plan);
	}	
	if (getOperation() == '*') {
		result = multiplyCell(plan);
	}	
	if (getOperation() == '/') {
		result = divideCell(plan);
	}	
	
	return (result);
}


public int getCellOneC() {
	return cellOneC;
}
public void setCellOneC(int cellOneC) {
	this.cellOneC = cellOneC;
}
public int getCellOneL() {
	return cellOneL;
}
public void setCellOneL(int cellOneL) {
	this.cellOneL = cellOneL;
}
public int getCellTwoC() {
	return cellTwoC;
}
public void setCellTwoC(int cellTwoC) {
	this.cellTwoC = cellTwoC;
}
public int getCellTwoL() {
	return cellTwoL;
}
public void setCellTwoL(int cellTwoL) {
	this.cellTwoL = cellTwoL;
}
public char getOperation() {
	return operacao;
}
public void setOperation(char operacao) {
	this.operacao = operacao;
}



}
