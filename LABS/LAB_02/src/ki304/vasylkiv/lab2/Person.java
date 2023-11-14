package ki304.vasylkiv.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>Person</code> is a model of a person with personal information,
 *  address, health status, and activity status.
* @author Rostyslav Vasylkiv
 * @version 1.0
 */
 

public class Person {
	
    private PersonalInfo personalInfo;
    private Address address;
    private HealthStatus healthStatus;
    private ActivityStatus activityStatus;
    private PrintWriter fout;

    /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */
    public Person() throws FileNotFoundException {
    	personalInfo = new PersonalInfo();
    	address = new Address();
    	healthStatus = new HealthStatus();
    	activityStatus = new ActivityStatus();

    	fout = new PrintWriter(new File("Log.txt"));
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
     * @throws FileNotFoundException 
     */
    public Person(String newFirstName, String newLastName, int age, String newCountry, String newCity,
    		String newStreet, int newHouseNumber, double newWeight, double newHeight) throws FileNotFoundException {
    	personalInfo = new PersonalInfo(newFirstName, newLastName, age);
    	address = new Address(newCountry, newCity, newStreet, newHouseNumber);
    	healthStatus = new HealthStatus(newWeight, newHeight);
    	activityStatus = new ActivityStatus();

    	fout = new PrintWriter(new File("Log.txt"));
    }
    
    /**
     * Method changes personal information and logs the update.
     *
     * @param newFirstName New first name
     * @param newLastName  New last name
     * @param newAge       New age
     */ 
   public void changePersonalInfo(String newFirstName, String newLastName, int newAge) {
  	  personalInfo.setFirstName(newFirstName);
  	  personalInfo.setLastName(newLastName);
  	  personalInfo.setAge(newAge);
  	  fout.println("Personal data has been changed");
      fout.println();
      fout.flush();
    }
   
   /**
    * Method changes address information and logs the update.
    *
    * @param newCountry    New country of residence
    * @param newCity       New city of residence
    * @param newStreet     New street of residence
    * @param newHouseNumber New house number of residence
    */
   public void changeAddress(String newCountry, String newCity, String newStreet, int newHouseNumber) {
	   address.setCountry(newCountry);
	   address.setCity(newCity);
	   address.setStreet(newStreet);
	   address.setHouseNumber(newHouseNumber);
	   fout.println("Address of residence changed");
	   fout.println();
	   fout.flush();
   } 
   
   /**
    * Method changes weight and height information, updates BMI, and logs the update.
    *
    * @param newWeigth New weight
    * @param newHeight New height
    */
  public void changeWeigthAndHeight(double newWeigth, double newHeight) {
	  healthStatus.setWeight(newWeigth);
	  healthStatus.setHeight(newHeight);
	  healthStatus.updateBMI();
	  fout.println("Weight and height data changed");
      fout.println();
      fout.flush();
  }
  
  /**
   * Method changes activity status based on the provided status code and logs the update.
   *
   * @param status Status code representing the new activity status
   */
  public void changeActivityStatus(int status) {
      if (status == 1) {
    	  activityStatus.setMovingActivity();
      } else if (status == 2) {
    	  activityStatus.setStangingActivity();
      }
        else if (status == 3) {
          activityStatus.setSittingActivity();
      } else {
    	  activityStatus.setLieActivity();
      }

	  fout.println("Activity mode changed to " + activityStatus.getCurrentActivity());
      fout.println();
      fout.flush();
  }
  
  /**
   * Method simulates the person growing up and logs the update.
   */
  public void growUp() {
      personalInfo.growUp();
      fout.println(personalInfo.getFullName() + "has grown up.");
      fout.println();
      fout.flush();
  }
  
  /**
   * Method provides personal info in logs
   */
  public void getPersonalInfo() {
      fout.println("First name: " + personalInfo.getFirstName());
      fout.println("Last name: " + personalInfo.getLastName());
      fout.println("Age: " + personalInfo.getAge());
      fout.println();
      fout.flush();
  }
  
  /**
   * Method provides address info in logs
   */
  public void getAddresInfo() {
      fout.println(personalInfo.getFullName() + "'s Address: " + address.getToString());
      fout.println();
      fout.flush();
  }
 
  /**
   * Method provides health status in logs
   */
  public void getHealthStatus() {
	  fout.println(healthStatus.checkHealthStatus());
      fout.println();
      fout.flush();
  }
  
  /**
   * Method provides information about weight and height in logs
   */
  public void getWeightAndHeight() {
	  fout.println("Body weight: " + healthStatus.getWeight());
	  fout.println("Height: " + healthStatus.getHeight());
      fout.println();
      fout.flush();
  }
  
  /**
   * Method provides current activity in logs
   */
  public void getCurrentActivity() {
	  fout.println("The activity mode is set to " + activityStatus.getCurrentActivity());
      fout.println();
      fout.flush(); 
  }
  
  /**
   * Method provides all info about the person in logs
   */
  public void getAllPersonInfo() {
  	  fout.println("ALL INFORMATION ABOUT THE PERSON: ");
  	  fout.println();
  	  fout.println("First name: " + personalInfo.getFirstName());
      fout.println("Last name: " + personalInfo.getLastName());
      fout.println("Age: " + personalInfo.getAge());
      fout.println("Address: " + address.getToString());
      fout.println(healthStatus.checkHealthStatus());
      fout.println();
  	  fout.flush(); 
    }
   
  
  /**
   * Method releases used recourses
   */
  public void cleanUp() {
      fout.close();
  }
}




