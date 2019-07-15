package br.com.verificarvoto.control;

import br.com.verificarvoto.model.Endereco;

public class ControleEndereco {
    private Endereco address;

    public void cadastrarEndereco(String cep, String logradouro, String complemento, String bairro, String cidade,
            String uf) {
        address = new Endereco(cep, logradouro, complemento, bairro, cidade, uf);
    }

    public Endereco adquirirEndereco() {
        return address;
    }
}
