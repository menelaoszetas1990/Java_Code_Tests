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
public class B_class implements Error_class_B {
    public int a(String test, int x) {
        System.out.println("Try the test with " + test);
        
        try {
            doRisky(test);
            System.out.println("No exeption");
            x = x + 2;
            System.out.print("x + 2 = ");
            showThem(x);
        } catch (Exception ex) {
            System.out.println(ex);
            x = x - 2;
            System.out.print("x - 2 = ");
            showThem(x);
        } finally {
            System.out.println("finally");
            System.out.print("x = ");
            showThem(x);
            return x;
        }        
    }
    
    public void showThem(int x) {
        System.out.println(x);
    }
    
    public void showThem(String text, int x) {
        System.out.println(text + " " + x);
    }
    
    static void doRisky(String test) throws All_Exceptions {
        if ("first_exception".equals(test)) {
            throw new First_Exception();
        }
        
        if ("second_exception".equals(test)) {
            throw new Second_Exception();
        }
    }

}

