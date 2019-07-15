package br.com.verificarvoto.model;

public class Pessoa {
    private String nome, cpf, dataNasc;
    private Sexo sexo;
    private Endereco endereco;
    
    public Pessoa(String nome, String cpf, String dataNasc, Sexo sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String verificarVoto(String dataNasc) {
        PessoaService pService = new PessoaService();
        
        if(pService.verificarObrigatorio(dataNasc)) {
            return TipoEleitor.OBRIGATORIO.getStatus();
        }else if(pService.verificarFacultativo(dataNasc)) {
            return TipoEleitor.FACULTATIVO.getStatus();
        }else {
            return TipoEleitor.NAO_PODE_VOTAR.getStatus();
        }
    }
}
