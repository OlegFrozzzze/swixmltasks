package com.home.swixmlexamples;

import org.swixml.SwingEngine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Foo {

    public Foo() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
//        new SwingEn
        if (name.length() > 1) {
            new SwingEngine().render("MenuAdminSwiXml.xml").setVisible(true);
//        }
//        if (name == "admin") {
//            new SwingEngine().render("gui.xml").setVisible(true);
//        }else{
//            new SwingEngine().render("hello.xml").setVisible(true);
        }
    }
}
