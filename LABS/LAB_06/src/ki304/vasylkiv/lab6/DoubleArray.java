package ki304.vasylkiv.lab6;
import java.util.*;

/**
 * Class <code>DoubleArray</code> implements the ArrayObject interface
 */
class DoubleArray implements ArrayObject {
    private String name;
    private double[] array;

    /**
     * Constructs 
     * @param name the name of the DoubleArray
     * @param array array
     */
    public DoubleArray(String name, double[] array) {
        this.name = name;
        this.array = array;
    }

    /**
     * Method calculates the sum of the elements in the array.
     * @return the sum of array elements
     */
    public double getSum() {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * Method compare ArrayObject 
     * 
     * @param obj ArrayObject 
     * @return a negative integer, zero, or a positive integer as this DoubleArray's sum
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
}
