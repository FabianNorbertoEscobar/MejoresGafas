package ar.edu.unlam.eia.mejoresgafas.model;

public enum Piel {

	Clara,
	Oscura,
	NoDeterminado;
	
	public Boolean isa(Piel piel) {
		return this.toString() == piel.toString();
	}
	
}
