package Ejercicio1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("File.in"));
        /* El throws lo que hace es que cuando da la excepción indicada lanza el error
           para que se solucione en el exterior, y en la terminal puede dar error, pero el
           programador no lo trata */
    }
}
