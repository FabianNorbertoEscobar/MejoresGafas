package ar.edu.unlam.eia.mejoresgafas.model;

public enum Expresion {

	Dulce,
	Amarga,
	NoDeterminado;
	
	public Boolean isa(Expresion expresion) {
		return this.toString() == expresion.toString();
	}
	
}
