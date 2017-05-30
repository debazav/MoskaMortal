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
        int jogadas = 10;// numero de jogadas
        int pontos = 0;
        int[][] arena = new int[1][1];
        boolean posicoesCorretas = false;
        boolean inciaJogo = false;

        desenhaMosca();// imagem da mosca
        //Pedir tamanho da arena
        while (inciaJogo == false) {//quando podeir = true o jogo inicia
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
                    System.out.println("Insira a quantidade de linhas desejada.");
                    int linha = ler.nextInt();
                    System.out.println("Insira a quantidade de colunas desejada.");
                    int coluna = ler.nextInt();
                    arena = new int[linha][coluna];
                    inciaJogo = true;
                    break;
                case 5:
                    int opm = menuOpcoes();
                    switch (opm) {
                        case 1:

                            System.out.println("Insira a quantidade de jogadas desejada: ");
                            jogadas = ler.nextInt();

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
        //Inicia o jogo
        System.out.println("Olá, vc possui " + jogadas + " rodadas para esmagar a mosca o maior numero de vezes possível");
        while (jogadas != 0) {
            desenhaArena(arena);
            arena = posicaoMosca(arena);

            try {
                while (posicoesCorretas != true) {//valida se a posição digitada é valida
                    System.out.println("Digite a coluna do tapa:");
                    int colunaTapa = ler.nextInt();
                    System.out.println("Digite a linha do tapa:");
                    int linhaTapa = ler.nextInt();
                    if (arena[colunaTapa - 1][linhaTapa - 1] == 1) {
                        splaft();
                        pontos++;
                        System.out.println("PONTUAÇÃO: " + pontos);
                        
                    }
                    posicoesCorretas = true;//posição valida prossegue o jogo
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida");
               
            }
            posicoesCorretas = false;// reseta para validacao

            jogadas--;
            System.out.println("Quantidade de jogadas: "+ jogadas);

        }// fim do while
        System.out.println("SUA PONTUAÇÃO TOTAL FOI: " + pontos);

    }

    public static int menuOpcoes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Opções: ");
        System.out.println("1.Alterar numero de jogadas");
        //System.out.println("2. Jogar contra computador?");

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
                    System.out.printf(" . ");
                }

            }

            System.out.println("||");
        }

    }

    public static void splaft() {
        System.out.println("  _________      .__          _____  __  ._._._.");
        System.out.println(" /   _____/_____ |  | _____ _/ ____\\/  |_| | | |");
        System.out.println(" \\_____  \\\\____ \\|  | \\__  \\\\   __\\\\   __\\ | | |");
        System.out.println(" /        \\  |_> >  |__/ __ \\|  |   |  |  \\|\\|\\|");
        System.out.println("/_______  /   __/|____(____  /__|   |__|  ______");
        System.out.println("        \\/|__|             \\/             \\/\\/\\/");
    }

    public static void desenhaMosca() {
        System.out.println("                                                                        *@@@     ,*#                                              ,,,                          ");
        System.out.println("                                                                      @@@@@,&@@@@@@@.                                           .@@@@@@#                       ");
        System.out.println("                                                                    .@@@#.@@@@(                                                       @@@(                     ");
        System.out.println("                                                                    &@   @@         ,,,,                      .,#%&%&%%*,              .@@( %                  ");
        System.out.println("                                                                               &@@@@@@@@@@@@@*          *@@@@@@@@@@@@@@@@@@@@.           @@.%@&                ");
        System.out.println("                                                                             @@@@@%.     .%@@@@@(   #@@@@@@(.            (@@@@@          %@%.@@                ");
        System.out.println("                                                                           @@@@               @@@@@@@@.                      @@@@         @@ @@.               ");
        System.out.println("                                                       ,*##(,.            @@@/                 &@@@@.                         #@@@        @@.@@                ");
        System.out.println("                                                 .@@@@@@@@@@@@@@@@&.     @@@.                  %@@&                            ,@@@       @@.%&                ");
        System.out.println("                                              ,@@@@@@&.       .@@@@@@@/ @@@.                   @@&                              ,@@(     .@@ (                 ");
        System.out.println("                          .@@@@@@@@@@@@@@#  &@@@@.                 %@@@@@@#                   (@@                 @.             @@@.    (@&                   ");
        System.out.println("                        &@@@@@.      .&@@@@@@@@                       @@@@                    @@,                .@.             &@@%      .                   ");
        System.out.println("                      @@@@               %@@@                           @@@                  .@@                 %@              .@@@                          ");
        System.out.println("                    ,@@@                (@@/                             @@@.                %@%                 &@              .@@@                          ");
        System.out.println("                   &@@.                ,@@.                               @@@                @@.                 @&              %@@%                          ");
        System.out.println("                  *@@.                 @@&                                 @@%               @@.                 @.              @@@                           ");
        System.out.println("                  @@(          .@&    #@@                     ,@@@#        %@@.              @@          @%.    ,@   .          &@@                            ");
        System.out.println("                 .@@           .@@@(  @@@                    ,@@@@@@       .@@@              @@            @@@@%@@@@/          @@@                             ");
        System.out.println("                 %@%           .@@@@@@@@&                   .@@@@@@@@       @@@%             @@               @@@@.           @@@                              ");
        System.out.println("                 %@%           .@@@@@&@@%                  .@@@@@@@@@       @@@@@@           @@                @@            @@@                               ");
        System.out.println("                 .@@             @@@. @@@                  &@@@@@@@@@      .@@@ .@@@,        @@                @           #@@(                                ");
        System.out.println("                  @@%                 @@@                  @@@@@@@.        &@@.   .@@@       @@          .(%@@@#%@@.      &@@.                                 ");
        System.out.println("                  .@@,                 @@&                                ,@@&      .@@.     @@      .@@%.    @@.       ,@@,                                   ");
        System.out.println("                   &@@,                ,@@,                               @@@         @@%    %@             .@        .@@@                                     ");
        System.out.println("                     @@@,               /@@/                            .@@@          .@@@   .@/           @.       (@@@                                       ");
        System.out.println("                      @@@@*              &@@@                          &@@@            &@@&   @@.        @@@@@@@@@@@@@                                         ");
        System.out.println("                        .@@@@@@%%%%%@@@@@@@@@@&                      %@@@.              &@@%  .@@##%&@@@@@@@@@@@@@@@@@@.                                       ");
        System.out.println("                           @@@@@@@@@@&.      @@@@,                *@@@@/                 @@@( %@@@@@@@@/.          .@@@@@                                      ");
        System.out.println("                            &@@@.              .@@@@@%/,.  .,/&@@@@@@                    %@@@@@@@@,                   /@@@&                                    ");
        System.out.println("                           .@@@                   ,@@@@@@@@@@@@@@%             @@@@       @@@@&                        .@@@@                                   ");
        System.out.println("                           @@@.                                                   @  @    #@@@                           @@@@                                  ");
        System.out.println("                           @@@                                           *@@@(    @*       @@@                           .@@@.                                 ");
        System.out.println("                          .@@.                                         ,@@/@@@    @        @@@.                           @@@&                                 ");
        System.out.println("                          %@@                                         #@@   @@*  @%        &@@.                           .@@@                                 ");
        System.out.println("                          @@@                                        @@.     @@  @         %@@%                            @@@                                 ");
        System.out.println("                          @@@                                     ,@@@       @@            %@@/                            @@@.                                ");
        System.out.println("                          &@@.                                  (@@@@@.      @@@           &@@.                            @@@.                                ");
        System.out.println("                          %@@#                                &@@/ .@@@@(    @@@,          @@@                             @@@.                                ");
        System.out.println("                           @@@                              &@@     &@,@@@@  ,@@&         (@@.                             @@@                                 ");
        System.out.println("                           &@@.                          *@@@#      .@   @@@  @@@         @@&                              @@@                                 ");
        System.out.println("                            @@@                      @@@@@ @@@@@     @     @@#@@@        &@@                              (@@&                                 ");
        System.out.println("                            .@@&                @@@@@@@    @@ @@@    @     @@@@@@       (@@/                              @@@                                  ");
        System.out.println("                             ,@@@   @@@@@@@@@@@@@# @@ @@@  @@  %@@%,&@.     @@@@@      &@@@#                            .@@@                                   ");
        System.out.println("                              &@@@   %@@*  @@@@,   @@  @@%/@@   .@@ &@        ..      @@@@@@@%                        ,@@@@                                    ");
        System.out.println("                               &@@@.   @@.  @@&@@( @@.  /@@@      @@@.              .@@@@  (@@@@@&*.            .*%@@@@@@&                                     ");
        System.out.println("                                 @@@@   @@#  %@@#@@(@%                             @@@@.      .@@@@@@@@@@@@@@@@@@@@@@@@@@                                      ");
        System.out.println("                                  @@@@@   @@@@@@% &@@&                           @@@@@         @@@@@#@@@@@.%@@@@@@. %@@@@,                                     ");
        System.out.println("                                    @@@@@.                                    *@@@@@/         *@@@@  @@@@@    .@@@&  @@@@@                                     ");
        System.out.println("                                      @@@@@@#                             *@@@@@@@.           @@@@. .@@@@&    .@@@@  @@@@@                                     ");
        System.out.println("                                         @@@@@@@@*                   ,%@@@@@@@@@.            %@@@&  .@@@@.    .@@@@. (@@@@,                                    ");
        System.out.println("                                            .@@@@@@@@@@@@@@%%%%@@@@@@@@@@@@,                 @@@@   #@@@@     .@@@@                                            ");
        System.out.println("                                                 ,@@@@@@@@@@@@@@@@@@@@.                      (@@.   &@@@@     .@@@.                                            ");
        System.out.println("                                                                                              .     @@@@@                                                      ");
        System.out.println("                                                                                                                                                               ");
        System.out.println("                                                                                                                                                               ");
    }

}
