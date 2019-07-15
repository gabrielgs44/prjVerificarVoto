package br.com.verificarvoto.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestePessoaService {
    PessoaService sPerson;
    
    @BeforeEach
    public void setup() {
        sPerson = new PessoaService();
    }
    @AfterEach
    public void tearDown() {
        sPerson = null;
    }
    
    @Test
    public void testarAdquirirIdade() {
        Assertions.assertEquals(22, sPerson.adquirirIdade("10/05/1997"));
    }
    @Test
    public void testarVerificarObrigatorio() {
        Assertions.assertEquals(true, sPerson.verificarObrigatorio("10/05/1997"));
    }
    @Test
    public void testarVerificarFacultativo() {
        Assertions.assertEquals(true, sPerson.verificarFacultativo("10/05/2002"));
    }
}
