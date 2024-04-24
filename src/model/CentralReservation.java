package model;

public class CentralReservation<E extends EntiteReservable<Formulaire> {
	private E[] tableauEntite;
	private int nombreEntite;
	
	public CentralReservation(int nbEntite,E[] tabEntite) {
		this.nombreEntite=nbEntite;
		this.tableauEntite=tabEntite;
	}
	
	
}
