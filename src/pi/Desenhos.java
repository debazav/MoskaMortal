/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.util.ArrayList;

/**
 *
 * @author victor.wdebaza
 */
public class Desenhos {

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
        cor("vermelho");
        System.out.println("     #####      #####                      ###                      ######     #####                      ###              ###    ");
        cor("vermelho");
        System.out.println("     ######    ## ###    #####      ####   ###   ##   ######        ### ##     ## ##     #####    ##  ## ######   #####    ###    ");
        cor("vermelho");
        System.out.println("     ##  ##   ### ##   #########  ###  ##  ### ####  ########        ## ###   ##  ##   ########   ###### ######  ########  ###    ");
        cor("vermelho");
        System.out.println("     ##  ###  ##  ##   ###    ##  ###      ######         ###        ##  ##  ###  ##  ###    ###  ###     ###         ###  ###    ");
        cor("vermelho");
        System.out.println("     ##   ## ###  ##   ##     ###   #####  ######     #######        ##  ### ##   ##  ###     ##  ###     ###    ########  ###    ");
        cor("vermelho");
        System.out.println("     ##   #####   ##   ###    ##      ###  ##  ###   ##    ##        ##   #####   ##   ##    ###  ###     ###   ###   ###  ###    ");
        cor("vermelho");
        System.out.println("     ###   ###    ###   #######   #######  ###  ###  ########       ###   ####   ###   ########   ###     #####  ########  ###    ");

    }

    public static void MOSKAESMAGADA() {

        char[] s1 = ("                                                                                                                    Z@X▓                       ").toCharArray();
        char[] s2 = ("                                     78Zr▓                                                                              S@MMM▓                      ").toCharArray();
        char[] s3 = ("                                  @MMMMMMMW▓                   MMMMM▓                                 MMMMW▓           ,MMMMM▓                      ").toCharArray();
        char[] s4 = ("                                 MMMMMM0MMW▓                   MMMMM▓                                .MMMMM▓            MMMMM▓                      ").toCharArray();
        char[] s5 = ("                                 MMMMMM▓        .0Ma▓         MMMMZ▓                  XW@W@Z▓        iMMMMM            ZMMMM▓                      ").toCharArray();
        char[] s6 = ("                                 ;MMMMMM▓       MMMMMM0,▓     MMMMa▓      rWMMMMW.▓    MMMMMMMr▓     rMMMMMMMM@7▓     .MMMM▓                       ").toCharArray();
        char[] s7 = ("                                  0MMMMMM▓     WMMMMMMMM0▓    MMMMa▓    XMMMMMMMMM▓   .MMMM;i,▓      2MMMMMMMMMMM▓     MMMM▓                       ").toCharArray();
        char[] s8 = ("                                   MMMMMMS▓    MMMMZ▓ ZMMM8▓  MMMMZ▓   XMM0XaMMMMW▓   MMMMr▓        8MMMMZ rMMMMr▓    WMMM▓                      ").toCharArray();
        char[] s9 = ("                                    MMMMMM▓   .MMMM7▓  WMMM▓  MMMMZ▓        a@MMMMM▓   :MMMMa▓      BMMMM:▓   MMMa▓   8MMM▓                      ").toCharArray();
        char[] s10 = ("                                   .MMMMMa▓  .MMMMr▓  ZMMM.▓ MMMMB▓      ZMMMMMMMM▓    BMMMMi▓     0MMMMi▓   MMMZ▓   0MMM▓                       ").toCharArray();
        char[] s11 = ("                                    SMMMMM▓   MMMM7▓  MMMM▓  MMMMM▓    0MMM▓  MMMM▓     MMMMW▓    0MMMM:▓   MMMZ▓    MM8▓                       ").toCharArray();
        char[] s12 = ("                                     MMMMM▓   MMMMSiMMMMZ▓   0MMMM▓    MMMX▓ rMMMM▓    .@MMMM▓     MMMMM,▓  ,MMMZ▓                                ").toCharArray();
        char[] s13 = ("                                  SWSMMMMM▓   MMMMMMMMMi▓    MMMMB▓    MMMMMMMMMM▓   @MMMMM;▓      XMMMM.▓  ,MMMZ▓   rMMMa▓                       ").toCharArray();
        char[] s14 = ("                                  MMMMMMM7▓   MMMMMMa▓        XB@i▓     .XZ2i iS,▓   .22Xi▓         2WZ▓    ;ZZ▓      8MMMMa▓                      ").toCharArray();
        char[] s15 = ("                                   200ZS.▓   MMMM.▓                                                                       BMMB▓                       ").toCharArray();
        char[] s16 = ("                                             WMMM▓                                                                                                ").toCharArray();
        char[] s17 = ("                                             .MMM▓                                                                                                ").toCharArray();
        char[] s18 = ("                                              .i▓    				                                                                             ").toCharArray();
        ArrayList<char[]> splashMosca = new ArrayList<>();
        splashMosca.add(s1);
        splashMosca.add(s2);
        splashMosca.add(s3);
        splashMosca.add(s4);
        splashMosca.add(s5);
        splashMosca.add(s6);
        splashMosca.add(s7);
        splashMosca.add(s8);
        splashMosca.add(s9);
        splashMosca.add(s10);
        splashMosca.add(s11);
        splashMosca.add(s12);
        splashMosca.add(s13);
        splashMosca.add(s14);
        splashMosca.add(s15);
        splashMosca.add(s16);
        splashMosca.add(s17);
        splashMosca.add(s18);

        splashMosca.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);

                cor("verde");
                //fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });

        char[] x1 = ("                                                                           ########      ############                              ").toCharArray();
        char[] x2 = ("                                                                          ###     #########        ####                            ").toCharArray();
        char[] x3 = ("                                                              ###       ###         ###               ##                           ").toCharArray();
        char[] x4 = ("                                                          ############  #           ##                 ##                          ").toCharArray();
        char[] x5 = ("                                              ########  ###         #####           #          #       ##                          ").toCharArray();
        char[] x6 = ("                                           ####      ####              ##          ##         ##        #                          ").toCharArray();
        char[] x7 = ("                                          ##          #                 ##         ##         ##        #                          ").toCharArray();
        char[] x8 = ("                                         ##          #                   #         #          #        ##                          ").toCharArray();
        char[] x9 = ("                                         #    ##  # ##       #  ###      ##        #      ##  #        #                           ").toCharArray();
        char[] x10 = ("                                       ##     ###  ##        ###        ##        #       #####      ##                            ").toCharArray();
        char[] x11 = ("                                       ##      ##  ##       ###         ####      #         #       ##                             ").toCharArray();
        char[] x12 = ("                                        #     #  ####      ##  #        ## ###    #         #      ##                              ").toCharArray();
        char[] x13 = ("                                        ##   #      #      #    #       #    ##   #     #  ##    ##                                ").toCharArray();
        char[] x14 = ("                                         ##         ##                 ##     ##  ##            ##                                 ").toCharArray();
        char[] x15 = ("                                          ###       ###              ###       ##  #    ########                                   ").toCharArray();
        char[] x16 = ("                                            ########   ##          ###          ## ######     ####                                 ").toCharArray();
        char[] x17 = ("                                              ##        ############            #####           ###                                ").toCharArray();
        char[] x18 = ("                                             ##             #####                #                ##                               ").toCharArray();
        char[] x19 = ("                                             #                                   ##               ##                               ").toCharArray();
        char[] x20 = ("                                             #                                   ##                ##                              ").toCharArray();
        char[] x21 = ("                                            ##                                   ##                ##                              ").toCharArray();
        char[] x22 = ("                                            ##              #########            ##                ##                              ").toCharArray();
        char[] x23 = ("                                             #          #####   ###########      #                 ##                              ").toCharArray();
        char[] x24 = ("                                             ##       ###          #   ######   ##                 ##                              ").toCharArray();
        char[] x25 = ("                                              #      #            ##  ##  ###   #                  #                               ").toCharArray();
        char[] x26 = ("                                              ##                  ##  #  ##    ##                 ##                               ").toCharArray();
        char[] x27 = ("                                               ##                 ##    ##    ######           ###                                 ").toCharArray();
        char[] x28 = ("                                                ###                ######   ###    ###############                                 ").toCharArray();
        char[] x29 = ("                                                 ####                     ####     ######   ## ###                                 ").toCharArray();
        char[] x30 = ("                                                   ####                 ####      ###  ##   ##  ###                                ").toCharArray();
        char[] x31 = ("                                                      ########    ########        ##  ###   ###  ##                                ").toCharArray();
        char[] x32 = ("                                                          ###########             ##  ###   ##                                     ").toCharArray();
        char[] x33 = ("                                                                                                                                   ").toCharArray();
        ArrayList<char[]> moscaEsmagada = new ArrayList<>();
        moscaEsmagada.add(x1);
        moscaEsmagada.add(x2);
        moscaEsmagada.add(x3);
        moscaEsmagada.add(x4);
        moscaEsmagada.add(x5);
        moscaEsmagada.add(x6);
        moscaEsmagada.add(x7);
        moscaEsmagada.add(x8);
        moscaEsmagada.add(x9);
        moscaEsmagada.add(x10);
        moscaEsmagada.add(x11);
        moscaEsmagada.add(x12);
        moscaEsmagada.add(x13);
        moscaEsmagada.add(x14);
        moscaEsmagada.add(x15);
        moscaEsmagada.add(x16);
        moscaEsmagada.add(x17);
        moscaEsmagada.add(x18);
        moscaEsmagada.add(x19);
        moscaEsmagada.add(x20);
        moscaEsmagada.add(x21);
        moscaEsmagada.add(x22);
        moscaEsmagada.add(x23);
        moscaEsmagada.add(x24);
        moscaEsmagada.add(x25);
        moscaEsmagada.add(x26);
        moscaEsmagada.add(x27);
        moscaEsmagada.add(x28);
        moscaEsmagada.add(x29);
        moscaEsmagada.add(x30);
        moscaEsmagada.add(x31);
        moscaEsmagada.add(x32);
        moscaEsmagada.add(x33);

        moscaEsmagada.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);
                cor("preto");
                //fundo("preto");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });
    }

    public static void Realizacao() {
        char[] r1 = ("                                                                                                           :MOriB:▓                      ").toCharArray();
        char[] r2 = ("                                                                                                            v;O ,i7                       ").toCharArray();
        char[] r3 = ("    GBBBBBU▓     7BMBBBB5▓       BMM▓       ,BB:▓       BBMMB8▓   iBBBBMMBv▓     iBMS▓        ;0BBBJ▓       UL:▓        78BB0i▓         ").toCharArray();
        char[] r4 = ("    BBBUkBBB.▓   XBBFYJUr▓      EBBBO▓      :BBY▓       SBBBMU▓   ,MEF0BBBL▓     BBBB:▓     iBBBMNBBB▓     BBBB.▓     rBBBNOBBB.▓       ").toCharArray();
        char[] r5 = ("    BBF▓  LBB,▓   LBB:▓.:i▓   .BBrBB.▓     .BB;▓        ,BB▓         0BB.▓     JBBuBB▓     BBB▓     .    1BGUBB▓     BBE▓    BBB▓      ").toCharArray();
        char[] r6 = ("    BBBBBBM▓     rBBBBBB,▓    BBY▓ 2BB▓     BBi▓        :BB▓       :BBq▓      BB▓  BBJ▓  .BB7▓          BB▓  BB7▓  .BBi▓    0BB▓      ").toCharArray();
        char[] r7 = ("    BBE▓ XBB.▓    rBB▓        iBBBBBBBr▓    BB:▓        .BB▓      PBBi▓       MBBBBBBB▓     BBB▓    :7    BBBBBBBB▓   BBB▓   BB8▓      ").toCharArray();
        char[] r8 = ("    BBO▓  iBBB.▓  LBBBBBBq▓   BBk▓ . NBB.▓  .BBBBBBB▓   BBBBBB▓   GBBBOBBBB▓  rBB:..BBB▓    GBBBBBBZ▓  vBB:▓..BBB▓    MBBBBBB1▓        ").toCharArray();
        char[] r9 = ("     ,:.   .72:    ::7YJUr  r:  iL.   ii7JuUL   r;:iLv    ,i::7JuUL   :i,     rY  ,rBB    :i,        rL       iJ7.              7vU.          ").toCharArray();
        ArrayList<char[]> realizacao = new ArrayList<>();
        realizacao.add(r1);
        realizacao.add(r2);
        realizacao.add(r3);
        realizacao.add(r4);
        realizacao.add(r5);
        realizacao.add(r6);
        realizacao.add(r7);
        realizacao.add(r8);
        realizacao.add(r9);
         realizacao.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);
                cor("preto");
                //fundo("preto");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });
    }

    public static void Senac() {

        char[] l1 = ("                                                                       .i:.                                             ").toCharArray();
        char[] l2 = ("                                                                      iBBBBBqJi.                                        ").toCharArray();
        char[] l3 = ("                                                                    jBBBBBBBBBBBBBBSr.                                  ").toCharArray();
        char[] l4 = ("                                                                  UBBBBBBBBBBBBBBBBBBBBBF:                              ").toCharArray();
        char[] l5 = ("                                                                 :5v:.           ..:rj0BBBBBU,                          ").toCharArray();
        char[] l6 = ("                                                                                           :UNF;.                       ").toCharArray();
        ArrayList<char[]> senacTopo = new ArrayList<>();
        senacTopo.add(l1);
        senacTopo.add(l2);
        senacTopo.add(l3);
        senacTopo.add(l4);
        senacTopo.add(l5);
        senacTopo.add(l6);

        senacTopo.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);

                cor("azul");
                //fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });

        char[] z1 = ("                                                                    ..::iirr77777r;ii:,..      ..                       ").toCharArray();
        char[] z2 = ("                                                            :rvJU255F511222UUUUUUUUUUUUUUUUUYLri:..                     ").toCharArray();
        char[] z3 = ("                                                      .,:irUXS52uJYYLLLLLLvvvvvvvLvvLLLLYYYjU1FPN00XUvi,                ").toCharArray();
        char[] z4 = ("                                                 .,:irrr;rjUYLvv77777777777777777777LLYJjJYLv7riii:iiii::               ").toCharArray();
        char[] z5 = ("                                                 ,v7;i::iLY77777777777777777777vLYYL7i:.                                ").toCharArray();
        char[] z6 = ("                                                   :ii::vY77777777777777777LYYLr:.                                      ").toCharArray();
        char[] z7 = ("                                                    .::7Y77777777777777vLYL;:                                           ").toCharArray();
        char[] z8 = ("                                                      ijL77777777777vYY7:                                               ").toCharArray();
        char[] z9 = ("                                                      ::;7v7777777LY7:                                                  ").toCharArray();
        char[] z10 = ("                                                     ::,.,i7L77LY7:                                                     ").toCharArray();
        char[] z11 = ("                                                    .i::,..,i7Yr.                                                       ").toCharArray();
        char[] z12 = ("                                                    :i::::::,.                                                          ").toCharArray();
        char[] z13 = ("                                                    i::::::.                                                            ").toCharArray();
        char[] z14 = ("                                                    i::::.                                                              ").toCharArray();
        char[] z15 = ("                                                   .ii:.                                                                ").toCharArray();
        char[] z16 = ("                                                   ,r,                                                                  ").toCharArray();
        ArrayList<char[]> senacMeio = new ArrayList<>();
        senacMeio.add(z1);
        senacMeio.add(z2);
        senacMeio.add(z3);
        senacMeio.add(z4);
        senacMeio.add(z5);
        senacMeio.add(z6);
        senacMeio.add(z7);
        senacMeio.add(z8);
        senacMeio.add(z9);
        senacMeio.add(z10);
        senacMeio.add(z11);
        senacMeio.add(z12);
        senacMeio.add(z13);
        senacMeio.add(z14);
        senacMeio.add(z15);
        senacMeio.add(z16);

        senacMeio.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);

                cor("vermelho");
                //fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });

        char[] q1 = ("          .,::::,.                                                                                                                     ").toCharArray();
        char[] q2 = ("      ;GBBBBBBBBBBi                                                                                              .iY5qZOi              ").toCharArray();
        char[] q3 = ("    7BBBBBBBBBBBBBi                                                                                           7MBBBBBBBBj              ").toCharArray();
        char[] q4 = ("   SBBBBBBBkY77YPB:              :1MBBBBBBBEL.            :j8BBBBBBBN7                  ,BBBBBBP7          .NBBBBBBBBBBBj              ").toCharArray();
        char[] q5 = ("  ,BBBMMB7                    .kBBBBBBBBBBBBBBBv        YBBBBBBBBBBBBBBB:               .BBBBBBBBBM.      UBBBBBBBBBqLi::              ").toCharArray();
        char[] q6 = ("  7BBMOMB.                   vBBBBBBBBBMBBBBBBBBB.    .BBBBBBBBBBBBBBBBBBq               BBBBBBBBBBBr    MBBBBMMBG:                    ").toCharArray();
        char[] q7 = ("   BBMMMBBu.                uBBBBMBU      .PBBBBBB.   BBBBMMBu.   ,NBBBBBB8                 .XBBBBBBB.  qBBBMOOB7                      ").toCharArray();
        char[] q8 = ("   iBBBBBBBBBBMXJ7i.       :BBBMMB:         rBBBBBB  5BBMMMB,       7BBBBBBr                  :BMMBBBU :BBMOOOBv                       ").toCharArray();
        char[] q9 = ("     jBBBBBBBBBBBBBBBBj    PBBMOMM   ....   .BBMBBB  BBMOOBF         BBMBBB8       :7u552UUuLiiMMMMBBk LBBMOOMB                        ").toCharArray();
        char[] q10 = ("       i2GBBBBBBBBBBBBBU  MBMOOMBBBBBBBBBBBBBBBBBB  BBMOOBX         MBMMBBB    iBBBBBBBBBBBBBBBMOMBBN :BBMOOBB                        ").toCharArray();
        char[] q11 = ("             ,rFBBBBBBBBq FBMOMBBGMBBBBBBBMGqPPqMM  BBMOMBZ         MBMOMBO   1BBBBBBB1v77rr;rMBMMMB0  BBMMMBBL                       ").toCharArray();
        char[] q12 = ("                  GBBBBBB :BBMMMB                   BBMOMBG         BBMMMBM  .BBBBMB:         GBMMMBE  NBBMMBBB7                      ").toCharArray();
        char[] q13 = ("   :BX.           :BMMMBB7 qBBMMBM.                 BBMOMBG         BBMMMBB  ,BBMMMB         7BBOMMB8   OBBMBBBBM:                    ").toCharArray();
        char[] q14 = ("..MBBBBBZL:.     :MBMMMBB.  0BBBBBBBEj7L,           BBMOMBG         BBMOMBO   BBBMMBBr.   .rBBBMMMMBM    UBBBBBBBBB0v:,.              ").toCharArray();
        char[] q15 = ("iBBBBBBBBBBBBBBBBBBBMBBB:    iBBBBBBBBBBP           BBBMBBM         BBBMBBG   .BBBBBBBBBBBBBB0MBBMBBB     .NBBBBBBBBBBBY              ").toCharArray();
        char[] q16 = ("  .UBBBBBBBBBBBBBBBBBBv        :PBBBBBBBk           BBBBBBB         BBBBBBB     :ZBBBBBBBBB1  BBBBBBB        YBBBBBBBBBJ              ").toCharArray();
        char[] q17 = ("     .:rY2FkXXXS1j7i.             .,:iii.           .......         .......        .,:::.     .......          .:rLU155r              ").toCharArray();
        ArrayList<char[]> senacNome = new ArrayList<>();
        senacNome.add(q1);
        senacNome.add(q2);
        senacNome.add(q3);
        senacNome.add(q4);
        senacNome.add(q5);
        senacNome.add(q6);
        senacNome.add(q7);
        senacNome.add(q8);
        senacNome.add(q9);
        senacNome.add(q10);
        senacNome.add(q11);
        senacNome.add(q12);
        senacNome.add(q13);
        senacNome.add(q14);
        senacNome.add(q15);
        senacNome.add(q16);
        senacNome.add(q17);

        senacNome.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {
                negrito(true);

                cor("azul");
                //fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });
    }

    public static void GameOver() {
        char[] g1 = ("      .ZB00BBM▓                                                    X000B8i▓                                             ").toCharArray();
        char[] g2 = ("     0MB:▓  :ZMM▓                                                :MMr  ,ZMM▓                                           ").toCharArray();
        char[] g3 = ("    BMi▓       Z▓      ..               .         ,.             MM▓       MM▓   ,  .  ,  .     ,.          ::         ").toCharArray();
        char[] g4 = ("    M@▓             aMM88M8▓   :MMWBMMMS8MMMB▓     7MBZBM2▓    2M▓       8M.▓  8MM2▓  aMMX▓  iM@Z8M0▓     WMWZMM,▓ ").toCharArray();
        char[] g5 = ("    Ma▓     SZSS2▓  B@▓  WM▓  iMM▓   MM,▓ 0M▓    2MS▓  SM▓  8M▓       7M;▓   XMX▓   ;M▓   iMW▓  iM▓    MMr▓    ").toCharArray();
        char[] g6 = ("    MM▓     irMMi▓   ,Z02WM▓    Mr▓    MM▓ 7M▓    MMiSa20S▓  iM7▓       WM▓     BM▓  M,▓   0M7X22XZZ▓    M2▓     ").toCharArray();
        char[] g7 = ("    XM0▓      MW▓   MM▓  rM▓   M7▓    MM▓ 7M▓    MZM▓      . MM:▓     SMX▓      MM8Z▓      ;M;▓     .    M2▓     ").toCharArray();
        char[] g8 = ("     ;MMZXXZ@M@▓    MMSXaMM▓    ZM;▓ 7MMX▓:MM.▓  0M0XX8MX▓      ZMWSXaMM:▓         MM▓      SMWSXZMZ▓    2MM;▓     ").toCharArray();
        char[] g9 = ("       .7X7:          ,7r  :;    , ,, ,  i  . :     rX7:              iXXr                         iX7i       , .:       ").toCharArray();

        ArrayList<char[]> gameOver = new ArrayList<>();
        gameOver.add(g1);
        gameOver.add(g2);
        gameOver.add(g3);
        gameOver.add(g4);
        gameOver.add(g5);
        gameOver.add(g6);
        gameOver.add(g7);
        gameOver.add(g8);
        gameOver.add(g9);

        gameOver.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {

                negrito(true);
                cor("vermelho");
                //fundo("verde");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });

    }

    public static void Menu() {

        char[] m1 = (" ╔╦╗ ┌─┐┌┐┌  ┬ ┬                                                              ").toCharArray();
        char[] m2 = (" ║║║ ├┤  │││ │ │                                                              ").toCharArray();
        char[] m3 = (" ╩ ╩ └─┘ ┘└┘ └─┘                                                              ").toCharArray();
        ArrayList<char[]> menu = new ArrayList<>();
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.forEach((linha) -> {
            int numer = linha.length;
            for (int i = 0; i < numer; i++) {

                negrito(true);
                cor("verde");
                fundo("ciano");
                System.out.print(linha[i]);
                reset();
                /*fundo("vermelho");
                System.out.print(linha[i]);*/

            }
            System.out.println("");
        });

    }

}

