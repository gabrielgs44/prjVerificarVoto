package br.com.verificarvoto.control;

public class DateException extends Exception{
    
    public DateException(String dataNasc) {
        super("Data inválida, digite no formato xx/xx/xxxx. Você digitou: " + dataNasc);
    }
}
