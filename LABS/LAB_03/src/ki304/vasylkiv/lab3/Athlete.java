package ki304.vasylkiv.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>Athlete</code> implements Competitor and extends Person
 */

public class Athlete extends Person implements Competitor {
	
	private String typeSport;
	
	  /**
     * Constructor
     * 
     * @throws FileNotFoundException FileNotFoundException
     */
    public Athlete () throws FileNotFoundException {
    	personalInfo = new PersonalInfo();
    	address = new Address();
    	healthStatus = new HealthStatus();
    	activityStatus = new ActivityStatus();
    	fout = new PrintWriter(new File("Log.txt"));
    	
    	typeSport = "unknown";		
    }

    /**
     * Constructor
     * 
     * @param newFirstName First name
     * @param newLastName  Last name
     * @param age           Age
     * @param newCountry    Country of residence
     * @param newCity       City of residence
     * @param newStreet     Street of residence
     * @param newHouseNumber House number of residence
     * @param newWeight     Weight
     * @param newHeight     Height
     * @param 
     * @throws FileNotFoundException FileNotFoundException
     */
    public Athlete (String newFirstName, String newLastName, int age, String newCountry, String newCity,
    		String newStreet, int newHouseNumber, double newWeight, double newHeight, String newTypeSport) throws FileNotFoundException {
    	personalInfo = new PersonalInfo(newFirstName, newLastName, age);
    	address = new Address(newCountry, newCity, newStreet, newHouseNumber);
    	healthStatus = new HealthStatus(newWeight, newHeight);
    	activityStatus = new ActivityStatus();
    	fout = new PrintWriter(new File("Log.txt"));
    	
    	
    	typeSport = newTypeSport;
    }
    
    /**
     * Method provides all info about the athlete in logs
     */
    public void getAllPersonInfo() {
  	  fout.println("ALL INFORMATION ABOUT THE PERSON: ");
  	  fout.println();
  	  fout.println("First name: " + personalInfo.getFirstName());
      fout.println("Last name: " + personalInfo.getLastName());
      fout.println("Age: " + personalInfo.getAge());
      fout.println("Address: " + address.getToString());
      fout.println("The athlete's sport: " + typeSport);
      fout.println(healthStatus.checkHealthStatus());
      fout.println();
  	  fout.flush(); 
    }
   
    /**
     * Setter method for the sport of the athlete.
     * This method also logs the change in the sport.
     * @param newTypeSport The new sport of the athlete.
     */  
    public void setSport(String newTypeSport) {
    	typeSport = newTypeSport;
        fout.println("Sport has been changed to " + typeSport);
        fout.println();
        fout.flush();
    }
    
    /**
     * The method records a simulation of an athlete's competition in his or her sport in logs.
     */   
    public void compete() {
        fout.println("The athlete is now competing in " + typeSport);
        fout.println();
        fout.flush();
    }
    
    /**
     * Method records the simulated start of a sports competition in logs.
     */ 
    public void startCompete() {
        fout.println("Sport competition started.");
        fout.println();
        fout.flush();
    }

    /**
     *Method records the simulated end of a sports competition in logs.
     */
    public void finishCompete() {
        fout.println("Sport competition finished.");
        fout.println();
        fout.flush();
    }
    
    /**
     * Method gets the current weight.
     *
     * @return Current weight
     */
    public String getSport() {
        return typeSport;
    }
}
