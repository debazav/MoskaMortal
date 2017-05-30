/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.util.ArrayList;
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
        MOSKAMORTAL();
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
                    cor("azul");
                    System.out.println("############## CRIAÇÃO DE TABULEIRO #################");
                    reset();
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
        System.out.println("");
        cor("azul");
        System.out.println("Olá, vc possui " + jogadas + " rodadas para esmagar a mosca o maior numero de vezes possível");
        reset();
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
                        splash();
                        pontos++;
                        cor("amarelo");
                        System.out.println("PONTUAÇÃO: " + pontos);
                        reset();
                    }
                    posicoesCorretas = true;//posição valida prossegue o jogo
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                cor("vermelho");
                System.out.println("Posição inválida");
                reset();//reseta a cor

            }
            posicoesCorretas = false;// reseta para validacao

            jogadas--;
            System.out.println("Quantidade de jogadas: " + jogadas);

        }// fim do while
        fundo("amarelo");
        System.out.println("SUA PONTUAÇÃO TOTAL FOI: " + pontos);
        reset();
    }

    public static int menuOpcoes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Opções: ");
        System.out.println("1.Alterar numero de jogadas");
        System.out.println("2. Instruções");
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

    public static void cor(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 30;
                break;
            case "vermelho":
            case "vermelha":
                valor = 31;
                break;
            case "verde":
                valor = 32;
                break;
            case "amarelo":
            case "amarela":
                valor = 33;
                break;
            case "azul":
                valor = 34;
                break;
            case "magenta":
                valor = 35;
                break;
            case "ciano":
                valor = 36;
                break;
            case "branco":
            case "branca":
                valor = 37;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

    public static void splash() {
        char[] c1 = ("  _________      .__          _____  __  ._._._.").toCharArray();
        char[] c2 = (" /   _____/_____ |  | _____ _/ ____\\/  |_| | | |").toCharArray();
        char[] c3 = (" \\_____  \\\\____ \\|  | \\__  \\\\   __\\\\   __\\ | | |").toCharArray();
        char[] c4 = (" /        \\  |_> >  |__/ __ \\|  |   |  |  \\|\\|\\|").toCharArray();
        char[] c5 = ("/_______  /   __/|____(____  /__|   |__|  ______").toCharArray();
        char[] c6 = ("        \\/|__|             \\/             \\/\\/\\/").toCharArray();
        ArrayList<char[]> splash = new ArrayList<>();
        splash.add(c1);
        splash.add(c2);
        splash.add(c3);
        splash.add(c4);
        splash.add(c5);
        splash.add(c6);
        splash.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);
                cor("preto");
                fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });
    }

    public static void fundo(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 40;
                break;
            case "vermelho":
            case "vermelha":
                valor = 41;
                break;
            case "verde":
                valor = 42;
                break;
            case "amarelo":
            case "amarela":
                valor = 43;
                break;
            case "azul":
                valor = 44;
                break;
            case "magenta":
                valor = 45;
                break;
            case "ciano":
                valor = 46;
                break;
            case "branco":
            case "branca":
                valor = 47;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

    public static void negrito(boolean ligado) {
        if (ligado) {
            System.out.printf("\u001b[100m");
        } else {
            System.out.printf("\u001b[22m");
        }
    }

    public static void reset() {
        System.out.printf("\u001b[0m");
    }

    public static void limpaTela() {
        System.out.printf("\u001b[2J");
    }

    public static void desenhaMosca() {
        System.out.println("                                                              iBB .LS8,                           YEqi               ");
        System.out.println("                                                             BBBBBBBMU                            rkBBB.             ");
        System.out.println("                                                            0B iG:    :ri.            :7U12ur:        GB.,           ");
        System.out.println("                                                                   OBBBBBBBBU    ,5BBBBBBBBBBBBB:      BB2B          ");
        System.out.println("                                                                 qBB:     .FBBM0BBBY.         iBBM      BiB:         ");
        System.out.println("                                                   :vUUYi.      BB.          BBBL               iBB     B:B:         ");
        System.out.println("                                               .XBBBBBBBBBBBv  BB            jB                  :B8    B.2          ");
        System.out.println("                                  .2BBBBBB5: :BBB2.       vBBBBB;            Bi          L        BB.  .B            ");
        System.out.println("                                rBBBN7iiL0BBBBB.             uBB            7B          iB        :Bq   i            ");
        System.out.println("                               BBF         UBr                 BB           B8          JB         BB                ");
        System.out.println("                              BB          .B:                   BM          B7          G5        .BS                ");
        System.out.println("                             MB           BB             ..     iB.         B,     .    B.        qB                 ");
        System.out.println("                             B:      JBi  B.            ;BBO     BB         B.     rMM7 B7r      :B;                 ");
        System.out.println("                            iB       UBBBBB            .BBBBP    BB7        B.       7BBBU      ,BJ                  ");
        System.out.println("                            iB       ,BBBBB            BBBBBB    BBBB7      B          B       iBu                   ");
        System.out.println("                             B;        . :B.          :BBBBN,    BB rBB     B      .::,U :    JBr                    ");
        System.out.println("                             BB           BB                    rB.   MB:   B.   :k0UiBB7    BB.                     ");
        System.out.println("                              BB          :Br                  .BN     1B:  Bi             LBM                       ");
        System.out.println("                               BBZ.        BBL                iBB       BB  FB     ,BMirjqBB                         ");
        System.out.println("                                :BBBZU2kZMBBOBB,            .BB2         BB  BULqBBBBBBBBBBB                         ");
        System.out.println("                                   BBBBMu:    PBBu.      ,UBBB           PB5LBBBB1,       .BB8                       ");
        System.out.println("                                   8B,          1BBBBBBBBBBF              BBB7              SBB                      ");
        System.out.println("                                   BS              .irr:                  PB                 8BB                     ");
        System.out.println("                                  7B                           BBB:       .B7                 BB                     ");
        System.out.println("                                  MB                         .Bq BB        BB                 5Br                    ");
        System.out.println("                                  BB                        LBi  .B        BB                 .Bk                    ");
        System.out.println("                                  BB                      uBB.    Bv       BB                  BM                    ");
        System.out.println("                                  MB                    rBB:BBP   BB      .B7                  BM                    ");
        System.out.println("                                  :BL                 rBB.  YBMBZ LB      MB                  .B5                    ");
        System.out.println("                                   BB              .kBBBS   rB :B7:B.    .B:                  LB,                    ");
        System.out.println("                                   :BP       ,:7ZBBBM  B1B7 rB  .BBB.    BB                   BB                     ");
        System.out.println("                                    GBr uBBZBBBj.rB B  B  B UB   :BB.   BBBi                .BB                      ");
        System.out.println("                                     BB7 .B: BB0  B .BB;  :BB:         BBL5BBOi         .i5BBB                       ");
        System.out.println("                                      BB0  B7 BBMGB   .     .        iBB.   :BBBBBBBBBBBBBBBB                        ");
        System.out.println("                                       7BBi .7j2 :k                :BBB      MBBiBBB.:rBB  BB5                       ");
        System.out.println("                                         qBBj                   :qBBBL      ;BB  BBk   BB7 BBB                       ");
        System.out.println("                                           LBBBBN7:.       .7OBBBBB7        BBS .BB;   BBB YBB:                      ");
        System.out.println("                                              rMBBBBBBBBBBBBBBBL.           BB  LBB:   BBv                           ");
        System.out.println("                                                   ,rJSPkYi                 .:  uBB.                                 ");
    }

    public static void MOSKAMORTAL() {
        cor("vermelho");
        System.out.println("     ####        ###                       ###                       ###        ####                                       ###    ");
        System.out.println("     #####      #####                      ###                      ######     #####                      ###              ###    ");
        System.out.println("     ######    ## ###    #####      ####   ###   ##   ######        ### ##     ## ##     #####    ##  ## ######   #####    ###    ");
        System.out.println("     ##  ##   ### ##   #########  ###  ##  ### ####  ########        ## ###   ##  ##   ########   ###### ######  ########  ###    ");
        System.out.println("     ##  ###  ##  ##   ###    ##  ###      ######         ###        ##  ##  ###  ##  ###    ###  ###     ###         ###  ###    ");
        System.out.println("     ##   ## ###  ##   ##     ###   #####  ######     #######        ##  ### ##   ##  ###     ##  ###     ###    ########  ###    ");
        System.out.println("     ##   #####   ##   ###    ##      ###  ##  ###   ##    ##        ##   #####   ##   ##    ###  ###     ###   ###   ###  ###    ");
        System.out.println("     ###   ###    ###   #######   #######  ###  ###  ########       ###   ####   ###   ########   ###     #####  ########  ###    ");
        
    }

}
