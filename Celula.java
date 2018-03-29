package edu.unisinos;
public class Celula {
private Double value;
private Integer line, column;
private String string;
private Formula formula;

public Celula () {
	setValue(null);
	setLine(null);
	setColumn(null);
	setFormula(null);
	setString(null);
}

public Celula (double value, int line,int column) {
	setValue(value);
	setLine(line);
	setColumn(column);
	setFormula(null);
	setString(null);
}
public Celula (String string, int line,int column) {
	setString(string);
	setLine(line);
	setColumn(column);
	setFormula(null);
	setValue(null);
}
public Celula (Formula formula, int line,int column) {
	setFormula(formula);
	setLine(line);
	setColumn(column);
	setString(null);
}

public Double getValue() {
	return value;
}
public void setValue(Double value) {
	this.value = value;
}
public int getLine() {
	return line;
}
public void setLine(Integer line) {
	this.line = line;
}
public int getColumn() {
	return column;
}
public void setColumn(Integer column) {
	this.column = column;
}
public void setString(String string) {
	this.string = string;
}
public void setFormula(Formula formula) {
	this.formula = formula;
}
public String getString() {
	return (this.string);
}
public Formula getFormula() {
	return (this.formula);
}



}
