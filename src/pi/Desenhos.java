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

}
