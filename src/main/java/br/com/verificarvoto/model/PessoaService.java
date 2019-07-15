package br.com.verificarvoto.model;

import java.util.Calendar;

public class PessoaService {

    public boolean verificarObrigatorio(String dataNasc) {

        return adquirirIdade(dataNasc) > 17 && adquirirIdade(dataNasc) < 70;
    }

    public boolean verificarFacultativo(String dataNasc) {
        return (adquirirIdade(dataNasc) > 15 && adquirirIdade(dataNasc) < 18) || adquirirIdade(dataNasc) > 69;
    }
    
    public int adquirirIdade(String dataNasc) {

        Calendar cal = Calendar.getInstance();

        int diaNasc = Integer.parseInt(dataNasc.substring(0, 2));
        int mesNasc = Integer.parseInt(dataNasc.substring(3, 5));
        int anoNasc = Integer.parseInt(dataNasc.substring(6, 10));

        int idade = cal.get(Calendar.DATE) >= diaNasc && (cal.get(Calendar.MONTH) + 1) >= mesNasc
                ? cal.get(Calendar.YEAR) - anoNasc
                : (cal.get(Calendar.YEAR) - 1) - anoNasc;

        return idade;
    }
}
