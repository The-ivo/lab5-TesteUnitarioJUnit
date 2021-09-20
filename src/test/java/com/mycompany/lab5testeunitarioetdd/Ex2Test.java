/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5testeunitarioetdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class Ex2Test {
    
    Ex2 ConfereNota;
    public Ex2Test() {
        ConfereNota = new Ex2();
    }

    @Test
    public void TestaConfereNotaValida() {
        System.out.println("Teste Nota Valida");
        assertEquals("valido", ConfereNota.validaNota(5));
        assertEquals("valido", ConfereNota.validaNota(0));
        assertEquals("valido", ConfereNota.validaNota(10));
    }
    
    @Test
    public void TestaConfereNotaInvalida() {
        System.out.println("Teste Nota Invalida");
        assertEquals("invalido", ConfereNota.validaNota(-5));
        assertEquals("invalido", ConfereNota.validaNota(15));
        assertEquals("invalido", ConfereNota.validaNota(-1));
        assertEquals("invalido", ConfereNota.validaNota(11));
    }
    
}
