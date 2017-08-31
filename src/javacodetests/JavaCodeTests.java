/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodetests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author menelaos
 */
public class JavaCodeTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck a = new Duck();
        Book b = new Book();
//        a.bookSize = 10;
//        System.out.println("Start of book size of book a: " + a.bookSize);
//        b.bookSize = 100;
//        System.out.println("Start of book size of book b: " + b.bookSize);
//        a = b;
//        System.out.println("Book size of book a: " + a.bookSize);
//        System.out.println("Book size of book b: " + b.bookSize);
//        a.addPage();
//        b = a;
//        System.out.println("New book size of book a: " + a.bookSize);
//        System.out.println("New book size of book b: " + b.bookSize);
//        b.bookSize = 1;
//        System.out.println("Final book size of book a: " + a.bookSize);
//        System.out.println("Final book size of book b: " + b.bookSize);   
        if (a instanceof Object) {
            System.out.println("a is an object First check");
        }
        a = null;
        // to a menei ''type'' duck
        if (a instanceof Object) {
            System.out.println("a is an object");
        }
        // System.out.println("type of a:" + ((Object)a).getClass().getName());
    }
    
    public static class Book {
        int bookSize = 0;
        public int addPage() {
            return bookSize++;
        }
    }
    
}

