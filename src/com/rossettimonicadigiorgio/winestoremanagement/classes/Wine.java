package com.rossettimonicadigiorgio.winestoremanagement.classes;

import java.util.*;
/**
 * The {@code Wine} Class defines a behavior that:
 * Manages The Creations of the wines to be sold
 * It also defines selling tools.
 * 
 * @author 296666
 */
public class Wine {
	private String Name;
	private String Producer;
	private int Year;
	private String Notes;
	private int BottlesNumber;
	private List<String> Vines; 
	
	/**
	 * Class constructor
	 * 
	 * @param name wine's name
	 * @param producer wine's producer
	 * @param year wine's year of production
	 * @param notes wine's technical notes
	 * @param bottlesnumber wine's available number of bottles
	 * @param vines list of wine's production Vines
	 */
	public Wine(String name, String producer, int year, String notes, int bottlesnumber, List<String> vines)
	{
		this.Name = name;
		this.Producer = producer;
		this.Year = year;
		this.Notes = notes;
		this.BottlesNumber = bottlesnumber;
		this.Vines = vines;
	}
	
	/**
	 * Decrements number of bottles
	 * @param bottlesnumber purchased bottles number
	 * @return if the order has been processed correctly
	 */
	protected boolean ProcessOrder(int bottlesnumber) {
		if(this.BottlesNumber - bottlesnumber < 0)
			return false;
		
		this.BottlesNumber -= bottlesnumber;
				
		return true;
	}
	
	/**
	 * Creates a clone of this wine
	 * @return a new Wine variable
	 */
	public Wine clone() {
		return new Wine(this.Name, this.Producer, this.Year, this.Notes, this.BottlesNumber, this.Vines);
	}
	
	/**
	 * Fetch the wine's name
	 * @return wine's name
	 */
	public String getName() { return this.Name; }
	
	/**
	 * Fetch the producer's name
	 * @return producer's name
	 */
	public String getProducer() { return this.Producer; }
	
	/**
	 * Fetch the year of production
	 * @return year of production
	 */
	public int getYear() { return this.Year; }
	
	/**
	 * Fetch technical notes 
	 * @return wine's technical notes
	 */
	public String getNotes() { return this.Notes; }
	
	/**
	 * Fetch number of bottle available
	 * @return number of bottle available
	 */
	public int getBottlesNumber() { return this.BottlesNumber; }
	
	/**
	 * Sets a new number of bottle
	 * @param newBottlesNumber the new number of bottle
	 */
	public void setBottlesNumber(int newBottlesNumber) { this.BottlesNumber = newBottlesNumber; }
	
	/**
	 * Fetch the Vine's list
	 * @return a list of string 
	 */
	public List<String> getVines() { return this.Vines; }
	
	/**
	 * Checks if a Wine is available
	 * @return a boolean witch represents if there are bottles left
	 */
	public boolean CheckAvailability() { return this.BottlesNumber > 0; }
	
	/**
	 * Adds new available bottles 
	 * @param numberofbottles the new bottles
	 * @return if the operation has succeeded 
	 */
	protected boolean Restock(int numberofbottles) { this.BottlesNumber += numberofbottles; return true; }
	
	/**
	 * Check if two wines are equals
	 * @param wine to be compared
	 * @return if they are equal
	 */
	protected boolean EqualTo(Wine wine) {
		return wine.Name == this.Name && wine.Producer == this.Producer && wine.Year == this.Year;  
	}
	
	/**
	 * Check if two wines are equals
	 * @param name of the wine
	 * @param producer the name of the producer
	 * @param year of production
	 * @return if they are equal
	 */
	protected boolean EqualTo(String name, String producer, int year) {
		return name == this.Name && producer == this.Producer && year == this.Year;  
	}
}
