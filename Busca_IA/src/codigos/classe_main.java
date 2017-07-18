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

        grafo.setComodos(new Comodo('A')); // 0
        grafo.setComodos(new Comodo('B')); // 1
        grafo.setComodos(new Comodo('C')); // 2
        grafo.setComodos(new Comodo('D')); // 3
        grafo.setComodos(new Comodo('E')); // 4
        grafo.setComodos(new Comodo('F')); // 5
        grafo.setComodos(new Comodo('G')); // 6
        grafo.setComodos(new Comodo('I')); // 7 
        grafo.setComodos(new Comodo('J')); // 8
        grafo.setComodos(new Comodo('L')); // 9
        grafo.setComodos(new Comodo('M')); // 10
        grafo.setComodos(new Comodo('N')); // 11
        grafo.setComodos(new Comodo('O')); // 12
        grafo.setComodos(new Comodo('P')); // 13
        grafo.setComodos(new Comodo('Q')); // 14
        grafo.setComodos(new Comodo('R')); // 15
        grafo.setComodos(new Comodo('S')); // 16
        grafo.setComodos(new Comodo('T')); // 17
        grafo.setComodos(new Comodo('U')); // 18
        grafo.setComodos(new Comodo('V')); // 19
        grafo.setComodos(new Comodo('X')); // 20
        grafo.setComodos(new Comodo('Z')); // 21
        grafo.setComodos(new Comodo('W')); // 22
        grafo.setComodos(new Comodo('Y')); // 23

        for (int x = 0; x < 24; x++) {
            System.out.print("[");
            for (int y = 0; y < 24; y++) {
                System.out.print(grafo.matriz[x][y] + " ");
            }
            System.out.println("]");
        }

        System.out.println("\n\n");
        for (int x = 0; x < 24; x++) {
            System.out.print(grafo.comodos[x].id + " ");
        }
        grafo.buscaEmLargura(22, 7);

        System.out.println("\n\n");
        System.out.println("Rota ate o objetivo:" + grafo.rota_objetivo);
       



    }

}
