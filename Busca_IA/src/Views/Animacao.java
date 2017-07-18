package Views;

import codigos.Grafo_Comodo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Animacao extends JFrame {

    JButton b1;
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
                            direita(35, 126); // temos que ter os valores de x e y de cada estado nesse vetor tipo caminho[x].atual.x e caminho[x].pai.x
                            Thread.sleep(1300);
                        }

                        //Transições de B
                        if (rota[x][0] == 1 && rota[x][1] == 0) {
                            esquerda(126, 35);
                            Thread.sleep(1300);
                        }

                        if (rota[x][0] == 1 && rota[x][1] == 2) {
                            descer(50, 131);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE C
                        if (rota[x][0] == 2 && rota[x][1] == 1) {
                            subir(131, 50);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 2 && rota[x][1] == 3) {
                            esquerda(126, 56);
                            Thread.sleep(1300);
                        }

                        if (rota[x][0] == 2 && rota[x][1] == 6) {
                            descer(131, 180);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE D
                        if (rota[x][0] == 3 && rota[x][1] == 2) {
                            direita(56, 126);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 3 && rota[x][1] == 4) {
                            descer(135, 220);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE E
                        if (rota[x][0] == 4 && rota[x][1] == 3) {
                            subir(220, 135);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 4 && rota[x][1] == 5) {
                            descer(220, 320);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE F
                        if (rota[x][0] == 5 && rota[x][1] == 4) {
                            subir(320, 220);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE G
                        if (rota[x][0] == 6 && rota[x][1] == 2) {
                            subir(180, 131);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 6 && rota[x][1] == 9) {
                            direita(126, 176);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 6 && rota[x][1] == 7) {
                            descer(180, 312);
                            Thread.sleep(1300);
                        }

                        // TRANSIÇÕES DE I
                        if (rota[x][0] == 7 && rota[x][1] == 6) {
                            subir(312, 180);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 7 && rota[x][1] == 8) {
                            direita(126, 178);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE J
                        if (rota[x][0] == 8 && rota[x][1] == 7) {
                            esquerda(178, 126);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 8 && rota[x][1] == 9) {
                            subir(312, 180);
                            Thread.sleep(1500);
                        }

                        //TRANSIÇÕES DE L
                        if (rota[x][0] == 9 && rota[x][1] == 6) {
                            esquerda(176, 126);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 9 && rota[x][1] == 8) {
                            descer(180, 312);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 9 && rota[x][1] == 10) {
                            direita(176, 285);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE M
                        if (rota[x][0] == 10 && rota[x][1] == 9) {
                            esquerda(285, 176);
                            Thread.sleep(1300);
                        }
                        if (rota[x][0] == 10 && rota[x][1] == 11) {

                        }
                        if (rota[x][0] == 10 && rota[x][1] == 13) {

                        }
                        if (rota[x][0] == 10 && rota[x][1] == 18) {
                            direita(285, 396);
                            Thread.sleep(1300);
                        }

                        //TRANSIÇÕES DE N
                        if (rota[x][0] == 11 && rota[x][1] == 12) {

                        }
                        if (rota[x][0] == 11 && rota[x][1] == 10) {

                        }

                        //TRANSIÇÕES DE O
                        if (rota[x][0] == 12 && rota[x][1] == 11) {

                        }

                        //TRANSIÇÕES DE P
                        if (rota[x][0] == 13 && rota[x][1] == 10) {

                        }

                        //TRANSIÇÕES DE Q
                        if (rota[x][0] == 14 && rota[x][1] == 15) {

                        }
                        if (rota[x][0] == 14 && rota[x][1] == 16) {

                        }

                        //TRANSIÇÕES DE R
                        if (rota[x][0] == 15 && rota[x][1] == 16) {

                        }
                        if (rota[x][0] == 15 && rota[x][1] == 14) {

                        }

                        //TRANSIÇÕES DE S
                        if (rota[x][0] == 16 && rota[x][1] == 15) {

                        }
                        if (rota[x][0] == 16 && rota[x][1] == 17) {

                        }

                        //TRANSIÇÕES DE T
                        if (rota[x][0] == 17 && rota[x][1] == 16) {

                        }
                        if (rota[x][0] == 17 && rota[x][1] == 14) {

                        }
                        if (rota[x][0] == 17 && rota[x][1] == 23) {

                        }
                        if (rota[x][0] == 17 && rota[x][1] == 18) {

                        }

                        //TRANSIÇÕES DE U
                        if (rota[x][0] == 18 && rota[x][1] == 17) {

                        }
                        if (rota[x][0] == 18 && rota[x][1] == 10) {
                           esquerda(396,285);
                           Thread.sleep(1300);
                        }
                        if (rota[x][0] == 18 && rota[x][1] == 19) {

                        }

                        //TRANSIÇÕES DE V
                        if (rota[x][0] == 19 && rota[x][1] == 18) {

                        }
                        if (rota[x][0] == 19 && rota[x][1] == 20) {

                        }

                        //TRANSIÇÕES DE X
                        if (rota[x][0] == 20 && rota[x][1] == 19) {

                        }
                        if (rota[x][0] == 20 && rota[x][1] == 21) {

                        }

                        //TRASIÇÕES DE Z
                        if (rota[x][0] == 21 && rota[x][1] == 19) {

                        }
                        if (rota[x][0] == 21 && rota[x][1] == 21) {

                        }

                        //TRANSIÇÕES DE Y
                        if (rota[x][0] == 23 && rota[x][1] == 17) {

                        }
                        if (rota[x][0] == 23 && rota[x][1] == 22) {

                        }

                        //TRANSIÇÕES DE W
                        if (rota[x][0] == 22 && rota[x][1] == 23) {

                        }

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

    public Animacao(int inicial, int[][] caminho) {
        setTitle("Background Color for JFrame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Grafo_Comodo n = new Grafo_Comodo();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/planta-mapeada.png"))));
        setLayout(new FlowLayout());
        l1 = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/roboOriginal.png")));
        b1 = new JButton("I am a button");
        add(l1);
        add(b1);
        l1.setBounds(0, 0, 30, 46);
        System.out.println("DIMENSAO: " + l1.getBounds());
        // Just for refresh :) Not optional!
        setSize(570, 418);
        setLayout(null);
        System.out.println("DIMENSAO: " + l1.getBounds());
        System.out.println("VALOR DE X: " + l1.getX());

        setResizable(false); //Redimensiona a tela

        // Receber os dados (inicial , final e vetor caminho) da VIEW PRINCIPAL
        char inicials = 'Y';

        // fim
        //Possicionando o aspirador de acordo com a sua inicial
        switch (n.retornaLetra(inicial)) {
            case 'A':
                l1.setBounds(35, 50, 31, 28);
                break;
            case 'B':
                l1.setBounds(126, 50, 31, 28);
                break;
            case 'C':
                l1.setBounds(126, 131, 31, 28);
                break;
            case 'D':
                l1.setBounds(56, 135, 31, 28);
                break;
            case 'E':
                l1.setBounds(56, 220, 31, 28);
                break;
            case 'F':
                l1.setBounds(56, 320, 31, 28);
                break;
            case 'G':
                l1.setBounds(126, 180, 31, 28);
                break;
            case 'I':
                l1.setBounds(126, 312, 31, 28);
                break;
            case 'J':
                l1.setBounds(178, 312, 31, 28);
                break;
            case 'L':
                l1.setBounds(176, 180, 31, 28);
                break;
            case 'M':
                l1.setBounds(285, 180, 31, 28);
                break;
            case 'N':
                l1.setBounds(291, 225, 31, 28);
                break;
            case 'O':
                l1.setBounds(298, 287, 31, 28);
                break;
            case 'P':
                l1.setBounds(283, 87, 31, 28);
                break;
            case 'Q':
                l1.setBounds(350, 105, 31, 28);
                break;
            case 'R':
                l1.setBounds(350, 62, 31, 28);
                break;
            case 'S':
                l1.setBounds(398, 62, 31, 28);
                break;
            case 'T':
                l1.setBounds(396, 136, 31, 28);
                break;
            case 'U':
                l1.setBounds(396, 180, 31, 28);
                break;
            case 'V':
                l1.setBounds(398, 245, 31, 28);
                break;
            case 'X':
                l1.setBounds(415, 299, 31, 28);
                break;
            case 'Z':
                l1.setBounds(483, 299, 31, 28);
                break;
            case 'W':
                l1.setBounds(465, 176, 31, 28);
                break;
            case 'Y':
                l1.setBounds(465, 137, 31, 28);
                break;
            default:
                System.out.println("Letra invalida!");

        }

        funcao_transicao(caminho);
    }

}
