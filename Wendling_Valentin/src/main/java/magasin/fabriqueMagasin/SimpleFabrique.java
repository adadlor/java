/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package magasin.fabriqueMagasin;

import magasin.Articles;
import magasin.Jardinage;
import magasin.Bricolage;
import magasin.Animal;

/**
 *
 * @author valentinwendling
 */
public class SimpleFabrique {

    public Articles creerProduit(String ligne){
        String[] ref = ligne.split(";");
        if (ref[0].equals("Jardianage")){
            return new Jardinage(ref[3], ref[1], Integer.parseInt(ref[4]), Integer.parseInt(ref[2]), ref[5]);
        }else if (ref[0].equals("Bricolage")){
            return new Bricolage(ref[3], ref[1], Integer.parseInt(ref[4]), Integer.parseInt(ref[2]), ref[5], ref[6]);
        }else if (ref[0].equals("Animal")){
            return new Animal(ref[3], ref[1], Integer.parseInt(ref[4]), Integer.parseInt(ref[2]), ref[5], Integer.parseInt(ref[6]));
        }else{
            System.out.println("pas de rayon");
            return null;
        }
        
    }
}
