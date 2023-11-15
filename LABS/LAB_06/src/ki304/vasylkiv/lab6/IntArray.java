package ki304.vasylkiv.lab6;
import java.util.Arrays;

/**
 * Class <code>IntArray</code> implements the ArrayObject interface
 */
public class IntArray implements ArrayObject {
    private String name;
    private int[] array;

    /**
     * Constructs 
     * @param name the name of the IntArray
     * @param array array
     */
    public IntArray(String name, int[] array) {
        this.name = name;
        this.array = array;
    }

    /**
     * Method calculates the sum of the elements in the array.
     * @return the sum of array elements
     */
    public double getSum() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * Method compare ArrayObject 
     * 
     * @param obj ArrayObject 
     * @return a negative integer, zero, or a positive integer as this IntArray's sum
     */
    public int compareTo(ArrayObject obj) {
        Double s = getSum();
        return s.compareTo(obj.getSum());
    }
    
    /**
     * Method print array object data
     */
    public void printData() {
        System.out.print("Name: " + name + ", Array: " + Arrays.toString(array) + ", Sum: " + getSum() + ";\n");
    }
    
    /**
     * Method changes the name of an array
     * @param newName the new name for the array
     */
    public void changeIName(String newName) {
       name = newName;
    }

    /**
     * Method changes numbers in an array
     * @param newArray the new array of numbers
     */
    public void changeIntNumbers(int[] newArray) {
        array = newArray;
    }
}