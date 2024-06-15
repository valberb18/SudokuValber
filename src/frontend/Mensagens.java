/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.newgame;

/**
 *
 * @author Valbe
 */
public class Mensagens {
    public void posicao(){
        System.out.println("ESCOLHA A POSICAO: ");
    }
    
    public void numero(){
        System.out.println("Escolha o numero que vai ser colocado naquela posicao:");
    }
    
    public void escolha(){
      //  System.out.println("Você escolheu o número: " + numtabu);

    }
    
    public void invalida(){
        System.out.println("Número inválido. Escolha outro número diferente de zero.");

    }
    
    public void entradaInvalida(){
        System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
    }
    
    public void voceVenceu(){
        System.out.println("Parabens voce venceu o jogo SUDOKU");
    }
}
