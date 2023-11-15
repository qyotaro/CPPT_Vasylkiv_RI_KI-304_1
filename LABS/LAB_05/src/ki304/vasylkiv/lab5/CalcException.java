package ki304.vasylkiv.lab5;

/**
* Class <code>CalcException</code> more precises ArithmeticException
* @author Rostyslav Vasylkiv
* @version 1.0
*/
public class CalcException extends ArithmeticException {
    public CalcException(){
    	
    }

    public CalcException(String cause)
    {
        super(cause);
    }
}