package org.excepciones.ejercicio2;

import java.util.Scanner;
public class Main {

    //David pregunta las 2C Y 2D
    static Scanner scanner = new Scanner(System.in);
    public static boolean calcularEdad(){
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
            if (edad >= 18){
                System.out.println("Puedes pasar");
            } else if (edad < 18){
                throw new ArithmeticException("La edad no puede ser menor a 18");
            } else if (//Tienes que comprobar que el numero no sea entero){
                throw new RuntimeException("No puede ser negativo");
        }
            return true;
    }

    public static void main(String[] args){

        try{
            System.out.println(calcularEdad());
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
