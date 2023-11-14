package ki304.vasylkiv.lab3;

/**
 * Class <code>Address</code> implements the address of the person's place of residence
 * @author Rostyslav Vasylkiv
 * @version 1.0
 */
public class Address {
	private String сountry;
	private String city;
    private String street;
    private int houseNumber;

    /**
     * Constructor
     */
    public Address() {
    	сountry = "unknown";
        city = "unknown";
        street = "unknown";
        houseNumber = 0;
    }
    
    /**
     * Constructor
     * 
     * @param newCountry      New country
     * @param newCity         New city
     * @param newStreet       New street
     * @param newHouseNumber  New house number
     */
    public Address(String newCountry, String newCity, String newStreet, int newHouseNumber) {
    	сountry = newCountry;
        city = newCity;
        street = newStreet;
        houseNumber = newHouseNumber;
    }
   
    
    /**
     * The method is used to change the country
     *
     * @param newCountry 
     */
    public void setCountry(String newCountry) {
        сountry = newCountry;
     }
    
    /**
     * The method is used to change the city
     *
     * @param newCity 
     */
    public void setCity(String newCity) {
    	city = newCity;
    }
    
    /**
     * The method is used to change the street
     *
     * @param newStreet 
     */
    public void setStreet(String newStreet) {
    	street = newStreet;
    }
    
    
    /**
     * The method is used to change the house number
     *
     * @param newHouseNumber 
     */
    public void setHouseNumber(int newHouseNumber) {
    	houseNumber = newHouseNumber;
    }
    
    /** 
     * Method returns сountry 
     * @return String
     */
    public String getCountry() {
        return сountry;
     }
    
    /** 
     * Method returns city
     * @return String
     */
    public String getCity() {
       return city;
    }

    /** 
     * Method returns street
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /** 
     * Method returns houseNumber
     * @return int
     */
    public int getHouseNumber() {
        return houseNumber;
    }
 
    /** 
     * Method returns сountry, city, street
     * @return String
     */
    public String getToString() {
        return сountry + ", " + city + ", " + street + " " + houseNumber;
    }
}
