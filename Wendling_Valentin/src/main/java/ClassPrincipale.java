import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import magasin.Catalogue;
import magasin.fabriqueMagasin.SimpleFabrique;

public class ClassPrincipale 
{
	public static void main(String[] args) 
	{
		SimpleFabrique simpleFabrique = new SimpleFabrique();
		Catalogue catalogue = new Catalogue();
		Path path = Paths.get("../../catalogue.txt");
		String ligne;
		Logger log = Logger.getLogger("log");

		try(BufferedReader lecteurAvecBuffer = Files.newBufferedReader(path, StandardCharsets.UTF_8))
		{
			while ((ligne = lecteurAvecBuffer.readLine()) != null)
				catalogue.addProd(simpleFabrique.creerProduit(ligne));
		} 
		catch (Exception exc) 
		{
			log.log(Level.SEVERE, "Erreur à la lecture du fichier de stock {0}: " , exc.getMessage());
		}
		
		log.log(Level.INFO, "Le catalogue contient : \n {0}", catalogue);
	}
}
