/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterandcomputermanufacturing;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Waterandcomputermanufacturing {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyedInput = new Scanner(System.in);
        
        
        //variables
        final double totalwater = 1.5;
        
        double wastewater;
        
        int all;
        
        System.out.println("How many do you have");
        
        System.out.println("");
        all = keyedInput.nextInt();
        
        wastewater = all * totalwater;
        System.out.println("You wasted "+wastewater+" tones of water!");
        
    }
    
}















































