/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Read {
    Scanner sc = new Scanner(System.in);
    
    public String readString(String mensaje){
        System.out.println(mensaje+": ");
        String dato = sc.next();
        return dato;
    }
    
    public double validateDouble(String text) {
        double value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(text);
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                if (value >= 0) {
                    isValid = true;
                } else {
                    System.out.println("¡Error! El valor debe ser positivo.");
                }
            } else {
                System.out.println("¡Error! Debe ingresar un valor numerico valido.");
                sc.next(); // Limpiar el buffer del scanner
            }
        }
        return value;
    }
    
    public int validateInt(String text) {
        int value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(text);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value >= 0) {
                    isValid = true;
                } else {
                    System.out.println("¡Error! El valor debe ser positivo.");
                }
            } else {
                System.out.println("¡Error! Debe ingresar un valor numerico valido.");
                sc.next();
            }
        }
        return value;
    }
    
    public float validateFloat(String text) {
        float value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(text);
            if (sc.hasNextFloat()) {
                value = sc.nextFloat();
                if (value >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Error, el valor debe ser positivo.");
                }
            } else {
                System.out.println("Error, debe ingresar un valor numerico valido.");
                sc.next();
            }
        }
        return value;
    }
}
