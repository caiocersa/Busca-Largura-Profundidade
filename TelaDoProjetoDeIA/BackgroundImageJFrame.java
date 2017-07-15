package TelaDoProjetoDeIA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundImageJFrame extends JFrame
{
	JButton b1;
	static JLabel l1; 

		
		public static void direita(int xInicial, int xFinal) {
	
			Thread t1 = new Thread() {
				public void run() {
					for (int i = xInicial; i < xFinal; i++) {
						l1.setBounds(i,35,30,46);
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
						l1.setBounds(i,35,30,46);
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
	/*
		One way
		-----------------
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		background.add(l1);
		background.add(b1);
	*/
	// Another way
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
		l1.setBounds(130, 175, 30, 46);
		System.out.println("DIMENSAO: " + l1.getBounds());
		System.out.println("VALOR DE X: " + l1.getX());
		
		
		direita(30,130);
		//descer(35,175);
		//subir(175,35);
		setResizable(false); //Redimensiona a tela

		
		}
		
		public static void main(String args[])
		{
		new BackgroundImageJFrame();
		}
}