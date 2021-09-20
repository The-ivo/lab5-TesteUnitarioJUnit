/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5testeunitarioetdd;

/**
 *
 * @author lucas
 */
public class Ex1 {
    
    public String validaAno(int ano){
        if (ano < 1900 || ano > 2020){
            return "invalido";
        }else{
            return "valido";
        }
    }
}

