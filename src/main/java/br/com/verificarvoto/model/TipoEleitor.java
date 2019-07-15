package br.com.verificarvoto.model;

public enum TipoEleitor {
    OBRIGATORIO("Voto obrigatório!"),
    FACULTATIVO("Voto facultativo!"),
    NAO_PODE_VOTAR("Nao pode votar!");
    
    private String status;
    
    TipoEleitor(String status){
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
