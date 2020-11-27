package ar.edu.unlam.eia.mejoresgafas.model;

public enum Rasgos {

	Marcados,
	NoMarcados,
	NoDeterminado;
	
	public Boolean isa(Rasgos rasgos) {
		return this.toString() == rasgos.toString();
	}
	
}
