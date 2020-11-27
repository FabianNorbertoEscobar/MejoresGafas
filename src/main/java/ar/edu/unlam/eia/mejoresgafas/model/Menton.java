package ar.edu.unlam.eia.mejoresgafas.model;

public enum Menton {

	Fino,
	Pronunciado,
	Peque�o,
	Corto,
	NoDeterminado;
	
	public Boolean isa(Menton menton) {
		return this.toString() == menton.toString();
	}
	
}
