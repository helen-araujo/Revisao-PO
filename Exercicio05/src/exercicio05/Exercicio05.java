/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package exercicio05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercicio05 {
    
    private Scanner input;
    int size=10;
    int [][] matrizA;
    int [][] matrizB;
    int [][] matrizSoma;
    public void AbrirAquivo(){
        try{
            input= new Scanner(new File ("arquivo.txt"));
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        
        }
    }
    public void LerArquivo(){
        matrizA = new int [size][size];
        matrizB = new int[size][size];
        matrizSoma = new int[size][size];
        int i,j;
        boolean verificar=false;
        int cont=0;
        
       i=0;
       j=0;
       while(input.hasNextInt()){
            for(i=0; i<size; i++){
                for(j=0; j<size; j++){ 
                      matrizA[i][j]=input.nextInt();
                }
            }
            
            for(i=0; i<size; i++){
                for(j=0; j<size; j++){                      
                      matrizB[i][j]=input.nextInt();
                }
            }             
       }
        //IMPRIMIR MATRIZ
        System.out.println("****Matriz A****");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){             
                System.out.println(matrizA[i][j]);
            }
        }
        System.out.println("***Matriz B*****");
            for(i=0; i<size; i++){
                for(j=0; j<size; j++){
                    System.out.println(matrizB[i][j]);
                }
            }
        //SOMA DE MATRIZ
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        System.out.println("****SOMA DAS MATRIZES***");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.println(matrizSoma[i][j]);
            }
        }
    }

        
     
    
/** Main.*/
public static void main (String args[]){
	Exercicio05 leitura = new Exercicio05();
        
        leitura.AbrirAquivo();
        leitura.LerArquivo();
			
	
        }			
}

