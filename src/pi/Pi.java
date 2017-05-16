/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author victor.wdebaza
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int j1 =0, j2=0;
        int[][] arena = new int[1][1];
        boolean esmagou = false;
        //Pedir tamanho da arena
        int op = menuArena();
        switch (op) {
            case 1:
                arena = new int[3][3];
                //desenhaArena(arena);
                break;
            case 2:
                arena = new int[6][6];
                //desenhaArena(arena);
                break;
            case 3:
                arena = new int[12][12];
                //desenhaArena(arena);
                break;
            default:
                System.out.println("Opção inválida");
        }
        //Inicia o jogo
        while (j1 != 5) {            
            desenhaArena(arena);
            arena = posicaoMosca(arena);
            System.out.println("Digite a coluna do tapa:");
            int colunaTapa = ler.nextInt();
            System.out.println("Digite a linha do tapa:");
            int linhaTapa = ler.nextInt();
            if (arena[colunaTapa-1][linhaTapa-1] == 1) {
                esmagou = true;
                j1++;
                System.out.println("  _________      .__          _____  __  ._._._.");
                System.out.println(" /   _____/_____ |  | _____ _/ ____\\/  |_| | | |");
                System.out.println(" \\_____  \\\\____ \\|  | \\__  \\\\   __\\\\   __\\ | | |");
                System.out.println(" /        \\  |_> >  |__/ __ \\|  |   |  |  \\|\\|\\|");
                System.out.println("/_______  /   __/|____(____  /__|   |__|  ______");
                System.out.println("        \\/|__|             \\/             \\/\\/\\/");
                System.out.println("PONTUAÇÃO: " + j1);
            }
            

            //conferir acerto
            //
        }// fim do while

    }

    public static int menuArena() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Selecione o tamanho da arena");
        System.out.println("1. pequena");
        System.out.println("2. Média");
        System.out.println("3. Grande");
        System.out.print("Opção: ");
        int op = ler.nextInt();
        return op;
    }

    public static int[][] posicaoMosca(int[][] arena) {
        int linha, coluna;
        Random gp = new Random();
        linha = gp.nextInt(arena.length - 1);// pega tamanho da arena -1 pra não estourar o array
        coluna = gp.nextInt(arena.length - 1);// pega tamanho da arena -1 pra não estourar o array

        int[][] novapos = new int[arena.length][arena.length];// cria novo array - copia do anterior

        novapos[linha][coluna] = 1;// cria novo array com a posição da mosca
        //System.out.println(linha + " "+ coluna);
        return novapos; // retorna ao main o novo array
    }

    public static void desenhaArena(int[][] arena) {
        System.out.println("");
        for (int linha = 0; linha < arena.length; linha++) {

            for (int coluna = 0; coluna < arena.length; coluna++) {

                if (coluna == 0 || coluna == (arena.length)) {
                    System.out.print(" || ");

                }

                if (arena[linha][coluna] == 1) {
                    System.out.print(" 8 ");
                }

                if (arena[linha][coluna] != 1 && arena[linha][coluna] == 0) {
                    System.out.print(" . ");
                }

            }

            System.out.println("||");
        }

    }

}
