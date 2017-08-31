/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch_finally;

/**
 *
 * @author menelaos
 */
public interface Error_class_B {
    class First_Exception extends All_Exceptions {
        public First_Exception() {}
    }
    
    class Second_Exception extends All_Exceptions {
        public Second_Exception() {
            System.out.println("Omg omg an error ??");
        }
    }
    
     class All_Exceptions extends Exception {
        public All_Exceptions() {}
    }
}
