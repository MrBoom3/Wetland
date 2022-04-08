package model;
/**
	* Descripción:
	* <b> pos:</b> String type, String organizer, Double price, String description.
	*/
public class Event{
	private String type;
	private String organizer;
	private Double price;
	private String description;
	
}
/**
	* Descripción: Register the proposed event</br>
	* <b> pos:</b> String type, String organizer, Double price, String description.
	*/
public Event(String type, String organizer, Double price, String description){
	
}
/**
	* Descripción: Register the proposed type</br>
	* <b> pos:</b> String type.
	*/
public void Settype(String type){
	
	this.type = type;
	
}
/**
	* Descripción: Shows the proposed type </br>
	* <b> pos:</b> String type.
	* @return <type> <String> Returns to display type
	*/
public String Gettype(){
	
	return type;
	
}
/**
	* Descripción: Register the organization</br>
	* <b> pos:</b> String organizer.
	*/
public void Setorganizer(String organizer){
	
	this.organizer = organizer;
	
}
/**
	* Descripción: Shows the type of organization proposed </br>
	* <b> pos:</b> String organizer.
	* @return <organizer> <String> Returns to display the organization type.
	*/
public String Getorganizer(){
	
	return organizer;
	
}
/**
	* Descripción: Record the cost of the event</br>
	* <b> pos:</b> Double price.
	*/
public void Setprice(Double price){
	
	this.price = price;
	
}
/**
	* Descripción: Show the proposed price </br>
	* <b> pos:</b> Double price.
	* @return <price> <Double> returns to show cost
	*/
public Double Getprice(){
	
	return price;
	
}
/**
	* Descripción: Record the description of the event</br>
	* <b> pos:</b> String  description.
	*/
public void Setdescription(String description){
	
	this.description = description;
	
}
/**
	* Descripción: Shows the proposed description </br>
	* <b> pos:</b> String description.
	* @return <description> <String> Returns to display the description
	*/
public String Getdescription(){
	
	return description;
	
}