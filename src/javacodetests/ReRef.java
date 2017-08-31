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
public class ReRef {

    Duck d = new Duck();
    
    public void go() {
        System.out.println("1st initialization: " + d.toString());
        d = new Duck();
        System.out.println("2nd initialization: " + d.toString());
    }
    
}
