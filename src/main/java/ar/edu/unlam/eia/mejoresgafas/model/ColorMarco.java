package ar.edu.unlam.eia.mejoresgafas.model;

public enum ColorMarco {
	
	MetalicoPlataOEstañoOPastaFrio,
	MetalicoDoradoOBronceOPastaCalido,
	SuavesYPastel,
	GranateOMarronCobrizo,
	OscurosEIntensos,
	GrisYLilaClaro,
	NoDeterminado;
	
	public Boolean isa(ColorMarco colorMarco) {	
		return this.toString() == colorMarco.toString();
	}
	
}
