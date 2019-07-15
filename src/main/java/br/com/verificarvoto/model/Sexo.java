package br.com.verificarvoto.model;

public enum Sexo {
    MASCULINO ('M'),
    FEMININO ('F');
    
    private char descricao;
    
     Sexo(char descricao) {
        this.descricao = descricao;
    }
     
     public char getDescricao() {
         return descricao;
     }
}
