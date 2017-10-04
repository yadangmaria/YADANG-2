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
public class factorielle {
 public static void main(String[] args){
    Scanner val =new Scanner(System.in);
    System.out.println("entrer un nombre");
    int x= val.nextInt();
    String chaine = val.nextLine();
    int d=1;
    for (int i=x;i>0;i--) d=d*i;
    System.out.println("resultat egal "+d);
 }   
}
