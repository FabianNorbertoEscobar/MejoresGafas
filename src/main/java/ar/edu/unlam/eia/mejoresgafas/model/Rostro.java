package ar.edu.unlam.eia.mejoresgafas.model;

public class Rostro {
	
	Frente frente;
	Menton menton;
	Pomulos pomulos;
	Mejillas mejillas;
	Mandibula mandibula;
	Rasgos rasgos;
	Expresion expresion;
	Piel piel;
	Cabello cabello;
	
	public Gafas gafas;
	
	public Rostro() {
		frente = Frente.NoDeterminado;
		menton = Menton.NoDeterminado;
		pomulos = Pomulos.NoDeterminado;
		mejillas = Mejillas.NoDeterminado;
		mandibula = Mandibula.NoDeterminado;
		rasgos = Rasgos.NoDeterminado;
		expresion = Expresion.NoDeterminado;
		piel = Piel.NoDeterminado;
		cabello = Cabello.NoDeterminado;
		
		gafas = new Gafas();
	}

	public Frente getFrente() {
		return frente;
	}

	public void setFrente(Frente frente) {
		this.frente = frente;
	}

	public Menton getMenton() {
		return menton;
	}

	public void setMenton(Menton menton) {
		this.menton = menton;
	}

	public Pomulos getPomulos() {
		return pomulos;
	}

	public void setPomulos(Pomulos pomulos) {
		this.pomulos = pomulos;
	}

	public Mejillas getMejillas() {
		return mejillas;
	}

	public void setMejillas(Mejillas mejillas) {
		this.mejillas = mejillas;
	}

	public Mandibula getMandibula() {
		return mandibula;
	}

	public void setMandibula(Mandibula mandibula) {
		this.mandibula = mandibula;
	}

	public Rasgos getRasgos() {
		return rasgos;
	}

	public void setRasgos(Rasgos rasgos) {
		this.rasgos = rasgos;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	public Piel getPiel() {
		return piel;
	}

	public void setPiel(Piel piel) {
		this.piel = piel;
	}

	public Cabello getCabello() {
		return cabello;
	}

	public void setCabello(Cabello cabello) {
		this.cabello = cabello;
	}

	public Gafas getGafas() {
		return gafas;
	}

	public void setGafas(Gafas gafas) {
		this.gafas = gafas;
	}

	@Override
	public String toString() {
		return "Rostro [frente=" + frente + ", menton=" + menton + ", pomulos=" + pomulos + ", mejillas=" + mejillas
				+ ", mandibula=" + mandibula + ", rasgos=" + rasgos + ", expresion=" + expresion + ", piel=" + piel
				+ ", cabello=" + cabello + ", gafas=" + gafas + "]";
	}
	
}
