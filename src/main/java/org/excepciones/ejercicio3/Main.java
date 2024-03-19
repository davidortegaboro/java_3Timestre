package org.excepciones.ejercicio3;

import org.excepciones.exception.AgeLimitsException;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        AgeLimitsException ageLimitsException = new AgeLimitsException("");

        System.out.print("Introduce tu edad: ");
        try{
            Integer edad = scanner.nextInt();
            ageLimitsException.verifyAge(edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: La edad debe ser un entero");
        } catch (AgeLimitsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
