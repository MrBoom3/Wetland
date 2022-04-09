package ui;
import java.util.Scanner;
import model.*;
import java.time.LocalDate;
public class Integrative2{


	private static WetlandServices wetlandServices; //??

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
        System.out.println("Invalid option");
      }
    }
  }


  public static void newWetland(){
  
    System.out.println("Put Wetland's name");
    String WN = reader.nextLine();
    System.out.println("Put Wetland's location");
    String WL = reader.nextLine();
    System.out.println("Is it a private wetland? Put (1) for yes or (2) for no");
    boolean WP = reader.nextBoolean();
    String message=wetlandServices.addWetland(WN, WL, WP);
    System.out.println(message);
    
    Date();
  }


  public static void newSpecies(){


    System.out.println("Put the name of the wetland");
    String WN = reader.nextLine();
    System.out.println("Put ");
    System.out.println("Put the species name");
    String SN = reader.nextLine();
    System.out.println("Put the species scientific name");
    String SSN = reader.nextLine();
    System.out.println("Put the species type");
    int ST = reader.nextInt();
    System.out.println("put migratory species");
    Boolean SM = reader.nextBoolean();
    System.out.println("Put the wetland you want to add the species to");
    String SW = reader.nextLine();

    newWetland();
    Date();
    wetlandServices.addSpecies(SN, SSN, ST, SM, SW, WN);
  }


  public static void newEvent(){

    System.out.println("Put the name of the wetland");
    String WN = reader.nextLine();
    System.out.println("Put event organizer's name");
    String EO = reader.nextLine();
    System.out.println("Put event's type");
    String ET = reader.nextLine();
    System.out.println("Put event's pruice");
    String EP = reader.nextLine();
    System.out.println("Put the wetland you want to add the event to");
    String EW = reader.nextLine();

    newWetland();
    Date();
    wetlandServices.addEvents(EO, ET, EP, EW, WN);
  }

  public static void Display(){

    System.out.println"(This is the information for all of our wetlands.");
    System.out.println("Including total species by type (does not include event information).")
    

    newWetland();
  }


  public static  void Date(){
    Scanner keyboard = new Scanner(System.in);
  
    System.out.println("Put the actual day");
    int day = keyboard.nextInt();
    System.out.println("Put the actual month");
    int month = keyboard.nextInt();
    System.out.println("Put the actual year");
    int year = keyboard.nextInt();

    LocalDate date = LocalDate.of(year, month, day);
  }
   

  public static int menu(){
    
    int option=0;

    System.out.println("Put (1) to create a Wetland.");
    System.out.println("Put (2) to register a new Species.");
    System.out.println("Put (3) to register a newevent.");

    System.out.println("Put (5) to see the wetland with less flora.");
    System.out.println("Put (6) to see wetlands where a species occurs");
    System.out.println("Put (7) for wetlands and species info.");

    System.out.println("Put (9) to close");


    option=reader.nextInt();
    return option;
  }
  public static void maintenance(){
   System.out.println ("How many maintenance did you do in the" + "year";);
   Wetland=maintenance;
   
  }
  public static void flora(){
	  Wetland<flora= new flora;
	  
  }
  public static void speciewetland(){
	  System.out.printl("Which species do you want to look for in the wetlands?")
	  species==Wetland;
	  Wetland= new Wetland1;
	  
	  
	  
  }


	
	
	
	
}
	