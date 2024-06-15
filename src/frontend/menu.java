/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.cartas;
import backend.tabuleiro;
import console.Console;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;
import mecanicas.Tabuleiro;
import java.util.Scanner;
import backend.tabuleiro;
import java.security.SecureRandom;
import backend.newgame;
import java.util.Scanner;

public class menu {
    
    public static void main(String[] args){
        
        newgame jogo = new newgame();
        
        StringColorida c0 = new StringColorida("0", Cor.PRETO, Cor.FUNDO_BRANCO);
        cartas carte0 = new cartas(c0);
        
        //tabuleiro criado
        tabuleiro tabu = new tabuleiro(9, 9, carte0);
        //linha - coluna
        //tabu.colocaCarta(i, a, carte1);
        
        System.out.println("*********************************************");
        System.out.println("*              SUDOKU                       *");
        System.out.println("*                                           *");
        System.out.println("*   DIGITE 1 PARA COMCAR                    *");
        System.out.println("*   DIGITE 2 PARA ADICIONAR SAVE            *");
        System.out.println("*   DIGITE 3 PARA COMCAR DE AONDE PAROU     *");
        System.out.println("*   DIGITE QUALQUER CARACTERE PARA SAIR     *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        System.out.println("*PARA JOGAR PRIMEIRO DEVE INFORMA A POSICAO:*");
        System.out.println("*            EXEMPLO:1-1                    *");
        System.out.println("*   E DEPOIS INFORMA O NUMERO QUE VAI SER   *");
        System.out.println("*             COLOCADO:                     *");
        System.out.println("*             EXEMPLO: 2                    *");
        System.out.println("*********************************************");

        Scanner scanner = new Scanner(System.in);
        int mn = scanner.nextInt();
        
        switch(mn){
            case 1:
                jogo.atribuirvalortabuleiro(tabu);
            break;
            case 2:
                System.out.println("DIGITE 2 PARA ADICIONAR SAVE");
            break;
            case 3:
                System.out.println("DIGITE 3 PARA COMCAR DE AONDE PAROU");
            break;
            case 4:
                System.out.println("DIGITE 4 PARA SAIR");
                Console.saiDoPrograma();
            break;
            default:
                System.out.println("DIGITE UM VALOR VALIDO");
            break;
        }
    }
}
