/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CITec
 */
public class Exercicio06 {

    private Scanner input;
    int[][] matrizGrafo;
    int[][] matrizAdj;
    int[] vetorA;//nos
    int[] vetorB;//nos
    int[] vetorC;//arestas

    public void AbrirGrafo() {
        try {
            input = new Scanner(new File("Grafo.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }
    }

    public void LerGrafo() {

        vetorA = new int[9];
        vetorB = new int[9];

        matrizGrafo = new int[9][3];
        matrizAdj = new int[6][6];
        while (input.hasNextInt()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 3; j++) {
                    matrizGrafo[i][j] = input.nextInt();
                }
            }

        }
        for (int i = 0; i < 9; i++) {
            vetorA[i] = matrizGrafo[i][0];
            vetorB[i] = matrizGrafo[i][1];
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(vetorA[i]);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {

                matrizAdj[vetorA[i]][vetorB[i]] = 1;
                matrizAdj[vetorB[i]][vetorA[i]] = 1;
            }
        }

        System.out.println("MATRIZ ADJACENCICIA");
        for (int i = 0; i < 6; i++) {
            System.out.println("\n");
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizAdj[i][j] + "\t");
            }
        }
        System.out.println("\n");

    }

    public void Adjacentes(int vertice) {
        int adj;

        for (int i = 0; i < 9; i++) {
            if (vetorA[i] == vertice) {
                System.out.println("Vertice adjacentes de " + vertice + ":" + vetorB[i]);
            } else if (vetorB[i] == vertice) {
                System.out.println(vetorA[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vertice;
        Exercicio06 grafo = new Exercicio06();
        grafo.AbrirGrafo();
        grafo.LerGrafo();
        System.out.println("*****QUESTÃO 07*****");
        System.out.println("Informe um vertice: ");
        vertice = entrada.nextInt();
        while (vertice < 6) {
            grafo.Adjacentes(vertice);
            System.out.println("Informe um vertice: " + "\n" + "Digite 6 para encerrar");
            vertice = entrada.nextInt();
        }

        // TODO code application logic here
    }

}
