/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author menelaos
 */
public class Main {
    public static void main (String[] arg) {
        A a = new B();
        // h f() edw tha einai apo to B class dioti exei ginei mesw tou extend
        // override ths f() thw A class
        a.f();
        
        // skaei dioti h g() einai mono gia Class B.
        // a.g();
    
        // skaei dioti to b prepei class kanei Extend to A class
        // B b = new A();
        
        B b = new B();
        b.f();
        b.g();
        // tha treksei giati exei kanei inherit th methodo c() apo to A class
        b.c();
    
    }
}
