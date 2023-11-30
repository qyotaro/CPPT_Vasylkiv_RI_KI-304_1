import java.io.*;
import java.util.*;

/**
 * Class Lab1VasylkivKI304 realize example program for lab 1
 * @author Rostyslav_Vasylkiv
 * @version 1.0
 * @since version 1.0

 */
public class Lab1VasylkivKI304 {
    /**
     * Static method main is enter point to program
     * @param args
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        
        PrintWriter fout = new PrintWriter(dataFile);
        
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        
        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++) {
        	arr[i]= new char[nRows];
        }

        System.out.print("Введіть символ-заповнювач: ");
        filler = in.nextLine();
        
        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) { 
                if (j >= i) {
                    if (filler.length() == 1) {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j]);
                        fout.print(arr[i][j]);
                    } else if (filler.length() == 0) {
                        System.out.print(" ");
                        fout.print(" ");
                    } else {
                        System.out.print("\nЗанадто багато символів-заповнювачів");
                        fout.print("\nЗанадто багато символів-заповнювачів");
                        break exit;
                    }
                } else {
                    System.out.print(" ");
                    fout.print(" ");
                }
            }
            System.out.println(); 
            fout.println(); 
        }
        
        fout.flush();
        fout.close();
    }
}
