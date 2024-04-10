package model;

public class ReservationRestaurant extends Reservation{
	private int jour;
	private int mois;
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
			service="deuxieme";
		}
		return "Le "+jour+"/"+mois+"\n table "+numTable+" pour le "+service+" service.";
	}
}
