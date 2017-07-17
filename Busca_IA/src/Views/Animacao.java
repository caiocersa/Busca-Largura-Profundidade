package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Animacao extends JFrame {

    JButton b1;
    static JLabel l1;

    public static void funcao_transicao(char atual, char pai, char destino, ArrayList caminho[]) {
        Thread t1 = new Thread() {
            public void run() {
                for (int x = 0; caminho.length > x; x++) {
                    try {
                        //Transições de A
                        if (atual == 'A' && pai == 'B') {
                            esquerda(35, 123); // temos que ter os valores de x e y de cada estado nesse vetor tipo caminho[x].atual.x e caminho[x].pai.x
                            Thread.sleep(1300);
                            
                        }
                        
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }

        };
    }

    public static void direita(int xInicial, int xFinal) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = xInicial; i < xFinal; i++) {
                    l1.setBounds(i, l1.getY(), 30, 46);
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
                    l1.setBounds(i, l1.getY(), 30, 46);
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
                    l1.setBounds(l1.getX(), i, 30, 46);
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
                    l1.setBounds(l1.getX(), i, 30, 46);
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

    public Animacao() {
        setTitle("Background Color for JFrame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

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
        char inicial = 'Y';

        // fim
        //Possicionando o aspirador de acordo com a sua inicial
        switch (inicial) {
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

        //funcao_transicao(1, 0);
    }

    public static void main(String args[]) {
        new Animacao();
    }
}
