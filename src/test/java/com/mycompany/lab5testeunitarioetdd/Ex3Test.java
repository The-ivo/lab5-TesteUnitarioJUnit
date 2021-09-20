
package com.mycompany.lab5testeunitarioetdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {
    
    Ex3 renovacao;
    public Ex3Test() {
        renovacao = new Ex3();
    }

    @Test
    public void testeChecaIdadeRenovacao3anos() {
        System.out.println("Teste renovação a cada 3 anos");
        
        assertEquals("Renovação a cada 3 anos", renovacao.checaIdade(150));
        assertEquals("Renovação a cada 3 anos", renovacao.checaIdade(70));
        assertEquals("Renovação a cada 3 anos", renovacao.checaIdade(71));
    }
    
    @Test
    public void testeChecaIdadeRenovacao5anos() {
        System.out.println("Teste renovação a cada 5 anos");
        
        assertEquals("Renovação a cada 5 anos", renovacao.checaIdade(60));
        assertEquals("Renovação a cada 5 anos", renovacao.checaIdade(50));
        assertEquals("Renovação a cada 5 anos", renovacao.checaIdade(51));
        assertEquals("Renovação a cada 5 anos", renovacao.checaIdade(69));
    }
    
    @Test
    public void testeChecaIdadeRenovacao10anos() {
        System.out.println("Teste renovação a cada 10 anos");
        
        assertEquals("Renovação a cada 10 anos", renovacao.checaIdade(30));
        assertEquals("Renovação a cada 10 anos", renovacao.checaIdade(49));
    }   
}
