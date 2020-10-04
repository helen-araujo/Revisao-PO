/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Exercicio08 {

    private int SomaVetor(int []v, int i, int tam){
        if(i<tam){
            return v[i]+SomaVetor(v, i+1, tam);
        }
        else
            return  0;
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Exercicio08 recursao = new Exercicio08();
        int tam;//tamanho vetor;
        int []vet;//vetor
        int resul;
       
        
        System.out.println("Informe o tamanho do vetor: ");
        tam=input.nextInt();
         vet=new int [tam];
        System.out.println("Preencha o vetor: ");
        for(int i=0; i<tam; i++){
           vet[i]=input.nextInt();
        }
    
         
        System.out.println("Soma do vetor: "+recursao.SomaVetor(vet, 0,tam));
        
    }
}

    

