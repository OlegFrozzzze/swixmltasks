package com.home.swixmlexamples;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = new JFrame();

        jFrame.add(Bar.generate());


        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(250,220);
        jFrame.setVisible(true);

//        new Foo();
    }
}
