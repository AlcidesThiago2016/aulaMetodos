package one.digitalinnovation.exceptions;

public class divisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    public divisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
