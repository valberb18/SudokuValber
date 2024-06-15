/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import frontend.Mensagens;
import sudokutrabalho.Sudokutrabalho;
import console.Console;
import cores.Cor;
import cores.StringColorida;        
import mecanicas.Carta;
import mecanicas.Tabuleiro;
import java.security.SecureRandom;
import java.util.Random;
import frontend.menu;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
/**
 *
 * @author Valbe
 */
public class newgame {
    //
    int numtabuescolhido;
    int alel;//aleatorio linha
    int alec;//aleatorio coluna
    int alen;
    int alep;
    int fim = 0;
    double posicao;
    int posicaozero = 0;
    int numerozero = 0;
    int recebeu1 = 0;   int ref1;
    int recebeu2 = 0;   int ref2;
    int recebeu3 = 0;   int ref3;
    int recebeu4 = 0;   int ref4;
    int recebeu5 = 0;   int ref5;
    int recebeu6 = 0;   int ref6;
    int recebeu7 = 0;   int ref7;
    int recebeu8 = 0;   int ref8;
    int recebeu9 = 0;   int ref9;
    int recebeu10 = 0;  int ref10;
    int recebeu11 = 0;  int ref11;
    int recebeu12 = 0;  int ref12;
    int recebeu13 = 0;  int ref13;
    int recebeu14 = 0;  int ref14;
    int recebeu15 = 0;  int ref15;
    int recebeu16 = 0;  int ref16;
    int recebeu17 = 0;  int ref17;
    int recebeu18 = 0;  int ref18;
    int recebeu19 = 0;  int ref19;
    int recebeu20 = 0;  int ref20;
    int recebeu21 = 0;  int ref21;
    int recebeu22 = 0;  int ref22;
    int recebeu23 = 0;  int ref23;
    int recebeu24 = 0;  int ref24;
    int recebeu25 = 0;  int ref25;
    int recebeu26 = 0;  int ref26;
    int recebeu27 = 0;  int ref27;
    int recebeu28 = 0;  int ref28;
    int recebeu29 = 0;  int ref29;
    int recebeu30 = 0;  int ref30;
    int recebeu31 = 0;  int ref31;
    int recebeu32 = 0;  int ref32;
    int recebeu33 = 0;  int ref33;
    int recebeu34 = 0;  int ref34;
    int recebeu35 = 0;  int ref35;
    int recebeu36 = 0;  int ref36;
    int recebeu37 = 0;  int ref37;
    int recebeu38 = 0;  int ref38;
    int recebeu39 = 0;  int ref39;
    int recebeu40 = 0;  int ref40;
    int recebeu41 = 0;  int ref41;
    int recebeu42 = 0;  int ref42;
    int recebeu43 = 0;  int ref43;
    int recebeu44 = 0;  int ref44;
    int recebeu45 = 0;  int ref45;
    int recebeu46 = 0;  int ref46;
    int recebeu47 = 0;  int ref47;
    int recebeu48 = 0;  int ref48;
    int recebeu49 = 0;  int ref49;
    int recebeu50 = 0;  int ref50;
    int recebeu51 = 0;  int ref51;
    int recebeu52 = 0;  int ref52;
    int recebeu53 = 0;  int ref53;
    int recebeu54 = 0;  int ref54;
    int recebeu55 = 0;  int ref55;
    int recebeu56 = 0;  int ref56;
    int recebeu57 = 0;  int ref57;
    int recebeu58 = 0;  int ref58;
    int recebeu59 = 0;  int ref59;
    int recebeu60 = 0;  int ref60;
    int recebeu61 = 0;  int ref61;
    int recebeu62 = 0;  int ref62;
    int recebeu63 = 0;  int ref63;
    int recebeu64 = 0;  int ref64;
    int recebeu65 = 0;  int ref65;
    int recebeu66 = 0;  int ref66;
    int recebeu67 = 0;  int ref67;
    int recebeu68 = 0;  int ref68;
    int recebeu69 = 0;  int ref69;
    int recebeu70 = 0;  int ref70;
    int recebeu71 = 0;  int ref71;
    int recebeu72 = 0;  int ref72;
    int recebeu73 = 0;  int ref73;
    int recebeu74 = 0;  int ref74;
    int recebeu75 = 0;  int ref75;
    int recebeu76 = 0;  int ref76;
    int recebeu77 = 0;  int ref77;
    int recebeu78 = 0;  int ref78;
    int recebeu79 = 0;  int ref79;
    int recebeu80 = 0;  int ref80;
    int recebeu81 = 0;  int ref81;
   
    
    public void atribuirvalortabuleiro(Tabuleiro tabu){
         
        
       cartas carte0;
       
        
        for(int i=0; i<8; i++){
            for(int c=0; c<8;c++){
                //tabu.colocaCarta(1, 4, carte1);
                Random aleatoriN = new Random();
                Random aleatoriC = new Random();
                Random aleatoriL = new Random();
                Random aleatoriPosicaoA = new Random();
                alen = aleatoriN.nextInt(9);// numero aleatoria que vai ser colocado naquela posicao
                alel = aleatoriL.nextInt(9);//linha aleatoria que vai selecionda
                alec = aleatoriC.nextInt(9);//coluna aleatoria que vai ser selecionda
                alep = aleatoriPosicaoA.nextInt(81);//vai ser posicao, todas as posicoes estao sendo representas, vai de 1(1-1) ate 81(9-9) 
                String salen = Integer.toString(alen);//numero que vai ser mudado para string
                //posicao 1-1
                if(alep==1){//
                   if(alen == 0){
                        StringColorida c1 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte1 = new cartas(c1);
                        tabu.colocaCarta(0, 0, carte1);
                   }
                   else{
                        StringColorida c1 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte1 = new cartas(c1);
                        tabu.colocaCarta(0, 0, carte1);
                        ref1=alen;
                        recebeu1=1;
                   }
                   //sistema que impede que gere numeros iguais nas linhas e colunas e quadrantes
                   if(ref1 ==ref2   || ref1==ref3    || ref1==ref4    || 
                      ref1 ==ref5   || ref1 == ref6  || ref1 == ref7  || 
                      ref1 == ref8  || ref1 ==ref9   || ref1==ref10   || 
                      ref1 ==ref19  || ref1==ref28   || ref1==ref37   || 
                      ref1 == ref46 || ref1 == ref55 || ref1 == ref64 || 
                      ref1 == ref73 || ref1 == ref11 || ref1 == ref12 || 
                      ref1 == ref20 || ref1 == ref21){
                       
                       alen=0;
                       StringColorida c1 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                       cartas carte1 = new cartas(c1);
                       tabu.colocaCarta(0, 0, carte1);
                       
                   }
                 
                }
                
                //posicao 1-2
                if(alep==2){
                   if(alen == 0){
                        StringColorida c2 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte2 = new cartas(c2);
                        tabu.colocaCarta(0, 1, carte2);
                   }
                   else{
                        StringColorida c2 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte2 = new cartas(c2);
                        tabu.colocaCarta(0, 1, carte2);
                        ref2=alen;
                        recebeu2=1;
                                
                   }
                   if(ref2==ref1    || ref2==ref3    ||ref2==ref4     || 
                      ref2==ref5    || ref2 == ref6  || ref2 == ref7  || 
                      ref2 == ref8  || ref2 == ref9  ||ref2==ref11    || 
                      ref2==ref20   || ref2==ref29   || ref2==ref38   || 
                      ref2 == ref47 || ref2 == ref56 || ref2 == ref65 || 
                      ref2 == ref74 || ref2 == ref10 || ref2 == ref12 || 
                      ref2 == ref19 || ref2 == ref21){
                       alen=0;
                       StringColorida c2 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                       cartas carte2 = new cartas(c2);
                       tabu.colocaCarta(0, 1, carte2);
                   
                   }
                }
                
                //posicao 1-3
                if(alep==3){
                   if(alen == 0){
                        StringColorida c3 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte3 = new cartas(c3);
                        tabu.colocaCarta(0, 2, carte3);
                   }
                   else{
                        StringColorida c3 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte3 = new cartas(c3);
                        tabu.colocaCarta(0, 2, carte3);
                        ref3=alen;
                                           recebeu3=1;

                   }
                   if(ref3==ref1    || ref3==ref2    || ref3==ref4    ||
                      ref3==ref5    || ref3 == ref6  || ref3 == ref7  || 
                      ref3 == ref8  || ref3 == ref9  || ref3==ref12   || 
                      ref3==ref21   ||ref3==ref30    || ref3==ref39   || 
                      ref3 == ref48 || ref3 == ref57 || ref3 == ref66 || 
                      ref3 == ref75 ||ref3 == ref10  || ref3 == ref11 || 
                      ref3 == ref19 || ref3 == ref20){
                       alen=0;
                       StringColorida c3 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                       cartas carte3 = new cartas(c3);
                       tabu.colocaCarta(0, 2, carte3);

                    }
                }
                //posicao 1-4
                if(alep==4){
                   if(alen == 0){
                        StringColorida c4 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte4 = new cartas(c4);
                        tabu.colocaCarta(0, 3, carte4);
                   }
                   else{
                        StringColorida c4 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte4 = new cartas(c4);
                        tabu.colocaCarta(0, 3, carte4);
                        ref4=alen;
                        recebeu4=1;

                   }
                   if(ref4==ref1    || ref4==ref2    ||ref4==ref3 ||
                    ref4==ref5    || ref4 == ref6  || ref4 == ref7 || 
                    ref4 == ref8  || ref4 == ref9  ||ref4==ref13 || 
                    ref4==ref22   ||ref4==ref31    || ref4==ref40 || 
                    ref4 == ref49 || ref4 == ref58 || ref4 == ref67 || 
                    ref4 == ref76 ||ref4 == ref14  || ref4 == ref15 || 
                    ref4 == ref23 || ref4 == ref24){
                     alen=0;  
                    StringColorida c4 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                    cartas carte4 = new cartas(c4);
                    tabu.colocaCarta(0, 3, carte4);   
                   }
                   
                   
                }
                
                //posicao 1-5
                if(alep==5){
                   if(alen == 0){
                        StringColorida c5 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte5 = new cartas(c5);
                        tabu.colocaCarta(0, 4, carte5);
                   }
                   else{
                        StringColorida c5 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte5 = new cartas(c5);
                        tabu.colocaCarta(0, 4, carte5);
                        ref5=alen;
                                           recebeu5=1;

                   }
                   if(ref5==ref1 || ref5==ref2 ||ref5==ref3 ||
                        ref5==ref4 || ref5 == ref6 || ref5 == ref7 || 
                        ref5 == ref8 || ref5 == ref9||ref5==ref14 || 
                        ref5==ref23 ||ref5==ref32 || ref5==ref41 || 
                        ref5 == ref50 || ref5 == ref59 || ref5 == ref68 ||
                        ref5 == ref77||ref5 == ref13 || ref5 == ref15 || 
                        ref5 == ref22 || ref5 == ref24){
                   
                        alen=0;
                        StringColorida c5 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte5 = new cartas(c5);
                        tabu.colocaCarta(0, 4, carte5);
                   }
                }
                
                //posicao 1-6
                if(alep==6){
                   if(alen == 0){
                        StringColorida c6 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte6 = new cartas(c6);
                        tabu.colocaCarta(0, 6, carte6);
                   }
                   else{
                        StringColorida c6 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte6 = new cartas(c6);
                        tabu.colocaCarta(0, 5, carte6);
                        ref6=alen;
                                           recebeu6=1;

                   }
                   if(ref6==ref1 || ref6==ref2 ||ref6==ref3 || 
                        ref6==ref4 || ref6 == ref5 || ref6 == ref7 || 
                        ref6 == ref8 || ref6 == ref9||ref6==ref15 || 
                        ref6==ref24 ||ref6==ref33 || ref6==ref42 || 
                        ref6 == ref51 || ref6 == ref60 || ref6 == ref69 ||
                        ref6 == ref78||ref6 == ref13 || ref6 == ref14 || 
                        ref6 == ref22 || ref6 == ref23){
                       alen=0;
                       StringColorida c6 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte6 = new cartas(c6);
                        tabu.colocaCarta(0, 6, carte6);
                   }
                }
                
                //posicao 1-7
                if(alep==7){
                   if(alen == 0){
                        StringColorida c7 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte7 = new cartas(c7);
                        tabu.colocaCarta(0, 6, carte7);
                   }
                   else{
                        StringColorida c7 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte7 = new cartas(c7);
                        tabu.colocaCarta(0, 6, carte7);
                        ref7=alen;
                                           recebeu7=1;

                   }
                   if(ref7==ref1 || ref7==ref2 ||ref7==ref3 || 
                    ref7==ref4 || ref7 == ref5 || ref7 == ref6 ||
                    ref7 == ref8 || ref7 == ref9||ref7==ref16 || 
                    ref7==ref25 ||ref7==ref34 || ref7==ref43 || 
                    ref7 == ref52 || ref7 == ref61 || ref7 == ref70 || 
                    ref7 == ref79||ref7 == ref17 || ref7 == ref18 || 
                    ref7 == ref26 || ref7 == ref27){
                  
                       alen=0;
                       StringColorida c7 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte7 = new cartas(c7);
                        tabu.colocaCarta(0, 6, carte7);
                   }
                   
                   
                   
                   
                }
                //posicao 1-8
                if(alep==8){
                   if(alen == 0){
                        StringColorida c8 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte8 = new cartas(c8);
                        tabu.colocaCarta(0, 7, carte8);
                   }
                   else{
                        StringColorida c8 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte8 = new cartas(c8);
                        tabu.colocaCarta(0, 7, carte8);
                        ref8=alen;
                                           recebeu8=1;

                   }
                   if(ref8==ref1 || ref8==ref2 ||ref8==ref3 ||
                      ref8==ref4 || ref8 == ref5 || ref8 == ref6 || 
                      ref8 == ref7 || ref8 == ref9||ref8==ref17 || 
                      ref8==ref26 ||ref8==ref35 || ref8==ref44 || 
                      ref8 == ref53 || ref8 == ref62 || ref8 == ref71 || 
                      ref8 == ref80||ref8 == ref16 || ref8 == ref18 || 
                      ref8 == ref25 || ref8 == ref27){
                   
                       alen=0;
                       StringColorida c8 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                       cartas carte8 = new cartas(c8);
                        tabu.colocaCarta(0, 7, carte8);
                   }
                   
                }
                
                //posicao 1-9
                if(alep==9){
                   if(alen == 0){
                        StringColorida c9 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte9 = new cartas(c9);
                        tabu.colocaCarta(0, 8, carte9);
                   }
                   else{
                        StringColorida c9 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte9 = new cartas(c9);
                        tabu.colocaCarta(0, 8, carte9);
                        ref9=alen;
                                           recebeu9=1;

                   }
                   
                   if(ref9==ref1 || ref9==ref2 ||ref9==ref3 || 
                    ref9==ref4 || ref9 == ref5 || ref9 == ref6 || 
                    ref9 == ref7 || ref9 == ref8||ref9==ref18 || 
                    ref9==ref27 ||ref9==ref36 || ref9==ref45 ||
                    ref9 == ref54 || ref9 == ref63 || ref9 == ref72 ||
                    ref9 == ref81||ref9 == ref16 || ref9 == ref17 ||
                    ref9 == ref25 || ref9 == ref26){
                   
                       alen=0;
                       StringColorida c9 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte9 = new cartas(c9);
                        tabu.colocaCarta(0, 8, carte9);
                   }
                }
                
                //posicao 2-1
                if(alep==10){
                   if(alen == 0){
                        StringColorida c10 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte10 = new cartas(c10);
                        tabu.colocaCarta(1, 0, carte10);
                   }
                   else{
                        StringColorida c10 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte10 = new cartas(c10);
                        tabu.colocaCarta(1, 0, carte10);
                        ref10=alen;
                                           recebeu10=1;

                   }
                   
                   if(ref10==ref11 || ref10==ref12 ||ref10==ref13 || 
                    ref10==ref14 || ref10 == ref15 || ref10 == ref16 ||
                    ref10 == ref17 || ref10 == ref18||ref10==ref1 ||
                    ref10==ref19 ||ref10==ref28 || ref10==ref37 || 
                    ref10 == ref46 || ref10 == ref55 || ref10 == ref64 ||
                    ref10 == ref73||ref10 == ref2 || ref10 == ref3 || 
                    ref10 == ref20 || ref10 == ref21){
                       alen=0;
                       StringColorida c10 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                       cartas carte10 = new cartas(c10);
                       tabu.colocaCarta(1, 0, carte10);
                   
                   }
                }
                //posicao 2-2
                if(alep==11){
                   if(alen == 0){
                        StringColorida c11 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte11 = new cartas(c11);
                        tabu.colocaCarta(1, 1, carte11);
                   }
                   else{
                        StringColorida c11 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte11 = new cartas(c11);
                        tabu.colocaCarta(1, 1, carte11);
                        ref11=alen;
                                           recebeu12=1;

                   }
                   if(ref11==ref10 || ref11==ref12 ||ref11==ref13 || 
                        ref11==ref14 || ref11 == ref15 || ref11 == ref16 || 
                        ref11 == ref17 || ref11 == ref18||ref11==ref2 || 
                         ref11==ref20 ||ref11==ref29 || ref11==ref38 || 
                        ref11 == ref47 || ref11 == ref56 || ref11 == ref65 || 
                        ref11 == ref74||ref11 == ref1 || ref11 == ref3 || 
                        ref11 == ref19 || ref11 == ref21){
                       alen=0;
                       StringColorida c11 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte11 = new cartas(c11);
                        tabu.colocaCarta(1, 1, carte11);
                   }
                }
                //posicao 2-3
                if(alep==12 ){
                   if(alen == 0){
                        StringColorida c12 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte12 = new cartas(c12);
                        tabu.colocaCarta(1, 2, carte12);
                   }
                   else{
                        StringColorida c12 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte12 = new cartas(c12);
                        tabu.colocaCarta(1, 2, carte12);
                        ref12=alen;
                                           recebeu12=1;

                   }
                   if(ref12==ref10 || ref12==ref11 ||ref12==ref13 || 
                        ref12==ref14 || ref12 == ref15 || ref12 == ref16 || 
                        ref12 == ref17 || ref12 == ref18||ref12==ref3 || 
                        ref12==ref21 ||ref12==ref30 || ref12==ref39 ||
                        ref12 == ref48 || ref12 == ref57 || ref12 == ref66 ||
                        ref12 == ref75||ref12 == ref1 || ref12 == ref2 || 
                        ref12 == ref19 || ref12 == ref20){
                        alen=0;
                        StringColorida c12 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte12 = new cartas(c12);
                        tabu.colocaCarta(1, 2, carte12);
                   }
                }
                
                //posicao 2-4
                if(alep==13 ){
                   if(alen == 0){
                        StringColorida c13 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte13 = new cartas(c13);
                        tabu.colocaCarta(1, 3, carte13);
                   }
                   else{
                        StringColorida c13 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte13 = new cartas(c13);
                        tabu.colocaCarta(1, 3, carte13);
                        ref13=alen;
                                           recebeu13=1;

                   }
                   if(ref13==ref10 || ref13==ref11 ||ref13==ref12 || 
                        ref13==ref14 || ref13 == ref15 || ref13 == ref16 || 
                        ref13 == ref17 || ref13 == ref18||ref13==ref4 || 
                        ref13==ref22 ||ref13==ref31 || ref13==ref40 || 
                        ref13 == ref49 || ref13 == ref58 || ref13 == ref67 || 
                        ref13 == ref76||ref13 == ref5 || ref13 == ref6 || 
                        ref13 == ref23 || ref13 == ref24){
                        alen=0;
                        StringColorida c13 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte13 = new cartas(c13);
                        tabu.colocaCarta(1, 3, carte13);
                   }
                   
                   
                }
                
                //posicao 2-5
                if(alep==14 ){
                   if(alen == 0){
                        StringColorida c14 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte14 = new cartas(c14);
                        tabu.colocaCarta(1, 4, carte14);
                   }
                   else{
                        StringColorida c14 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte14 = new cartas(c14);
                        tabu.colocaCarta(1, 4, carte14);
                        ref14=alen;
                                           recebeu14=1;

                   }
                   if(ref14==ref10 || ref14==ref11 ||ref14==ref12 || 
                    ref14==ref13 || ref14 == ref15 || ref14 == ref16 || 
                    ref14 == ref17 || ref14 == ref18||ref14==ref5 || 
                    ref14==ref23 ||ref14==ref32 || ref14==ref41 || 
                    ref14 == ref50 || ref14 == ref59 || ref14 == ref68 || 
                    ref14 == ref77 ||ref14 == ref4 || ref14 == ref6 || 
                    ref14 == ref22 || ref14 == ref24){
                        alen=0;
                        StringColorida c14 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte14 = new cartas(c14);
                        tabu.colocaCarta(1, 4, carte14);
                   }
                   
                }
                
                //posicao 2-6
                if(alep==15 ){
                   if(alen == 0){
                        StringColorida c15 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte15 = new cartas(c15);
                        tabu.colocaCarta(1, 5, carte15);
                   }
                   else{
                        StringColorida c15 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte15 = new cartas(c15);
                        tabu.colocaCarta(1, 5, carte15);
                        ref15=alen;
                                           recebeu15=1;

                   }
                   if(ref15==ref10 || ref15==ref11 ||ref15==ref12 || 
                        ref15==ref13 || ref15 == ref14 || ref15 == ref16 || 
                        ref15 == ref17 || ref15 == ref18||ref15==ref6 || 
                        ref15==ref24 ||ref15==ref33 || ref15==ref42 || 
                        ref15 == ref51 || ref15 == ref60 || ref15 == ref69 || 
                        ref15 == ref78||ref15 == ref4 || ref15 == ref5 || 
                        ref15 == ref22 || ref15 == ref23){
                        
                       alen=0;
                       StringColorida c15 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte15 = new cartas(c15);
                        tabu.colocaCarta(1, 5, carte15);
                   }
                }
                //posicao 2-7
                if(alep==16 ){
                   if(alen == 0){
                        StringColorida c16 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte16 = new cartas(c16);
                        tabu.colocaCarta(1, 6, carte16);
                   }
                   else{
                        StringColorida c16 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte16 = new cartas(c16);
                        tabu.colocaCarta(1, 6, carte16);
                        ref16=alen;
                                           recebeu16=1;

                   }
                   if(ref16==ref10 || ref16==ref11 ||ref16==ref12 || 
                        ref16==ref13 || ref16 == ref14 || ref16 == ref15 || 
                        ref16 == ref17 || ref16 == ref18||ref16==ref7 || 
                        ref16==ref25 ||ref16==ref34 || ref16==ref43 || 
                        ref16 == ref52 || ref16 == ref61 || ref16 == ref70 || 
                        ref16 == ref79||ref16 == ref8 || ref16 == ref9 || 
                        ref16 == ref26 || ref16 == ref27){
                        alen=0;
                        StringColorida c16 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte16 = new cartas(c16);
                        tabu.colocaCarta(1, 6, carte16);
                   }
                }
                //posicao 2-8
                if(alep==17){
                   if(alen == 0){
                        StringColorida c17 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte17 = new cartas(c17);
                        tabu.colocaCarta(1, 7, carte17);
                   }
                   else{
                        StringColorida c17 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte17 = new cartas(c17);
                        tabu.colocaCarta(1, 7, carte17);
                        ref17=alen;
                                           recebeu17=1;

                   }
                   if(ref17==ref10 || ref17==ref11 ||ref17==ref12 || 
                        ref17==ref13 || ref17 == ref14 || ref17 == ref15 ||
                        ref17 == ref16 || ref17 == ref18||ref17==ref8 || 
                        ref17==ref26 ||ref17==ref35 || ref17==ref44 || 
                        ref17 == ref53 || ref17 == ref62 || ref17 == ref71 || 
                        ref17 == ref80||ref17 == ref7 || ref17 == ref9 || 
                        ref17 == ref25 || ref17 == ref27){
                        alen=0;
                        StringColorida c17 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte17 = new cartas(c17);
                        tabu.colocaCarta(1, 7, carte17);
                   }
                }
                
                //posicao 2-9
                if(alep==18){
                   if(alen == 0){
                        StringColorida c18 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte18 = new cartas(c18);
                        tabu.colocaCarta(1, 8, carte18);
                   }
                   else{
                        StringColorida c18 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte18 = new cartas(c18);
                        tabu.colocaCarta(1, 8, carte18);
                        ref18=alen;
                                           recebeu18=1;

                   }
                   if(ref18==ref10 || ref18==ref11 ||ref18==ref12 || 
                        ref18==ref13 || ref18 == ref14 || ref18 == ref15 || 
                        ref18 == ref16 || ref18 == ref17||ref18==ref9 || 
                        ref18==ref27||ref18==ref36 || ref18==ref45 || 
                        ref18 == ref54 || ref18 == ref63 || ref18 == ref72 ||
                        ref18 == ref81||ref18 == ref17 || ref18 == ref8 ||
                        ref18 == ref25 || ref18 == ref26){
                        alen=0;
                        StringColorida c18 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte18 = new cartas(c18);
                        tabu.colocaCarta(1, 8, carte18);
                   }
                }
                //posicao 3-1
                if(alep==19 ){
                   if(alen == 0){
                        StringColorida c19 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte19 = new cartas(c19);
                        tabu.colocaCarta(2, 0, carte19);
                   }
                   else{
                        StringColorida c19 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte19 = new cartas(c19);
                        tabu.colocaCarta(2, 0, carte19);
                        ref19=alen;
                                           recebeu19=1;

                   }
                   
                   if(ref19 == ref20 || ref19 == ref21 || ref19 == ref22 || 
                        ref19 == ref23 || ref19 == ref24 || ref19 == ref25 || 
                        ref19 == ref26 || ref19 == ref27 || ref19 == ref1 ||
                        ref19 == ref10 || ref19 == ref28 || ref19 == ref37 ||
                        ref19 == ref46 || ref19 == ref55 || ref19 == ref64 ||
                        ref19 == ref73 || ref19 == ref2 || ref19 == ref3 ||
                        ref19 == ref11 || ref19 == ref12){
                        alen=0;
                        StringColorida c19 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte19 = new cartas(c19);
                        tabu.colocaCarta(2, 0, carte19);
                   
                   }
                }
                //posicao 3-2
                if(alep==20){
                   if(alen == 0){
                        StringColorida c20 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte20 = new cartas(c20);
                        tabu.colocaCarta(2, 1, carte20);
                   }
                   else{
                        StringColorida c20 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte20 = new cartas(c20);
                        tabu.colocaCarta(2, 1, carte20);
                        ref20=alen;
                                           recebeu20=1;

                   }
                   if(ref20 == ref19 || ref20 == ref21 || ref20 == ref22 ||
                        ref20 == ref23 || ref20 == ref24 || ref20 == ref25 ||
                        ref20 == ref26 || ref20 == ref27 || ref20 == ref2 ||
                        ref20 == ref11 || ref20 == ref29 || ref20 == ref38 ||
                        ref20 == ref47 || ref20 == ref56 || ref20 == ref65 ||
                        ref20 == ref74 || ref20 == ref1 || ref20 == ref10 || 
                        ref20 == ref3 || ref20 == ref12){
                   
                       alen=0;
                        StringColorida c20 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte20 = new cartas(c20);
                        tabu.colocaCarta(2, 1, carte20);
                   }
                   
                   
                }
                //posicao 3-3
                if(alep==21){
                   if(alen == 0){
                        StringColorida c21 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte21 = new cartas(c21);
                        tabu.colocaCarta(2, 2, carte21);
                   }
                   else{
                        StringColorida c21 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte21 = new cartas(c21);
                        tabu.colocaCarta(2, 2, carte21);
                        ref21=alen;
                                           recebeu21=1;

                   }
                   if(ref21 == ref19 || ref21 == ref20 || ref21 == ref22 ||
                    ref21 == ref23 || ref21 == ref24 || ref21 == ref25 || 
                    ref21 == ref26 || ref21 == ref27 || ref21 == ref3 || 
                    ref21 == ref12 || ref21 == ref30 || ref21 == ref39 ||
                    ref21 == ref48 || ref21 == ref57 || ref21 == ref66 ||
                    ref21 == ref75 || ref21 == ref1 || ref21 == ref2 || 
                    ref21 == ref10 || ref21 == ref11){
                   
                   }
                }
                //posicao 3-4
                if(alep==22){
                   if(alen == 0){
                        StringColorida c22 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte22 = new cartas(c22);
                        tabu.colocaCarta(2, 3, carte22);
                   }
                   else{
                        StringColorida c22 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte22 = new cartas(c22);
                        tabu.colocaCarta(2, 3, carte22);
                        ref22=alen;
                                           recebeu22=1;

                   }
                   if(ref22 == ref19 || ref22 == ref20 || ref22 == ref21 ||
                    ref22 == ref23 || ref22 == ref24 || ref22 == ref25 ||
                    ref22 == ref26 || ref22 == ref27 || ref22 == ref4 || 
                    ref22 == ref13 || ref22 == ref31 || ref22 == ref40 || 
                    ref22 == ref49 || ref22 == ref58 || ref22 == ref67 ||
                    ref22 == ref76 || ref22 == ref5 || ref22 == ref6 || 
                    ref22 == ref23 || ref22 == ref24) {
                       alen=0;
                        StringColorida c22 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte22 = new cartas(c22);
                        tabu.colocaCarta(2, 3, carte22);
                   
                   }
                }
                //posicao 3-5
                if(alep==23){
                   if(alen == 0){
                        StringColorida c23 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte23 = new cartas(c23);
                        tabu.colocaCarta(2, 4, carte23);
                   }
                   else{
                        StringColorida c23 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte23 = new cartas(c23);
                        tabu.colocaCarta(2, 4, carte23);
                       ref23=alen;
                                          recebeu23=1;

                   }
                   if (ref19 == ref23 || ref20 == ref23 || ref21 == ref23 || 
                    ref22 == ref23 || ref24 == ref23 || ref25 == ref23 || 
                    ref26 == ref23 || ref27 == ref23 || ref5 == ref23 ||
                    ref14 == ref23 || ref32 == ref23 || ref41 == ref23 ||
                    ref50 == ref23 || ref59 == ref23 || ref68 == ref23 ||
                    ref77 == ref23 || ref4 == ref23 || ref6 == ref23 || 
                    ref22 == ref23 || ref24 == ref23){
                       alen=0;
                       StringColorida c23 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte23 = new cartas(c23);
                        tabu.colocaCarta(2, 4, carte23);
                   }
                }
                //posicao 3-6
                if(alep==24){
                   if(alen == 0){
                        StringColorida c24 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte24 = new cartas(c24);
                        tabu.colocaCarta(2, 5, carte24);
                   }
                   else{
                        StringColorida c24 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte24 = new cartas(c24);
                        tabu.colocaCarta(2, 5, carte24);
                                           recebeu24=1;

                       ref24=alen;
                   }
                   if (ref19 == ref24 || ref20 == ref24 || ref21 == ref24 ||
                        ref22 == ref24 || ref23 == ref24 || ref25 == ref24 || 
                        ref26 == ref24 || ref27 == ref24 || ref6 == ref24 || 
                        ref15 == ref24 || ref33 == ref24 || ref42 == ref24 ||
                        ref51 == ref24 || ref60 == ref24 || ref69 == ref24 || 
                        ref78 == ref24 || ref4 == ref24 || ref5 == ref24 || 
                        ref13 == ref24 || ref14 == ref24){
                       alen=0;
                       StringColorida c24 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte24 = new cartas(c24);
                        tabu.colocaCarta(2, 5, carte24);
                   }
               
                }
                //posicao 3-7
                if(alep==25){
                   if(alen == 0){
                        StringColorida c25 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte25 = new cartas(c25);
                        tabu.colocaCarta(2, 6, carte25);
                   }
                   else{
                        StringColorida c25 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte25 = new cartas(c25);
                        tabu.colocaCarta(2, 6, carte25);
                       ref25=alen;                   
                       recebeu25=1;

                   }
                   if (ref19 == ref25 || ref20 == ref25 || ref21 == ref25 || 
                        ref22 == ref25 || ref23 == ref25 || ref24 == ref25 || 
                        ref26 == ref25 || ref27 == ref25 || ref7 == ref25 ||
                        ref16 == ref25 || ref34 == ref25 || ref43 == ref25 ||
                        ref52 == ref25 || ref61 == ref25 || ref70 == ref25 || 
                        ref79 == ref25 || ref8 == ref25 || ref9 == ref25 || 
                        ref17 == ref25 || ref18 == ref25){
                       alen=0;
                       StringColorida c25 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte25 = new cartas(c25);
                        tabu.colocaCarta(2, 6, carte25);
                   }
                   
                }
                //posicao 3-8
                if(alep==26){
                   if(alen == 0){
                        StringColorida c26 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte26 = new cartas(c26);
                        tabu.colocaCarta(2, 7, carte26);
                   }
                   else{
                        StringColorida c26 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte26 = new cartas(c26);
                        tabu.colocaCarta(2, 7, carte26);
                        ref26=alen;
                                           recebeu26=1;

                   }
                   if (ref19 == ref26 || ref20 == ref26 || ref21 == ref26 ||
                        ref22 == ref26 || ref23 == ref26 || ref24 == ref26 || 
                        ref25 == ref26 || ref27 == ref26 || ref8 == ref26 ||
                        ref17 == ref26 || ref35 == ref26 || ref44 == ref26 || 
                        ref53 == ref26 || ref62 == ref26 || ref71 == ref26 ||
                        ref80 == ref26 || ref1 == ref26 || ref2 == ref26 || 
                        ref3 == ref26 || ref4 == ref26){
                       alen=0;
                       StringColorida c26 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte26 = new cartas(c26);
                        tabu.colocaCarta(2, 7, carte26);
                   }
                
                }
                //posicao 3-9
                if(alep==27){
                   if(alen == 0){
                        StringColorida c27 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte27 = new cartas(c27);
                        tabu.colocaCarta(2, 8, carte27);
                   }
                   else{
                        StringColorida c27 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte27 = new cartas(c27);
                        tabu.colocaCarta(2, 8, carte27);
                        ref27=alen;
                                           recebeu27=1;

                   }
                   if (ref19 == ref27 || ref20 == ref27 || ref21 == ref27 ||
                        ref22 == ref27 || ref23 == ref27 || ref24 == ref27 || 
                        ref25 == ref27 || ref26 == ref27 || ref9 == ref27 ||
                        ref18 == ref27 || ref36 == ref27 || ref45 == ref27 || 
                        ref54 == ref27 || ref63 == ref27 || ref72 == ref27 ||
                        ref81 == ref27 || ref7 == ref27 || ref8 == ref27 || 
                        ref16 == ref27 || ref17 == ref27){
                       alen=0;
                       StringColorida c27 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte27 = new cartas(c27);
                        tabu.colocaCarta(2, 8, carte27);
                   }
                }
                
                //posicao 4-1
                if(alep==28){
                   if(alen == 0){
                        StringColorida c28 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte28 = new cartas(c28);
                        tabu.colocaCarta(3, 0, carte28);
                   }
                   else{
                        StringColorida c28 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte28 = new cartas(c28);
                        tabu.colocaCarta(3, 0, carte28);
                        ref28=alen;
                                           recebeu28=1;

                   }
                   if (ref29 == ref28 || ref30 == ref28 || ref31 == ref28 || 
                        ref32 == ref28 || ref33 == ref28 || ref34 == ref28 || 
                        ref35 == ref28 || ref36 == ref28 || ref1 == ref28 || 
                        ref10 == ref28 || ref19 == ref28 || ref37 == ref28 || 
                        ref46 == ref28 || ref55 == ref28 || ref64 == ref28 || 
                        ref73 == ref28 || ref38 == ref28 || ref39 == ref28 || 
                        ref47 == ref28 || ref48 == ref28) {
                       alen=0;
                        StringColorida c28 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte28 = new cartas(c28);
                        tabu.colocaCarta(3, 0, carte28);
                   }
                   
                }
                
                //posicao 4-2
                if(alep==29){
                   if(alen == 0){
                        StringColorida c29 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte29 = new cartas(c29);
                        tabu.colocaCarta(3, 1, carte29);
                   }
                   else{
                        StringColorida c29 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte29 = new cartas(c29);
                        tabu.colocaCarta(3, 1, carte29);
                        ref29=alen;
                                           recebeu29=1;

                   }
                   if (ref28 == ref29 || ref30 == ref29 || ref31 == ref29 || 
                    ref32 == ref29 || ref33 == ref29 || ref34 == ref29 || 
                    ref35 == ref29 || ref36 == ref29 || ref2 == ref29 || 
                    ref11 == ref29 || ref20 == ref29 || ref38 == ref29 || 
                    ref47 == ref29 || ref56 == ref29 || ref65 == ref29 || 
                    ref74 == ref29 || ref39 == ref29 || ref37 == ref29 || 
                    ref48 == ref29 || ref46 == ref29) {
                       alen=0;
                        StringColorida c29 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte29 = new cartas(c29);
                        tabu.colocaCarta(3, 1, carte29);
                   }
                }
                //posicao 4-3
                if(alep==30){
                   if(alen == 0){
                        StringColorida c30 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte30 = new cartas(c30);
                        tabu.colocaCarta(3, 2, carte30);
                   }
                   else{
                        StringColorida c30 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte30 = new cartas(c30);
                        tabu.colocaCarta(3, 2, carte30);
                        ref30=alen;
                                           recebeu30=1;

                   }
                   if (ref28 == ref30 || ref29 == ref30 || ref31 == ref30 || 
                    ref32 == ref30 || ref33 == ref30 || ref34 == ref30 || 
                    ref35 == ref30 || ref36 == ref30 || ref3 == ref30 || 
                    ref12 == ref30 || ref21 == ref30 || ref39 == ref30 || 
                    ref48 == ref30 || ref57 == ref30 || ref66 == ref30 || 
                    ref75 == ref30 || ref37 == ref30 || ref38 == ref30 || 
                    ref46 == ref30 || ref47 == ref30) {
                       alen=0;
                        StringColorida c30 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte30 = new cartas(c30);
                        tabu.colocaCarta(3, 2, carte30);
                   }
                }
                //posicao 4-4
                if(alep==31){
                   if(alen == 0){
                        StringColorida c31 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte31 = new cartas(c31);
                        tabu.colocaCarta(3, 3, carte31);
                   }
                   else{
                        StringColorida c31 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte31 = new cartas(c31);
                        tabu.colocaCarta(3, 3, carte31);
                        ref31=alen;
                                           recebeu31=1;

                   }
                   if (ref28 == ref31 || ref29 == ref31 || ref30 == ref31 || 
                        ref32 == ref31 || ref33 == ref31 || ref34 == ref31 || 
                        ref35 == ref31 || ref36 == ref31 || ref4 == ref31 || 
                        ref13 == ref31 || ref22 == ref31 || ref40 == ref31 || 
                        ref49 == ref31 || ref58 == ref31 || ref67 == ref31 || 
                        ref76 == ref31 || ref41 == ref31 || ref42 == ref31 || 
                        ref50 == ref31 || ref51 == ref31) {
                       alen=0;
                       StringColorida c31 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte31 = new cartas(c31);
                        tabu.colocaCarta(3, 3, carte31);
                   }
                 
                }
                //posicao 4-5
                if(alep==32){
                   if(alen == 0){
                        StringColorida c32 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte32 = new cartas(c32);
                        tabu.colocaCarta(3, 4, carte32);
                    }
                   else{
                        StringColorida c32 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte32 = new cartas(c32);
                        tabu.colocaCarta(3, 4, carte32);
                        ref32=alen;
                                           recebeu32=1;

                    }
                   if (ref32 == ref28 || ref32 == ref29 || ref32 == ref30 || 
                        ref32 == ref31 || ref32 == ref33 || ref32 == ref34 || 
                        ref32 == ref35 || ref32 == ref5 || ref32 == ref14 || 
                        ref32 == ref23 || ref32 == ref41 || ref32 == ref50 || 
                        ref32 == ref59 || ref32 == ref68 || ref32 == ref77 || 
                        ref32 == ref42 || ref32 == ref40 || ref32 == ref51 || 
                        ref32 == ref49) {
                        alen=0;
                       StringColorida c32 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte32 = new cartas(c32);
                        tabu.colocaCarta(3, 4, carte32);
                   }
                   
                }
                //posicao 4-6
                if(alep==33){
                    if(alen == 0){
                        StringColorida c33 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte33 = new cartas(c33);
                        tabu.colocaCarta(3, 5, carte33);
                    }
                    else{
                        StringColorida c33 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte33 = new cartas(c33);
                        tabu.colocaCarta(3, 5, carte33);
                        ref33=alen;
                                            recebeu33=1;

                    }
                     if (ref33 == ref28 || ref33 == ref29 || ref33 == ref30 || 
                        ref33 == ref31 || ref33 == ref32 || ref33 == ref36 || 
                        ref33 == ref34 || ref33 == ref35 || ref33 == ref6 || 
                        ref33 == ref15 || ref33 == ref24 || ref33 == ref42 || 
                        ref33 == ref51 || ref33 == ref60 || ref33 == ref69 || 
                        ref33 == ref78 || ref33 == ref40 || ref33 == ref41 || 
                        ref33 == ref49 || ref33 == ref50) {
                        alen=0;
                         StringColorida c33 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte33 = new cartas(c33);
                        tabu.colocaCarta(3, 5, carte33);
                     }
               
                }
                //posicao 4-7
                if(alep==34){
                    if(alen == 0){
                        StringColorida c34 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte34 = new cartas(c34);
                        tabu.colocaCarta(3, 6, carte34);
                    }
                    else{
                        StringColorida c34 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte34 = new cartas(c34);
                        tabu.colocaCarta(3, 6, carte34);
                        ref34=alen;
                                            recebeu34=1;

                    }
                 
                    if (ref28 == ref34 || ref29 == ref34 || ref30 == ref34 || 
                        ref31 == ref34 || ref32 == ref34 || ref33 == ref34 || 
                        ref35 == ref34 || ref36 == ref34 || ref7 == ref34 || 
                        ref16 == ref34 || ref25 == ref34 || ref43 == ref34 || 
                        ref52 == ref34 || ref61 == ref34 || ref70 == ref34 || 
                        ref79 == ref34 || ref44 == ref34 || ref45 == ref34 || 
                        ref53 == ref34 || ref54 == ref34) {
                        alen=0;
                        StringColorida c34 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte34 = new cartas(c34);
                        tabu.colocaCarta(3, 6, carte34);
                    }
                }
                //posicao 4-8
                if(alep==35){
                    if(alen == 0){
                        StringColorida c35 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte35 = new cartas(c35);
                        tabu.colocaCarta(3, 7, carte35);
                    }
                    else{
                        StringColorida c35 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte35 = new cartas(c35);
                        tabu.colocaCarta(3, 7, carte35); 
                        ref35=alen;
                                            recebeu35=1;

                    }
                    if (ref28 == ref35 || ref29 == ref35 || ref30 == ref35 || 
                    ref31 == ref35 || ref32 == ref35 || ref33 == ref35 || 
                    ref34 == ref35 || ref36 == ref35 || ref8 == ref35 || 
                    ref17 == ref35 || ref26 == ref35 || ref44 == ref35 || 
                    ref53 == ref35 || ref62 == ref35 || ref71 == ref35 || 
                    ref80 == ref35 || ref43 == ref35 || ref45 == ref35 || 
                    ref54 == ref35 || ref52 == ref35 ) {
                    
                        alen=0;
                        StringColorida c35 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte35 = new cartas(c35);
                        tabu.colocaCarta(3, 7, carte35);
                    }
                  
                }
                //posicao 4-9
                if(alep==36){
                    if(alen == 0){
                        StringColorida c36 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte36 = new cartas(c36);
                        tabu.colocaCarta(3, 8, carte36);
                    }
                    else{
                        StringColorida c36 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte36 = new cartas(c36);
                        tabu.colocaCarta(3, 8, carte36);
                        ref36=alen;
                                            recebeu36=1;

                    }
                    if (ref28 == ref36 || ref29 == ref36 || ref30 == ref36 || 
                    ref31 == ref36 || ref32 == ref36 || ref33 == ref36 || 
                    ref34 == ref36 || ref35 == ref36 || ref9 == ref36 || 
                    ref18 == ref36 || ref27 == ref36 || ref45 == ref36 || 
                    ref54 == ref36 || ref63 == ref36 || ref72 == ref36 || 
                    ref81 == ref36 || ref43 == ref36 || ref44 == ref36 || 
                    ref52 == ref36 || ref53 == ref36 ) {
                    alen=0;
                    StringColorida c36 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte36 = new cartas(c36);
                        tabu.colocaCarta(3, 8, carte36);
                    }
                    
                }
                //posicao 5-1
                if(alep==37){
                    if(alen == 0){
                        StringColorida c37 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte37 = new cartas(c37);
                        tabu.colocaCarta(4, 0, carte37);
                    }
                    else{
                        StringColorida c37 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte37 = new cartas(c37);
                        tabu.colocaCarta(4, 0, carte37);
                        ref37=alen;
                                            recebeu37=1;

                    }
                    if (ref37 == ref38 || ref37 == ref39 || ref37 == ref40 || 
                    ref37 == ref41 || ref37 == ref42 || ref37 == ref43 || 
                    ref37 == ref44 || ref37 == ref45 || ref37 == ref1 || 
                    ref37 == ref10 || ref37 == ref19 || ref37 == ref28 || 
                    ref37 == ref46 || ref37 == ref55 || ref37 == ref64 || 
                    ref37 == ref73 || ref37 == ref29 || ref37 == ref28 ||
                    ref37 == ref47 || ref37 == ref48) {
                    alen=0;
                    StringColorida c37 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte37 = new cartas(c37);
                        tabu.colocaCarta(4, 0, carte37);
                    }
                }
                //posicao 5-2
                if(alep==38){
                    if(alen == 0){
                        StringColorida c38 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte38 = new cartas(c38);
                        tabu.colocaCarta(4, 1, carte38);
                    }
                    else{
                        StringColorida c38 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte38 = new cartas(c38);
                        tabu.colocaCarta(4, 1, carte38);
                        ref38=alen;
                                            recebeu38=1;

                    }
                    if (ref37 == ref38 || ref38 == ref39 || ref38 == ref40 || 
                    ref38 == ref41 || ref38 == ref42 || ref38 == ref43 || 
                    ref38 == ref44 || ref38 == ref45 || ref38 == ref2 || 
                    ref38 == ref11 || ref38 == ref20 || ref38 == ref29 || 
                    ref38 == ref47 || ref38 == ref56 || ref38 == ref65 || 
                    ref38 == ref74 || ref38 == ref28 || ref38 == ref30 ||
                    ref38 == ref46 || ref38 == ref48) {
                    
                    alen=0;
                    StringColorida c38 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte38 = new cartas(c38);
                        tabu.colocaCarta(4, 1, carte38);
                    }
                  
                }
                //posicao 5-3
                if(alep==39){
                    if(alen == 0){
                        StringColorida c39 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte39 = new cartas(c39);
                        tabu.colocaCarta(4, 2, carte39);
                    }
                    else{
                        StringColorida c39 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte39 = new cartas(c39);
                        tabu.colocaCarta(4, 2, carte39);
                        ref39=alen;
                                            recebeu39=1;

                    }
                    if (ref39 == ref37 || ref39 == ref38 || ref39 == ref40 || 
                        ref39 == ref41 || ref39 == ref42 || ref39 == ref43 || 
                        ref39 == ref44 || ref39 == ref45 || ref39 == ref3 || 
                        ref39 == ref12 || ref39 == ref21 || ref39 == ref30 || 
                        ref39 == ref48 || ref39 == ref57 || ref39 == ref66 || 
                        ref39 == ref75 || ref39 == ref28 || ref39 == ref29 ||
                        ref39 == ref46 || ref39 == ref47) {
                    
                        alen=0;
                        StringColorida c39 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte39 = new cartas(c39);
                        tabu.colocaCarta(4, 2, carte39);
                    }
               
                }
                //posicao 5-4
                if(alep==40){
                    if(alen == 0){
                        StringColorida c40 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte40 = new cartas(c40);
                        tabu.colocaCarta(4, 3, carte40);
                    }
                    else{
                        StringColorida c40 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte40 = new cartas(c40);
                        tabu.colocaCarta(4, 3, carte40);
                        ref40=alen;
                                            recebeu40=1;

                    }
                    if (ref37 == ref40 || ref38 == ref40 || ref39 == ref40 || 
                    ref41 == ref40 || ref42 == ref40 || ref43 == ref40 || 
                    ref44 == ref40 || ref45 == ref40 || ref4 == ref40 || 
                    ref13 == ref40 || ref22 == ref40 || ref31 == ref40 || 
                    ref49 == ref40 || ref58 == ref40 || ref67 == ref40 || 
                    ref76 == ref40 || ref32 == ref40 || ref33 == ref40 ||
                    ref50 == ref40 || ref51 == ref40) {
                    
                    alen=0;
                    StringColorida c40 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte40 = new cartas(c40);
                        tabu.colocaCarta(4, 3, carte40);
                    }
                   
                }
                //posicao 5-5
                if(alep==41){
                    if(alen == 0){
                        StringColorida c41 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte41 = new cartas(c41);
                        tabu.colocaCarta(4, 4, carte41);
                    }
                    else{
                        StringColorida c41 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte41 = new cartas(c41);
                        tabu.colocaCarta(4, 4, carte41);
                        ref41=alen;
                        
                                            recebeu41=1;

                    }
                    if (ref37 == ref41 || ref38 == ref41 || ref39 == ref41 || 
                        ref40 == ref41 || ref42 == ref41 || ref43 == ref41 || 
                        ref44 == ref41 || ref45 == ref41 || ref5 == ref41 || 
                        ref14 == ref41 || ref23 == ref41 || ref32 == ref41 || 
                        ref50 == ref41 || ref59 == ref41 || ref68 == ref41 || 
                        ref77 == ref41 || ref31 == ref41 || ref33 == ref41 ||
                        ref49 == ref41 || ref51 == ref41) {
                        alen=0;
                        StringColorida c41 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte41 = new cartas(c41);
                        tabu.colocaCarta(4, 4, carte41);
                    }
                  
                }
                //posicao 5-6
                if(alep==42){
                    if(alen == 0){
                        StringColorida c42 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte42 = new cartas(c42);
                        tabu.colocaCarta(4, 5, carte42);
                    }
                    else{
                        StringColorida c42 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte42 = new cartas(c42);
                        tabu.colocaCarta(4, 5, carte42);
                        ref42=alen;
                                            recebeu42=1;

                    }
                    if (ref37 == ref42 || ref38 == ref42 || ref39 == ref42 || 
                        ref40 == ref42 || ref41 == ref42 || ref43 == ref42 || 
                        ref44 == ref42 || ref45 == ref42 || ref6 == ref42 || 
                        ref15 == ref42 || ref24 == ref42 || ref33 == ref42 || 
                        ref51 == ref42 || ref60 == ref42 || ref69 == ref42 || 
                        ref78 == ref42 || ref31 == ref42 || ref32 == ref42 ||
                        ref49 == ref42 || ref50 == ref42) {
                        alen=0;
                        StringColorida c42 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte42 = new cartas(c42);
                        tabu.colocaCarta(4, 5, carte42);
                    }
                
                }
                //posicao 5-7
                if(alep==43){
                    if(alen == 0){
                        StringColorida c43 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte43 = new cartas(c43);
                        tabu.colocaCarta(4, 6, carte43);
                    }
                    else{
                        StringColorida c43 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte43= new cartas(c43);
                        tabu.colocaCarta(4, 6, carte43);
                        ref43=alen;
                                            recebeu43=1;

                    }
                    if (ref37 == ref43 || ref38 == ref43 || ref39 == ref43 || 
                        ref40 == ref43 || ref41 == ref43 || ref42 == ref43 || 
                        ref44 == ref43 || ref45 == ref43 || ref7 == ref43 || 
                        ref16 == ref43 || ref25 == ref43 || ref34 == ref43 || 
                        ref52 == ref43 || ref61 == ref43 || ref70 == ref43 || 
                        ref79 == ref43 || ref35 == ref43 || ref36 == ref43 ||
                        ref53 == ref43 || ref54 == ref43) {
                    
                        alen=0;
                        StringColorida c43 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte43 = new cartas(c43);
                        tabu.colocaCarta(4, 6, carte43);
                    }
                  
                }
                //posicao 5-8
                if(alep==44){
                    if(alen == 0){
                        StringColorida c44 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte44 = new cartas(c44);
                        tabu.colocaCarta(4, 7, carte44);
                    }
                    else{
                        StringColorida c44 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte44 = new cartas(c44);
                        tabu.colocaCarta(4, 7, carte44);
                       ref44=alen;
                                           recebeu44=1;

                    }
                    if (ref37 == ref44 || ref38 == ref44 || ref39 == ref44 || 
                        ref40 == ref44 || ref41 == ref44 || ref42 == ref44 || 
                        ref43 == ref44 || ref45 == ref44 || ref8 == ref44 || 
                        ref17 == ref44 || ref26 == ref44 || ref35 == ref44 || 
                        ref53 == ref44 || ref62 == ref44 || ref71 == ref44 || 
                        ref80 == ref44 || ref34 == ref44 || ref36 == ref44 ||
                        ref52 == ref44 || ref54 == ref44) {
                    
                        alen=0;
                        StringColorida c44 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte44 = new cartas(c44);
                        tabu.colocaCarta(4, 7, carte44);
                    }
                   
                }
                //posicao 5-9
                if(alep==45){
                    if(alen == 0){
                        StringColorida c45 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte45 = new cartas(c45);
                        tabu.colocaCarta(4, 8, carte45);
                    }
                    else{
                        StringColorida c45 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte45 = new cartas(c45);
                        tabu.colocaCarta(4, 8, carte45);
                        ref45=alen;
                                            recebeu45=1;

                    }
                    if (ref37 == ref45 || ref38 == ref45 || ref39 == ref45 || 
                        ref40 == ref45 || ref41 == ref45 || ref42 == ref45 || 
                        ref43 == ref45 || ref44 == ref45 || ref9 == ref45 || 
                        ref18 == ref45 || ref27 == ref45 || ref36 == ref45 || 
                        ref54 == ref45 || ref63 == ref45 || ref72 == ref45 || 
                        ref81 == ref45 || ref34 == ref45 || ref35 == ref45 ||
                        ref52 == ref45 || ref53 == ref45) {
                    
                        alen=0;
                        StringColorida c45 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte45 = new cartas(c45);
                        tabu.colocaCarta(4, 8, carte45);
                    }
                  
                }
                //posicao 6-1
                if(alep==46){
                    if(alen == 0){
                        StringColorida c46 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte46 = new cartas(c46);
                        tabu.colocaCarta(5, 0, carte46);
                    }
                    else{
                        StringColorida c46 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte46 = new cartas(c46);
                        tabu.colocaCarta(5, 0, carte46);
                        ref46=alen;
                        
                                            recebeu46=1;

                    }
                    if (ref47 == ref46 || ref48 == ref46 || ref49 == ref46 || 
                        ref50 == ref46 || ref51 == ref46 || ref52 == ref46 || 
                        ref53 == ref46 || ref54 == ref46 || ref1 == ref46 || 
                        ref10 == ref46 || ref19 == ref46 || ref28 == ref46 || 
                        ref37 == ref46 || ref55 == ref46 || ref64 == ref46 || 
                        ref73 == ref46 || ref38 == ref46 || ref39 == ref46 ||
                        ref29 == ref46 || ref30 == ref46) {
                    
                        alen=0;
                        StringColorida c46 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte46 = new cartas(c46);
                        tabu.colocaCarta(5, 0, carte46);
                    }
                    
                }
                //posicao 6-2
                if(alep==47){
                    if(alen == 0){
                        StringColorida c47 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte47 = new cartas(c47);
                        tabu.colocaCarta(5, 1, carte47);
                    }
                    else{
                        StringColorida c47 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte47 = new cartas(c47);
                        tabu.colocaCarta(5, 1, carte47);
                        ref47=alen;
                                            recebeu47=1;

                    }
                    if (ref46 == ref47 || ref48 == ref47 || ref49 == ref47 || 
                    ref50 == ref47 || ref51 == ref47 || ref52 == ref47 || 
                    ref53 == ref47 || ref54 == ref47 || ref2 == ref47 || 
                    ref11 == ref47 || ref20 == ref47 || ref29 == ref47 || 
                    ref38 == ref47 || ref56 == ref47 || ref65 == ref47 || 
                    ref74 == ref47 || ref37 == ref47 || ref39 == ref47 ||
                    ref30 == ref47 || ref28 == ref47) {
                    alen=0;
                    StringColorida c47 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte47 = new cartas(c47);
                        tabu.colocaCarta(5, 1, carte47);
                    }
                    
                }
                //posicao 6-3
                if(alep==48){
                    if(alen == 0){
                        StringColorida c48 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte48 = new cartas(c48);
                        tabu.colocaCarta(5, 2, carte48);
                    }
                    else{
                        StringColorida c48 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte48 = new cartas(c48);
                        tabu.colocaCarta(5, 2, carte48);
                        ref48=alen;
                                            recebeu48=1;

                    }
                    if (ref46 == ref48 || ref47 == ref48 || ref49 == ref48 || 
                        ref50 == ref48 || ref51 == ref48 || ref52 == ref48 || 
                        ref53 == ref48 || ref54 == ref48 || ref3 == ref48 || 
                        ref12 == ref48 || ref21 == ref48 || ref30 == ref48 || 
                        ref39 == ref48 || ref57 == ref48 || ref66 == ref48 || 
                        ref75 == ref48 || ref37 == ref48 || ref38 == ref48 ||
                        ref28 == ref48 || ref29 == ref48) {
                        alen=0;
                        StringColorida c48 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte48 = new cartas(c48);
                        tabu.colocaCarta(5, 2, carte48);
                    }
                    
                }
                //posicao 6-4
                if(alep==49){
                    if(alen == 0){
                        StringColorida c49 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte49 = new cartas(c49);
                        tabu.colocaCarta(5, 3, carte49);
                    }
                    else{
                        StringColorida c49 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte49 = new cartas(c49);
                        tabu.colocaCarta(5, 3, carte49);
                        ref49=alen;                   
                        recebeu49=1;

                    }
                    if (ref50 == ref49 || ref51 == ref49 || ref52 == ref49 || 
                        ref53 == ref49 || ref54 == ref49 || ref46 == ref49 || 
                        ref47 == ref49 || ref48 == ref49 || ref4 == ref49 || 
                        ref13 == ref49 || ref22 == ref49 || ref31 == ref49 || 
                        ref40 == ref49 || ref58 == ref49 || ref67 == ref49 || 
                        ref76 == ref49 || ref32 == ref49 || ref33 == ref49 ||
                        ref41 == ref49 || ref42 == ref49) {
                        alen=0;
                        StringColorida c49 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte49 = new cartas(c49);
                        tabu.colocaCarta(5, 3, carte49);
                    }
                 
                }
                //posicao 6-5
                if(alep==50){
                    if(alen == 0){
                        StringColorida c50 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte50 = new cartas(c50);
                        tabu.colocaCarta(5, 4, carte50);
                    }
                    else{
                        StringColorida c50 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte50 = new cartas(c50);
                        tabu.colocaCarta(5, 4, carte50);
                        ref50=alen;
                                            recebeu50=1;

                    }
                    if (ref49 == ref50 || ref51 == ref50 || ref52 == ref50 || 
                        ref53 == ref50 || ref54 == ref50 || ref46 == ref50 || 
                        ref47 == ref50 || ref48 == ref50 || ref5 == ref50 || 
                        ref14 == ref50 || ref23 == ref50 || ref32 == ref50 || 
                        ref41 == ref50 || ref59 == ref50 || ref68 == ref50 || 
                        ref77 == ref50 || ref31 == ref50 || ref40 == ref50 ||
                        ref33 == ref50 || ref42 == ref50) {
                        alen=0;
                        StringColorida c50 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte50 = new cartas(c50);
                        tabu.colocaCarta(5, 4, carte50);
                    }
                  
                }
                //posicao 6-6
                if(alep==51){
                    if(alen == 0){
                        StringColorida c51 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte51 = new cartas(c51);
                        tabu.colocaCarta(5, 5, carte51);
                    }
                    else{
                        StringColorida c51 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte51 = new cartas(c51);
                        tabu.colocaCarta(5, 5,  carte51);
                        ref51=alen;
                                            recebeu51=1;

                    }
                    if (ref49 == ref51 || ref50 == ref51 || ref51 == ref51 || 
                        ref53 == ref51 || ref54 == ref51 || ref46 == ref51 || 
                        ref47 == ref51 || ref48 == ref51 || ref6 == ref51 || 
                        ref15 == ref51 || ref24 == ref51 || ref33 == ref51 || 
                        ref42 == ref51 || ref60 == ref51 || ref69 == ref51 || 
                        ref78 == ref51 || ref31 == ref51 || ref40 == ref51 ||
                        ref32 == ref51 || ref41 == ref51) {
                    
                        alen=0;
                        StringColorida c51 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte51 = new cartas(c51);
                        tabu.colocaCarta(5, 5, carte51);
                    }
                }
                //posicao 6-7
                if(alep==52){
                    if(alen == 0){
                        StringColorida c52 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte52 = new cartas(c52);
                        tabu.colocaCarta(5, 6, carte52);
                    }
                    else{
                        StringColorida c52 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte52 = new cartas(c52);
                        tabu.colocaCarta(5, 6,  carte52);
                        ref52=alen;
                                            recebeu52=1;

                    }
                    if (ref52 == ref49 || ref52 == ref50 || ref52 == ref51 || 
                        ref52 == ref53 || ref52 == ref54 || ref52 == ref46 || 
                        ref52 == ref47 || ref52 == ref48 || ref52 == ref7 || 
                        ref52 == ref16 || ref52 == ref25 || ref52 == ref34 || 
                        ref52 == ref43 || ref52 == ref61 || ref52 == ref70 || 
                        ref52 == ref79 || ref52 == ref35 || ref52 == ref36 ||
                        ref52 == ref44 || ref52 == ref54) {
                        alen=0;
                        StringColorida c52 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte52 = new cartas(c52);
                        tabu.colocaCarta(5, 6, carte52);
                    }
                }
                //posicao 6-8
                if(alep==53){
                    if(alen == 0){
                        StringColorida c53 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte53 = new cartas(c53);
                        tabu.colocaCarta(5, 7, carte53);
                    }
                    else{
                        StringColorida c53 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte53 = new cartas(c53);
                        tabu.colocaCarta(5, 7,  carte53);
                        ref53=alen;
                                            recebeu53=1;

                    }
                    if (ref49 == ref53 || ref50 == ref53 || ref51 == ref53 || 
                        ref52 == ref53 || ref54 == ref53 || ref46 == ref53 || 
                        ref47 == ref53 || ref48 == ref53 || ref8 == ref53 || 
                        ref17 == ref53 || ref26 == ref53 || ref35 == ref53 || 
                        ref44 == ref53 || ref62 == ref53 || ref71 == ref53 || 
                        ref80 == ref53 || ref36 == ref53 || ref34 == ref53 ||
                        ref43 == ref53 || ref45 == ref53) {
                        alen=0;
                        StringColorida c53 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte53 = new cartas(c53);
                        tabu.colocaCarta(5, 7, carte53);
                    }
                }
                //posicao 6-9
                if(alep==54){
                    if(alen == 0){
                        StringColorida c54 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte54 = new cartas(c54);
                        tabu.colocaCarta(5, 8, carte54);
                    }
                    else{
                        StringColorida c54 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte54 = new cartas(c54);
                        tabu.colocaCarta(5, 8,  carte54);
                        ref54=alen;
                                            recebeu54=1;

                    }
                    if (ref54 == ref49 || ref54 == ref50 || ref54 == ref51 || 
                        ref54 == ref52 || ref54 == ref53 || ref54 == ref46 || 
                        ref54 == ref47 || ref54 == ref48 || ref54 == ref9 || 
                        ref54 == ref18 || ref54 == ref27 || ref54 == ref36 || 
                        ref54 == ref45 || ref54 == ref63 || ref54 == ref72 || 
                        ref54 == ref81 || ref54 == ref34 || ref54 == ref35 ||
                        ref54 == ref43 || ref54 == ref44) {
                        
                        alen=0;
                        StringColorida c54 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte54 = new cartas(c54);
                        tabu.colocaCarta(5, 8, carte54);
                    }
                }
                //posicao 7-1
                if(alep==55){
                    if(alen == 0){
                        StringColorida c55 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte55 = new cartas(c55);
                        tabu.colocaCarta(6, 0, carte55);
                    }
                    else{
                        StringColorida c55 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte55 = new cartas(c55);
                        tabu.colocaCarta(6, 0,  carte55);
                        ref55=alen;
                                            recebeu55=1;

                    }
                    if (ref55 == ref56 || ref55 == ref57 || ref55 == ref58 || 
                        ref55 == ref59 || ref55 == ref60 || ref55 == ref61 || 
                        ref55 == ref62 || ref55 == ref63 || ref55 == ref1 ||
                        ref55 == ref10 || ref55 == ref19 || ref55 == ref28 ||
                        ref55 == ref37 || ref55 == ref46 || ref55 == ref64 ||
                        ref55 == ref73 || ref55 == ref74 || ref55 == ref75 ||
                        ref55 == ref65 || ref55 == ref66) {
                        alen=0;
                        StringColorida c55 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte55 = new cartas(c55);
                        tabu.colocaCarta(6, 0, carte55);
                    }
                }
                //posicao 7-2
                if(alep==56){
                    if(alen == 0){
                        StringColorida c56 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte56 = new cartas(c56);
                        tabu.colocaCarta(6, 1, carte56);
                    }
                    else{
                        StringColorida c56 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte56 = new cartas(c56);
                        tabu.colocaCarta(6, 1,  carte56);
                        ref56=alen;
                                            recebeu56=1;

                    }
                    if (ref56 == ref55 || ref56 == ref57 || ref56 == ref58 || 
                        ref56 == ref59 || ref56 == ref60 || ref56 == ref61 || 
                        ref56 == ref62 || ref56 == ref63 || ref56 == ref2 ||
                        ref56 == ref11 || ref56 == ref20 || ref56 == ref29 ||
                        ref56 == ref38 || ref56 == ref47 || ref56 == ref65 ||
                        ref56 == ref74 || ref56 == ref75 || ref56 == ref64 ||
                        ref56 == ref66 || ref56 == ref73) {
                        alen=0;
                        StringColorida c56 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte56 = new cartas(c56);
                        tabu.colocaCarta(6, 1, carte56);
                    }
                }
                //posicao 7-3
                if(alep==57){
                    if(alen == 0){
                        StringColorida c57 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte57 = new cartas(c57);
                        tabu.colocaCarta(6, 2, carte57);
                    }
                    else{
                        StringColorida c57 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte57 = new cartas(c57);
                        tabu.colocaCarta(6, 2,  carte57);
                        ref57=alen;
                                            recebeu57=1;

                        
                    }
                    if (ref57 == ref55 || ref57 == ref56 || ref57 == ref58 ||
                        ref57 == ref59 || ref57 == ref60 || ref57 == ref61 ||
                        ref57 == ref62 || ref57 == ref63 || ref57 == ref3 ||
                        ref57 == ref12 || ref57 == ref21 || ref57 == ref30 ||
                        ref57 == ref39 || ref57 == ref48 || ref57 == ref66 ||
                        ref57 == ref75 || ref57 == ref73 || ref57 == ref64 ||
                        ref57 == ref65 || ref57 == ref74) {
                        alen=0;
                        StringColorida c57 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte57 = new cartas(c57);
                        tabu.colocaCarta(6, 2, carte57);
                    }
                }
                //posicao 7-4
                if(alep==58){
                    if(alen == 0){
                        StringColorida c58 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte58 = new cartas(c58);
                        tabu.colocaCarta(6, 3, carte58);
                    }
                    else{
                        StringColorida c58 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte58 = new cartas(c58);
                        tabu.colocaCarta(6, 3,  carte58);
                        ref58=alen;
                                            recebeu58=1;

                    }
                    if (ref58 == ref55 || ref58 == ref56 || ref58 == ref57 ||
                        ref58 == ref59 || ref58 == ref60 || ref58 == ref61 ||
                        ref58 == ref62 || ref58 == ref63 || ref58 == ref4 ||
                        ref58 == ref13 || ref58 == ref22 || ref58 == ref31 ||
                        ref58 == ref40 || ref58 == ref49 || ref58 == ref67 ||
                        ref58 == ref76 || ref58 == ref77 || ref58 == ref78 ||
                        ref58 == ref68 || ref58 == ref69) {
                        alen=0;
                        StringColorida c58 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte58 = new cartas(c58);
                        tabu.colocaCarta(6, 3, carte58);
                    }
                }
                //posicao 7-5
                if(alep==59){
                    if(alen == 0){
                        StringColorida c59 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte59 = new cartas(c59);
                        tabu.colocaCarta(6, 4, carte59);
                    }
                    else{
                        StringColorida c59 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte59 = new cartas(c59);
                        tabu.colocaCarta(6, 4,  carte59);
                        ref59=alen;
                                            recebeu59=1;

                    }
                    if (ref59 == ref55 || ref59 == ref56 || ref59 == ref57 ||
                        ref59 == ref58 || ref59 == ref60 || ref59 == ref61 ||
                        ref59 == ref62 || ref59 == ref63 || ref59 == ref5 ||
                        ref59 == ref14 || ref59 == ref23 || ref59 == ref32 ||
                        ref59 == ref41 || ref59 == ref50 || ref59 == ref68 ||
                        ref59 == ref77 || ref59 == ref76 || ref59 == ref78 ||
                        ref59 == ref67 || ref59 == ref69) {
                        alen=0;
                        StringColorida c59 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte59 = new cartas(c59);
                        tabu.colocaCarta(6, 4, carte59);
                    }
                }
                //posicao 7-6
                if(alep==60){
                    if(alen == 0){
                        StringColorida c60 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte60 = new cartas(c60);
                        tabu.colocaCarta(6, 5, carte60);
                    }
                    else{
                        StringColorida c60 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte60 = new cartas(c60);
                        tabu.colocaCarta(6, 5,  carte60);
                        ref60=alen;
                                            recebeu60=1;

                    }
                    if (ref60 == ref55 || ref60 == ref56 || ref60 == ref57 ||
                        ref60 == ref58 || ref60 == ref59 || ref60 == ref61 ||
                        ref60 == ref62 || ref60 == ref63 || ref60 == ref6 ||
                        ref60 == ref15 || ref60 == ref24 || ref60 == ref33 ||
                        ref60 == ref42 || ref60 == ref51 || ref60 == ref69 ||
                        ref60 == ref78 || ref60 == ref76 || ref60 == ref77 ||
                        ref60 == ref67 || ref60 == ref68) {
                    alen=0;
                    StringColorida c60 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte60 = new cartas(c60);
                        tabu.colocaCarta(6, 5, carte60);
                    }
                }
                //posicao 7-7
                if(alep==61){
                    if(alen == 0){
                        StringColorida c61 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte61 = new cartas(c61);
                        tabu.colocaCarta(6, 6, carte61);
                    }
                    else{
                        StringColorida c61 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte61 = new cartas(c61);
                        tabu.colocaCarta(6, 6, carte61);
                        ref61=alen;
                                            recebeu61=1;

                    }
                    if (ref61 == ref55 || ref61 == ref56 || ref61 == ref57 ||
                        ref61 == ref58 || ref61 == ref59 || ref61 == ref60 ||
                        ref61 == ref62 || ref61 == ref63 || ref61 == ref7 ||
                        ref61 == ref16 || ref61 == ref25 || ref61 == ref34 ||
                        ref61 == ref43 || ref61 == ref52 || ref61 == ref70 ||
                        ref61 == ref79 || ref61 == ref71 || ref61 == ref72 ||
                        ref61 == ref80 || ref61 == ref81) {
                        alen=0;
                        StringColorida c61 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte61 = new cartas(c61);
                        tabu.colocaCarta(6, 6, carte61);
                    }
                }
                //posicao 7-8
                if(alep==62){
                    if(alen == 0){
                        StringColorida c62 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte62 = new cartas(c62);
                        tabu.colocaCarta(6, 7, carte62);
                    }
                    else{
                        StringColorida c62 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte62 = new cartas(c62);
                        tabu.colocaCarta(6, 7, carte62);
                        ref62=alen;
                                            recebeu62=1;

                    }
                    if (ref62 == ref55 || ref62 == ref56 || ref62 == ref57 ||
                        ref62 == ref58 || ref62 == ref59 || ref62 == ref60 ||
                        ref62 == ref61 || ref62 == ref63 || ref62 == ref8 ||
                        ref62 == ref17 || ref62 == ref26 || ref62 == ref35 ||
                        ref62 == ref44 || ref62 == ref53 || ref62 == ref71 ||
                        ref62 == ref80 || ref62 == ref70 || ref62 == ref72 ||
                        ref62 == ref79 || ref62 == ref81) {
                        alen=0;
                        StringColorida c62 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte62 = new cartas(c62);
                        tabu.colocaCarta(6, 7, carte62);
                    }
                }
                //posicao 7-9
                if(alep==63){
                    if(alen == 0){
                        StringColorida c63 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte63 = new cartas(c63);
                        tabu.colocaCarta(6, 8, carte63);
                    }
                    else{
                        StringColorida c63 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte63 = new cartas(c63);
                        tabu.colocaCarta(6, 8, carte63);
                        ref63=alen;
                                            recebeu63=1;

                    }
                    if (ref63 == ref55 || ref63 == ref56 || ref63 == ref57 ||
                    ref63 == ref58 || ref63 == ref59 || ref63 == ref60 ||
                    ref63 == ref61 || ref63 == ref62 || ref63 == ref9 ||
                    ref63 == ref18 || ref63 == ref27 || ref63 == ref36 ||
                    ref63 == ref45 || ref63 == ref54 || ref63 == ref72 ||
                    ref63 == ref81 || ref63 == ref70 || ref63 == ref71 ||
                    ref63 == ref79 || ref63 == ref80) {
                    alen=0;
                     StringColorida c63 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte63 = new cartas(c63);
                        tabu.colocaCarta(6, 8, carte63);
                    }
                }
                //posicao 8-1
                if(alep==64){
                    if(alen == 0){
                        StringColorida c64 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte64 = new cartas(c64);
                        tabu.colocaCarta(7, 0, carte64);
                    }
                    else{
                        StringColorida c64 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte64 = new cartas(c64);
                        tabu.colocaCarta(7, 0, carte64);
                        ref64=alen;
                                            recebeu64=1;

                    }
                    if (ref64 == ref65 || ref64 == ref66 || ref64 == ref67 ||
                        ref64 == ref68 || ref64 == ref69 || ref64 == ref70 ||
                        ref64 == ref71 || ref64 == ref72 || ref64 == ref1 ||
                        ref64 == ref10 || ref64 == ref19 || ref64 == ref28 ||
                        ref64 == ref37 || ref64 == ref46 || ref64 == ref55 ||
                        ref64 == ref73 || ref64 == ref74 || ref64 == ref75 ||
                        ref64 == ref56 || ref64 == ref57){
                        alen=0;
                        StringColorida c64 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte64 = new cartas(c64);
                        tabu.colocaCarta(7, 0, carte64);
                    }
                }
                //posicao 8-2
                if(alep==65){
                    if(alen == 0){
                        StringColorida c65 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte65 = new cartas(c65);
                        tabu.colocaCarta(7, 1, carte65);
                    }
                    else{
                        StringColorida c65 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte65 = new cartas(c65);
                        tabu.colocaCarta(7, 1, carte65);
                        ref65=alen;
                                            recebeu65=1;

                    }
                    if (ref65 == ref64 || ref65 == ref66 || ref65 == ref67 ||
                    ref65 == ref68 || ref65 == ref69 || ref65 == ref70 ||
                    ref65 == ref71 || ref65 == ref72 || ref65 == ref2 ||
                    ref65 == ref11 || ref65 == ref20 || ref65 == ref29 ||
                    ref65 == ref38 || ref65 == ref47 || ref65 == ref56 ||
                    ref65 == ref74 || ref65 == ref75 || ref65 == ref57 ||
                    ref65 == ref73 || ref65 == ref55) {
                    alen=0;
                    StringColorida c65 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte65 = new cartas(c65);
                        tabu.colocaCarta(7, 1, carte65);
                    }
                }
                //posicao 8-3
                if(alep==66){
                    if(alen == 0){
                        StringColorida c66 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte66 = new cartas(c66);
                        tabu.colocaCarta(7, 2, carte66);
                    }
                    else{
                        StringColorida c66 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte66 = new cartas(c66);
                        tabu.colocaCarta(7, 2, carte66);
                        ref66=alen;
                                            recebeu66=1;

                    }
                    if (ref66 == ref64 || ref66 == ref65 || ref66 == ref67 ||
                        ref66 == ref68 || ref66 == ref69 || ref66 == ref70 ||
                        ref66 == ref71 || ref66 == ref72 || ref66 == ref3 ||
                        ref66 == ref12 || ref66 == ref21 || ref66 == ref30 ||
                        ref66 == ref39 || ref66 == ref48 || ref66 == ref57 ||
                        ref66 == ref75 || ref66 == ref74 || ref66 == ref73 ||
                        ref66 == ref55 || ref66 == ref56) {
                    alen=0;
                    StringColorida c66 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte66 = new cartas(c66);
                        tabu.colocaCarta(7, 2, carte66);
                    }
                }
                //posicao 8-4
                if(alep==67){
                    if(alen == 0){
                        StringColorida c67 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte67 = new cartas(c67);
                        tabu.colocaCarta(7, 3, carte67);
                    }
                    else{
                        StringColorida c67 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte67 = new cartas(c67);
                        tabu.colocaCarta(7, 3, carte67);
                        ref67=alen;
                                            recebeu67=1;

                    }
                    if (ref67 == ref64 || ref67 == ref65 || ref67 == ref66 ||
                        ref67 == ref68 || ref67 == ref69 || ref67 == ref70 ||
                        ref67 == ref71 || ref67 == ref72 || ref67 == ref4 ||
                        ref67 == ref13 || ref67 == ref22 || ref67 == ref31 ||
                        ref67 == ref40 || ref67 == ref49 || ref67 == ref58 ||
                        ref67 == ref76 || ref67 == ref77 || ref67 == ref78 ||
                        ref67 == ref59 || ref67 == ref60) {
                        alen=0;
                        StringColorida c67 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte67 = new cartas(c67);
                        tabu.colocaCarta(7, 3, carte67);
                    }
                }
                //posicao 8-5
                if(alep==68){
                    if(alen == 0){
                        StringColorida c68 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte68 = new cartas(c68);
                        tabu.colocaCarta(7, 4, carte68);
                    }
                    else{
                        StringColorida c68 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte68 = new cartas(c68);
                        tabu.colocaCarta(7, 4, carte68);
                        ref68=alen;
                                            recebeu68=1;

                    }
                    if (ref68 == ref64 || ref68 == ref65 || ref68 == ref66 ||
                        ref68 == ref67 || ref68 == ref69 || ref68 == ref70 ||
                        ref68 == ref71 || ref68 == ref72 || ref68 == ref5 ||
                        ref68 == ref14 || ref68 == ref23 || ref68 == ref32 ||
                        ref68 == ref41 || ref68 == ref50 || ref68 == ref59 ||
                        ref68 == ref77 || ref68 == ref76 || ref68 == ref78 ||
                        ref68 == ref58 || ref68 == ref60) {
                        alen=0;
                        StringColorida c68 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte68 = new cartas(c68);
                        tabu.colocaCarta(7, 4, carte68);
                    }
                }
                //posicao 8-6
                if(alep==69){
                    if(alen == 0){
                        StringColorida c69 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte69 = new cartas(c69);
                        tabu.colocaCarta(7, 5, carte69);
                    }
                    else{
                        StringColorida c69 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte69 = new cartas(c69);
                        tabu.colocaCarta(7, 5, carte69);
                        ref69=alen;
                                            recebeu69=1;

                    }
                    if (ref69 == ref64 || ref69 == ref65 || ref69 == ref66 ||
                        ref69 == ref67 || ref69 == ref68 || ref69 == ref70 ||
                        ref69 == ref71 || ref69 == ref72 || ref69 == ref6 ||
                        ref69 == ref15 || ref69 == ref24 || ref69 == ref33 ||
                        ref69 == ref42 || ref69 == ref51 || ref69 == ref60 ||
                        ref69 == ref78 || ref69 == ref77 || ref69 == ref76 ||
                        ref69 == ref58 || ref69 == ref59) {
                        alen=0;
                        StringColorida c69 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte69 = new cartas(c69);
                        tabu.colocaCarta(7, 5, carte69);
                    }
                }
                //posicao 8-7
                if(alep==70){
                    if(alen == 0){
                        StringColorida c70 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte70 = new cartas(c70);
                        tabu.colocaCarta(7, 6, carte70);
                    }
                    else{
                        StringColorida c70 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte70 = new cartas(c70);
                        tabu.colocaCarta(7, 6, carte70);
                        ref70=alen;
                                            recebeu70=1;

                    }
                    if (ref70 == ref64 || ref70 == ref65 || ref70 == ref66 ||
                        ref70 == ref67 || ref70 == ref68 || ref70 == ref69 ||
                        ref70 == ref71 || ref70 == ref72 || ref70 == ref7 ||
                        ref70 == ref16 || ref70 == ref25 || ref70 == ref34 ||
                        ref70 == ref43 || ref70 == ref52 || ref70 == ref61 ||
                        ref70 == ref79 || ref70 == ref62 || ref70 == ref63 ||
                        ref70 == ref80 || ref70 == ref81) {
                        alen=0;
                        StringColorida c70 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte70 = new cartas(c70);
                        tabu.colocaCarta(7, 6, carte70);
                    }
                }
                //posicao 8-8
                if(alep==71){
                    if(alen == 0){
                        StringColorida c71 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte71 = new cartas(c71);
                        tabu.colocaCarta(7, 7, carte71);
                    }
                    else{
                        StringColorida c71 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte71 = new cartas(c71);
                        tabu.colocaCarta(7, 7, carte71);
                        ref71=alen;
                                            recebeu71=1;

                    }
                    if (ref71 == ref64 || ref71 == ref65 || ref71 == ref66 ||
                        ref71 == ref67 || ref71 == ref68 || ref71 == ref69 ||
                        ref71 == ref70 || ref71 == ref72 || ref71 == ref8 ||
                        ref71 == ref17 || ref71 == ref26 || ref71 == ref35 ||
                        ref71 == ref44 || ref71 == ref53 || ref71 == ref62 ||
                        ref71 == ref80 || ref71 == ref79 || ref71 == ref81 ||
                        ref71 == ref63 || ref71 == ref61) {
                        alen=0;
                        StringColorida c71 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte71 = new cartas(c71);
                        tabu.colocaCarta(7, 7, carte71);
                    }
                }
                //posicao 8-9
                if(alep==72){
                    if(alen == 0){
                        StringColorida c72 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte72 = new cartas(c72);
                        tabu.colocaCarta(7, 8, carte72);
                    }
                    else{
                        StringColorida c72 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte72 = new cartas(c72);
                        tabu.colocaCarta(7, 8, carte72);
                        ref72=alen;
                                            recebeu72=1;

                    }
                    if (ref72 == ref64 || ref72 == ref65 || ref72 == ref66 ||
                        ref72 == ref67 || ref72 == ref68 || ref72 == ref69 ||
                        ref72 == ref70 || ref72 == ref71 || ref72 == ref9 ||
                        ref72 == ref18 || ref72 == ref27 || ref72 == ref36 ||
                        ref72 == ref45 || ref72 == ref54 || ref72 == ref63 ||
                        ref72 == ref81 || ref72 == ref80 || ref72 == ref79 ||
                        ref72 == ref61 || ref72 == ref62) {
                        alen=0;
                        StringColorida c72 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte72 = new cartas(c72);
                        tabu.colocaCarta(7, 8, carte72);
                    }
                }
                //posicao 9-1
                if(alep==73){
                    if(alen == 0){
                        StringColorida c73 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte73 = new cartas(c73);
                        tabu.colocaCarta(8, 0, carte73);
                    }
                    else{
                        StringColorida c73 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte73 = new cartas(c73);
                        tabu.colocaCarta(8, 0, carte73);
                        ref73=alen;
                                            recebeu73=1;

                    }
                    if (ref74 == ref73 || ref75 == ref73 || ref76 == ref73 ||
                        ref77 == ref73 || ref78 == ref73 || ref79 == ref73 ||
                        ref80 == ref73 || ref81 == ref73 || ref1  == ref73 ||
                        ref10 == ref73 || ref19 == ref73 || ref28 == ref73 ||
                        ref37 == ref73 || ref46 == ref73 || ref55 == ref73 ||
                        ref64 == ref73 || ref56 == ref73 || ref57 == ref73 ||
                        ref65 == ref73 || ref66 == ref73) {
                        alen=0;
                        StringColorida c73 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte73 = new cartas(c73);
                        tabu.colocaCarta(8, 0, carte73);
                    }
                }
                //posicao 9-2
                if(alep==74){
                    if(alen == 0){
                        StringColorida c74 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte74 = new cartas(c74);
                        tabu.colocaCarta(8, 1, carte74);
                    }
                    else{
                        StringColorida c74 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte74 = new cartas(c74);
                        tabu.colocaCarta(8, 1, carte74);
                        ref74=alen;
                                            recebeu74=1;

                    }
                    if (ref73 == ref74 || ref75 == ref74 || ref76 == ref74 ||
                        ref77 == ref74 || ref78 == ref74 || ref79 == ref74 ||
                        ref80 == ref74 || ref81 == ref74 || ref2  == ref74 ||
                        ref11 == ref74 || ref20 == ref74 || ref29 == ref74 ||
                        ref38 == ref74 || ref47 == ref74 || ref56 == ref74 ||
                        ref65 == ref74 || ref55 == ref74 || ref57 == ref74 ||
                        ref64 == ref74 || ref66 == ref74) {
                        alen=0;
                        StringColorida c74 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte74 = new cartas(c74);
                        tabu.colocaCarta(8, 1, carte74);
                    
                    }
                }
                //posicao 9-3
                if(alep==75){
                    if(alen == 0){
                        StringColorida c75 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte75 = new cartas(c75);
                        tabu.colocaCarta(8, 2, carte75);
                    }
                    else{
                        StringColorida c75 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte75 = new cartas(c75);
                        tabu.colocaCarta(8, 2, carte75);
                        ref75=alen;
                                            recebeu75=1;

                    }
                    if (ref74 == ref75 || ref73 == ref75 || ref76 == ref75 ||
                        ref77 == ref75 || ref78 == ref75 || ref79 == ref75 ||
                        ref80 == ref75 || ref81 == ref75 || ref3  == ref75 ||
                        ref12 == ref75 || ref21 == ref75 || ref30 == ref75 ||
                        ref39 == ref75 || ref48 == ref75 || ref57 == ref75 ||
                        ref66 == ref75 || ref55 == ref75 || ref56 == ref75 ||
                        ref65 == ref75 || ref64 == ref75) {
                        alen=0;
                        StringColorida c75 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte75 = new cartas(c75);
                        tabu.colocaCarta(8, 2, carte75);
                    }
                }
                
                //posicao 9-4
                if(alep==76){
                    if(alen == 0){
                        StringColorida c76 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte76 = new cartas(c76);
                        tabu.colocaCarta(8, 3, carte76);
                    }
                    else{
                        StringColorida c76 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte76 = new cartas(c76);
                        tabu.colocaCarta(8, 3, carte76);
                        ref76=alen;
                                            recebeu76=1;

                    }
                    if (ref74 == ref76 || ref75 == ref76 || ref73 == ref76 ||
                    ref77 == ref76 || ref78 == ref76 || ref79 == ref76 ||
                    ref80 == ref76 || ref81 == ref76 || ref4  == ref76 ||
                    ref13 == ref76 || ref22 == ref76 || ref31 == ref76 ||
                    ref40 == ref76 || ref49 == ref76 || ref58 == ref76 ||
                    ref67 == ref76 || ref68 == ref76 || ref69 == ref76 ||
                    ref59 == ref76 || ref60 == ref76) {
                        alen=0;
                        StringColorida c76 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte76 = new cartas(c76);
                        tabu.colocaCarta(8, 3, carte76);
                    }
                }
                //posicao 9-5
                if(alep==77){
                    if(alen == 0){
                        StringColorida c77 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte77 = new cartas(c77);
                        tabu.colocaCarta(8, 4, carte77);
                    }
                    else{
                        StringColorida c77 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte77 = new cartas(c77);
                        tabu.colocaCarta(8, 4, carte77);
                        ref77=alen;
                                            recebeu77=1;

                    }
                    if (ref73 == ref77 || ref74 == ref77 || ref75 == ref77 ||
                        ref76 == ref77 || ref78 == ref77 || ref79 == ref77 ||
                        ref80 == ref77 || ref81 == ref77 || ref5  == ref77 ||
                        ref14 == ref77 || ref23 == ref77 || ref32 == ref77 ||
                        ref41 == ref77 || ref50 == ref77 || ref59 == ref77 ||
                        ref68 == ref77 || ref58 == ref77 || ref60 == ref77 ||
                        ref67 == ref77 || ref69 == ref77) {
                        alen=0;
                        StringColorida c77 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte77 = new cartas(c77);
                        tabu.colocaCarta(8, 4, carte77);
                    }
                }
                //posicao 9-6
                if(alep==78){
                    if(alen == 0){
                        StringColorida c78 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte78 = new cartas(c78);
                        tabu.colocaCarta(8, 5, carte78);
                    }
                    else{
                        StringColorida c78 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte78 = new cartas(c78);
                        tabu.colocaCarta(8, 5, carte78);
                        ref78=alen;
                                            recebeu78=1;

                    }
                    if (ref74 == ref78 || ref75 == ref78 || ref76 == ref78 ||
                        ref77 == ref78 || ref79 == ref78 || ref73 == ref78 ||
                        ref80 == ref78 || ref81 == ref78 || ref6  == ref78 ||
                        ref15 == ref78 || ref24 == ref78 || ref33 == ref78 ||
                        ref42 == ref78 || ref51 == ref78 || ref60 == ref78 ||
                        ref69 == ref78 || ref68 == ref78 || ref67 == ref78 ||
                        ref58 == ref78 || ref59 == ref78) {
                        alen=0;
                        StringColorida c78 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte78 = new cartas(c78);
                        tabu.colocaCarta(8, 5, carte78);
                    }
                }
                //posicao 9-7
                if(alep==79){
                    if(alen == 0){
                        StringColorida c79 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte79 = new cartas(c79);
                        tabu.colocaCarta(8, 6, carte79);
                    }
                    else{
                        StringColorida c79 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte79 = new cartas(c79);
                        tabu.colocaCarta(8, 6, carte79);
                        ref79=alen;
                                            recebeu79=1;

                    }
                    if (ref73 == ref79 || ref74 == ref79 || ref75 == ref79 ||
                        ref76 == ref79 || ref77 == ref79 || ref78 == ref79 ||
                        ref80 == ref79 || ref81 == ref79 || ref7  == ref79 ||
                        ref16 == ref79 || ref25 == ref79 || ref34 == ref79 ||
                        ref43 == ref79 || ref52 == ref79 || ref61 == ref79 ||
                        ref70 == ref79 || ref71 == ref79 || ref72 == ref79 ||
                        ref62 == ref79 || ref63 == ref79) {
                        alen=0;
                        StringColorida c79 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte79 = new cartas(c79);
                        tabu.colocaCarta(8, 6, carte79);
                    }
                }
                //posicao 9-8
                if(alep==80){
                    if(alen == 0){
                        StringColorida c80 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte80 = new cartas(c80);
                        tabu.colocaCarta(8, 7, carte80);
                    }
                    else{
                        StringColorida c80 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte80 = new cartas(c80);
                        tabu.colocaCarta(8, 7, carte80);
                        ref80=alen;
                                            recebeu80=1;

                    }
                    if (ref73 == ref80 || ref74 == ref80 || ref75 == ref80 ||
                        ref76 == ref80 || ref77 == ref80 || ref78 == ref80 ||
                        ref79 == ref80 || ref81 == ref80 || ref8  == ref80 ||
                        ref17 == ref80 || ref26 == ref80 || ref35 == ref80 ||
                        ref44 == ref80 || ref53 == ref80 || ref62 == ref80 ||
                        ref71 == ref80 || ref72 == ref80 || ref70 == ref80 ||
                        ref61 == ref80 || ref63 == ref80) {
                    
                        alen=0;
                        StringColorida c80 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte80 = new cartas(c80);
                        tabu.colocaCarta(8, 7, carte80);
                    }
                }
                //posicao 9-9
                if(alep==81){
                    if(alen == 0){
                        StringColorida c81 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte81 = new cartas(c81);
                        tabu.colocaCarta(8, 8, carte81);
                    }
                    else{
                        StringColorida c81 = new StringColorida("" + alen, Cor.PRETO, Cor.AZUL_CLARO);
                        cartas carte81 = new cartas(c81);
                        tabu.colocaCarta(8, 8, carte81);
                        ref81=alen;
                                            recebeu81=1;

                    }
                    if (ref73 == ref81 || ref74 == ref81 || ref75 == ref81 ||
                        ref76 == ref81 || ref77 == ref81 || ref78 == ref81 ||
                        ref79 == ref81 || ref80 == ref81 || ref9  == ref81 ||
                        ref18 == ref81 || ref27 == ref81 || ref36 == ref81 ||
                        ref45 == ref81 || ref54 == ref81 || ref63 == ref81 ||
                        ref72 == ref81 || ref71 == ref81 || ref70 == ref81 ||
                        ref61 == ref81 || ref62 == ref81) {
                        alen=0;
                        StringColorida c81 = new StringColorida("" + alen, Cor.PRETO, Cor.FUNDO_BRANCO);
                        cartas carte81 = new cartas(c81);
                        tabu.colocaCarta(8, 8, carte81);
                    }
                    recebeu81=1;
                }
            }
        }
        
        //print depois dos numeros aleatorios
        Console.print(tabu);
        //get.Pilha(int 1, int 1);
        System.out.println();
        while(fim!=1){
            //posicao na matriz que o numero vai ser botado
            Mensagens mostra =  new Mensagens();
            mostra.posicao();
            //System.out.println("Esolha a posicao:");
            Scanner scannerp = new Scanner(System.in);
            String posicao = scannerp.nextLine();
            
            //credito chat GPT
            
            //int numquadrado = scanner.nextInt();
            Scanner scanner = new Scanner(System.in);
            String numtabu = ""; // Inicializa numtabu como uma string vazia

            // String numtabu = "";
            
            while (true) {
                Mensagens mostra2 =  new Mensagens();
                mostra2.numero();
                String input = scanner.nextLine();

                try {
                    // Tenta converter a entrada para um número inteiro
                    int numquadrado = Integer.parseInt(input);
                    if (numquadrado != 0) {
                        numtabu = Integer.toString(numquadrado); // Atualiza numtabu se a conversão for bem-sucedida
                        //Mensagens mostra3 =  new Mensagens();
                        //mostra3.numero();
                        //System.out.println("Você escolheu o número: " + numtabu);
                        numtabuescolhido = numquadrado;
                        break; // Sai do loop se um número válido for fornecido
                    } 
                    else {
                        Mensagens mostra3 =  new Mensagens();
                        mostra3.invalida();
                    }
                } 
                catch (NumberFormatException e) {
                    // Se a conversão falhar, exibe uma mensagem de erro e continua o loop
                    Mensagens mostra4 =  new Mensagens();
                    mostra4.entradaInvalida();
                }
            }
            //fim credito chat GPT
            //getTecla(int codigoTecla)
            //System.out.println(numtabuescolhido);
            //fim=1; -> sair do jogo
            switch(posicao){
                //==========linha 1==========
                case "1-1":
                    if(recebeu1==0){ 
                        if(numtabuescolhido==ref2    || numtabuescolhido==ref3    ||numtabuescolhido==ref4     || 
                           numtabuescolhido==ref5    || numtabuescolhido == ref6  || numtabuescolhido == ref7  || 
                           numtabuescolhido == ref8  || numtabuescolhido == ref9  ||numtabuescolhido==ref10    || 
                           numtabuescolhido==ref19   || numtabuescolhido==ref28   || numtabuescolhido==ref37   || 
                           numtabuescolhido == ref46 || numtabuescolhido == ref55 || numtabuescolhido == ref64 || 
                           numtabuescolhido == ref73 ||numtabuescolhido == ref11  || numtabuescolhido == ref12 || 
                           numtabuescolhido == ref20 || numtabuescolhido == ref21){
                            StringColorida c1 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte1 = new cartas(c1);
                            tabu.colocaCarta(0, 0, carte1);
                            ref1 = numtabuescolhido;
                        }
                        else{
                           StringColorida c1 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte1 = new cartas(c1);
                           tabu.colocaCarta(0, 0, carte1);
                           ref1 = numtabuescolhido;
                        }
                    }
                    if(recebeu1 > 0){
                    }
                break;
                 
                case "1-2":
                    if(recebeu2==0){ 
                        if(numtabuescolhido==ref1    || numtabuescolhido==ref3    ||numtabuescolhido==ref4     || 
                           numtabuescolhido==ref5    || numtabuescolhido == ref6  || numtabuescolhido == ref7  || 
                           numtabuescolhido == ref8  || numtabuescolhido == ref9  ||numtabuescolhido==ref11    || 
                           numtabuescolhido==ref20   || numtabuescolhido==ref29   || numtabuescolhido==ref38   || 
                           numtabuescolhido == ref47 || numtabuescolhido == ref56 || numtabuescolhido == ref65 || 
                           numtabuescolhido == ref74 || numtabuescolhido == ref10 || numtabuescolhido == ref12 || 
                           numtabuescolhido == ref19 || numtabuescolhido == ref21){
                            StringColorida c2 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte2 = new cartas(c2);
                            tabu.colocaCarta(0, 1, carte2);
                            ref2 = numtabuescolhido;
                        }
                        else{
                           StringColorida c2 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte2 = new cartas(c2);
                           tabu.colocaCarta(0, 1, carte2);
                           ref2 = numtabuescolhido;
                        }
                    }
                    if(recebeu2 > 0){
                    }
                break;
                 
                 
                case "1-3":
                    if(recebeu3==0){ 
                        if(numtabuescolhido==ref1    || numtabuescolhido==ref2    || numtabuescolhido==ref4    ||
                           numtabuescolhido==ref5    || numtabuescolhido == ref6  || numtabuescolhido == ref7  || 
                           numtabuescolhido == ref8  || numtabuescolhido == ref9  || numtabuescolhido==ref12   || 
                           numtabuescolhido==ref21   ||numtabuescolhido==ref30    || numtabuescolhido==ref39   || 
                           numtabuescolhido == ref48 || numtabuescolhido == ref57 || numtabuescolhido == ref66 || 
                           numtabuescolhido == ref75 ||numtabuescolhido == ref10  || numtabuescolhido == ref11 || 
                           numtabuescolhido == ref19 || numtabuescolhido == ref20){
                            StringColorida c3 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte3 = new cartas(c3);
                            tabu.colocaCarta(0, 2, carte3);
                            ref3 = numtabuescolhido;
                        }
                        else{
                           StringColorida c3 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte3 = new cartas(c3);
                           tabu.colocaCarta(0, 2, carte3);
                           ref3 = numtabuescolhido;
                        }
                    }
                    if(recebeu3 > 0){
                    }
                break;
                
                case "1-4":
                    if(recebeu4==0){ 
                        if(numtabuescolhido==ref1    || numtabuescolhido==ref2    ||numtabuescolhido==ref3 ||
                           numtabuescolhido==ref5    || numtabuescolhido == ref6  || numtabuescolhido == ref7 || 
                           numtabuescolhido == ref8  || numtabuescolhido == ref9  ||numtabuescolhido==ref13 || 
                           numtabuescolhido==ref22   ||numtabuescolhido==ref31    || numtabuescolhido==ref40 || 
                           numtabuescolhido == ref49 || numtabuescolhido == ref58 || numtabuescolhido == ref67 || 
                           numtabuescolhido == ref76 ||numtabuescolhido == ref14  || numtabuescolhido == ref15 || 
                           numtabuescolhido == ref23 || numtabuescolhido == ref24){
                            StringColorida c4 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte4 = new cartas(c4);
                            tabu.colocaCarta(0, 3, carte4);
                            ref4 = numtabuescolhido;
                        }
                        else{
                           StringColorida c4 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte4 = new cartas(c4);
                           tabu.colocaCarta(0, 3, carte4);
                           ref4 = numtabuescolhido;
                        }
                    }
                    if(recebeu4 > 0){
                    }
                break;
                 
                case "1-5":
                   if(recebeu5==0){ 
                        if(numtabuescolhido==ref1 || numtabuescolhido==ref2 ||numtabuescolhido==ref3 ||
                           numtabuescolhido==ref4 || numtabuescolhido == ref6 || numtabuescolhido == ref7 || 
                           numtabuescolhido == ref8 || numtabuescolhido == ref9||numtabuescolhido==ref14 || 
                           numtabuescolhido==ref23 ||numtabuescolhido==ref32 || numtabuescolhido==ref41 || 
                           numtabuescolhido == ref50 || numtabuescolhido == ref59 || numtabuescolhido == ref68 ||
                           numtabuescolhido == ref77||numtabuescolhido == ref13 || numtabuescolhido == ref15 || 
                           numtabuescolhido == ref22 || numtabuescolhido == ref24){
                            StringColorida c5 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte5 = new cartas(c5);
                            tabu.colocaCarta(0, 4, carte5);
                            ref5 = numtabuescolhido;
                        }
                        else{
                           StringColorida c5 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte5 = new cartas(c5);
                           tabu.colocaCarta(0, 4, carte5);
                           ref5 = numtabuescolhido;
                        }
                    }
                    if(recebeu5 > 0){
                    }
                break;
                 
                case"1-6":
                    if(recebeu6==0){ 
                        if(numtabuescolhido==ref1 || numtabuescolhido==ref2 ||numtabuescolhido==ref3 || 
                           numtabuescolhido==ref4 || numtabuescolhido == ref5 || numtabuescolhido == ref7 || 
                           numtabuescolhido == ref8 || numtabuescolhido == ref9||numtabuescolhido==ref15 || 
                           numtabuescolhido==ref24 ||numtabuescolhido==ref33 || numtabuescolhido==ref42 || 
                           numtabuescolhido == ref51 || numtabuescolhido == ref60 || numtabuescolhido == ref69 ||
                           numtabuescolhido == ref78||numtabuescolhido == ref13 || numtabuescolhido == ref14 || 
                           numtabuescolhido == ref22 || numtabuescolhido == ref23){
                            StringColorida c6 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte6 = new cartas(c6);
                            tabu.colocaCarta(0, 5, carte6);
                            ref6 = numtabuescolhido;
                        }
                        else{
                           StringColorida c6 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte6 = new cartas(c6);
                           tabu.colocaCarta(0, 5, carte6);
                           ref6 = numtabuescolhido;
                        }
                    }
                    if(recebeu6 > 0){
                    }
                break;
                
                case "1-7":
                    if(recebeu7==0){ 
                        if(numtabuescolhido==ref1 || numtabuescolhido==ref2 ||numtabuescolhido==ref3 || 
                           numtabuescolhido==ref4 || numtabuescolhido == ref5 || numtabuescolhido == ref6 ||
                           numtabuescolhido == ref8 || numtabuescolhido == ref9||numtabuescolhido==ref16 || 
                           numtabuescolhido==ref25 ||numtabuescolhido==ref34 || numtabuescolhido==ref43 || 
                           numtabuescolhido == ref52 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                           numtabuescolhido == ref79||numtabuescolhido == ref17 || numtabuescolhido == ref18 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27){
                            StringColorida c7 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte7 = new cartas(c7);
                            tabu.colocaCarta(0, 5, carte7);
                            ref7 = numtabuescolhido;
                        }
                        else{
                           StringColorida c7 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte7 = new cartas(c7);
                           tabu.colocaCarta(0, 6, carte7);
                           ref7 = numtabuescolhido;
                        }
                    }
                    if(recebeu7 > 0){
                    }
                break;
                 
                case "1-8":
                   if(recebeu6==0){ 
                        if(numtabuescolhido==ref1 || numtabuescolhido==ref2 ||numtabuescolhido==ref3 ||
                           numtabuescolhido==ref4 || numtabuescolhido == ref5 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref7 || numtabuescolhido == ref9||numtabuescolhido==ref17 || 
                           numtabuescolhido==ref26 ||numtabuescolhido==ref35 || numtabuescolhido==ref44 || 
                           numtabuescolhido == ref53 || numtabuescolhido == ref62 || numtabuescolhido == ref71 || 
                           numtabuescolhido == ref80||numtabuescolhido == ref16 || numtabuescolhido == ref18 || 
                           numtabuescolhido == ref25 || numtabuescolhido == ref27){
                            StringColorida c8 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte8 = new cartas(c8);
                            tabu.colocaCarta(0, 7, carte8);
                            ref8 = numtabuescolhido;
                        }
                        else{
                           StringColorida c8 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte8 = new cartas(c8);
                           tabu.colocaCarta(0, 7, carte8);
                           ref8 = numtabuescolhido;
                        }
                    }
                    if(recebeu8 > 0){
                    }
                break;
                 
                case"1-9":
                    if(recebeu9==0){ 
                        if(numtabuescolhido==ref1 || numtabuescolhido==ref2 ||numtabuescolhido==ref3 || 
                           numtabuescolhido==ref4 || numtabuescolhido == ref5 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref7 || numtabuescolhido == ref8||numtabuescolhido==ref18 || 
                           numtabuescolhido==ref27 ||numtabuescolhido==ref36 || numtabuescolhido==ref45 ||
                           numtabuescolhido == ref54 || numtabuescolhido == ref63 || numtabuescolhido == ref72 ||
                           numtabuescolhido == ref81||numtabuescolhido == ref16 || numtabuescolhido == ref17 ||
                           numtabuescolhido == ref25 || numtabuescolhido == ref26){
                            StringColorida c9 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte9 = new cartas(c9);
                            tabu.colocaCarta(0, 8, carte9);
                            ref9 = numtabuescolhido;
                        }
                        else{
                           StringColorida c9 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte9 = new cartas(c9);
                           tabu.colocaCarta(0, 8, carte9);
                           ref9 = numtabuescolhido;
                        }
                    }
                    if(recebeu9 > 0){
                    }
                break;
                
                //==========linha 2==========
                
                case "2-1":
                   if(recebeu10==0){ 
                        if(numtabuescolhido==ref11 || numtabuescolhido==ref12 ||numtabuescolhido==ref13 || 
                           numtabuescolhido==ref14 || numtabuescolhido == ref15 || numtabuescolhido == ref16 ||
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref1 ||
                           numtabuescolhido==ref19 ||numtabuescolhido==ref28 || numtabuescolhido==ref37 || 
                           numtabuescolhido == ref46 || numtabuescolhido == ref55 || numtabuescolhido == ref64 ||
                           numtabuescolhido == ref73||numtabuescolhido == ref2 || numtabuescolhido == ref3 || 
                           numtabuescolhido == ref20 || numtabuescolhido == ref21){
                            StringColorida c10 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte10 = new cartas(c10);
                            tabu.colocaCarta(1, 0, carte10);
                            ref10 = numtabuescolhido;
                        }
                        else{
                           StringColorida c10 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte10 = new cartas(c10);
                           tabu.colocaCarta(1, 0, carte10);
                           ref10 = numtabuescolhido;
                        }
                    }
                    if(recebeu10 > 0){
                    }
                break;
                 
                case "2-2":
                    if(recebeu11==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref12 ||numtabuescolhido==ref13 || 
                           numtabuescolhido==ref14 || numtabuescolhido == ref15 || numtabuescolhido == ref16 || 
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref2 || 
                           numtabuescolhido==ref20 ||numtabuescolhido==ref29 || numtabuescolhido==ref38 || 
                           numtabuescolhido == ref47 || numtabuescolhido == ref56 || numtabuescolhido == ref65 || 
                           numtabuescolhido == ref74||numtabuescolhido == ref1 || numtabuescolhido == ref3 || 
                           numtabuescolhido == ref19 || numtabuescolhido == ref21){
                            StringColorida c11 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte11 = new cartas(c11);
                            tabu.colocaCarta(1, 1, carte11);
                            ref11 = numtabuescolhido;
                        }
                        else{
                           StringColorida c11 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte11 = new cartas(c11);
                           tabu.colocaCarta(1, 1, carte11);
                           ref11 = numtabuescolhido;
                        }
                    }
                    if(recebeu11 > 0){
                    }
                break;
                 
                case"2-3":
                   if(recebeu12==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref13 || 
                           numtabuescolhido==ref14 || numtabuescolhido == ref15 || numtabuescolhido == ref16 || 
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref3 || 
                           numtabuescolhido==ref21 ||numtabuescolhido==ref30 || numtabuescolhido==ref39 ||
                           numtabuescolhido == ref48 || numtabuescolhido == ref57 || numtabuescolhido == ref66 ||
                           numtabuescolhido == ref75||numtabuescolhido == ref1 || numtabuescolhido == ref2 || 
                           numtabuescolhido == ref19 || numtabuescolhido == ref20){
                            StringColorida c12 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte12 = new cartas(c12);
                            tabu.colocaCarta(1, 2, carte12);
                            ref12 = numtabuescolhido;
                        }
                        else{
                           StringColorida c12 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte12 = new cartas(c12);
                           tabu.colocaCarta(1, 2, carte12);
                           ref12 = numtabuescolhido;
                        }
                    }
                    if(recebeu12 > 0){
                    }
                break;
                
                case "2-4":
                    if(recebeu13==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                           numtabuescolhido==ref14 || numtabuescolhido == ref15 || numtabuescolhido == ref16 || 
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref4 || 
                           numtabuescolhido==ref22 ||numtabuescolhido==ref31 || numtabuescolhido==ref40 || 
                           numtabuescolhido == ref49 || numtabuescolhido == ref58 || numtabuescolhido == ref67 || 
                           numtabuescolhido == ref76||numtabuescolhido == ref5 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref23 || numtabuescolhido == ref24){
                            StringColorida c13 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte13 = new cartas(c13);
                            tabu.colocaCarta(1, 3, carte13);
                            ref13 = numtabuescolhido;
                        }
                        else{
                           StringColorida c13 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte13 = new cartas(c13);
                           tabu.colocaCarta(1, 3, carte13);
                           ref13 = numtabuescolhido;
                        }
                    }
                    if(recebeu13 > 0){
                    }
                break;
                 
                case "2-5":
                    if(recebeu14==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                           numtabuescolhido==ref13 || numtabuescolhido == ref15 || numtabuescolhido == ref16 || 
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref5 || 
                           numtabuescolhido==ref23 ||numtabuescolhido==ref32 || numtabuescolhido==ref41 || 
                           numtabuescolhido == ref50 || numtabuescolhido == ref59 || numtabuescolhido == ref68 || 
                           numtabuescolhido == ref77 ||numtabuescolhido == ref4 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref22 || numtabuescolhido == ref24){
                            StringColorida c14 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte14 = new cartas(c14);
                            tabu.colocaCarta(1, 4, carte14);
                            ref14 = numtabuescolhido;
                        }
                        else{
                           StringColorida c14 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte14 = new cartas(c14);
                           tabu.colocaCarta(1, 4, carte14);
                           ref14 = numtabuescolhido;
                        }
                    }
                    if(recebeu14 > 0){
                    }
                break;
                 
                case"2-6":
                    if(recebeu15==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                            numtabuescolhido==ref13 || numtabuescolhido == ref14 || numtabuescolhido == ref16 || 
                            numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref6 || 
                            numtabuescolhido==ref24 ||numtabuescolhido==ref33 || numtabuescolhido==ref42 || 
                            numtabuescolhido == ref51 || numtabuescolhido == ref60 || numtabuescolhido == ref69 || 
                            numtabuescolhido == ref78||numtabuescolhido == ref4 || numtabuescolhido == ref5 || 
                            numtabuescolhido == ref22 || numtabuescolhido == ref23){
                            StringColorida c15 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte15 = new cartas(c15);
                            tabu.colocaCarta(1, 5, carte15);
                            ref15 = numtabuescolhido;
                        }
                        else{
                           StringColorida c15 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte15 = new cartas(c15);
                           tabu.colocaCarta(1, 5, carte15);
                           ref15 = numtabuescolhido;
                        }
                    }
                    if(recebeu15 > 0){
                    }
                break;
                
                case "2-7":
                    if(recebeu16==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                           numtabuescolhido==ref13 || numtabuescolhido == ref14 || numtabuescolhido == ref15 || 
                           numtabuescolhido == ref17 || numtabuescolhido == ref18||numtabuescolhido==ref7 || 
                           numtabuescolhido==ref25 ||numtabuescolhido==ref34 || numtabuescolhido==ref43 || 
                           numtabuescolhido == ref52 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                           numtabuescolhido == ref79||numtabuescolhido == ref8 || numtabuescolhido == ref9 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27){
                            StringColorida c16 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte16 = new cartas(c16);
                            tabu.colocaCarta(1, 6, carte16);
                            ref16 = numtabuescolhido;
                        }
                        else{
                           StringColorida c16 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte16 = new cartas(c16);
                           tabu.colocaCarta(1, 6, carte16);
                           ref16 = numtabuescolhido;
                        }
                    }
                    if(recebeu16 > 0){
                    }
                break;
                 
                case "2-8":
                    if(recebeu17==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                           numtabuescolhido==ref13 || numtabuescolhido == ref14 || numtabuescolhido == ref15 ||
                           numtabuescolhido == ref16 || numtabuescolhido == ref18||numtabuescolhido==ref8 || 
                           numtabuescolhido==ref26 ||numtabuescolhido==ref35 || numtabuescolhido==ref44 || 
                           numtabuescolhido == ref53 || numtabuescolhido == ref62 || numtabuescolhido == ref71 || 
                           numtabuescolhido == ref80||numtabuescolhido == ref7 || numtabuescolhido == ref9 || 
                           numtabuescolhido == ref25 || numtabuescolhido == ref27){
                            StringColorida c17 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte17 = new cartas(c17);
                            tabu.colocaCarta(1, 7, carte17);
                            ref17 = numtabuescolhido;
                        }
                        else{
                           StringColorida c17 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte17 = new cartas(c17);
                           tabu.colocaCarta(1, 7, carte17);
                           ref17 = numtabuescolhido;
                        }
                    }
                    if(recebeu17 > 0){
                    }
                break;
                 
                case"2-9":
                   if(recebeu18==0){ 
                        if(numtabuescolhido==ref10 || numtabuescolhido==ref11 ||numtabuescolhido==ref12 || 
                           numtabuescolhido==ref13 || numtabuescolhido == ref14 || numtabuescolhido == ref15 || 
                           numtabuescolhido == ref16 || numtabuescolhido == ref17||numtabuescolhido==ref9 || 
                           numtabuescolhido==ref27||numtabuescolhido==ref36 || numtabuescolhido==ref45 || 
                           numtabuescolhido == ref54 || numtabuescolhido == ref63 || numtabuescolhido == ref72 ||
                           numtabuescolhido == ref81||numtabuescolhido == ref17 || numtabuescolhido == ref8 ||
                           numtabuescolhido == ref25 || numtabuescolhido == ref26){
                            StringColorida c18 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte18 = new cartas(c18);
                            tabu.colocaCarta(1, 8, carte18);
                            ref18 = numtabuescolhido;
                        }
                        else{
                           StringColorida c18 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                           cartas carte18 = new cartas(c18);
                           tabu.colocaCarta(1, 8, carte18);
                           ref18 = numtabuescolhido;
                        }
                    }
                    if(recebeu18 > 0){
                    }
                break;
                
                //==========linha 3==========
                case "3-1":
                    if(recebeu19 == 0){ 
                        if(numtabuescolhido == ref20 || numtabuescolhido == ref21 || numtabuescolhido == ref22 || 
                           numtabuescolhido == ref23 || numtabuescolhido == ref24 || numtabuescolhido == ref25 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref1 ||
                           numtabuescolhido == ref10 || numtabuescolhido == ref28 || numtabuescolhido == ref37 ||
                           numtabuescolhido == ref46 || numtabuescolhido == ref55 || numtabuescolhido == ref64 ||
                           numtabuescolhido == ref73 || numtabuescolhido == ref2 || numtabuescolhido == ref3 ||
                           numtabuescolhido == ref11 || numtabuescolhido == ref12){
                            StringColorida c19 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte19 = new cartas(c19);
                            tabu.colocaCarta(2, 0, carte19);
                            ref19 = numtabuescolhido;
                        } else {
                            StringColorida c19 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte19 = new cartas(c19);
                            tabu.colocaCarta(2, 0, carte19);
                            ref19 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-2":
                    if(recebeu20 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref21 || numtabuescolhido == ref22 ||
                           numtabuescolhido == ref23 || numtabuescolhido == ref24 || numtabuescolhido == ref25 ||
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref2 ||
                           numtabuescolhido == ref11 ||numtabuescolhido == ref29 || numtabuescolhido == ref38 ||
                           numtabuescolhido == ref47 || numtabuescolhido == ref56 || numtabuescolhido == ref65 ||
                           numtabuescolhido == ref74 || numtabuescolhido == ref1 || numtabuescolhido == ref10 || 
                           numtabuescolhido == ref3 || numtabuescolhido == ref12){
                            StringColorida c20 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte20 = new cartas(c20);
                            tabu.colocaCarta(2, 1, carte20);
                            ref20 = numtabuescolhido;
                        } else {
                            StringColorida c20 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte20 = new cartas(c20);
                            tabu.colocaCarta(2, 1, carte20);
                            ref20 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-3":
                    if(recebeu21 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref22 ||
                           numtabuescolhido == ref23 || numtabuescolhido == ref24 || numtabuescolhido == ref25 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref3 || 
                           numtabuescolhido == ref12 || numtabuescolhido == ref30 || numtabuescolhido == ref39 ||
                           numtabuescolhido == ref48 || numtabuescolhido == ref57 || numtabuescolhido == ref66 ||
                           numtabuescolhido == ref75 || numtabuescolhido == ref1 || numtabuescolhido == ref2 || 
                           numtabuescolhido == ref10 || numtabuescolhido == ref11){
                            StringColorida c21 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte21 = new cartas(c21);
                            tabu.colocaCarta(2, 2, carte21);
                            ref21 = numtabuescolhido;
                        } else {
                            StringColorida c21 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte21 = new cartas(c21);
                            tabu.colocaCarta(2, 2, carte21);
                            ref21 = numtabuescolhido;
                        }
                    } else {
                    }
                break;
                
                case "3-4":
                    if(recebeu22 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 ||
                           numtabuescolhido == ref23 || numtabuescolhido == ref24 || numtabuescolhido == ref25 ||
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref4 || 
                           numtabuescolhido == ref13 ||numtabuescolhido == ref31 || numtabuescolhido == ref40 || 
                           numtabuescolhido == ref49 || numtabuescolhido == ref58 || numtabuescolhido == ref67 ||
                           numtabuescolhido == ref76 || numtabuescolhido == ref5 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref23 || numtabuescolhido == ref24){
                            StringColorida c22 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte22 = new cartas(c22);
                            tabu.colocaCarta(2, 3, carte22);
                            ref22 = numtabuescolhido;
                        } else {
                            StringColorida c22 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte22 = new cartas(c22);
                            tabu.colocaCarta(2, 3, carte22);
                            ref22 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-5":
                    if(recebeu23 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 || 
                           numtabuescolhido == ref22 || numtabuescolhido == ref24 || numtabuescolhido == ref25 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref5 ||
                           numtabuescolhido == ref14 || numtabuescolhido == ref32 || numtabuescolhido == ref41 ||
                           numtabuescolhido == ref50 || numtabuescolhido == ref59 || numtabuescolhido == ref68 ||
                           numtabuescolhido == ref77 || numtabuescolhido == ref4 || numtabuescolhido == ref6|| 
                           numtabuescolhido == ref22 || numtabuescolhido == ref24){
                            StringColorida c23 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte23 = new cartas(c23);
                            tabu.colocaCarta(2, 4, carte23);
                            ref23 = numtabuescolhido;
                        } else {
                            StringColorida c23 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte23 = new cartas(c23);
                            tabu.colocaCarta(2, 4, carte23);
                            ref23 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-6":
                    if(recebeu24 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 ||
                           numtabuescolhido == ref22 || numtabuescolhido == ref23 || numtabuescolhido == ref25 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref6 || 
                           numtabuescolhido == ref15 || numtabuescolhido == ref33 || numtabuescolhido == ref42 ||
                           numtabuescolhido == ref51 || numtabuescolhido == ref60 || numtabuescolhido == ref69 || 
                           numtabuescolhido == ref78 || numtabuescolhido == ref4 || numtabuescolhido == ref5 || 
                           numtabuescolhido == ref13 || numtabuescolhido == ref14){
                            StringColorida c24 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte24 = new cartas(c24);
                            tabu.colocaCarta(2, 5, carte24);
                            ref24 = numtabuescolhido;
                        } else {
                            StringColorida c24 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte24 = new cartas(c24);
                            tabu.colocaCarta(2, 5, carte24);
                            ref24 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-7":
                    if(recebeu25 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 || 
                           numtabuescolhido == ref22 || numtabuescolhido == ref23 || numtabuescolhido == ref24 || 
                           numtabuescolhido == ref26 || numtabuescolhido == ref27 || numtabuescolhido == ref7 ||
                           numtabuescolhido == ref16 || numtabuescolhido == ref34 || numtabuescolhido == ref43 ||
                           numtabuescolhido == ref52 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                           numtabuescolhido == ref79 || numtabuescolhido == ref8 || numtabuescolhido == ref9 || 
                           numtabuescolhido == ref17|| numtabuescolhido == ref18){
                            StringColorida c25 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte25 = new cartas(c25);
                            tabu.colocaCarta(2, 6, carte25);
                            ref25 = numtabuescolhido;
                        } else {
                            StringColorida c25 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte25 = new cartas(c25);
                            tabu.colocaCarta(2, 6, carte25);
                            ref25 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-8":
                    if(recebeu26 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 ||
                           numtabuescolhido == ref22 || numtabuescolhido == ref23 || numtabuescolhido == ref24 || 
                           numtabuescolhido == ref25 || numtabuescolhido == ref27 || numtabuescolhido == ref8 ||
                           numtabuescolhido == ref17 ||numtabuescolhido == ref35 || numtabuescolhido == ref44 || 
                           numtabuescolhido == ref53 || numtabuescolhido == ref62 || numtabuescolhido == ref71 ||
                           numtabuescolhido == ref80 || numtabuescolhido == ref1 || numtabuescolhido == ref2 || 
                           numtabuescolhido == ref3 || numtabuescolhido == ref4){
                            StringColorida c26 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte26 = new cartas(c26);
                            tabu.colocaCarta(2, 7, carte26);
                            ref26 = numtabuescolhido;
                        } else {
                            StringColorida c26 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte26 = new cartas(c26);
                            tabu.colocaCarta(2, 7, carte26);
                            ref26 = numtabuescolhido;
                        }
                    } else {
                    }
                break;

                case "3-9":
                    if(recebeu27 == 0){ 
                        if(numtabuescolhido == ref19 || numtabuescolhido == ref20 || numtabuescolhido == ref21 ||
                           numtabuescolhido == ref22 || numtabuescolhido == ref23 || numtabuescolhido == ref24 ||
                           numtabuescolhido == ref25 || numtabuescolhido == ref26 || numtabuescolhido == ref9 || 
                           numtabuescolhido == ref18 ||numtabuescolhido == ref36 || numtabuescolhido == ref45 || 
                           numtabuescolhido == ref54 || numtabuescolhido == ref63 || numtabuescolhido == ref72|| 
                           numtabuescolhido == ref81 || numtabuescolhido == ref7 || numtabuescolhido == ref8 || 
                           numtabuescolhido == ref16 || numtabuescolhido == ref17){
                            StringColorida c27 = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                            cartas carte27 = new cartas(c27);
                            tabu.colocaCarta(2, 8, carte27);
                            ref27 = numtabuescolhido;
                        } else {
                            StringColorida c27 = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                            cartas carte27 = new cartas(c27);
                            tabu.colocaCarta(2, 8, carte27);
                            ref27 = numtabuescolhido;
                        }
                    } else {
                    }
                break;
                //==========linha 4==========

                case "4-1":
                        if (recebeu28 == 0) { 
                            if (numtabuescolhido == ref29 || numtabuescolhido == ref30 || numtabuescolhido == ref31 || 
                                numtabuescolhido == ref32 || numtabuescolhido == ref33 || numtabuescolhido == ref34 || 
                                numtabuescolhido == ref35 || numtabuescolhido == ref36 || numtabuescolhido == ref1 || 
                                numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref37 || 
                                numtabuescolhido == ref46 || numtabuescolhido == ref55 || numtabuescolhido == ref64 || 
                                numtabuescolhido == ref73 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                numtabuescolhido == ref47 || numtabuescolhido == ref48 ) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(3, 0, carta);
                                ref28 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(3, 0, carta);
                                ref28 = numtabuescolhido;
                            }
                        } else {
                        }
                break;
                case "4-2":
                            if (recebeu29 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref30 || numtabuescolhido == ref31 || 
                                    numtabuescolhido == ref32 || numtabuescolhido == ref33 || numtabuescolhido == ref34 || 
                                    numtabuescolhido == ref35 || numtabuescolhido == ref36 || numtabuescolhido == ref2 || 
                                    numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref38 || 
                                    numtabuescolhido == ref47 || numtabuescolhido == ref56 || numtabuescolhido == ref65 || 
                                    numtabuescolhido == ref74 || numtabuescolhido == ref39 || numtabuescolhido == ref37 || 
                                    numtabuescolhido == ref48 || numtabuescolhido == ref46 ) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 1, carta);
                                    ref29 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 1, carta);
                                    ref29 = numtabuescolhido;
                                }
                            } else {
                            }
                break;
                case "4-3":
                            if (recebeu30 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref31 || 
                                    numtabuescolhido == ref32 || numtabuescolhido == ref33 || numtabuescolhido == ref34 || 
                                    numtabuescolhido == ref35 || numtabuescolhido == ref36 || numtabuescolhido == ref3 || 
                                    numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref48 || numtabuescolhido == ref57 || numtabuescolhido == ref66 || 
                                    numtabuescolhido == ref75 || numtabuescolhido == ref37 || numtabuescolhido == ref38 || 
                                    numtabuescolhido == ref46 || numtabuescolhido == ref47 ) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 2, carta);
                                    ref30 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 2, carta);
                                    ref30 = numtabuescolhido;
                                }
                            } else {
                            }
                break;
                case "4-4":
                            if (recebeu31 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref32 || numtabuescolhido == ref33 || numtabuescolhido == ref34 || 
                                    numtabuescolhido == ref35 || numtabuescolhido == ref36 || numtabuescolhido == ref4 || 
                                    numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref40 || 
                                    numtabuescolhido == ref49 || numtabuescolhido == ref58 || numtabuescolhido == ref67 || 
                                    numtabuescolhido == ref76 || numtabuescolhido == ref41 || numtabuescolhido == ref42 || 
                                    numtabuescolhido == ref50 || numtabuescolhido == ref51) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 3, carta);
                                    ref31 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 3, carta);
                                    ref31 = numtabuescolhido;
                                }
                            } else {
                            }
                break;
                case "4-5":
                            if (recebeu32 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref31 || numtabuescolhido == ref33 || 
                                    numtabuescolhido == ref34 || numtabuescolhido == ref35 || numtabuescolhido == ref5 || 
                                    numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref41 || 
                                    numtabuescolhido == ref50 || numtabuescolhido == ref59 || numtabuescolhido == ref68 || 
                                    numtabuescolhido == ref77 || numtabuescolhido == ref42 || numtabuescolhido == ref40 || 
                                    numtabuescolhido == ref51 || numtabuescolhido == ref49) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 4, carta);
                                    ref32 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 4, carta);
                                    ref32 = numtabuescolhido;
                                }
                            } else {
                                
                            }
                break;
                case "4-6":
                            if (recebeu33 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref31 || numtabuescolhido == ref32 || numtabuescolhido == ref36 || 
                                    numtabuescolhido == ref34 || numtabuescolhido == ref35 || numtabuescolhido == ref6 || 
                                    numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref42 || 
                                    numtabuescolhido == ref51 || numtabuescolhido == ref60 || numtabuescolhido == ref69 || 
                                    numtabuescolhido == ref78 || numtabuescolhido == ref40 || numtabuescolhido == ref41 || 
                                    numtabuescolhido == ref49 || numtabuescolhido == ref50) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 5, carta);
                                    ref33 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 5, carta);
                                    ref33 = numtabuescolhido;
                                }
                            } else {
                                
                            }
                break;
                case "4-8":
                        if (recebeu35 == 0) { 
                            if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                numtabuescolhido == ref31 || numtabuescolhido == ref32 || numtabuescolhido == ref33 || 
                                numtabuescolhido == ref34 || numtabuescolhido == ref36 || numtabuescolhido == ref8 || 
                                numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref44 || 
                                numtabuescolhido == ref53 || numtabuescolhido == ref62 || numtabuescolhido == ref71 || 
                                numtabuescolhido == ref80 || numtabuescolhido == ref43 || numtabuescolhido == ref45 || 
                                numtabuescolhido == ref54 || numtabuescolhido == ref52 ) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(3, 7, carta);
                                ref35 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(3, 7, carta);
                                ref35 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;

                    case "4-7":
                            if (recebeu34 == 0) { 
                                if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref31 || numtabuescolhido == ref32 || numtabuescolhido == ref33 || 
                                    numtabuescolhido == ref35 || numtabuescolhido == ref36 || numtabuescolhido == ref7 || 
                                    numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref52 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                                    numtabuescolhido == ref79 || numtabuescolhido == ref44 || numtabuescolhido == ref45 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54 ) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 6, carta);
                                    ref34 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(3, 6, carta);
                                    ref34 = numtabuescolhido;
                                }
                            } else {
                               
                            }
                    break;
                    case "4-9":
                                if (recebeu36 == 0) { 
                                    if (numtabuescolhido == ref28 || numtabuescolhido == ref29 || numtabuescolhido == ref30 || 
                                        numtabuescolhido == ref31 || numtabuescolhido == ref32 || numtabuescolhido == ref33 || 
                                        numtabuescolhido == ref34 || numtabuescolhido == ref35 || numtabuescolhido == ref9 || 
                                        numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref45 || 
                                        numtabuescolhido == ref54 || numtabuescolhido == ref63 || numtabuescolhido == ref72 || 
                                        numtabuescolhido == ref81 || numtabuescolhido == ref43 || numtabuescolhido == ref44 || 
                                        numtabuescolhido == ref52 || numtabuescolhido == ref53 ) {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(3, 8, carta);
                                        ref36 = numtabuescolhido;
                                    } else {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(3, 8, carta);
                                        ref36 = numtabuescolhido;
                                    }
                                } else {
                                }
                    break;
                    //==========linha 5==========

                    case "5-1":
                             if (recebeu37 == 0) { 
                                if (numtabuescolhido == ref38 || numtabuescolhido == ref39 || numtabuescolhido == ref40 || 
                                    numtabuescolhido == ref41 || numtabuescolhido == ref42 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref1 || 
                                    numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref28 || 
                                    numtabuescolhido == ref46 || numtabuescolhido == ref55 || numtabuescolhido == ref64 || 
                                    numtabuescolhido == ref73 || numtabuescolhido == ref29 || numtabuescolhido == ref28 ||
                                    numtabuescolhido == ref47 || numtabuescolhido == ref48) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 0, carta);
                                    ref37 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 0, carta);
                                    ref37 = numtabuescolhido;
                                }
                            } else {
                                System.out.println("Jogada não realizada");
                            }
                    break;
                    case "5-2":
                                if (recebeu38 == 0) { 
                                  if (numtabuescolhido == ref37 || numtabuescolhido == ref39 || numtabuescolhido == ref40 || 
                                      numtabuescolhido == ref41 || numtabuescolhido == ref42 || numtabuescolhido == ref43 || 
                                      numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref2 || 
                                      numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref29 || 
                                      numtabuescolhido == ref47 || numtabuescolhido == ref56 || numtabuescolhido == ref65 || 
                                      numtabuescolhido == ref74 || numtabuescolhido == ref28 || numtabuescolhido == ref30 ||
                                      numtabuescolhido == ref46 || numtabuescolhido == ref48) {
                                      StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                      cartas carta = new cartas(corCarta);
                                      tabu.colocaCarta(4, 1, carta);
                                      ref38 = numtabuescolhido;
                                  } else {
                                      StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                      cartas carta = new cartas(corCarta);
                                      tabu.colocaCarta(4, 1, carta);
                                      ref38 = numtabuescolhido;
                                  }
                              } else {
                              }
                    break;
                    case "5-3":
                            if (recebeu39 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref40 || 
                                    numtabuescolhido == ref41 || numtabuescolhido == ref42 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref3 || 
                                    numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref48 || numtabuescolhido == ref57 || numtabuescolhido == ref66 || 
                                    numtabuescolhido == ref75 || numtabuescolhido == ref28 || numtabuescolhido == ref29 ||
                                    numtabuescolhido == ref46 || numtabuescolhido == ref47) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 2, carta);
                                    ref39 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 2, carta);
                                    ref39 = numtabuescolhido;
                                }
                            } else {
                               
                            }
                    break;

                    case "5-4":
                            if (recebeu40 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref41 || numtabuescolhido == ref42 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref4 || 
                                    numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref31 || 
                                    numtabuescolhido == ref49 || numtabuescolhido == ref58 || numtabuescolhido == ref67 || 
                                    numtabuescolhido == ref76 || numtabuescolhido == ref32 || numtabuescolhido == ref33 ||
                                    numtabuescolhido == ref50 || numtabuescolhido == ref51) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 3, carta);
                                    ref40 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 3, carta);
                                    ref40 = numtabuescolhido;
                                }
                            } else {
                               
                            }
                            break;

                    case "5-5":
                            if (recebeu41 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref40 || numtabuescolhido == ref42 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref5 || 
                                    numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref32 || 
                                    numtabuescolhido == ref50 || numtabuescolhido == ref59 || numtabuescolhido == ref68 || 
                                    numtabuescolhido == ref77 || numtabuescolhido == ref31 || numtabuescolhido == ref33 ||
                                    numtabuescolhido == ref49 || numtabuescolhido == ref51) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 4, carta);
                                    ref41 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 4, carta);
                                    ref41 = numtabuescolhido;
                                }
                            } else {
                            }
                            break;

                    case "5-6":
                            if (recebeu42 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref40 || numtabuescolhido == ref41 || numtabuescolhido == ref43 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref6 || 
                                    numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref33 || 
                                    numtabuescolhido == ref51 || numtabuescolhido == ref60 || numtabuescolhido == ref69 || 
                                    numtabuescolhido == ref78 || numtabuescolhido == ref31 || numtabuescolhido == ref32 ||
                                    numtabuescolhido == ref49 || numtabuescolhido == ref50) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 5, carta);
                                    ref42 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 5, carta);
                                    ref42 = numtabuescolhido;
                                }
                            } else {
                            }
                            break;

                    case "5-7":
                            if (recebeu43 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref40 || numtabuescolhido == ref41 || numtabuescolhido == ref42 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref45 || numtabuescolhido == ref7 || 
                                    numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref34 || 
                                    numtabuescolhido == ref52 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                                    numtabuescolhido == ref79 || numtabuescolhido == ref35 || numtabuescolhido == ref36 ||
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 6, carta);
                                    ref43 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 6, carta);
                                    ref43 = numtabuescolhido;
                                }
                            } else {
                               
                            }
                    break;

                    case "5-8":
                            if (recebeu44 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref40 || numtabuescolhido == ref41 || numtabuescolhido == ref42 || 
                                    numtabuescolhido == ref43 || numtabuescolhido == ref45 || numtabuescolhido == ref8 || 
                                    numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref35 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref62 || numtabuescolhido == ref71 || 
                                    numtabuescolhido == ref80 || numtabuescolhido == ref34 || numtabuescolhido == ref36 ||
                                    numtabuescolhido == ref52 || numtabuescolhido == ref54) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 7, carta);
                                    ref44 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 7, carta);
                                    ref44 = numtabuescolhido;
                                }
                            } else {
                               
                            }
                            break;

                    case "5-9":
                            if (recebeu45 == 0) { 
                                if (numtabuescolhido == ref37 || numtabuescolhido == ref38 || numtabuescolhido == ref39 || 
                                    numtabuescolhido == ref40 || numtabuescolhido == ref41 || numtabuescolhido == ref42 || 
                                    numtabuescolhido == ref43 || numtabuescolhido == ref44 || numtabuescolhido == ref9 || 
                                    numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref36 || 
                                    numtabuescolhido == ref54 || numtabuescolhido == ref63 || numtabuescolhido == ref72 || 
                                    numtabuescolhido == ref81 || numtabuescolhido == ref34 || numtabuescolhido == ref35 ||
                                    numtabuescolhido == ref52 || numtabuescolhido == ref53) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 8, carta);
                                    ref45 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(4, 8, carta);
                                    ref45 = numtabuescolhido;
                                }
                            } else {
                                
                            }
                    break;
                    //==========linha 6==========

                    case "6-1":
                              if (recebeu46 == 0) { 
                                  if (numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref49 || 
                                       numtabuescolhido == ref50 || numtabuescolhido == ref51 || numtabuescolhido == ref52 || 
                                        numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref1 || 
                                        numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref28 || 
                                        numtabuescolhido == ref37 || numtabuescolhido == ref55 || numtabuescolhido == ref64 || 
                                        numtabuescolhido == ref73 || numtabuescolhido == ref38 || numtabuescolhido == ref39 ||
                                        numtabuescolhido == ref29 || numtabuescolhido == ref30) {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(5, 0, carta);
                                        ref46 = numtabuescolhido;
                                    } else {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(5, 0, carta);
                                        ref46 = numtabuescolhido;
                                    }
                                } else {
                                    
                                }
                    break;
                    case "6-2":
                            if (recebeu47 == 0) { 
                                if (numtabuescolhido == ref46 || numtabuescolhido == ref48 || numtabuescolhido == ref49 || 
                                    numtabuescolhido == ref50 || numtabuescolhido == ref51 || numtabuescolhido == ref52 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref2 || 
                                    numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref29 || 
                                    numtabuescolhido == ref38 || numtabuescolhido == ref56 || numtabuescolhido == ref65 || 
                                    numtabuescolhido == ref74 || numtabuescolhido == ref37 || numtabuescolhido == ref39 ||
                                    numtabuescolhido == ref30 || numtabuescolhido == ref28) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 1, carta);
                                    ref47 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 1, carta);
                                    ref47 = numtabuescolhido;
                                }
                            } else {
                                
                            }
                    break;
                    
                    case "6-3":
                            if (recebeu48 == 0) { 
                                if (numtabuescolhido == ref46 || numtabuescolhido == ref47 || numtabuescolhido == ref49 || 
                                    numtabuescolhido == ref50 || numtabuescolhido == ref51 || numtabuescolhido == ref52 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref3 || 
                                    numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref30 || 
                                    numtabuescolhido == ref39 || numtabuescolhido == ref57 || numtabuescolhido == ref66 || 
                                    numtabuescolhido == ref75 || numtabuescolhido == ref37 || numtabuescolhido == ref38 ||
                                    numtabuescolhido == ref28 || numtabuescolhido == ref29) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 2, carta);
                                    ref48 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 2, carta);
                                    ref48 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "6-4":
                        if (recebeu49 == 0) { 
                            if (numtabuescolhido == ref50 || numtabuescolhido == ref51 || numtabuescolhido == ref52 || 
                                numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref46 || 
                                numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref4 || 
                                numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref31 || 
                                numtabuescolhido == ref40 || numtabuescolhido == ref58 || numtabuescolhido == ref67 || 
                                numtabuescolhido == ref76 || numtabuescolhido == ref32 || numtabuescolhido == ref33 ||
                                numtabuescolhido == ref41 || numtabuescolhido == ref42) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(5, 3, carta);
                                ref49 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(5, 3, carta);
                                ref49 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    
                    case "6-5":
                        if (recebeu50 == 0) {
                            if (numtabuescolhido == ref49 || numtabuescolhido == ref51 || numtabuescolhido == ref52 || 
                                numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref46 || 
                                numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref5 || 
                                numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref32 || 
                                numtabuescolhido == ref41 || numtabuescolhido == ref59 || numtabuescolhido == ref68 || 
                                numtabuescolhido == ref77 || numtabuescolhido == ref31 || numtabuescolhido == ref40 ||
                                numtabuescolhido == ref33 || numtabuescolhido == ref42) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(5, 4, carta);
                                ref50 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(5, 4, carta);
                                ref50 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    
                    case "6-6":
                            if (recebeu51 == 0) {
                                if (numtabuescolhido == ref49 || numtabuescolhido == ref50 || numtabuescolhido == ref52 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref46 || 
                                    numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref6 || 
                                    numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref33 || 
                                    numtabuescolhido == ref42 || numtabuescolhido == ref60 || numtabuescolhido == ref69 || 
                                    numtabuescolhido == ref78 || numtabuescolhido == ref31 || numtabuescolhido == ref40 ||
                                    numtabuescolhido == ref32 || numtabuescolhido == ref41) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 5, carta);
                                    ref51 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 5, carta);
                                    ref51 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "6-7":
                            if (recebeu52 == 0) {
                                if (numtabuescolhido == ref49 || numtabuescolhido == ref50 || numtabuescolhido == ref51 || 
                                    numtabuescolhido == ref53 || numtabuescolhido == ref54 || numtabuescolhido == ref46 || 
                                    numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref7 || 
                                    numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref34 || 
                                    numtabuescolhido == ref43 || numtabuescolhido == ref61 || numtabuescolhido == ref70 || 
                                    numtabuescolhido == ref79 || numtabuescolhido == ref35 || numtabuescolhido == ref36 ||
                                    numtabuescolhido == ref44 || numtabuescolhido == ref54) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 6, carta);
                                    ref52 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 6, carta);
                                    ref52 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "6-8":
                            if (recebeu53 == 0) {
                                if (numtabuescolhido == ref49 || numtabuescolhido == ref50 || numtabuescolhido == ref51 || 
                                    numtabuescolhido == ref52 || numtabuescolhido == ref54 || numtabuescolhido == ref46 || 
                                    numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref8 || 
                                    numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref35 || 
                                    numtabuescolhido == ref44 || numtabuescolhido == ref62 || numtabuescolhido == ref71 || 
                                    numtabuescolhido == ref80 || numtabuescolhido == ref36 || numtabuescolhido == ref34 ||
                                    numtabuescolhido == ref43 || numtabuescolhido == ref45) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 7, carta);
                                    ref53 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 7, carta);
                                    ref53 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    
                    case "6-9":
                            if (recebeu54 == 0) {
                                if (numtabuescolhido == ref49 || numtabuescolhido == ref50 || numtabuescolhido == ref51 || 
                                    numtabuescolhido == ref52 || numtabuescolhido == ref53 || numtabuescolhido == ref46 || 
                                    numtabuescolhido == ref47 || numtabuescolhido == ref48 || numtabuescolhido == ref9 || 
                                    numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref36 || 
                                    numtabuescolhido == ref45 || numtabuescolhido == ref63 || numtabuescolhido == ref72 || 
                                    numtabuescolhido == ref81 || numtabuescolhido == ref34 || numtabuescolhido == ref35 ||
                                    numtabuescolhido == ref43 || numtabuescolhido == ref44) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 8, carta);
                                    ref54 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(5, 8, carta);
                                    ref54 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    //==========linha 7==========

                    case "7-1":
                            if (recebeu55 == 0) { 
                                if (numtabuescolhido == ref56 || numtabuescolhido == ref57 || numtabuescolhido == ref58 || 
                                    numtabuescolhido == ref59 || numtabuescolhido == ref60 || numtabuescolhido == ref61 || 
                                    numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref1 ||
                                    numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref28 ||
                                    numtabuescolhido == ref37 || numtabuescolhido == ref46 || numtabuescolhido == ref64 ||
                                    numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                    numtabuescolhido == ref65 || numtabuescolhido == ref66) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 0, carta);
                                    ref55 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 0, carta);
                                    ref55 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    
                    case "7-2":
                        if (recebeu56 == 0) { 
                            if (numtabuescolhido == ref55 || numtabuescolhido == ref57 || numtabuescolhido == ref58 || 
                                numtabuescolhido == ref59 || numtabuescolhido == ref60 || numtabuescolhido == ref61 || 
                                numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref2 ||
                                numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref29 ||
                                numtabuescolhido == ref38 || numtabuescolhido == ref47 || numtabuescolhido == ref65 ||
                                numtabuescolhido == ref74 || numtabuescolhido == ref75 || numtabuescolhido == ref64 ||
                                numtabuescolhido == ref66 || numtabuescolhido == ref73) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 1, carta);
                                ref56 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 1, carta);
                                ref56 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    
                    case "7-3":
                        if (recebeu57 == 0) {
                            if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref58 ||
                                numtabuescolhido == ref59 || numtabuescolhido == ref60 || numtabuescolhido == ref61 ||
                                numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref3 ||
                                numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref30 ||
                                numtabuescolhido == ref39 || numtabuescolhido == ref48 || numtabuescolhido == ref66 ||
                                numtabuescolhido == ref75 || numtabuescolhido == ref73 || numtabuescolhido == ref64 ||
                                numtabuescolhido == ref65 || numtabuescolhido == ref74) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 2, carta);
                                ref57 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 2, carta);
                                ref57 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    
                    case "7-4":
                        if (recebeu58 == 0) {
                            if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                numtabuescolhido == ref59 || numtabuescolhido == ref60 || numtabuescolhido == ref61 ||
                                numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref4 ||
                                numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref31 ||
                                numtabuescolhido == ref40 || numtabuescolhido == ref49 || numtabuescolhido == ref67 ||
                                numtabuescolhido == ref76 || numtabuescolhido == ref77 || numtabuescolhido == ref78 ||
                                numtabuescolhido == ref68 || numtabuescolhido == ref69) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 3, carta);
                                ref58 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 3, carta);
                                ref58 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    case "7-5":
                        if (recebeu59 == 0) {
                            if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                numtabuescolhido == ref58 || numtabuescolhido == ref60 || numtabuescolhido == ref61 ||
                                numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref5 ||
                                numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref32 ||
                                numtabuescolhido == ref41 || numtabuescolhido == ref50 || numtabuescolhido == ref68 ||
                                numtabuescolhido == ref77 || numtabuescolhido == ref76 || numtabuescolhido == ref78 ||
                                numtabuescolhido == ref67 || numtabuescolhido == ref69) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 4, carta);
                                ref59 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(6, 4, carta);
                                ref59 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    case "7-6":
                                if (recebeu60 == 0) {
                                    if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                        numtabuescolhido == ref58 || numtabuescolhido == ref59 || numtabuescolhido == ref61 ||
                                        numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref6 ||
                                        numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref33 ||
                                        numtabuescolhido == ref42 || numtabuescolhido == ref51 || numtabuescolhido == ref69 ||
                                        numtabuescolhido == ref78 || numtabuescolhido == ref76 || numtabuescolhido == ref77 ||
                                        numtabuescolhido == ref67 || numtabuescolhido == ref68) {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(6, 5, carta);
                                        ref60 = numtabuescolhido;
                                    } else {
                                        StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                        cartas carta = new cartas(corCarta);
                                        tabu.colocaCarta(6, 5, carta);
                                        ref60 = numtabuescolhido;
                                    }
                                } else {
                                }
                    break;
                    
                    case "7-7":
                            if (recebeu61 == 0) {
                                if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref58 || numtabuescolhido == ref59 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref62 || numtabuescolhido == ref63 || numtabuescolhido == ref7 ||
                                    numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref34 ||
                                    numtabuescolhido == ref43 || numtabuescolhido == ref52 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref79 || numtabuescolhido == ref71 || numtabuescolhido == ref72 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 6, carta);
                                    ref61 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 6, carta);
                                    ref61 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "7-8":
                            if (recebeu62 == 0) {
                                if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref58 || numtabuescolhido == ref59 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref61 || numtabuescolhido == ref63 || numtabuescolhido == ref8 ||
                                    numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref35 ||
                                    numtabuescolhido == ref44 || numtabuescolhido == ref53 || numtabuescolhido == ref71 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref70 || numtabuescolhido == ref72 ||
                                    numtabuescolhido == ref79 || numtabuescolhido == ref81) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 7, carta);
                                    ref62 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 7, carta);
                                    ref62 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "7-9":
                            if (recebeu63 == 0) {
                                if (numtabuescolhido == ref55 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref58 || numtabuescolhido == ref59 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref61 || numtabuescolhido == ref62 || numtabuescolhido == ref9 ||
                                    numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref36 ||
                                    numtabuescolhido == ref45 || numtabuescolhido == ref54 || numtabuescolhido == ref72 ||
                                    numtabuescolhido == ref81 || numtabuescolhido == ref70 || numtabuescolhido == ref71 ||
                                    numtabuescolhido == ref79 || numtabuescolhido == ref80) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 8, carta);
                                    ref63 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(6, 8, carta);
                                    ref63 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    //==========linha 8==========
                    case "8-1":
                            if (recebeu64 == 0) {
                                if (numtabuescolhido == ref65 || numtabuescolhido == ref66 || numtabuescolhido == ref67 ||
                                    numtabuescolhido == ref68 || numtabuescolhido == ref69 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref1 ||
                                    numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref28 ||
                                    numtabuescolhido == ref37 || numtabuescolhido == ref46 || numtabuescolhido == ref55 ||
                                    numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                    numtabuescolhido == ref56 || numtabuescolhido == ref57) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 0, carta);
                                    ref64 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 0, carta);
                                    ref64 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    
                    case "8-2":
                            if (recebeu65 == 0) {
                                if (numtabuescolhido == ref64 || numtabuescolhido == ref66 || numtabuescolhido == ref67 ||
                                    numtabuescolhido == ref68 || numtabuescolhido == ref69 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref2 ||
                                    numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref29 ||
                                    numtabuescolhido == ref38 || numtabuescolhido == ref47 || numtabuescolhido == ref56 ||
                                    numtabuescolhido == ref74 || numtabuescolhido == ref75 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref73|| numtabuescolhido == ref55) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 1, carta);
                                    ref65 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 1, carta);
                                    ref65 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    
                    
                    case "8-3":
                            if (recebeu66 == 0) {
                                if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref67 ||
                                    numtabuescolhido == ref68 || numtabuescolhido == ref69 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref3 ||
                                    numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref30 ||
                                    numtabuescolhido == ref39 || numtabuescolhido == ref48 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref75 || numtabuescolhido == ref74 || numtabuescolhido == ref73 ||
                                    numtabuescolhido == ref55 || numtabuescolhido == ref56) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 2, carta);
                                    ref66 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 2, carta);
                                    ref66 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "8-4":
                            if (recebeu67 == 0) {
                                if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                    numtabuescolhido == ref68 || numtabuescolhido == ref69 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref4 ||
                                    numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref31 ||
                                    numtabuescolhido == ref40 || numtabuescolhido == ref49 || numtabuescolhido == ref58 ||
                                    numtabuescolhido == ref76 || numtabuescolhido == ref77|| numtabuescolhido == ref78 ||
                                    numtabuescolhido == ref59 || numtabuescolhido == ref60) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 3, carta);
                                    ref67 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 3, carta);
                                    ref67 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "8-5":
                        if (recebeu68 == 0) {
                            if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                numtabuescolhido == ref67 || numtabuescolhido == ref69 || numtabuescolhido == ref70 ||
                                numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref5 ||
                                numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref32 ||
                                numtabuescolhido == ref41 || numtabuescolhido == ref50 || numtabuescolhido == ref59 ||
                                numtabuescolhido == ref77 || numtabuescolhido == ref76 || numtabuescolhido == ref78 ||
                                numtabuescolhido == ref58 || numtabuescolhido == ref60) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 4, carta);
                                ref68 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 4, carta);
                                ref68 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    case "8-6":
                            if (recebeu69 == 0) {
                                if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                    numtabuescolhido == ref67 || numtabuescolhido == ref68 || numtabuescolhido == ref70 ||
                                    numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref6 ||
                                    numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref33 ||
                                    numtabuescolhido == ref42 || numtabuescolhido == ref51 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref78 || numtabuescolhido == ref77 || numtabuescolhido == ref76 ||
                                    numtabuescolhido == ref58 || numtabuescolhido == ref59) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 5, carta);
                                    ref69 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 5, carta);
                                    ref69 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "8-7":
                        if (recebeu70 == 0) {
                            if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                numtabuescolhido == ref67 || numtabuescolhido == ref68 || numtabuescolhido == ref69 ||
                                numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref7 ||
                                numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref34 ||
                                numtabuescolhido == ref43 || numtabuescolhido == ref52 || numtabuescolhido == ref61 ||
                                numtabuescolhido == ref79 || numtabuescolhido == ref62 || numtabuescolhido == ref63 ||
                                numtabuescolhido == ref80 || numtabuescolhido == ref81) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 6, carta);
                                ref70 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 6, carta);
                                ref70 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;

                    case "8-8":
                        if (recebeu71 == 0) {
                            if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                numtabuescolhido == ref67 || numtabuescolhido == ref68 || numtabuescolhido == ref69 ||
                                numtabuescolhido == ref70 || numtabuescolhido == ref72 || numtabuescolhido == ref8 ||
                                numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref35 ||
                                numtabuescolhido == ref44 || numtabuescolhido == ref53 || numtabuescolhido == ref62 ||
                                numtabuescolhido == ref80 || numtabuescolhido == ref79 || numtabuescolhido == ref81 ||
                                numtabuescolhido == ref63 || numtabuescolhido == ref61) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 7, carta);
                                ref71 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(7, 7, carta);
                                ref71 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;
                    case "8-9":
                            if (recebeu72 == 0) {
                                if (numtabuescolhido == ref64 || numtabuescolhido == ref65 || numtabuescolhido == ref66 ||
                                    numtabuescolhido == ref67 || numtabuescolhido == ref68 || numtabuescolhido == ref69 ||
                                    numtabuescolhido == ref70 || numtabuescolhido == ref71 || numtabuescolhido == ref9 ||
                                    numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref36 ||
                                    numtabuescolhido == ref45 || numtabuescolhido == ref54 || numtabuescolhido == ref63 ||
                                    numtabuescolhido == ref81 || numtabuescolhido == ref80 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref61 || numtabuescolhido == ref62) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 8, carta);
                                    ref72 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(7, 8, carta);
                                    ref72 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    //==========linha 9==========
                    case "9-1":
                            if (recebeu73 == 0) {
                                if (numtabuescolhido == ref74 || numtabuescolhido == ref75 || numtabuescolhido == ref76 ||
                                    numtabuescolhido == ref77 || numtabuescolhido == ref78 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref1  ||
                                    numtabuescolhido == ref10 || numtabuescolhido == ref19 || numtabuescolhido == ref28 ||
                                    numtabuescolhido == ref37 || numtabuescolhido == ref46 || numtabuescolhido == ref55 ||
                                    numtabuescolhido == ref64 || numtabuescolhido == ref56 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref65 || numtabuescolhido == ref66) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 0, carta);
                                    ref73 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 0, carta);
                                    ref73 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-2":
                            if (recebeu74 == 0) {
                                if (numtabuescolhido == ref73 || numtabuescolhido == ref75 || numtabuescolhido == ref76 ||
                                    numtabuescolhido == ref77 || numtabuescolhido == ref78 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref2 ||
                                    numtabuescolhido == ref11 || numtabuescolhido == ref20 || numtabuescolhido == ref29 ||
                                    numtabuescolhido == ref38 || numtabuescolhido == ref47 || numtabuescolhido == ref56 ||
                                    numtabuescolhido == ref65 || numtabuescolhido == ref55 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref64 || numtabuescolhido == ref66) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 1, carta);
                                    ref74 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 1, carta);
                                    ref74 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-3":
                            if (recebeu75 == 0) {
                                if (numtabuescolhido == ref74 || numtabuescolhido == ref73 || numtabuescolhido == ref76 ||
                                    numtabuescolhido == ref77 || numtabuescolhido == ref78 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref3 ||
                                    numtabuescolhido == ref12 || numtabuescolhido == ref21 || numtabuescolhido == ref30 ||
                                    numtabuescolhido == ref39 || numtabuescolhido == ref48 || numtabuescolhido == ref57 ||
                                    numtabuescolhido == ref66 || numtabuescolhido == ref55 || numtabuescolhido == ref56 ||
                                    numtabuescolhido == ref65 || numtabuescolhido == ref64) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 2, carta);
                                    ref75 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 2, carta);
                                    ref75 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-4":
                            if (recebeu76 == 0) {
                                if (numtabuescolhido == ref74 || numtabuescolhido == ref75 || numtabuescolhido == ref73 ||
                                    numtabuescolhido == ref77 || numtabuescolhido == ref78 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref4 ||
                                    numtabuescolhido == ref13 || numtabuescolhido == ref22 || numtabuescolhido == ref31 ||
                                    numtabuescolhido == ref40 || numtabuescolhido == ref49 || numtabuescolhido == ref58 ||
                                    numtabuescolhido == ref67 || numtabuescolhido == ref68 || numtabuescolhido == ref69 ||
                                    numtabuescolhido == ref59 || numtabuescolhido == ref60) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 3, carta);
                                    ref76 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 3, carta);
                                    ref76 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-5":
                            if (recebeu77 == 0) {
                                if (numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                    numtabuescolhido == ref76 || numtabuescolhido == ref78 || numtabuescolhido == ref79 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref5 ||
                                    numtabuescolhido == ref14 || numtabuescolhido == ref23 || numtabuescolhido == ref32 ||
                                    numtabuescolhido == ref41 || numtabuescolhido == ref50 || numtabuescolhido == ref59 ||
                                    numtabuescolhido == ref68 || numtabuescolhido == ref58 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref67 || numtabuescolhido == ref69) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 4, carta);
                                    ref77 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 4, carta);
                                    ref77 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-6":
                            if (recebeu78 == 0) {
                                if (numtabuescolhido == ref74 || numtabuescolhido == ref75 || numtabuescolhido == ref76 ||
                                    numtabuescolhido == ref77 || numtabuescolhido == ref79 || numtabuescolhido == ref73 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref6 ||
                                    numtabuescolhido == ref15 || numtabuescolhido == ref24 || numtabuescolhido == ref33 ||
                                    numtabuescolhido == ref42 || numtabuescolhido == ref51 || numtabuescolhido == ref60 ||
                                    numtabuescolhido == ref69 || numtabuescolhido == ref68 || numtabuescolhido == ref67 ||
                                    numtabuescolhido == ref58 || numtabuescolhido == ref59) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 5, carta);
                                    ref78 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 5, carta);
                                    ref78 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;
                    case "9-7":
                            if (recebeu79 == 0) {
                                if (numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                    numtabuescolhido == ref76 || numtabuescolhido == ref77 || numtabuescolhido == ref78 ||
                                    numtabuescolhido == ref80 || numtabuescolhido == ref81 || numtabuescolhido == ref7 ||
                                    numtabuescolhido == ref16 || numtabuescolhido == ref25 || numtabuescolhido == ref34 ||
                                    numtabuescolhido == ref43 || numtabuescolhido == ref52 || numtabuescolhido == ref61 ||
                                    numtabuescolhido == ref70 || numtabuescolhido == ref71 || numtabuescolhido == ref72 ||
                                    numtabuescolhido == ref62 || numtabuescolhido == ref63) {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 6, carta);
                                    ref79 = numtabuescolhido;
                                } else {
                                    StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                    cartas carta = new cartas(corCarta);
                                    tabu.colocaCarta(8, 6, carta);
                                    ref79 = numtabuescolhido;
                                }
                            } else {
                            }
                    break;

                    case "9-8":
                        if (recebeu80 == 0) {
                            if (numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                numtabuescolhido == ref76 || numtabuescolhido == ref77 || numtabuescolhido == ref78 ||
                                numtabuescolhido == ref79 || numtabuescolhido == ref81 || numtabuescolhido == ref8 ||
                                numtabuescolhido == ref17 || numtabuescolhido == ref26 || numtabuescolhido == ref35 ||
                                numtabuescolhido == ref44 || numtabuescolhido == ref53 || numtabuescolhido == ref62 ||
                                numtabuescolhido == ref71 || numtabuescolhido == ref72 || numtabuescolhido == ref70 ||
                                numtabuescolhido == ref61 || numtabuescolhido == ref63) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(8, 7, carta);
                                ref80 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(8, 7, carta);
                                ref80 = numtabuescolhido;
                            }
                        } else {
                        }
                    break;


                    case "9-9":
                        if (recebeu81 == 0) {
                            if (numtabuescolhido == ref73 || numtabuescolhido == ref74 || numtabuescolhido == ref75 ||
                                numtabuescolhido == ref76 || numtabuescolhido == ref77 || numtabuescolhido == ref78 ||
                                numtabuescolhido == ref79 || numtabuescolhido == ref80 || numtabuescolhido == ref9 ||
                                numtabuescolhido == ref18 || numtabuescolhido == ref27 || numtabuescolhido == ref36 ||
                                numtabuescolhido == ref45 || numtabuescolhido == ref54 || numtabuescolhido == ref63 ||
                                numtabuescolhido == ref72 || numtabuescolhido == ref71 || numtabuescolhido == ref70 ||
                                numtabuescolhido == ref61 || numtabuescolhido == ref62) {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.VERMELHO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(8, 8, carta);
                                ref81 = numtabuescolhido;
                            } else {
                                StringColorida corCarta = new StringColorida("" + numtabu, Cor.PRETO, Cor.CIANO);
                                cartas carta = new cartas(corCarta);
                                tabu.colocaCarta(8, 8, carta);
                                ref81 = numtabuescolhido;
                            }
                        } 
                        
                       else {
                        }
                    break;
                    
                    default:
                    break;     
            }
        
            
            Console.limpaTela();
            Console.print(tabu);
            
            
        }
    }
}

