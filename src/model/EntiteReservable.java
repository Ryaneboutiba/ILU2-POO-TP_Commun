package model;

public class EntiteReservable<T extends Formulaire> {
	private CalendrierAnnuel carnetReservation=new CalendrierAnnuel();
	private int identification;
	
	public Boolean estLibre(T formulaire) {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public Boolean compatible(T formulaire) {
		return false;
	}
	
	public Reservation reserver() {
		return null;
	}
}
