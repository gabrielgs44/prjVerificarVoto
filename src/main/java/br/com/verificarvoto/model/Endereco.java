package br.com.verificarvoto.model;

import java.util.ArrayList;

public class Endereco {
    private String cep, logradouro, complemento, bairro, cidade, uf;
    private ArrayList<Pessoa> pessoas;
    
    public Endereco(String cep, String logradouro, String complemento, String bairro, String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        
        pessoas = new ArrayList<Pessoa>();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void addPessoas(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void removerPessoas(Pessoa exPessoa) {
        if(pessoas.contains(exPessoa)) {
            pessoas.remove(exPessoa);
            exPessoa.setEndereco(null);
        }else {
            return;
        }
    }
}
