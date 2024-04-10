package model;

public class CalendrierAnnuel {
	private Mois[] calendrier=new Mois[12];
	
	public CalendrierAnnuel() {
		// TODO Auto-generated constructor stub
		calendrier[0]=new Mois("Janvier",31);
		calendrier[1]=new Mois("Février",28);
		calendrier[2]=new Mois("Mars",31);
		calendrier[3]=new Mois("Aril",30);
		calendrier[4]=new Mois("Maie",31);
		calendrier[5]=new Mois("Juin",30);
		calendrier[6]=new Mois("Juillet",31);
		calendrier[7]=new Mois("Août",31);
		calendrier[8]=new Mois("Septambre",30);
		calendrier[9]=new Mois("Octobre",31);
		calendrier[10]=new Mois("Novembre",30);
		calendrier[11]=new Mois("Décembre",31);
	}
	
	public Boolean estLibre(int jour,int mois) {
		return !calendrier[mois-1].estLibre(jour);
	}
	
	public Boolean reserver(int jour,int mois) {
		if(!calendrier[mois-1].estLibre(jour)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
	private static class Mois{
		private String nom;
		private Boolean[] jour;
		
		private  Mois(String nom, int nbJours) {
			this.nom=nom;
			jour=new Boolean[nbJours];
			for(int i=0;i<nbJours;i++) {
				jour[i]=false;
			}
		}
		
		private Boolean estLibre(int nbJours) {
			return jour[nbJours-1];
		}
		
		private void reserver(int nbJour) {
			if(estLibre(nbJour-1)) {
				throw new IllegalStateException("Il y a déjà une réservation faîte le "+nbJour+" "+nom);
			}else {
				jour[nbJour-1]=true;
			}
		}
		
	}
}
