package br.com.verificarvoto.control;

import br.com.verificarvoto.model.Endereco;
import br.com.verificarvoto.model.Pessoa;
import br.com.verificarvoto.model.Sexo;

public class ControlePessoa {
    private Pessoa person;
    
    public void cadastrarPessoa(String nome, String cpf, String dataNasc, Sexo sexo, Endereco endereco) {
        person = new Pessoa(nome, cpf, dataNasc, sexo, endereco);
    }
    
    public Pessoa adquirirPessoa() {
        return person;
    }
}
