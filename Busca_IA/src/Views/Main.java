/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import codigos.Comodo;
import codigos.Grafo_Comodo;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author caio_
 */
public class Main extends javax.swing.JFrame {

    char inicial;
    char objetivo;

    public Main() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProfundidade = new javax.swing.JButton();
        btnLargura = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        memoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLITZDRONE");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1123, 675));

        btnProfundidade.setText("Busca em Profundidade");
        btnProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfundidadeActionPerformed(evt);
            }
        });

        btnLargura.setText("Busca em Largura");
        btnLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarguraActionPerformed(evt);
            }
        });

        btnMatriz.setText("Visualizar Matriz");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        jLabel3.setText("Esquina Inicial:");

        jLabel4.setText("Esquina Objetivo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "W", "Y", "K", "Ç", "a", "b", "c" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "W", "Y", "K", "Ç", "a", "b", "c" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Uso de Memoria:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tempo de Execução:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Log de Expansão:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Quadro com Grafo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProfundidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLargura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memoria)))
                    .addComponent(jLabel2))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnProfundidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLargura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMatriz)))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(memoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tempo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        Grafo_Comodo grafo = new Grafo_Comodo();
        grafo.setComodos(new Comodo('A')); // 0
        grafo.setComodos(new Comodo('B')); // 1
        grafo.setComodos(new Comodo('C')); // 2
        grafo.setComodos(new Comodo('D')); // 3
        grafo.setComodos(new Comodo('E')); // 4
        grafo.setComodos(new Comodo('F')); // 5
        grafo.setComodos(new Comodo('G')); // 6
        grafo.setComodos(new Comodo('H')); // 7 
        grafo.setComodos(new Comodo('I')); // 8 
        grafo.setComodos(new Comodo('J')); // 9
        grafo.setComodos(new Comodo('L')); // 10
        grafo.setComodos(new Comodo('M')); // 11
        grafo.setComodos(new Comodo('N')); // 12
        grafo.setComodos(new Comodo('O')); // 13
        grafo.setComodos(new Comodo('P')); // 14
        grafo.setComodos(new Comodo('Q')); // 15
        grafo.setComodos(new Comodo('R')); // 16
        grafo.setComodos(new Comodo('S')); // 17
        grafo.setComodos(new Comodo('T')); // 18
        grafo.setComodos(new Comodo('U')); // 19
        grafo.setComodos(new Comodo('V')); // 20
        grafo.setComodos(new Comodo('X')); // 21
        grafo.setComodos(new Comodo('Z')); // 22
        grafo.setComodos(new Comodo('Y')); // 23
        grafo.setComodos(new Comodo('W')); // 24
        grafo.setComodos(new Comodo('K')); // 25
        grafo.setComodos(new Comodo('Ç')); // 26
        grafo.setComodos(new Comodo('a')); // 27
        grafo.setComodos(new Comodo('b')); // 28
        grafo.setComodos(new Comodo('c')); // 29
        char[] vet = new char[30];
        for (int x = 0; x <30;x++){
            vet[x] = grafo.retornaLetra(x);
        }
        
        Matriz mat = new Matriz(grafo.matriz, vet);
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void btnProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfundidadeActionPerformed
        String ob = (String) jComboBox2.getSelectedItem();
        String in = (String) jComboBox1.getSelectedItem();
        inicial = in.charAt(0);
        objetivo = ob.charAt(0);
        Grafo_Comodo grafo = new Grafo_Comodo();
        grafo.setComodos(new Comodo('A')); // 0
        grafo.setComodos(new Comodo('B')); // 1
        grafo.setComodos(new Comodo('C')); // 2
        grafo.setComodos(new Comodo('D')); // 3
        grafo.setComodos(new Comodo('E')); // 4
        grafo.setComodos(new Comodo('F')); // 5
        grafo.setComodos(new Comodo('G')); // 6
        grafo.setComodos(new Comodo('H')); // 7 
        grafo.setComodos(new Comodo('I')); // 8 
        grafo.setComodos(new Comodo('J')); // 9
        grafo.setComodos(new Comodo('L')); // 10
        grafo.setComodos(new Comodo('M')); // 11
        grafo.setComodos(new Comodo('N')); // 12
        grafo.setComodos(new Comodo('O')); // 13
        grafo.setComodos(new Comodo('P')); // 14
        grafo.setComodos(new Comodo('Q')); // 15
        grafo.setComodos(new Comodo('R')); // 16
        grafo.setComodos(new Comodo('S')); // 17
        grafo.setComodos(new Comodo('T')); // 18
        grafo.setComodos(new Comodo('U')); // 19
        grafo.setComodos(new Comodo('V')); // 20
        grafo.setComodos(new Comodo('X')); // 21
        grafo.setComodos(new Comodo('Z')); // 22
        grafo.setComodos(new Comodo('Y')); // 23
        grafo.setComodos(new Comodo('W')); // 24
        grafo.setComodos(new Comodo('K')); // 25
        grafo.setComodos(new Comodo('Ç')); // 26
        grafo.setComodos(new Comodo('a')); // 27
        grafo.setComodos(new Comodo('b')); // 28
        grafo.setComodos(new Comodo('c')); // 29

        Runtime rt = Runtime.getRuntime();
        int ini = grafo.retornaIndice(inicial);
        int end = grafo.retornaIndice(objetivo);
        long tempoInicial = System.nanoTime();
        long memini= rt.freeMemory();
        grafo.buscaEmProfundidade(ini, end);
        long memfim= rt.totalMemory();
        long tempoFinal = System.nanoTime();
        memoria.setText(Double.toString(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())+" Bytes");
        tempo.setText(Double.toString(tempoFinal - tempoInicial)+ " Nanosegundos");
        String teste = "";

        //LOG COMPLETO DE EXPANSÃO
        for (int x = 0; grafo.rota.length > x; x++) {

            for (int y = 0; y < 2; y++) {
                if (y == 0 && grafo.rota[x][y] != -1) {
                    teste += "[";
                }
                if (grafo.rota[x][y] != -1) {
                    teste += " " + grafo.retornaLetra(grafo.rota[x][y]) + " ";
                }
                if (y == 1 && grafo.rota[x][y] != -1) {
                    teste += "] \n";
                }

            }

        }
        jTextArea1.setText(teste);
        String[] resultado = grafo.rota_objetivo.split(";");
        int[][] rota_ob = new int[80][2];
        for (int x = 0; x < 80; x++) {
            for (int y = 0; y < 2; y++) {
                rota_ob[x][y] = -1;
            }
        }
        int y = 0;
        for (int x = 0; resultado.length > x; x++) {
            if (resultado.length > y) {
                rota_ob[x][0] = Integer.parseInt(resultado[y]);
                rota_ob[x][1] = Integer.parseInt(resultado[++y]);
                y++;
            }

        }

        //Animacao ani = new Animacao(ini, rota_ob);
    }//GEN-LAST:event_btnProfundidadeActionPerformed

    private void btnLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarguraActionPerformed
        String ob = (String) jComboBox2.getSelectedItem();
        String in = (String) jComboBox1.getSelectedItem();
        inicial = in.charAt(0);
        objetivo = ob.charAt(0);
        Grafo_Comodo grafo = new Grafo_Comodo();
        grafo.setComodos(new Comodo('A')); // 0
        grafo.setComodos(new Comodo('B')); // 1
        grafo.setComodos(new Comodo('C')); // 2
        grafo.setComodos(new Comodo('D')); // 3
        grafo.setComodos(new Comodo('E')); // 4
        grafo.setComodos(new Comodo('F')); // 5
        grafo.setComodos(new Comodo('G')); // 6
        grafo.setComodos(new Comodo('H')); // 7 
        grafo.setComodos(new Comodo('I')); // 8 
        grafo.setComodos(new Comodo('J')); // 9
        grafo.setComodos(new Comodo('L')); // 10
        grafo.setComodos(new Comodo('M')); // 11
        grafo.setComodos(new Comodo('N')); // 12
        grafo.setComodos(new Comodo('O')); // 13
        grafo.setComodos(new Comodo('P')); // 14
        grafo.setComodos(new Comodo('Q')); // 15
        grafo.setComodos(new Comodo('R')); // 16
        grafo.setComodos(new Comodo('S')); // 17
        grafo.setComodos(new Comodo('T')); // 18
        grafo.setComodos(new Comodo('U')); // 19
        grafo.setComodos(new Comodo('V')); // 20
        grafo.setComodos(new Comodo('X')); // 21
        grafo.setComodos(new Comodo('Z')); // 22
        grafo.setComodos(new Comodo('Y')); // 23
        grafo.setComodos(new Comodo('W')); // 24
        grafo.setComodos(new Comodo('K')); // 25
        grafo.setComodos(new Comodo('Ç')); // 26
        grafo.setComodos(new Comodo('a')); // 27
        grafo.setComodos(new Comodo('b')); // 28
        grafo.setComodos(new Comodo('c')); // 29

        Runtime rt = Runtime.getRuntime();
        int ini = grafo.retornaIndice(inicial);
        int end = grafo.retornaIndice(objetivo);
        long tempoInicial = System.nanoTime();
        long memini= rt.freeMemory();
        grafo.buscaEmLargura(ini, end);
        long memfim= rt.totalMemory();
        long tempoFinal = System.nanoTime();
        memoria.setText(Double.toString(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())+" Bytes");
        tempo.setText(Double.toString(tempoFinal - tempoInicial)+ " Nanosegundos");
        String teste = "";

        //LOG COMPLETO DE EXPANSÃO
        for (int x = 0; grafo.rota.length > x; x++) {

            for (int y = 0; y < 2; y++) {
                if (y == 0 && grafo.rota[x][y] != -1) {
                    teste += "[";
                }
                if (grafo.rota[x][y] != -1) {
                    teste += " " + grafo.retornaLetra(grafo.rota[x][y]) + " ";
                }
                if (y == 1 && grafo.rota[x][y] != -1) {
                    teste += "] \n";
                }

            }

        }
        jTextArea1.setText(teste);
        String[] resultado = grafo.rota_objetivo.split(";");
        int[][] rota_ob = new int[80][2];
        for (int x = 0; x < 80; x++) {
            for (int y = 0; y < 2; y++) {
                rota_ob[x][y] = -1;
            }
        }
        int y = 0;
        for (int x = 0; resultado.length > x; x++) {
            if (resultado.length > y) {
                rota_ob[x][0] = Integer.parseInt(resultado[y]);
                rota_ob[x][1] = Integer.parseInt(resultado[++y]);
                y++;
            }

        }

       // Animacao ani = new Animacao(ini, rota_ob);
    }//GEN-LAST:event_btnLarguraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLargura;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnProfundidade;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel memoria;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        this.setIconImage(new ImageIcon("imagens/icone.png").getImage());
    }
}
