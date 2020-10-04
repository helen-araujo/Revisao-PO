/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Exercicio11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      int i;
      int n;
      double soma=0;
      System.out.println("Informe o valor de N: ");
      n=input.nextInt();
      for(i=1; i<=n; i++){
          soma=soma+((2*i-1)/(Math.pow(-2, i+1)));
      }
        System.out.println(soma);
    }
    
}
