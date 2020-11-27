package ar.edu.unlam.eia.mejoresgafas.model;

public class Gafas {

	public FormaMarco formaMarco;
	public ColorMarco colorMarco;
	
	public Gafas() {
		formaMarco = FormaMarco.NoDeterminado;
		colorMarco = ColorMarco.NoDeterminado;
	}

	public FormaMarco getFormaMarco() {
		return formaMarco;
	}

	public void setFormaMarco(FormaMarco formaMarco) {
		this.formaMarco = formaMarco;
	}

	public ColorMarco getColorMarco() {
		return colorMarco;
	}

	public void setColorMarco(ColorMarco colorMarco) {
		this.colorMarco = colorMarco;
	}

	@Override
	public String toString() {
		return "Gafas [formaMarco=" + formaMarco + ", colorMarco=" + colorMarco + "]";
	}
	
	
}
