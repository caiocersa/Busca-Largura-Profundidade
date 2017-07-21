/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Matriz extends JFrame {

    public JPanel panel;
    public JLabel[][] matriz;

    public Matriz(int[][] mat, char[] vet) {
        this.setSize(600, 600);

        this.setLayout(new BorderLayout());
        matriz = new JLabel[30][30];
        panel = new JPanel();
        panel.setLayout(new GridLayout(30, 30));


        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                JLabel l = new JLabel(String.valueOf(mat[i][j]));
                l.setHorizontalAlignment(JLabel.CENTER);
                matriz[i][j] = l;
                panel.add(matriz[i][j]);
            }
        }


        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void componentes(int[][] mat) {

    }
}
