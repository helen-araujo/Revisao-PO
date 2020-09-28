/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.po;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import sun.awt.FontConfiguration;

/**
 *
 * @author User
 */
public class RevisaoPO {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        
        int numQuestao;
        int []vetor, v;
        vetor=new int[10];
        int [][]matriz;
        matriz=new int[2][2];
        v=new int[10];
        int maior=-4999;
        int menor=19999;
        double media, soma=0;
    
        
        
    System.out.print("Lista de Exercicios PO - 01\n");
    
    System.out.print("Digite o numero da Questao: \n");
    System.out.print("De 1 a 4\n "+"digite 6 para encerrar\n");
    numQuestao=input.nextInt();
    
    
    while (numQuestao<6) {            
        if(numQuestao==1){
        System.out.print("Ola Mundo");
        }
        else if(numQuestao==2){
            System.out.print("Informe 10 numeros: \n");
            for(int i=0; i<10; i++){
                vetor[i]=input.nextInt();
            }
            System.out.print("\n");
            for(int i=0; i<10; i++){
                System.out.print(vetor[i]);
            }   
        }
        else if(numQuestao==3){
            System.out.print("Informe 4 numeros: \n");
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    matriz[i][j]=input.nextInt();
                }
            }
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    System.out.print(matriz[i][j]);
                }
            }
        }
        else if(numQuestao==4){
            System.out.print("Informe 10 numeros: \n");
            for(int i=0; i<10; i++){
                v[i]=input.nextInt();
             }
            for(int i=0; i<10; i++){
                if(v[i]<menor){
                    menor=v[i];
                }
                if(v[i]>maior){
                    maior=v[i];
                }
                soma=soma+v[i];
            }
            media=soma/10;
            System.out.println("maior numero: "+ maior+"\n");
            System.out.println("menor numero: "+menor+"\n");
            System.out.println("media dos numeros: "+media +"\n\n");
       
        }
        
    System.out.print("Qual a proxima questão? ");
    numQuestao=input.nextInt();
        }
// TODO code application logic here
    }
   
    
}

