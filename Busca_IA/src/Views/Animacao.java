/*
 * UNIVERSIDADE FEDERAL DE SERGIPE
 * Alunos: Caio Alves e Jadson Ribeiro
 * Matéria: Inteligência Artificial
 * Prof.: Dr. Alcides Xavier Benicasa
 * Obs.: Código referente ao Projeto I da disciplina em questão
 */

package Views;

import codigos.Grafo_Comodo;
import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;

class Animacao extends JFrame {

    static JLabel l1;

    public Animacao() {

    }

    public static void funcao_transicao(int[][] rota) {
        Thread t1 = new Thread() {
            public void run() {
                for (int x = 0; rota.length > x; x++) {
                    try {
                        //Transições de A
                        if (rota[x][0] == 0 && rota[x][1] == 1) {
                            descer(3, 125); 
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 0 && rota[x][1] == 9){
                            direita(1,209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 1 && rota[x][1] == 0) { //Transições de B
                            subir(125, 3);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 1 && rota[x][1] == 2) {
                            descer(125, 247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 1 && rota[x][1] == 8) {
                            direita(1, 209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 2 && rota[x][1] == 1) { //TRANSIÇÕES DE C
                            subir(247, 125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 2 && rota[x][1] == 3) {
                            descer(247, 362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 2 && rota[x][1] == 7) {
                            direita(1, 209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 3 && rota[x][1] == 2) { //TRANSIÇÕES DE D
                            subir(362, 247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 3 && rota[x][1] == 4) {
                            descer(362, 482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 3 && rota[x][1] == 6) {
                            direita(1, 209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 4 && rota[x][1] == 3) { //TRANSIÇÕES DE E
                            subir(482, 362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 4 && rota[x][1] == 5) {
                            direita(1, 209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 5 && rota[x][1] == 4) { //TRANSIÇÕES DE F
                            esquerda(209, 1);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 5 && rota[x][1] == 6) {
                            subir(482, 362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 5 && rota[x][1] == 14) {
                            direita(209, 441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 6 && rota[x][1] == 3) { //TRANSIÇÕES DE G
                            esquerda(209, 1);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 6 && rota[x][1] == 5) {
                            descer(362, 482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 6 && rota[x][1] == 7) {
                            subir(362, 247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 6 && rota[x][1] == 13) {
                            direita(209, 441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 7 && rota[x][1] == 2) { //TRANSIÇÕES DE H
                            esquerda(209, 1);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 7 && rota[x][1] == 6) {
                            descer(247, 362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 7 && rota[x][1] == 8) {
                            subir(247, 125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 7 && rota[x][1] == 12) {
                            direita(209, 441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 8 && rota[x][1] == 1) { //TRANSIÇÕES DE I
                            esquerda(209, 1);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 8 && rota[x][1] == 7) {
                            descer(125, 247);
                            Thread.sleep(1000);
                        } else if (rota[x][0] == 8 && rota[x][1] == 9) {
                            subir(125, 3);
                            Thread.sleep(1000);
                        } else if (rota[x][0] == 8 && rota[x][1] == 11) {
                            direita(209, 441);
                            Thread.sleep(1000);
                        } else if (rota[x][0] == 9 && rota[x][1] == 0) { //TRANSIÇÕES DE J
                            esquerda(209, 1);
                            
                        } else if (rota[x][0] == 9 && rota[x][1] == 8) {
                            descer(3, 125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 9 && rota[x][1] == 10) {
                            direita(209, 441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 10 && rota[x][1] == 9) { //TRANSIÇÕES DE L
                            esquerda(441, 209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 10 && rota[x][1] == 11) {
                            descer(3,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 10 && rota[x][1] == 19) {
                            direita(441,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 11 && rota[x][1] == 8) { //TRANSIÇÕES DE M
                            esquerda(441,209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 11 && rota[x][1] == 10) {
                            subir(125,3);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 11 && rota[x][1] == 12) {
                            descer(125,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 11 && rota[x][1] == 18) {
                            direita(441,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 12 && rota[x][1] == 7) { //TRANSIÇÕES DE N
                            esquerda(441,209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 12 && rota[x][1] == 11) {
                            subir(247,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 12 && rota[x][1] == 13) {
                            descer(247,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 12 && rota[x][1] == 17) {
                            direita(441,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 13 && rota[x][1] == 6) { //TRANSIÇÕES DE O
                            esquerda(441,209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 13 && rota[x][1] == 12) {
                            subir(362,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 13 && rota[x][1] == 14) {
                            descer(362,482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 13 && rota[x][1] == 16) {
                            direita(441,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 14 && rota[x][1] == 5) { //TRANSIÇÕES DE P
                            esquerda(441,209);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 14 && rota[x][1] == 13) {
                            subir(482,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 14 && rota[x][1] == 15) {
                            direita(441,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 15 && rota[x][1] == 14) { //TRANSIÇÕES DE Q
                            esquerda(661,441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 15 && rota[x][1] == 16) {
                            subir(482,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 15 && rota[x][1] == 24) {
                            direita(661,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 16 && rota[x][1] == 13) { //TRANSIÇÕES DE R
                            esquerda(661,441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 16 && rota[x][1] == 15) {
                            descer(362,482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 16 && rota[x][1] == 17) {
                            subir(362,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 16 && rota[x][1] == 23) {
                            direita(661,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 17 && rota[x][1] == 12) { //TRANSIÇÕES DE S
                            esquerda(661,441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 17 && rota[x][1] == 16) {
                            descer(247,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 17 && rota[x][1] == 18) {
                            subir(247,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 17 && rota[x][1] == 22) {
                            direita(661,885);
                            
                            Thread.sleep(1000);
                        } else if (rota[x][0] == 18 && rota[x][1] == 11) { //TRANSIÇÕES DE T
                            esquerda(661,441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 18 && rota[x][1] == 17) {
                           descer(125,247);
                           Thread.sleep(1000);
                           
                        } else if (rota[x][0] == 18 && rota[x][1] == 19) {
                            subir(125,3);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 18 && rota[x][1] == 21) {
                            direita(661,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 19 && rota[x][1] == 10) { //TRANSIÇÕES DE U
                            esquerda(661,441);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 19 && rota[x][1] == 18) {
                            descer(3,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 19 && rota[x][1] == 20) {
                            direita(661,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 20 && rota[x][1] == 19) { //TRANSIÇÕES DE V
                            esquerda(885,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 20 && rota[x][1] == 21) {
                            descer(3,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 20 && rota[x][1] == 29) {
                            direita(885,1060);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 21 && rota[x][1] == 18) { //TRANSIÇÕES DE X
                            esquerda(885,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 21 && rota[x][1] == 20) {
                            subir(125,3);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 21 && rota[x][1] == 22) {
                            descer(125,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 21 && rota[x][1] == 28) {
                            direita(885,1060);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 22 && rota[x][1] == 17) { //TRANSIÇÕES DE Z
                            esquerda(885,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 22 && rota[x][1] == 21) {
                            subir(247,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 22 && rota[x][1] == 23) {
                            descer(247,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 22 && rota[x][1] == 27) {
                            direita(885,1060);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 23 && rota[x][1] == 16) { //TRANSIÇÕES DE Y
                            esquerda(885,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 23 && rota[x][1] == 22) {
                            subir(362,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 23 && rota[x][1] == 24) {
                            descer(362,482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 23 && rota[x][1] == 26) {
                            direita(885,1060);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 24 && rota[x][1] == 15) { //TRANSIÇÕES DE W
                            esquerda(885,661);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 24 && rota[x][1] == 23) {
                            subir(482,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 24 && rota[x][1] == 25) {
                            direita(885,1060);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 25 && rota[x][1] == 24) { //TRANSIÇÕES DE K
                            esquerda(1060,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 25 && rota[x][1] == 26) {
                            subir(482,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 26 && rota[x][1] == 23) { //TRANSIÇÕES DE Ç
                            esquerda(1060,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 26 && rota[x][1] == 25) {
                            descer(362,482);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 26 && rota[x][1] == 27) {
                            subir(362,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 27 && rota[x][1] == 22) { //TRANSIÇÕES DE a
                            esquerda(1060,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 27 && rota[x][1] == 26) {
                            descer(247,362);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 27 && rota[x][1] == 28) {
                            subir(247,125);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 28 && rota[x][1] == 21) { //TRANSIÇÕES DE b
                            esquerda(1060,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 28 && rota[x][1] == 27) {
                            descer(125,247);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 28 && rota[x][1] == 29) {
                            subir(125,3);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 29 && rota[x][1] == 20) { //TRANSIÇÕES DE c
                            esquerda(1060,885);
                            Thread.sleep(1000);
                            
                        } else if (rota[x][0] == 29 && rota[x][1] == 28) {
                            descer(3,125);
                            Thread.sleep(1000);
                            
                        }
                        Thread.sleep(1300);
                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        };
        t1.start();
    }

    public static void direita(int xInicial, int xFinal) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = xInicial; i < xFinal; i++) {
                    l1.setBounds(i, l1.getY(), 31, 28);
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        };
        t1.start();
    }

    public static void esquerda(int xInicial, int xFinal) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = xInicial; i > xFinal; i--) {
                    l1.setBounds(i, l1.getY(), 31, 28);
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        };
        t1.start();
    }

    public static void descer(int yInicial, int yFinal) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = yInicial; i < yFinal; i++) {
                    l1.setBounds(l1.getX(), i, 31, 28);
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        };
        t1.start();
    }

    public static void subir(int yInicial, int yFinal) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = yInicial; i > yFinal; i--) {
                    l1.setBounds(l1.getX(), i, 31, 28);
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        };
        t1.start();
    }

    
    public Animacao(int inicial, int[][] rota) {
        setTitle("BLITZ DRONE");
        setSize(1101, 517);
        setLocationRelativeTo(null);
        setVisible(true);
        Grafo_Comodo n = new Grafo_Comodo();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/mapa.png"))));
        setLayout(new FlowLayout());
        l1 = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/drone.png")));
        add(l1);
        setSize(1101, 544);
        setLayout(null);
        setResizable(false); //Redimensiona a tela

        // Receber os dados (inicial , final e vetor caminho) da VIEW PRINCIPAL
        char inicials = 'Y';
        // fim
        //Possicionando o drone de acordo com a sua inicial
        switch (n.retornaLetra(inicial)) {
            case 'A': //0
                l1.setBounds(1, 3, 31, 28);
                break;
            case 'B': //1
                l1.setBounds(1, 125, 31, 28);
                break;
            case 'C': //2
                l1.setBounds(1, 247, 31, 28);
                break;
            case 'D': //3
                l1.setBounds(1, 362, 31, 28);
                break;
            case 'E': //4
                l1.setBounds(1, 482, 31, 28);
                break;
            case 'F': //5
                l1.setBounds(209, 482, 31, 28);
                break;
            case 'G': //6
                l1.setBounds(209, 362, 31, 28);
                break;
            case 'H': //7
                l1.setBounds(209, 247, 31, 28);
                break;
            case 'I': //8
                l1.setBounds(209, 125, 31, 28);
                break;
            case 'J': //9
                l1.setBounds(209, 3, 31, 28);
                break;
            case 'L': //10
                l1.setBounds(441, 3, 31, 28);
                break;
            case 'M': //11
                l1.setBounds(441, 125, 31, 28);
                break;
            case 'N': //12
                l1.setBounds(441, 247, 31, 28);
                break;
            case 'O': //13
                l1.setBounds(441, 362, 31, 28);
                break;
            case 'P': //14
                l1.setBounds(441, 482, 31, 28);
                break;
            case 'Q': //15
                l1.setBounds(661, 482, 31, 28);
                break;
            case 'R': //16
                l1.setBounds(661, 362, 31, 28);
                break;
            case 'S': //17
                l1.setBounds(661, 247, 31, 28);
                break;
            case 'T': //18
                l1.setBounds(661, 125, 31, 28);
                break;
            case 'U': //19
                l1.setBounds(661, 3, 31, 28);
                break;
            case 'V': //20
                l1.setBounds(885, 3, 31, 28);
                break;
            case 'X': //21
                l1.setBounds(885, 125, 31, 28);
                break;
            case 'Z': //22
                l1.setBounds(885, 247, 31, 28);
                break;
            case 'Y': //23
                l1.setBounds(885, 362, 31, 28);
                break;
            case 'W': //24
                l1.setBounds(885, 482, 31, 28);
                break;
            case 'K': //25
                l1.setBounds(1060, 482, 31, 28);
                break;
            case 'Ç': //26
                l1.setBounds(1060, 362, 31, 28);
                break;
            case 'a': //27
                l1.setBounds(1060, 247, 31, 28);
                break;
            case 'b': //28
                l1.setBounds(1060, 125, 31, 28);
            break;
            case 'c': //29
                l1.setBounds(1060, 3, 31, 28);
                break;
            default:
                System.out.println("Letra invalida!");
        }
    funcao_transicao(rota);
    }
}
