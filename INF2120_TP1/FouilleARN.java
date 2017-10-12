/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jay
 */
public class FouilleARN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.print( "Veuillez entrer une chaine ARN valide: " );
        String entreeARN = userInput.next();
        ARN.afficherStatsARN(entreeARN);
        
        //Demande une requête de recherche d'ARN.
        System.out.print( "Veuillez spécifier une requête de recherche: " );
        String requete = userInput.next();

        //Valide la requete.
        ValiderRequete.estRequeteDeRecherche(requete);

        //Affiche les resultats de la recherche.
        if (ValiderRequete.estRequeteAcideAmine(requete)) {
            RequeteAcideAmine.requeteAcideAmine(entreeARN, requete);
        } else {
            RequeteSuiteNucleo.requeteSuiteNucleo(entreeARN, requete);
        }

        //Termine le programme.
    }
    
}
