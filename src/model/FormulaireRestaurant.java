package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonne;
	private int numService;
	
	
	public FormulaireRestaurant(int jour,int mois,int nbPersonne,int numService) {
		super(jour,mois);
		this.nbPersonne=nbPersonne;
		this.numService=numService;
	}


	public int getNombrePersonnes() {
		return nbPersonne;
	}


	public int getNumService() {
		return numService;
	}
	
	
	public void setIdentificationEntite(int numE) {
		super.setNumEntite(numE);
	}
	
	public int getIdentificationEntite() {
		return super.getNumEntite();
	}
	
	
}
