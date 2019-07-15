package br.com.verificarvoto.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestePessoa {
    Pessoa person;
    
    @BeforeEach
    public void setup() {
        person = new Pessoa(null, null, null, null, null);
    }
    
    @AfterEach
    public void tearDown() {
        person = null;
    }
    
    @Test
    public void testeVerificarVotoObrigatorio() {
        Assertions.assertEquals(TipoEleitor.OBRIGATORIO.getStatus(), person.verificarVoto("10/05/1997"));
    }
    @Test
    public void testeVerificarVotoFacultativo() {
        Assertions.assertEquals(TipoEleitor.FACULTATIVO.getStatus(), person.verificarVoto("10/05/2002"));
    }
    @Test
    public void testeVerificarNaoPodeVotar() {
        Assertions.assertEquals(TipoEleitor.NAO_PODE_VOTAR.getStatus(), person.verificarVoto("10/05/2004"));
    }
}
