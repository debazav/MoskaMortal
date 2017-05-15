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
        int j1, j2;
        int[][] arena = new int[1][1];
        boolean esmagou = false;
        //Pedir tamanho da arena
        int op = menuArena();
        switch (op) {
            case 1:
                arena = new int[3][3];
                desenhaArena(arena);
                break;
            case 2:
                arena = new int[6][6];
                desenhaArena(arena);
                break;
            case 3:
                arena = new int[12][12];
                desenhaArena(arena);
                break;
            default:
                System.out.println("Opção inválida");
        }
        //Inicia o jogo
        while (esmagou == false) {
            //arena = posicaoMosca(arena);
            //tapa
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
        Random gp = new Random(arena.length - 1);// pega tamanho da arena -1 pra não estourar o array
        linha = gp.nextInt();
        coluna = gp.nextInt();

        int[][] novapos = new int[arena.length][arena.length];

        novapos[linha][coluna] = 1;
        return novapos;
    }

    public static void desenhaArena(int[][] arena) {
        System.out.println();
        for (int linha = 0; linha < arena.length; linha++) {
            for (int coluna = 0; coluna < arena.length; coluna++) {
                if (coluna == 0 || coluna == (arena.length - 1)) {
                    System.out.print(" || ");
                    
                }

                if (linha == 0 || linha == (arena.length - 1)) {
                    System.out.print(" = ");
                }

                if (arena[linha][coluna] == 1) {
                    System.out.print(" 8 ");
                }

                if (arena[linha][coluna] == 0 && coluna != 0 && coluna != (arena.length - 1) && linha != 0 && linha != (arena.length - 1)) {
                    System.out.print(" . ");
                }

            }
            System.out.println();
        }

    }

}
