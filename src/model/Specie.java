package model;
/**
	* Descripción: 
	* <b> pos:</b> String name, String scientificname, String migratorystatus, String type.
	*/
public class Specie{
	enum SpeciesType{
        
        TERRESTRIALFLORA, AQUATICFLORA, BIRD, MAMMAL, AQUATICFAUNA;
    }
	
	private String name;
	private String scientificname;
	private String migratorystatus;
	private String type;
	private Speciestype speciesType;
	
	public Species(String name, String scientificname, int type, boolean migratorystatus){

        this.speciesName = name;
        this.speciesScientificName = scientificname;
        this.speciesMigratory = migratorystatus;
        switch (type) 
        {
            case 1:  this.speciesType=SpeciesType.TERRESTRIALFLORA;
                    break;
            case 2:  this.speciesType=SpeciesType.AQUATICFLORA;
                    break;
            case 3:  this.speciesType=SpeciesType.BIRD;
                    break;
            case 4: this.speciesType=SpeciesType.MAMMAL;
                    break;
            case 5: this.speciesType=SpeciesType.AQUATICFAUNA;
                    break;
        }
    }
	
	

/**
	* Descripción: record the species</br>
	* <b> pos:</b> String name, String scientificname, String migratorystatus, String type.
	*/
public Specie(String name, String scientificname, String migratorystatus, String type){
	
	
}
/**
	* Descripción: Register the proposed name</br>
	* <b> pos:</b> String name.
	*/
public void Setname(String name){
	
	this.name = name;
	
}
/**
	* Descripción: Shows the proposed name </br>
	* <b> pos:</b> String name.
	* @return <name> <String> Returns to display the name
	*/
public String Getname(){
	
	return name;
	
}
/**
	* Descripción: Register the proposed scientific name type</br>
	* <b> pos:</b> String scientificname.
	*/
public void Setscientificname(String scientificname){
	
	this.scientificname = scientificname;
	
}
/**
	* Descripción:Shows the proposed scientific name </br>
	* <b> pos:</b> String scientificname.
	* @return <scientificname> <String> Returns to display the proposed scientific name.
	*/
public String Getscientificname(){
	
	return scientificname;
	
}
/**
	* Descripción: Record immigration status</br>
	* <b> pos:</b> String migratorystatus.
	*/
public void Setmigratorystatus(String migratorystatus){
	
	this.migratorystatus = migratorystatus;
	
}
/**
	* Descripción: Shows immigration status</br>
	* <b> pos:</b> String migratorystatus.
	* @return <migratorystatus> <String> Returns to show immigration status.
	*/
public String Getmigratorystatus(){
	
	return migratorystatus;
	
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
	* @return <type> <String> Returns to display type.
	*/
	public String Gettype(){
	
	return type;
	
	}
	public String toString(){

        String migratorystatusAnswer;
        if(migratorystatus==true){
            migratorystatusAnswer=("The species is migratory");
        }else{
            migratorystatusAnswer=("The species is not migratory");
        }
    
        return "Species name: " + name
        + "\nSpecies ScientificName: " + scientificname
        + "\nSpecies Type: " + speciesType
        + "\nSpecies migratory or non-migratory " + migratorystatusAnswer;
    }

}