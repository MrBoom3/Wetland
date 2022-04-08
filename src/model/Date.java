package model;
/**
	* Descripción: 
	* <b> pos:</b> int day, int month, int year.
	*/
public class Date{
	private int day ;
	private int month;
	private int year;


/**
	* Descripción: Records the proposed or current time</br>
	* <b> pos:</b> int day, int month, int year.
	*/
public Date(int day, int month, int year){
	
	
	
}
/**
	* Descripción: Records the proposed or current time</br>
	* <b> pos:</b> int day.
	*/
public void Setday(int day){
	
	this.day = day;
	
}
/**
	* Descripción: Shows the proposed or current day </br>
	* <b> pos:</b> int day.
	* @return <day> <int> Returns to display the day
	*/
public int Getday(){
	
	return day;
	
}
/**
	* Descripción: Records the proposed or current time</br>
	* <b> pos:</b> int month.
	*/
public void Setmonth(int month){
	
	this.month = month;
	
}
/**
	* Descripción: Shows the proposed or current month </br>
	* <b> pos:</b> int month.
	* @return <month> <int> Returns to display the month
	*/
public int Getmonth(){
	
	return month;
	
}
/**
	* Descripción: Records the proposed or current time</br>
	* <b> pos:</b> int year.
	*/
public void Setyear(int year){
	
	this.year = year;
	
}
/**
	* Descripción: Shows the proposed or current year </br>
	* <b> pos:</b> int year.
	* @return <year> <int> Returns to display the year
	*/
public int Getyear(){
	
	return year;
	
}

public String toString (){
	
	return (day+"/"+month+"/"+year);
	// return (variables + "texto")
}

}


