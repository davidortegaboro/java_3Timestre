package org.excepciones.exception;

public class AgeLimitsException extends Exception {


    public AgeLimitsException(String message) {
        super(message);
    }

        public void verifyAge(int edad) throws AgeLimitsException{
            if (edad < 18){
                throw  new AgeLimitsException("La edad no puede ser menor de 18");
            } else if (edad > 65){
                throw new AgeLimitsException("La edad no puede ser suèrior a 65");
            }
        }



}
