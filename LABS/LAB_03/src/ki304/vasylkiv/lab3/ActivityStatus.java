package ki304.vasylkiv.lab3;


/**
 * Class <code>ActivityStatus</code> implements the status of a person's activity
 */
public class ActivityStatus {

    enum Activities {
        MOVING, STANDING, SITTING, LIE
    }
   
    private Activities activity;
    
    /**
     * Constructor
     */
    public ActivityStatus() {
    	activity = Activities.STANDING;
    }
    
    /**
     * Method changes the activity mode to MOVING
     */
    public void setMovingActivity() {
    	activity = Activities.MOVING;
    }
    
    /**
     * Method changes the activity mode to STANDING
     */
    public void setStangingActivity() {
    	activity = Activities.STANDING;
    }
    
    /**
     * Method changes the activity mode to SITTING
     */
    public void setSittingActivity() {
    	activity = Activities.SITTING;
    }
    
    /**
     * Method changes the activity mode to LIE
     */
    public void setLieActivity() {
    	activity = Activities.LIE;
    }
    
    /**
     * Return Current Activity
     * 
     * @return Activities
     */
    public Activities getCurrentActivity() {
        return activity;
    }
  
}
