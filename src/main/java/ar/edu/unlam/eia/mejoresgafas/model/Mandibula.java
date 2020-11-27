package ar.edu.unlam.eia.mejoresgafas.model;

public enum Mandibula {

	Ancha,
	Estrecha,
	NoDeterminado;
	
	public Boolean isa(Mandibula mandibula) {
		return this.toString() == mandibula.toString();
	}
	
}
