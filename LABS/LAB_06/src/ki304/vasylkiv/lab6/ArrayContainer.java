package ki304.vasylkiv.lab6;
import java.util.ArrayList;

/**
 * Parameterized class <code>ArrayContainer</code> implements Array
 */

class ArrayContainer<T extends ArrayObject> {
    private ArrayList<T> array;

    /**
     * Constructor
     */
    public ArrayContainer() {
        array = new ArrayList<T>();
    }

    /**
     * Method find object with the max sum
     */
    public T getMaxObject() {
    	if (!array.isEmpty())
    	{
    		T max = array.get(0);
    		for (int i=1; i< array.size(); i++)
    		{
    			if ( array.get(i).compareTo(max) > 0 )
    				max = array.get(i);
    				}
    		return max;
    	}
    	return null;
    }
    
    /**
     * Method add new object to array
     * 
     * @param object value
     */
    public void addObject(T object) {
        array.add(object);
        System.out.print("Element added: ");
        object.printData();
    }

    /**
    * Method delete object from array
    * 
    * @param index The index of element
    */
    public T removeObject(int index) {
        return array.remove(index);
    }
}