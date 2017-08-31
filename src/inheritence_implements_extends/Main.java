/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence_implements_extends;

/**
 *
 * @author menelaos
 */
public class Main {
    
    public static void main (String[] args) {
        A_class a = new A_class();
        B_class b = new B_class();
        
        a.setLength(10);
        a.apotelesma();
        a.diplasiase();
        a.apotelesma();
        
        b.setLength(100);
        b.apotelesma();
        b.diplasiase();
        b.apotelesma();
        b.kantoMhden();
        b.apotelesma();
 
    }
}
