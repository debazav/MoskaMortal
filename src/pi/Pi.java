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
        Scanner ler = new Scanner(System.in);
        int jogadas = 10;
        int qtdMosca =1;
        int pontos = 0;
        int[][] arena = new int[1][1];
        boolean posicoesCorretas = false;
        boolean inciaJogo = false;
        boolean jogarNovamente = true;

        Desenhos.desenhaMosca();// imagem da mosca
        Desenhos.MOSKAMORTAL();
        //Pedir tamanho da arena
        while (jogarNovamente != false) {
            while (inciaJogo == false) {//quando iniciajogo = true o jogo inicia

                int op = menuArena();
                switch (op) {
                    case 1:
                        arena = new int[3][3];
                        inciaJogo = true;
                        break;
                    case 2:
                        arena = new int[6][6];
                        inciaJogo = true;
                        break;
                    case 3:
                        arena = new int[12][12];
                        inciaJogo = true;
                        break;
                    case 4:
                        Desenhos.cor("azul");
                        System.out.println("############## CRIAÇÃO DE TABULEIRO #################");
                        Desenhos.reset();
                        System.out.println("Digite o tamanho da matriz do tabuleiro");
                        int linha = ler.nextInt();
                        arena = new int[linha][linha];
                        inciaJogo = true;
                        break;
                    case 5:
                        int opm = menuOpcoes();
                        switch (opm) {
                            case 1:
                                System.out.println("Insira a quantidade de jogadas desejada: ");
                                jogadas = ler.nextInt();
                                break;
                            case 2:
                                System.out.println("Digite a quantidade de moscas desejada");
                                qtdMosca = ler.nextInt();
                                break;
                                
                            case 3:
                                System.out.println("O objetivo do jogo é esmagar a maior quantidade possível de moskas."
                                        + "\nPara isso o jogador deve acertar a coordenada em que a moska estará."
                                        + "\nDigitando a linha e a coluna onde ela estará na próxima rodada.");
                                break;
                            default:
                                System.out.println("Opção inválida");

                        }
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }//Fim do while do menu
            //######################################################################
            //##--------------------------Inicia o jogo-------------------------####
            //######################################################################
            System.out.println("");
            Desenhos.cor("azul");
            System.out.println("Olá, vc possui " + jogadas + " rodadas para esmagar a mosca o maior numero de vezes possível");
            Desenhos.reset();
            while (jogadas != 0) {
                desenhaArena(arena);
                arena = posicaoMosca2(arena,qtdMosca);

                try {
                    while (posicoesCorretas != true) {//valida se a posição digitada é valida
                        System.out.println("Digite a coluna do tapa:");
                        int colunaTapa = ler.nextInt();
                        System.out.println("Digite a linha do tapa:");
                        int linhaTapa = ler.nextInt();
                        
                        if (arena[colunaTapa - 1][linhaTapa - 1] == 1) { // O menos um traduz a coluna/linha do que o jogador inseriu                        
                            Desenhos.MOSKAESMAGADA();
                            pontos++;
                            arena[colunaTapa-1][linhaTapa -1] = 3;
                            Desenhos.cor("amarelo");
                            System.out.println("PONTUAÇÃO: " + pontos);
                            Desenhos.reset();
                        }else{
                        arena[colunaTapa-1][linhaTapa -1] = 2;//Define onde foi o tapa
                            Desenhos.fundo("amarelo");
                            System.out.println("ERÔU!!!");
                            Desenhos.reset();
                        }
                        posicoesCorretas = true;//posição valida prossegue o jogo
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    Desenhos.cor("vermelho");
                    System.out.println("Posição inválida");
                    Desenhos.reset();//reseta a cor

                }
                posicoesCorretas = false;// reseta para validacao

                jogadas--;
                Desenhos.limpaTela();
                System.out.println("Quantidade de jogadas restantes: " + jogadas);

            }// fim do while
            Desenhos.fundo("amarelo");
            System.out.println("SUA PONTUAÇÃO TOTAL FOI: " + pontos);
            Desenhos.reset();
            System.out.println("Jogar novamente? (s/n)");
            String jogarDeNovo = ler.next();
            if (jogarDeNovo.equalsIgnoreCase("n")) {

                jogarNovamente = false;
                System.out.println("Game OVer");
                Desenhos.Senac();
            } else {
                jogarNovamente = true;
                inciaJogo = false;
                pontos = 0;
                jogadas = 10;
            }

        }
    }

    public static int menuOpcoes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Opções: ");
        System.out.println("1.Alterar numero de jogadas");
        System.out.println("2.Alterar quantidade de moscas");
        System.out.println("3.Instruções ");
        System.out.print("Opção: ");
        int op = ler.nextInt();
        return op;
    }

    public static int menuArena() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Selecione o tamanho da arena");
        System.out.println("1. pequena");
        System.out.println("2. Média");
        System.out.println("3. Grande");
        System.out.println("4. Arena Personalizada");
        System.out.println("5. Opções");
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

    public static int[][] posicaoMosca2(int[][] arena, int qtdMosca) {
        int linha, coluna;
        Random gp = new Random();
        int[][] novapos = new int[arena.length][arena.length];// cria novo array - copia do anterior
        
        for (int i = 0; i < qtdMosca; i++) {
            linha = gp.nextInt(arena.length);// pega tamanho da arena -1 pra não estourar o array
            coluna = gp.nextInt(arena.length);// pega tamanho da arena -1 pra não estourar o array
            if(novapos[linha][coluna] !=1){
            novapos[linha][coluna] = 1;
            }else{
                i--;
            }
        }
        // cria novo array com a posição da mosca
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
                if (arena[linha][coluna] == 2) {
                    Desenhos.cor("vermelho");
                    System.out.print(" X ");
                    Desenhos.reset();
                }
                if (arena[linha][coluna] == 3) {
                    Desenhos.fundo("verde");
                    System.out.print(" & ");
                    Desenhos.reset();
                }

                if (arena[linha][coluna] != 1 && arena[linha][coluna] == 0) {
                    System.out.printf(" . ");
                }

            }

            System.out.println("||");
        }

    }

}
