package model;

public abstract class Reservation {
	protected int jourR;
	protected int moisR;
	
	public Reservation(int jour,int mois) {
		this.jourR=jour;
		this.moisR=mois;
	}
	
	public abstract String toString();
	
}
