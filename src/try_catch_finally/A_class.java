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
public class A_class {
    public int a(String test, int x) {
        System.out.println("Try the test with " + test);
        
        try {
            doRisky(test);
            System.out.println("No exeption");
            x = x + 2;
            System.out.print("x + 2 = ");
            showThem(x);
        } catch (First_Exception f_ex) {
            System.out.println(f_ex);
            x = x - 2;
            System.out.print("x - 2 = ");
            showThem(x);
        } catch (Second_Exception s_ex) {
            System.out.println(s_ex);
            x = x - 4;
            System.out.print("x - 4 = ");
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
    
    static void doRisky(String test) throws First_Exception, Second_Exception {
        if ("first_exception".equals(test)) {
            throw new First_Exception();
        }
        
        if ("second_exception".equals(test)) {
            throw new Second_Exception();
        }
    }

    private static class First_Exception extends Exception {

        public First_Exception() {
            System.out.println("OMG FFS ERROR");
        }
    }

    private static class Second_Exception extends Exception {

        public Second_Exception() {
        }
    }
}

