/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListMulti;

/**
 *
 * @author menelaos
 */
import java.util.*;
public class arraylistMultidimentional {
    public static void main (String[] args) {
    ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
    
    x.add(0, new ArrayList<String>());
    x.get(0).add(0, "zetas");
    x.get(0).add(1, "menelaos");

    x.add(1, new ArrayList<String>());
    x.get(1).add(0, "theodratou");
    x.get(1).add(1, "titika");
    
    showThem(x);
    
    x.get(1).set(0, "zeta");
    showThem(x);
    }
    
    private static void showThem(ArrayList<ArrayList<String>> x) {
        int y = 0;
        for (ArrayList<String> element: x) {
        
            for (String k: element) {
                System.out.println(k + " ");
            }
        
        System.out.println("");
        y++;
        }

    }
}
