/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author Jadson
 */
public class Grafo_Comodo {
    int[][] matriz = new int[13][13];
    int[][] rota = new int[40][2];
    Comodo[] comodos = new Comodo[13];
    int indice;
    Queue fila;
    String caminho = "";
    ArrayList<Integer> array = new ArrayList();
    
    public Grafo_Comodo(){
        for (int x = 0; x < 13; x++)
            for (int y = 0; y < 13; y++){
                matriz[x][y] = 0;
            }
        
        for (int x = 0; x < 40; x++)
            for (int y = 0; y < 2; y++){
                rota[x][y] = -1;
            }
        
        indice = 0;
    
        matriz[0][1] = 1;
        matriz[0][2] = 1;
        
        matriz[1][0] = 1;
        matriz[1][3] = 1;
        matriz[1][12] = 1;
        
        matriz[2][0] = 1;
        matriz[2][10] = 1;
        
        matriz[3][1] = 1;
        matriz[3][4] = 1;
        matriz[3][5] = 1;
        matriz[3][6] = 1;
        
        matriz[4][3] = 1;
        
        matriz[5][3] = 1;
        
        matriz[6][3] = 1;
        matriz[6][7] = 1;
        matriz[6][9] = 1;
        
        matriz[7][6] = 1;
        matriz[7][8] = 1;
        matriz[7][11] = 1;
        
        matriz[8][7] = 1;
        
        matriz[9][6] = 1;
        
        matriz[10][2] = 1;
        
        matriz[11][7] = 1;
        
        matriz[12][1] = 1;
    
    }
    
    public void setComodos(Comodo comodo){
        comodos[indice] = comodo;
        indice++;
    }

    public int retornarNo(int indice){
        for (int x = 0; x < 13; x++)
            if (matriz[indice][x] != 0 && comodos[x].visitado == false)
                return x;
         return -1;   
    }
    
    public void buscaEmLargura(int estado_inicial, int estado_final){
        comodos[estado_inicial].visitado = true;
        caminho = caminho + estado_inicial;
        array.add(estado_inicial);
        int no;
        int linha = 0;
        int coluna = 0;
        int contador = 0;
        
        while(!array.isEmpty()){
            int v1 = array.get(0);
            array.remove(0);
         
            while ((no = retornarNo(v1)) != -1){
                array.add(no);
                caminho = caminho + no;
                comodos[no].visitado = true;
                rota[linha][coluna] = v1;
                coluna++;
                rota[linha][coluna] = no;
                linha++;
                contador++;
                if (coluna == 1)
                    coluna = 0;
            }
        }
        System.out.println("Caminho: " + caminho);
        
        System.out.println("\n\nEXPANSAO DOS NOS: ");
        for (int x = 0; x < contador; x++){
            System.out.print("[");
            for (int y = 0; y < 2; y++){
                System.out.print(rota[x][y] + " ");
            }
            System.out.println("]");
        }
        
        rotaprincipal(rota,estado_inicial,estado_final);
        
    }
    
   public void rotaprincipal(int matriz[][],int inicial, int objetivo) {
           ArrayList<Integer> pilha = new ArrayList();
       
	   
	   boolean encontrou = false;
	   
           int  linha = 0;
           
           while (matriz[linha][1] != objetivo){
                linha++;
           }
	   
           pilha.add(linha);
           int valor = matriz[linha][0];
           
           while (encontrou != true){
               if (valor == inicial)
                   encontrou = true;
               else {
                   while(matriz[linha][1] != valor)
                       linha--;
                   
                   pilha.add(linha);
                   valor = matriz[linha][0];
               }
           
           }
	   int tamanho = pilha.size();
           System.out.println("Tamanho: " + tamanho);
           int contador = 0;
           tamanho--;
           
	   while (tamanho >= 0) {
                System.out.println("\n\nROTA OBJETIVO: " + matriz[pilha.get(tamanho)][0] +
                                    " - " + matriz[pilha.get(tamanho)][1]);
                tamanho--;
           }
	   
   }
    
}
