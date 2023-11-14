package ki304.vasylkiv.lab3;


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

    Athlete personOne = new Athlete();
    
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
    personOne.setSport("Basketball");
    personOne.compete();
    personOne.startCompete();
    personOne.finishCompete();
    personOne.getAllPersonInfo();
    personOne.cleanUp();
    }
}