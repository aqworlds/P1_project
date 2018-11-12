/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_2069817_2071517;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class P1_2069817_2071517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Infantry inf =  new Infantry(25, 75);
        inf.toString();
        
        int i = 0;
        while(i < 5){  // em vez de 10 é o valor introduzido pelo utilizador
            System.out.println(inf.attack());
            i++;
        }
    }
    
}
