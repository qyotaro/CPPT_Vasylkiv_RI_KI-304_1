package ki304.vasylkiv.lab3;

/**
 * The <code>PersonalInfo</code> class represents personal information about a person.
 */
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Default constructor that initializes fields with default values.
     */
    public PersonalInfo() {
    	firstName = "unknown";
    	lastName = "unknown";
    	age = 0;
    }

    /**
     * Constructor that takes values for first name, last name, and age.
     * 
     * @param newFirstName  New first name
     * @param newLastName   New last name
     * @param newAge        New age
     */
    public PersonalInfo(String newFirstName, String newLastName, int newAge) {
    	firstName = newFirstName;
    	lastName = newLastName;
    	age = newAge;
    }
    
    /**
     * Method is used to change the first name.
     *
     * @param newFirstName New first name
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /** 
     * Method returns first name.
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method is used to change the last name.
     *
     * @param newLastName New last name
     */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /** 
     * Method returns last name.
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method is used to change the age.
     *
     * @param newAge New age
     */
    public void setAge(int newAge) {
        age = newAge;
    }

    /** 
     * Method returns age.
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Method is used to change the age.
     *
     * @param newAge New age
     */
    public void changeAge(int newAge) {
        setAge(newAge);
    }

    /**
     * Method is used to increase age by one year.
     */
    public void growUp() {
    	age ++;
    }

    /** 
     * Method returns full name.
     * @return String
     */
    public String getFullName() {
    	return firstName + " " + lastName;
    }
}
