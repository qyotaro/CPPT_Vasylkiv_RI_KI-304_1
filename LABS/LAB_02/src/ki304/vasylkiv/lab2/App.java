package ki304.vasylkiv.lab2;

/**
 * Class App realize example program for lab 2
 * @author Rostyslav Vasylkiv
 * @version 1.1
 * @since version 1.0
 */


public class App {
	
	/** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

    Person personOne = new Person();
    
    personOne.getPersonalInfo();
    personOne.changePersonalInfo("Nicola", "Kovac", 26);
    personOne.getPersonalInfo();
    personOne.getAddresInfo();
    personOne.changeAddress("Ukraine", "Lviv", "Horodotska ", 21);
    personOne.getAddresInfo();
    personOne.changeWeigthAndHeight(67, 172);
    personOne.getWeightAndHeight();
    personOne.getHealthStatus();
    personOne.getCurrentActivity();
    personOne.changeActivityStatus(1);
    personOne.growUp();
    personOne.changeActivityStatus(3); 
    personOne.getAllPersonInfo();
    personOne.cleanUp();
    }
}