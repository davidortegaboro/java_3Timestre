package org.excepciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    //David pregunta las 2C Y 2D
    static Scanner scanner = new Scanner(System.in);
    public static boolean calcularEdad(int edad){
        if(edad < 18) {
            throw new RuntimeException("La edad no puede ser menor a 18");
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Introduce tu edad: ");
        try{
            Integer edad = scanner.nextInt();
            if(calcularEdad(edad)) {
                System.out.println("puedes pasar");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: La edad debe ser un entero");
        } catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
