package datenmodell;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Flug implements Serializable {
	


	Date startDatum;
	Date landeDatum;
	
	Destinations orgin;
	Destinations destination;
	
	String startID;
	String landID;
	
	Boolean internationalFlight;
	
	
	public Flug(String startID, String landID) {
		super();
		this.startID = startID;
		this.landID = landID;
	}
	
	
	/**
	 * @param startDatum
	 * @param orgin
	 * @param destination
	 * @param internationalFlight
	 */
	public Flug(String startDatum, Destinations orgin, Destinations destination, Boolean internationalFlight) {
		super();
		//this.startDatum = startDatum;
		this.orgin = orgin;
		this.destination = destination;
		this.internationalFlight = internationalFlight;
	}



	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return orgin + "--> " + destination;
	}
	
	
	public void save() {
		
		
		
		System.out.println("Es wird gespeichert");
		
		
	}
	
	

}
