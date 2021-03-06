package ui;
import java.util.Scanner;
import model.*;
import java.time.LocalDate;
public class Integrative2{


	private static WetlandServices wetlandServices; 

  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args){
    wetlandServices = new WetlandServices();

    int option=0;
    while(option!=9){
      option=menu();
      if(option==1){
        newWetland();
      }
      if(option==2){
        newSpecies();
      }
      if(option==3){
        newEvent();
      }
      if((option>3)&&(option<9)){
        System.out.println("Option invalid");
      }
    }
  }


  public static void registerWetland(){
	
	int selector = 0;
	boolean type; boolean zonetype; boolean protectedstatus;
    System.out.println("Enter Wetland's name");
    String name = reader.nextLine();
    System.out.println("Enter Wetland ubication");
    String ubication = reader.nextLine();
	System.out.println("Enter url's wetland image");
    String photourl = reader.nextLine();
   
	System.out.println("Enter (1)for a protected status private");
    selector = Integer.parseInt(reader.nextLine());
	if (selector==1){
		protectedstatus=true;
	}else{
		protectedstatus=false;
	}
	System.out.println("Enter (1) for a rural or (2) for a urban wetland"); 
    selector = Integer.parseInt(reader.nextLine());
	if (selector==1){
		zonetype=true;
	}else{
		zonetype=false;
	}
	System.out.println("Select wetland type 1 for yes 2 for no");
	selector=Integer.parseInt(reader.nextLine());
	if (selector==1){
		type=true;
	}else{
		type=false;
	}
	System.out.println("Enter the wetland in km2");
    double size = reader.nextDouble();
	System.out.println("Enter the date");
    System.out.println("day");
    int day = reader.nextInt();
    System.out.println("month");
    int month = reader.nextInt();
    System.out.println("year");
    int year = reader.nextInt();
	
    Date date = new Date(day, month, year);
	
    Date();
	String message=Dagma.createWetland(name, ubication, type);
    System.out.println(message);
  }


  public static void registerSpecies(){
	int selector = 0;
	boolean migratorystatus;

    System.out.println("Enter the name of the wetland");
    String name = reader.nextLine();
    System.out.println("Enter ");
    System.out.println("Enter the species name");
    String name = reader.nextLine();
    System.out.println("Enter the species scientific name");
    String scientificname = reader.nextLine();
    System.out.println("Enter the species type");
    int type = reader.nextInt();
    
    
	
	System.out.println("put migratory species");
	if (selector==1){
		migratorystatus=true;
	}else{
		migratorystatus=false;
	}
    newWetland();
    Date();
    wetlandServices.addSpecies(name, scientificname, type, migratorystatus, name);
	
  }


  public static void newEvent(){

    System.out.println("Enter the name of the wetland");
    String name = reader.nextLine();
    System.out.println("Enter event organizer's name");
    String organizer = reader.nextLine();
    System.out.println("Enter event's type");
    String type = reader.nextLine();
    System.out.println("Enter event's price");
    double price = reader.nextLine();
    

    newWetland();
    Date();
    wetlandServices.registerEvents(organizer, type, price, name);
  }

  


	
	
	
	
}
	
