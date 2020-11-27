package ar.edu.unlam.eia.mejoresgafas.model;

public enum Menton {

	Fino,
	Pronunciado,
	Pequeño,
	Corto,
	NoDeterminado;
	
	public Boolean isa(Menton menton) {
		return this.toString() == menton.toString();
	}
	
}
