package org.excepciones.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        try{
            System.out.print("Introduce un número:");
            double number = reader.nextDouble();
            System.out.println("Resultado:" + number * 2 );
        } catch (Exception e){
            System.out.println("El formato del número que ha elegido no es el correcto");
        } finally {
            reader.close();
        }
    }

}
