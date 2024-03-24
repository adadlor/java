
import java.awt.Color;
import java.util.HashMap;

public class LSystem
{

   private String axiome;
   private HashMap <Character, String> regles;
   private String expCourante;
   
   public LSystem()
   {
      /* definition regle derivation */
      this.regles = new HashMap <Character, String> ();
      this.regles.put('X', "X+Y++Y-X - -XX-Y+");
      this.regles.put('Y', "-X+YY++Y+X--X-Y");
      this.regles.put('-', "-");
      this.regles.put('+', "+");
      
      
      
      
      this.expCourante = this.axiome; 
   }

   public void derivation()
   {
      String nouvelleExp="X-Y";
      String res = "";

      for(int i = 0; i<nouvelleExp.length(); i++){
         res += this.regles.get(nouvelleExp.charAt(i));
      }
      
      nouvelleExp = res;
      this.expCourante = nouvelleExp;  
      System.out.println( this.expCourante );   
   }

   public void resetExp()
   {
      this.expCourante = this.axiome;
   }
   
     
   public void interpretation(Logo l, int j)
   {
      // lire l'expression et interpreter les symboles...
      if (j != this.expCourante.length()){
         if(this.expCourante.charAt(j) == 'X' || this.expCourante.charAt(j)=='Y'){
            l.av();
         } else if(this.expCourante.charAt(j) == '+'){
            l.rotG(60);
         } else{
            l.rotD(60);
         }
   }
   }
   
   public int alea(int a, int b )
   {
      return (int) (Math.random()*(b-a+1)+a);   
   }

}