/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio01.po;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Desafio01PO {

    private Scanner ler;

    public void AbrirAquivo() {
        try {
        ler = new Scanner(new File("Desafio01.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);

        }
    }

    public int[][] LerArquivo() {
        int [][]m;
        m = new int[4][4];
        while (ler.hasNextInt()) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    m[i][j] = ler.nextInt();
                }
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Desafio01PO itinerario = new Desafio01PO();
        int matriz[][];
        int[] v_custo;
        int k;//quant cidades
        int n;//quant itinerarios;
        int total = 0;
        System.out.println("Informe a quantidade de itinerários: ");
        n = input.nextInt();

        while (n % 2 != 0) {
            System.out.println("Informe novamente o numero de itinerarios: ");
            n = input.nextInt();
        }

        v_custo = new int[n];
        System.out.println("Informe os itinerários: ");

        for (int i = 0; i < n; i++) {
            v_custo[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(v_custo[i]);
        }
        
        
        matriz = new int[4][4];

        itinerario.AbrirAquivo();
        matriz = itinerario.LerArquivo();
       /* for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
        }*/
        for (int i = 0; i <n-1 ; i++) {
            total =matriz[v_custo[i]][v_custo[i + 1]]+ total;
            
        }

        System.out.println("Total de Custos: " + total);

    }

}
