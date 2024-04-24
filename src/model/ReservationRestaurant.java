package model;

public class ReservationRestaurant extends Reservation{
	private int numservice;
	private int numTable;
	
	public ReservationRestaurant(int jour,int mois,int numService,int numTable) {
		super(jour, mois);
		this.numservice=numService;
		this.numTable=numTable;
	}
	
	
	@Override
	public String toString() {
		String service;
		if(numservice==1) {
			service="premier";
		}else {
			service="deuxième";
		}
		return "Le "+jourR+"/"+moisR+"\nTable "+numTable+" pour le "+service+" service.";
	}
}
