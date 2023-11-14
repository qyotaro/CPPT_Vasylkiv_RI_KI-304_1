package ki304.vasylkiv.lab3;

/**
 * Class <code>HealthStatus</code> implements speakers of television
 */		
public class HealthStatus {
    private double weight;
    private double height;
    private double bmi;

    
    /**
     * Constructor
     */
    public HealthStatus() {
    	   weight = 1;
    	   height = 1;
    	   updateBMI();	
    	    }
    
    /**
     * Constructor
     * 
     * @param newWeight New weight
     * @param newHeight New height
     */
    public HealthStatus(double newWeight, double newHeight) {
        weight = newWeight;
        height = newHeight;
        updateBMI();
     }

    /**
     * Method calculates BMI based on weight and height.
     *
     * @return Calculated BMI
     */
    private double calculateBMI() {
        return weight / (height/100 * height/100);
    }

    /**
     * Method checks the health status based on the calculated BMI.
     *
     * @return Health status message
     */
    public String checkHealthStatus() {
        if (bmi < 18.5) {
            return "Health status: underweight.";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Health status: normal body weight.";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Health status: overweight.";
        } else {
            return "Health status: obese.";
        }
    }
    
    /**
     * Method sets a new weight and updates the BMI.
     *
     * @param newWeight
     */
    public void setWeight(double newWeight) {
    	weight = newWeight;
    	updateBMI();
    }
    
    /**
     * Method sets a new height and updates the BMI.
     *
     * @param newHeight New height
     */
    public void setHeight(double newHeight) {
    	height = newHeight;
    	updateBMI();
    }
    
    /**
     * Method updates the BMI based on the current weight and height.
     */
    public void updateBMI() {
        bmi = calculateBMI();
    }
    
    /**
     * Method gets the current weight.
     *
     * @return Current weight
     */
    public double getWeight() {
        return weight;
     }
    
    /**
     * Method gets the current height.
     *
     * @return Current height
     */
    public double getHeight() {
       return height;
    }
}