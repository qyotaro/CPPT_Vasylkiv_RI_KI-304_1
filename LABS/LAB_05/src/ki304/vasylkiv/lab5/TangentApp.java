package ki304.vasylkiv.lab5;

import java.util.Scanner;
/**
 * Class <code>TangentApp</code> Implements driver for Tangent class
 * 
 * @author Rostyslav Vasylkiv
 * @version 1.0
 */


public class TangentApp {
	/**
     * @param args
     */
	 public static void main(String[] args) throws Exception {
	        Scanner in = new Scanner(System.in);
	        OutputTangent output = new OutputTangent();
	        try {
	            Tangent eq = new Tangent();
	            System.out.print("Enter X: ");
	            double res = eq.calculate(in.nextInt());
	            output.writeResTxt(res);
	            output.writeResBin(res);
	            System.out.println(output.readResTxt());
	            System.out.println(output.readResBin());
	        } catch (CalcException ex) {
	            System.out.print(ex.getMessage());
	        }
	        in.close();

	    }
}