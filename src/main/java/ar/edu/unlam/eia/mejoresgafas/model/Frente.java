package ar.edu.unlam.eia.mejoresgafas.model;

public enum Frente {

	Ancha,
	Estrecha,
	Amplia,
	NoDeterminado;
	
	public Boolean isa(Frente frente) {
		return this.toString() == frente.toString();
	}
	
}
