package ar.edu.unlam.eia.mejoresgafas.model;

public enum Pomulos {

	Amplios,
	Estrechos,
	NoDeterminado;
	
	public Boolean isa(Pomulos pomulos) {
		return this.toString() == pomulos.toString();
	}
	
}
