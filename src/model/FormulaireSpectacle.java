package model;

public class FormulaireSpectacle extends Formulaire{
	private int numeroZone;
	
	public FormulaireSpectacle(int jour,int mois,int numeroZone) {
		super(jour, mois);
		this.numeroZone=numeroZone;
	}
	
	
	
	public void setIdentificationEntite(int numE) {
		super.setNumEntite(numE);
	}
	
	public int getIdentificationEntite() {
		return super.getNumEntite();
	}

	public int getNumeroZone() {
		return numeroZone;
	}
	
}
