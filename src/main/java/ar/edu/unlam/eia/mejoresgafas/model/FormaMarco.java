package ar.edu.unlam.eia.mejoresgafas.model;

public enum FormaMarco {

	Cualquiera,
	Anchas,
	Alargadas,
	Rectangulares,
	Ovaladas,
	Angulosas,
	NoDeterminado;
	
	public Boolean isa(FormaMarco formaMarco) {	
		return this.toString() == formaMarco.toString();
	}
	
}
