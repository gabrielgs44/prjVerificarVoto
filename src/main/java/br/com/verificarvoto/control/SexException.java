package br.com.verificarvoto.control;

public class SexException extends Exception{
    public SexException(char sex) {
        super("Sexo invalido, digite F ou M, você digitou: " + sex);
    }
}
