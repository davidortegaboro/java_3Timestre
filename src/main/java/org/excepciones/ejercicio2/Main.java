package org.excepciones.ejercicio2;

import java.util.Scanner;

class MenorDeEdadException extends Exception{
    public MenorDeEdadException(){
        super("La persona es menor de 18 años");
    }
}

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static boolean calcularEdad(){
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
            if (edad >= 18){
                System.out.println("Puedes pasar");
                return true;
            } else{
                throw new MenorDeEdadException();
            }
    }

    public static void main(String[] args){

        try{
            System.out.println(calcularEdad());
        } catch (MenorDeEdadException e){
            System.out.println("Algo ha salido mal");
        }
    }

    //David tienes error aquí, vas por el 2b
}
