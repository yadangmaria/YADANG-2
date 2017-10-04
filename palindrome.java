package exo;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Finest
 */
public class palindrome {
    public static void main(String[] args){
    Scanner val=new Scanner(System.in);
    System.out.println("entree un mot ");
    String T=val.nextLine();
    int i=0;
    int j=T.length() -1;

//affichage de la suite de caractere saisie
    System.out.print(T);
    //test polindrome
    while((i<j) && (T.charAt(i)==T.charAt(j))){
        i=i+1; j=j-1;
    }
    if (T.charAt(i)!=T.charAt(j))
        System.out.println(" n'est pas un palindrome");
    else
        System.out.println(" est un palindrome");
    }
}