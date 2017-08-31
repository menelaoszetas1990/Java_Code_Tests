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
public class TextBox {
   // Will thow NullPointerException because wrapped variables do not get a 
   // default value
   Integer i;  
   int j;
   public static void main (String[] args) {
       TextBox t = new TextBox();
       t.go();   
   } 
   public void go() {  
       j=i;
       System.out.println(j); 
       System.out.println(i);   
   }
}
