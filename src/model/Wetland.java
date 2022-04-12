package model;
/**
	* Descripción: 
	* <b> pos:</b> String name, String ubication, String size, String type, String photourl, String String protectedstatus, String zonename, String zonetype.
	*/
public class Wetland{
	
	public static final int MAXSPECIES=9999;
    public static final int MAXEVENTS=9999;
    public static final int MAXWETLANDS=80;

	
	private String name;
	private String ubication;
	private String size;
	private String type;
	private String photourl;
	private String protectedstatus;
	private String zonename;
	private String zonetype;
	  
	private Species[] wetlandSpecies;
    private Event[] wetlandEvent;


	public String registerSpecies(String name, String scientificname, int type, boolean migratorystatus){
        boolean continius1 = true;
        String distach1="Species successfully registered";

        for(int i=0; (i<MAXSPECIES) && continius1; i++){
            if (wetlandSpecies[i]==null){
                wetlandSpecies[i]=new Species(name,scientificname,type,migratorystatus);
                continius1=false;
            }
        }
        return distach1;
    }
	public String registerEvents(String organizer, int type, String price){
        boolean continius2 = true;
        String distach2 = "Event successfully registered";

        for(int i=0; (i<MAXEVENTS) && continius2; i++){
            if (wetlandEvent[i]==null){
                wetlandEvent[i]=new Event(organizer, type, price);
                continius2=false;
            }
        }
        return distach2;
    }
/**
	* Descripción: Register the wetland</br>
	* <b> pos:</b> String name, String ubication, String size, String type, String photourl, String protectedstatus, String zonename, String zonetype.
	*/
public Wetland (String name, String ubication, String size, String type, String photourl, String protectedstatus, String zonename, String zonetype){
	
	
	
}
 /**
	* Descripción: Register the proposed name</br>
	* <b> pos:</b> String name.
	*/
public void Setname(String name){
	
	this.name = name;
	
}
/**
	* Descripción: Shows the proposed name</br>
	* <b> pos:</b> String name.
	* @return <name> <String> Returns to display the name
	*/
public String Getname(){
	
	return name;
	
}
/**
	* Descripción: Register the proposed location</br>
	* <b> pos:</b> String ubication.
	*/
public void Setubication(String ubication){
	
	this.ubication = ubication;
	
}
/**
	* Descripción: Show location </br>
	* <b> pos:</b> String ubication.
	* @return <ubication> <String> Returns to show location
	*/
public String Getubication(){
	
	return ubication;
	
}

/**
	* Descripción: Record the proposed size</br>
	* <b> pos:</b> String size.
	*/
public void Setsize(String size){
	
	this.size = size;
	
}
/**
	* Descripción: Shows the proposed size </br>
	* <b> pos:</b> String size.
	* @return <size> <String> Returns to display the proposed size
	*/
public String Getsize(){
	
	return size;
	
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
	* Descripción: Register the photo</br>
	* <b> pos:</b> String photourl.
	*/
public void Setphotourl(String photourl){
	
	this.photourl = photourl;
	
}
/**
	* Descripción: Register the photo </br>
	* <b> pos:</b> String photourl.
	* @return <photourl> <String> Return to display the photo
	*/
public String Getphotourl(){
	
	return photourl;
	
}
/**
	* Descripción: Registers the protected status of the wetland</br>
	* <b> pos:</b> String protectedstatus.
	*/
public void Setprotectedstatus(String protectedstatus){
	
	this.protectedstatus = protectedstatus;
	
}
/**
	* Descripción: Shows the protected area </br>
	* <b> pos:</b> String protectedstatus.
	* @return <protectedstatus> <String> Returns to display the protected area
	*/
public String Getprotectedstatus(){
	
	return protectedstatus;
	
}
/**
	* Descripción: Register the name of the area</br>
	* <b> pos:</b> String zonename.
	*/
public void Setzonename(String zonename){
	
	this.zonename = zonename;
	
}
/**
	* Descripción: Register the name of the area </br>
	* <b> pos:</b> String zonename.
	* @return <zonename> <String> Returns to display the name of the zone
	*/
public String Getzonename(){
	
	return zonename;
	
}
/**
	* Descripción: Register the type of the zone</br>
	* <b> pos:</b> String zonetype.
	*/
public void Setzonetype(String zonetype){
	
	this.zonetype = zonetype;
	
}
/**
	* Descripción: Register the type of the zone </br>
	* <b> pos:</b> String zonetype.
	* @return <zonetype> <String> Returns to display the zone type
	*/
public String Getzonetype(){
	
	return zonetype;
	
}

	public String toString(){

        String answerPrivateWetland;
        if(type==true){
            answerPrivateWetland=("Private");
        }else{
            answerPrivateWetland=("Public");
        }

        String answerRuralWetland;
        if(type==true){
            answerRuralWetland=("Rural");
        }else{
            answerRuralWetland=("Urban");
        }

        String protectedArea;
        if(protectedstatus==true){
            protectedArea=("ProtectedArea");
        }else{
            protectedArea=("UnprotectedArea");
        }
        return "wetland name: " + name 
        + "\nwetland location: " + ubication
        + "\nwetland url: " + photourl
        + "\nwetland private or public: " + answerPrivateWetland
        + "\nwetland rural or urban: " + answerRuralWetland
        + "\nwetland protected area: " + protectedstatus
        + "\nwetland wetland area: " + size;
    }
}