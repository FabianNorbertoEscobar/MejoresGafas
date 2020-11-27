package ar.edu.unlam.eia.mejoresgafas.model;

public enum Cabello {

	Claro,
	Rojizo,
	Oscuro,
	Canoso,
	NoDeterminado;
	
	public Boolean isa(Cabello cabello) {
		return this.toString() == cabello.toString();
	}
	
}
