package ki304.vasylkiv.lab6;

/**
 * Class ArrayApp realize example program for lab 6
 * 
 * @author Rostyslav Vsylkiv
 * @version 1.0
 */

public class ArrayApp {
	
	/**
    * @param args
    * @throws Exception
    */
    public static void main(String[] args) {
    	
        ArrayContainer<ArrayObject> isArray = new ArrayContainer<>();
        
        isArray.addObject(new IntArray("Array1", new int[]{1, 2, 3, 4, 5}));
        isArray.addObject(new DoubleArray("Array2", new double[]{1.1, 2.2, 3.3, 4.4, 5.5}));
        ArrayObject maxArray = isArray.getMaxObject();
        System.out.print("The array with the maximum sum of elements: \n");
        maxArray.printData();
    }
}