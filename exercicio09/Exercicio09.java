/*
 **/
package exercicio09;

import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n;
       int cont;
       int somatorio=0;
        System.out.println("Informe o valor de N: ");
        n=input.nextInt();
        
        for(int i=1; i<=n; i++){
            somatorio=somatorio + (i*(i+1));
        }
        System.out.println("Resultado do somatorio: "+somatorio);
// TODO code application logic here
    }
    
}
