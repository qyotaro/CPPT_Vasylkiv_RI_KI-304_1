package ki304.vasylkiv.lab4;
/**
 * Class <code>Tangent</code> implements method for y = tan(x)
 * expression
 * calculation
 * 
 * @author Rostyslav Vasylkiv
 * @version 1.0
 */

public class Tangent {

    /**
     * Method calculates the y= tan(x) expression
     * 
     * @param x Angle in degrees
     * @throws CalcException
     */
	public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = Math.tan(rad);
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 90
                    || x == -90 || x == 270 || x == -270)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0 || rad == 3*(Math.PI / 2.0) || rad == 3*(-Math.PI / 2.0))
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }

}