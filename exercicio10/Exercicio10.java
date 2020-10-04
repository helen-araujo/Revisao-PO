/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Exercicio10 {
    int [][]matrizA; 
    int [][]matrizB;
    int size=2;
    int somatorioA=0;
    int somatorioB=0;
    int resul;
    Scanner input = new Scanner(System.in);
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
        //matrizSoma = new int[size][size];
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
         for(i=0; i<size; i++){
                for(j=0; j<size; j++){                      
                      System.out.println(matrizB[i][j]);
                }
    }
    }
    public void Somatorio(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                somatorioA=somatorioA + matrizA[i][j];
                somatorioB=somatorioB+matrizB[i][j];
                
            }
        }
        resul=somatorioA*somatorioB;
        System.out.print("Somatório da matrizes: "+resul);
    }
  
   
    public static void main(String[] args) {
        // TODO code application logic here
       
        Exercicio10 somatorio = new Exercicio10();
        somatorio.AbrirAquivo();
        somatorio.LerArquivo();
        somatorio.Somatorio();
       
        
        
    }
    
}
