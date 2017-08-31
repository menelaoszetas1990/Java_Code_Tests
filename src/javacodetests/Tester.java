/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodetests;

/**
 *
 * @author menelaos
 */
public class Tester {
    public static void main (String[] arg) {
        ReRef a = new ReRef();
        a.d.size = 25;
        System.out.println("\n1st a size: " + a.d.size);
        a.go();
        System.out.println("2nd a size: " + a.d.size + "\n");
        System.out.println("What a is 1st: " + a.toString());
        System.out.println("What is a.d: " + a.d.toString() + " size " + a.d.size);
        
        int c = 150;
        double b = 8.567;
        double x = Math.max(c, b);
        System.out.println("max is: " + x);
        System.out.println("type of c:" + ((Object)c).getClass().getName());
        System.out.println("type of b:" + ((Object)b).getClass().getName());
        System.out.println("type of x:" + ((Object)x).getClass().getName());
    }
}
