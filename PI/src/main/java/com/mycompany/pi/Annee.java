

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

import java.util.Scanner;

/**
 *
 * @author valentinwendling
 */
public class angle {
    public final Double pi;
    private double valeur;

    public angle(double valeur) {
        this.pi = Math.PI;
        this.valeur = valeur;
    }

    public Double getPi() {
        return pi;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    
    public double toRadiant(){
       return (this.valeur * this.pi )/180;
    }
    
    public double toDegree(){
       return (this.valeur * 180 )/ this.pi;
    }
    
}

public class Annee {
    public static void main(String[] args) {
        double x = 10;
        double resultat = (x * Math.PI)/180;
        System.out.println("Le résultat est :" + resultat);
       
        int annee;
        Scanner ecouteur;
        ecouteur = new Scanner(System.in);
        System.out.print("entrez anee :");
        annee = ecouteur.nextInt();
        /*
        if (((annee%4==0) && !(annee%100==0)) || (annee%400==0))
            System.out.print("annee Bissextile");
        else
            System.out.print("annee NON Bisextile");
        */
    }
    public boolean estBissextile(int annee){
        return (((annee%4==0) && !(annee%100==0)) || (annee%400==0));
         
        
    }
    
}

