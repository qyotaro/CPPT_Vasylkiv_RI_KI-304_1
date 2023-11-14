package ki304.vasylkiv.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Class <code>TangentApp</code> Implements driver for Tangent class
 * 
 * @author Rostyslav Vasylkiv
 * @version 1.0
 */


public class TangentApp {
	public static void main(String[] args) throws Exception {
        try {
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName + ".txt"));
            try {
                try {
                	Tangent eq = new Tangent();
                    System.out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                System.out.print(ex.getMessage());
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.print("Exception reason: Perhaps wrong file path");
        }

    }
}