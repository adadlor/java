/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */
public class AppEntiers {
    public static void main(String[] args) {
        
        
    }
    public static void afficherDiviseur(int n){
        String chaine = "";
        for (int i = 1; i < n; i++){
            if (n % i == 0){chaine += ", " + i;}
                
            }
        System.out.println(chaine);
        }
    
    public static String ListeDiviseur(int n){
        String chaine = "";
        for (int i = 1; i < n; i++){
            if (n % i == 0){chaine += ", " + i;}
                
            }
        return chaine;   
    }
    
    public static int nbDiviseurs(int n){
        int cpt = 0;
        for (int i = 0; i < n; i++){
            if (n % i == 0){cpt += 1;}  
            }
        return cpt;
    }
    
    public static boolean estPremier(int n){return(nbDiviseurs(n) == 2);}
    
    
    public static String decompositionFacteursPremiers(int n){
         int i = 2;
         String chaine = "";
         int cpt = 0;
         while (i * i <= n){
             if (estPremier(i)){
                if (n % i == 0){
                    n = n / i;
                    cpt += 1;
                }
                else{
                    chaine = chaine + i + "^" + cpt + "*";
                    cpt = 0;
                    i += 1;
                }
            }
             else{i += 1;}
         }
        return chaine + n;
     }
    
    
}

