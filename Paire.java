/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo;

import java.util.Scanner;

/**
 *
 * @author Finest
 */
public class Paire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("entree un nombre");
    Scanner scan= new Scanner(System.in);
    int x = scan.nextInt();
    if (x%2==0){
        System.out.println("nombre paire");
    }
    else{
        System.out.println("nombre impaire");
    }
    }
    
}
