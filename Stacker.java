/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacker;

import java.util.Stack;

/**
 *
 * @author mac
 */
public class Stacker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<String> stack = new Stack<>();
        stack.push("fly");
        stack.push("fworm");
        stack.push("butterfly");

        String peekResult = stack.peek();
        System.out.println(peekResult);

        String popResult = stack.pop();
        System.out.println(popResult);

    }

}
