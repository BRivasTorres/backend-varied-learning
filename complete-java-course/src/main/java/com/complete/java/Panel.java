package com.complete.java;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(redPanel);
    }

}
