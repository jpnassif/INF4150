package tp1;

import java.util.Scanner;
/**
 *
 * @author Jay
 * @author Dalila
 */

//Demande un chaine d'ARN a l'utilisateur,
// la valide,
// calcule et affiche les metriques,
// demande une requete de recherche,
// valide la requete en faisant appel,
// affiche les resultats de la recherche *****
// et termine le programme.
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Demande un chaine d'ARN a l'utilisateur.
        Scanner userInput = new Scanner (System.in);
        System.out.print( "Veuillez entrer une chaine ARN valide: " );
        String stringARN = userInput.next();

        //Valide la chaine.
        ValiderARN.estARN(stringARN);

        //Calcule et affiche les metriques.
        AfficherMetriques.calculerMetriquesARN(stringARN);

        //Demande une requete de recherche.
        System.out.print( "Veuillez spécifier une requête de recherche: " );
        String requete = userInput.next();

        //Valide la requete.
        ValiderRequete.estRequeteDeRecherche(requete);

        //Affiche les resultats de la recherche.
        if (ValiderRequete.estRequeteAcideAmine(requete)) {
            ResultatsRequeteAcideAmine.afficherResultatsRequeteAcideAmine(stringARN, requete);
        } else {
            ResultatsRequeteSuiteNucleo.afficherResultatsRequeteSuiteNucleo(stringARN, requete);
        }

        //Termine le programme.
        System.exit(0);
    }
}
