/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5testeunitarioetdd;

public class Ex2 {
     public String validaNota(int nota){
        if (nota < 0 || nota > 10){
            return "invalido";
        }else{
            return "valido";
        }
    }
}
