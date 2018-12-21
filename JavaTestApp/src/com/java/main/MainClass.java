package com.java.main;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {

		JFrame obj = new JFrame();
		Gameplay game=new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
	}

}
