
package com.mycompany.lab5testeunitarioetdd;

public class Ex3 {
         public String checaIdade(int idade){
            String mensagem;
             if (idade >= 70 ){
                mensagem = "Renovação a cada 3 anos";
            }else if(idade <70 && idade >= 50){
                mensagem = "Renovação a cada 5 anos";
            }else{
                mensagem = "Renovação a cada 10 anos";
            }
            return mensagem; 
         }
}
