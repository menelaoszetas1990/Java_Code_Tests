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
public class Main {
    public static void main (String[] args) {
        int result;
        A_class a = new A_class();
        B_class b = new B_class();
        
        result = a.a("no _exception", 10);
        a.showThem("Test with Yes, starting with 10 and result = " , result);
        System.out.println("");
        
        result = a.a("first_exception", 10);
        a.showThem("Test with first_exception, starting with 10 and result = ", result);
        System.out.println("");
        
        result = a.a("second_exception", 10);
        a.showThem("Test with second_exception, starting with 10 and result = ", result);
        System.out.println("");
        
        System.out.println("With the parent All_Exceptions object \n");
        result = b.a("no _exception", 10);
        b.showThem("Test with Yes, starting with 10 and result = " , result);
        System.out.println("");
        
        result = b.a("first_exception", 10);
        b.showThem("Test with first_exception, starting with 10 and result = ", result);
        System.out.println("");
        
        result = b.a("second_exception", 10);
        b.showThem("Test with second_exception, starting with 10 and result = ", result);
        System.out.println("");
    }
}
