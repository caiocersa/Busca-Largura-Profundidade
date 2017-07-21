package codigos;

import java.util.ArrayList;
import java.util.Queue;

public class Grafo_Comodo {

    int[][] matriz = new int[24][24]; // MATRIZ DO PROBLEMA
    public int[][] rota = new int[40][2];  // MENOR CAMINHO DO PONTO INICIAL PARA O PONTO OBJETIVO
    Comodo[] comodos = new Comodo[24]; // ESTADOS DO MEU PROBLEMA 23 PQ COMEÇA DO 0
    public String rota_objetivo = "";
    int indice;
    Queue fila;
    String caminho = "";
    ArrayList<Integer> array = new ArrayList();

    public Grafo_Comodo() {
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 24; y++) {
                matriz[x][y] = 0;
            }
        }

        for (int x = 0; x < 40; x++) {
            for (int y = 0; y < 2; y++) {
                rota[x][y] = -1;
            }
        }

        indice = 0;
        //CAMINHOS DE A
        matriz[0][1] = 1;

        //CAMINHOS DE B
        matriz[1][0] = 1;
        matriz[1][2] = 1;

        //CAMINHOS DE C
        matriz[2][1] = 1;
        matriz[2][3] = 1;
        matriz[2][6] = 1;

        //CAMINHOS DE D
        matriz[3][2] = 1;
        matriz[3][4] = 1;

        //CAMINHOS DE E
        matriz[4][3] = 1;
        matriz[4][5] = 1;

        //CAMINHOS DE F
        matriz[5][4] = 1;

        //CAMINHOS DE G
        matriz[6][2] = 1;
        matriz[6][9] = 1;
        matriz[6][7] = 1;

        //CAMINHOS DE I
        matriz[7][6] = 1;
        matriz[7][8] = 1;

        //CAMINHOS DE J
        matriz[8][7] = 1;
        matriz[8][9] = 1;

        //CAMINHOS DE L
        matriz[9][6] = 1;
        matriz[9][8] = 1;
        matriz[9][10] = 1;

        //CAMINHOS DE M
        matriz[10][9] = 1;
        matriz[10][13] = 1;
        matriz[10][11] = 1;
        matriz[10][18] = 1;

        //CAMINHOS DE N
        matriz[11][10] = 1;
        matriz[11][12] = 1;

        //CAMINHOS DE O
        matriz[12][11] = 1;

        //CAMINHOS DE P
        matriz[13][10] = 1;

        //CAMINHOS DE Q
        matriz[14][15] = 1;
        matriz[14][17] = 1;

        //CAMINHOS DE R
        matriz[15][14] = 1;
        matriz[15][16] = 1;

        //CAMINHOS DE S
        matriz[16][15] = 1;
        matriz[16][17] = 1;

        //CAMINHOS DE T
        matriz[17][14] = 1;
        matriz[17][18] = 1;
        matriz[17][16] = 1;
        matriz[17][23] = 1;

        //CAMINHOS DE U
        matriz[18][17] = 1;
        matriz[18][10] = 1;
        matriz[18][19] = 1;

        //CAMINHOS DE V
        matriz[19][18] = 1;
        matriz[19][20] = 1;

        //CAMINHOS DE X
        matriz[20][19] = 1;
        matriz[20][21] = 1;

        //CAMINHOS DE Z
        matriz[21][20] = 1;

        //CAMINHOS DE W
        matriz[22][23] = 1;

        //CAMINHOS DE Y
        matriz[23][22] = 1;
        matriz[23][17] = 1;

    }

    public void setComodos(Comodo comodo) {
        comodos[indice] = comodo;
        indice++;
    }

    public int retornarNo(int indice) {
        for (int x = 0; x < 24; x++) {
            if (matriz[indice][x] != 0 && comodos[x].visitado == false) {
                return x;
            }
        }
        return -1;
    }

    public void buscaEmLargura(int estado_inicial, int estado_final) {
        comodos[estado_inicial].visitado = true;
        caminho = caminho + estado_inicial;
        array.add(estado_inicial);
        int no;
        int linha = 0;
        int coluna = 0;
        int contador = 0;

        while (!array.isEmpty()) {
            int v1 = array.get(0);
            array.remove(0);
;
            while ((no = retornarNo(v1)) != -1) {
                caminho = caminho + no;
                comodos[no].visitado = true;
                rota[linha][coluna] = v1;
                coluna++;
                rota[linha][coluna] = no;
                linha++;
                contador++;
                if (coluna == 1) {
                    coluna = 0;
                }
                if (no != estado_final)
                    array.add(no);
                
            }
        }
        System.out.println("Caminho: " + caminho);

        System.out.println("\n\nEXPANSAO DOS NOS: ");
        for (int x = 0; x < contador; x++) {
            System.out.print("[");
            for (int y = 0; y < 2; y++) {
                System.out.print(rota[x][y] + " ");
            }
            System.out.println("]");
        }

        rotaprincipal(rota, estado_inicial, estado_final);

    }

    public void rotaprincipal(int matriz[][], int inicial, int objetivo) {
        ArrayList<Integer> pilha = new ArrayList();

        boolean encontrou = false;

        int linha = 0;

        while (matriz[linha][1] != objetivo) {
            linha++;
        }

        pilha.add(linha);
        int valor = matriz[linha][0];

        while (encontrou != true) {
            if (valor == inicial) {
                encontrou = true;
            } else {
                while (matriz[linha][1] != valor) {
                    linha--;
                }

                pilha.add(linha);
                valor = matriz[linha][0];
            }

        }
        int tamanho = pilha.size();
        System.out.println("Tamanho: " + tamanho);
        int contador = 0;
        tamanho--;

        while (tamanho >= 0) {
            rota_objetivo += matriz[pilha.get(tamanho)][0] + ";" + matriz[pilha.get(tamanho)][1] + ";";
            tamanho--;
        }

    }

    public int retornaIndice(char comodo) {
        switch (comodo) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            case 'L':
                return 10;
            case 'M':
                return 11;
            case 'N':
                return 12;
            case 'O':
                return 13;
            case 'P':
                return 14;
            case 'Q':
                return 15;
            case 'R':
                return 16;
            case 'S':
                return 17;
            case 'T':
                return 18;
            case 'U':
                return 19;
            case 'V':
                return 20;
            case 'X':
                return 21;
            case 'Z':
                return 22;
            case 'Y':
                return 23;
            case 'W':
                return 24;
            case 'K':
                return 25;
            case 'a':
                return 26;
            case 'b':
                return 27;
            case 'c':
                return 28;

            default:
                return -1;
        }
    }

    public static char retornaLetra(int comodo) {
        switch (comodo) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            case 7:
                return 'H';
            case 8:
                return 'I';
            case 9:
                return 'J';
            case 10:
                return 'L';
            case 11:
                return 'M';
            case 12:
                return 'N';
            case 13:
                return 'O';
            case 14:
                return 'P';
            case 15:
                return 'Q';
            case 16:
                return 'R';
            case 17:
                return 'S';
            case 18:
                return 'T';
            case 19:
                return 'U';
            case 20:
                return 'V';
            case 21:
                return 'X';
            case 22:
                return 'Z';
            case 23:
                return 'Y';
            case 24:
                return 'W';
            case 25:
                return 'K';
            case 26:
                return 'a';
            case 27:
                return 'b';
            case 28:
                return 'c';

            default:
                return 'h';
        }
    }
    

    public void buscaEmProfundidade(int estado_inicial, int estado_final) {

        comodos[estado_inicial].visitado = true;
        int ponteiro = estado_inicial, linha = 0, coluna = 0;
        caminho = caminho + estado_inicial;

        ArrayList<Comodo> lista = new ArrayList();
        Comodo comodo = comodos[estado_inicial];
        lista.add(comodo);

        while (!lista.isEmpty()) {

            int filho = retornarNo(ponteiro);

            if (filho == -1) {
                Comodo comodo_remove = comodos[ponteiro];
                lista.remove(comodo_remove);
                int tamanho = lista.size();
                tamanho = tamanho - 1;

                if (tamanho >= 0) {
                    char label = lista.get(tamanho).getId();
                    ponteiro = retornaIndice(label);
                }
            } else {
                caminho = caminho + filho;
                comodos[filho].visitado = true;
                comodo = comodos[filho];

                lista.add(comodo);

                rota[linha][coluna] = ponteiro;
                rota[linha][++coluna] = filho;
                linha++;

                if (coluna == 1) {
                    coluna = 0;
                }

                ponteiro = filho;
            }
        }
        rotaprincipal(rota, estado_inicial, estado_final);
    }

}
