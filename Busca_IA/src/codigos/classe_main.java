/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.Stack;

/**
 *
 * @author Jadson
 */
public class classe_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Grafo_Comodo grafo = new Grafo_Comodo();
        
        grafo.setComodos(new Comodo('A'));
        grafo.setComodos(new Comodo('B'));
        grafo.setComodos(new Comodo('C'));
        grafo.setComodos(new Comodo('D'));
        grafo.setComodos(new Comodo('E'));
        grafo.setComodos(new Comodo('F'));
        grafo.setComodos(new Comodo('G'));
        grafo.setComodos(new Comodo('H'));
        grafo.setComodos(new Comodo('I'));
        grafo.setComodos(new Comodo('J'));
        grafo.setComodos(new Comodo('L'));
        grafo.setComodos(new Comodo('M'));
        grafo.setComodos(new Comodo('N'));
        
        for (int x = 0; x < 13; x++){
            System.out.print("[");
            for (int y = 0; y < 13; y++){
                System.out.print(grafo.matriz[x][y] + " ");
            }
            System.out.println("]");
        }
           
        System.out.println("\n\n");
        for (int x = 0; x < 13; x++){
            System.out.print(grafo.comodos[x].id + " ");
        }
        grafo.buscaEmLargura(0, 12);
        System.out.println("\n\n");
        System.out.println("Caminho: " + grafo.caminho);
    }
    
}
