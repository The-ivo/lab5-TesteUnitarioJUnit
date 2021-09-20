package com.mycompany.lab5testeunitarioetdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class Ex1Test {
    
    Ex1 validaAno;
    
    public Ex1Test() {
        validaAno = new Ex1();
    }

    @org.junit.jupiter.api.Test
    public void testaValidaAnoValido() {
        System.out.println("Teste Ano Valido");
        
        assertEquals("valido", validaAno.validaAno(1990));
        assertEquals("valido", validaAno.validaAno(1900));
        assertEquals("valido", validaAno.validaAno(2020));
    }
    
    @org.junit.jupiter.api.Test
    public void testaValidaAnoInvalido() {
        System.out.println("Teste Ano invalido");
        
        assertEquals("invalido", validaAno.validaAno(1890));
        assertEquals("invalido", validaAno.validaAno(2049));
        assertEquals("invalido", validaAno.validaAno(1889));
        assertEquals("invalido", validaAno.validaAno(2021));
    }
    
}
