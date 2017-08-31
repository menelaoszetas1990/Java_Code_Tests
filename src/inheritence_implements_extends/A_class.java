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
public class A_class implements C_interface {
    
    int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength () {
        return length;
    }
    
    public void apotelesma() {
        System.out.println("megethos: " + length);
    }
        
    public void diplasiase () {
        length = length * 2;
    }
}
