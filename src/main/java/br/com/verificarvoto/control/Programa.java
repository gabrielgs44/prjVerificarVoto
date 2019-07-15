package br.com.verificarvoto.control;

import java.util.Scanner;

import br.com.verificarvoto.model.Sexo;

public class Programa {

    public static void main(String[] args) throws SexException, DateException{
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = leia.nextLine();
        String dataNasc = "";
        do {
            try {
                System.out.print("Digite sua data de nascimento no formato(xx/xx/xxxx): ");
                dataNasc = leia.nextLine();
                if(dataNasc.length() != 10)
                    throw new DateException(dataNasc);
            }catch(DateException e) {
                System.out.println(e.getMessage());
            }
        }while(dataNasc.length() != 10);
        
        char sex = 'n';
        Sexo tipoSexo = null;
        do {
            try {
                System.out.print("Digite seu sexo F/M: ");
                sex = leia.nextLine().toUpperCase().charAt(0);

                if (sex == 'F' || sex == 'M')
                    tipoSexo = sex == 'F' ? Sexo.FEMININO : Sexo.MASCULINO;
                else
                    throw new SexException(sex);

            } catch (SexException e) {
                System.out.println(e.getMessage());
            }
        } while (sex != 'F' && sex != 'M');
        
        System.out.print("Digite seu cep: ");
        String cep = leia.nextLine();
        System.out.print("Digite o lograouro: ");
        String logradouro = leia.nextLine();
        System.out.print("Digite o complemento: ");
        String comple = leia.nextLine();
        System.out.print("Digite o bairro: ");
        String bairro = leia.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = leia.nextLine();
        System.out.print("Digite o UF: ");
        String uf = leia.nextLine().toUpperCase();
        
        ControleEndereco contEd = new ControleEndereco();
        contEd.cadastrarEndereco(cep, logradouro, comple, bairro, cidade, uf);
        ControlePessoa contPe = new ControlePessoa();
        contPe.cadastrarPessoa(nome, cpf, dataNasc, tipoSexo, contEd.adquirirEndereco());
        contEd.adquirirEndereco().addPessoas(contPe.adquirirPessoa());
        String resultado = contPe.adquirirPessoa().verificarVoto(dataNasc);
        
        System.out.println("----SEUS DADOS----");
        System.out.println();        
        System.out.println();
        System.out.println("Nome: " + contPe.adquirirPessoa().getNome());
        System.out.println("CPF: " + contPe.adquirirPessoa().getCpf());
        System.out.println("Data de Nascimento: " + contPe.adquirirPessoa().getDataNasc());
        System.out.println("sexo: " + contPe.adquirirPessoa().getSexo().getDescricao());
        System.out.println("Resultado: " + resultado);
        System.out.println("----Endereço----");
        System.out.println();
        System.out.println("CEP: " + contPe.adquirirPessoa().getEndereco().getCep());
        System.out.println("Logradouro: " + contPe.adquirirPessoa().getEndereco().getLogradouro());
        System.out.println("Complemento: " + contPe.adquirirPessoa().getEndereco().getComplemento());
        System.out.println("Bairro: " + contPe.adquirirPessoa().getEndereco().getBairro());
        System.out.println("Cidade: " + contPe.adquirirPessoa().getEndereco().getCidade());
        System.out.println("UF: " + contPe.adquirirPessoa().getEndereco().getUf());
        
    }

}
