package com.market.main.problem.a1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends JFrame {
	public MyWindow() {
		this.initConstructor();

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}

	public void initConstructor() {
		// 여러 컴포넌트
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);

		JPanel imagePanel = new JPanel();
		ImageIcon catIcon = new ImageIcon("./images/user.png");
		JLabel imageLabel = new JLabel(catIcon);
		imagePanel.setSize(100, 100);
		imageLabel.setSize(100, 100);
		imagePanel.add(imageLabel);
		mainPanel.add(imagePanel);
	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		new MyWindow();
	}
}
