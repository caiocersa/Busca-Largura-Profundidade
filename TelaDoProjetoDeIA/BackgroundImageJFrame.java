package TelaDoProjetoDeIA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundImageJFrame extends JFrame
{
	JButton b1;
	static JLabel l1; 
		
		public static void funcao_transicao(int inicio, int destino) {
			Thread t1 = new Thread() {
				public void run() {
					try {
						if (inicio == 0 && destino == 1) {
							direita(30,130);
							Thread.sleep(1300);
							descer(35,175);
							Thread.sleep(1300);
							direita(130,175);
							Thread.sleep(1300);
						} else if (inicio == 1 && destino == 0) {
							esquerda(175,130);
							Thread.sleep(500);
							subir(175,35);
							Thread.sleep(1300);
							esquerda(130,30);
							Thread.sleep(1300);
						}
					} catch  (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}};
			t1.start();
		}
	
		
		public static void direita(int xInicial, int xFinal) {
	
			Thread t1 = new Thread() {
				public void run() {
					for (int i = xInicial; i < xFinal; i++) {
						l1.setBounds(i,l1.getY(),30,46);
						try{
							Thread.sleep(9);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}

					}
				}};
				t1.start();	
		}

		public static void esquerda(int xInicial, int xFinal) {
			
			Thread t1 = new Thread() {
				public void run() {
					for (int i = xInicial; i > xFinal; i--) {
						l1.setBounds(i,l1.getY(),30,46);
						try{
							Thread.sleep(9);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}

					}
				}};
				t1.start();	
		}
		
		
		public static void descer(int yInicial, int yFinal) {
			Thread t1 = new Thread() {
				public void run() {
					for (int i = yInicial; i < yFinal; i++) {
						l1.setBounds(l1.getX(),i,30,46);
						try{
							Thread.sleep(9);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}

					}
				}};
				t1.start();	
		}

		public static void subir(int yInicial, int yFinal) {
			Thread t1 = new Thread() {
				public void run() {
					for (int i = yInicial; i > yFinal; i--) {
						l1.setBounds(l1.getX(),i,30,46);
						try{
							Thread.sleep(9);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}

					}
				}};
				t1.start();	
		}

	
	
	
	public BackgroundImageJFrame()
		{
		setTitle("Background Color for JFrame");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("TelaDoProjetoDeIA/planta.png"))));
		setLayout(new FlowLayout());
		l1=new JLabel(new ImageIcon(ClassLoader.getSystemResource("TelaDoProjetoDeIA/roboOriginal.png")));
		b1=new JButton("I am a button");
		add(l1);
		add(b1);
		l1.setBounds(0, 0, 30, 46);
		System.out.println("DIMENSAO: " + l1.getBounds());
		// Just for refresh :) Not optional!
		setSize(570,418);
		setSize(580,430);
		setLayout(null);
		System.out.println("DIMENSAO: " + l1.getBounds());
		System.out.println("VALOR DE X: " + l1.getX());
		
		

		setResizable(false); //Redimensiona a tela

		l1.setBounds(170, 175, 30, 46);
		
		funcao_transicao(1,0);
		
		}
		
		public static void main(String args[])
		{
		new BackgroundImageJFrame();
		}
}