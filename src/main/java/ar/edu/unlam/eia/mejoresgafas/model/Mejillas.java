package ar.edu.unlam.eia.mejoresgafas.model;

public enum Mejillas {

	Anchas,
	Estrechas,
	NoDeterminado;
	
	public Boolean isa(Mejillas mejillas) {
		return this.toString() == mejillas.toString();
	}
	
}
