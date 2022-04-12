package model;
/**
	* Descripción:
	* <b> pos:</b> String Resisterwetland, String Registerspecie, String leastpopulatedwetland, String mostpopulatedwetland, String wetlandwherespeciels.
	*/
public class Dagma{
	private  String Resisterwetland;
	private String Registerspecie;
	private String leastpopulatedwetland;
	private String mostpopulatedwetland;
	private String wetlandwherespeciels;
	
	
	public String registerWetland(String name, String ubication, String photourl, boolean type, boolean type, boolean protectedstatus, double size, Date date){
        
        boolean continius1=true;
        String dispatch1="Wetland with a successful registration";

        for( int i=0; (i<MAXWETLANDS) && continuis1; i++){
            if(wetland[i]==null){
                wetland[i]=new Wetland(name, ubication, photourl, type, type, protectedstatus, size);
                continius1=false;
            }
        }
        return dispatch1;
    }
	
	public String registerSpecies(String name, String scientificname, int type, boolean migratorystatus, String name, Date date){

        boolean continius2 = true;
        String dispatch2="Registered species";

        for(int i=0; (i<MAXSPECIES) && continius2; i++){
            if (wetland[i]!=null && wetland[i].getname().equalsIgnoreCase(name)){
                wetland[i].registerSpecies(name,scientificname,type,migratorystatus);
                continius2=false;
            }
        }
        return dispatch2;
    }
	
	 public String registerEvents(String organizer, int type, String price, String name, Date date){
        boolean continius3 = true;
        String dispatch3 = "Registered event";

        for(int i=0; (i<MAXEVENTS) && continius3; i++){
            if (wetland[i]==null && wetland[i].getname().equalsIgnoreCase(name)){
                wetland[i].registerEvents(organizer, type, price);
                continius3=false;
            }
        }
        return dispatch3;
    }
	
	
	
	
	
}
