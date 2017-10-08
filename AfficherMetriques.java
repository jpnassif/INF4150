package tp1;

/**
 *
 * @author Jay
 * @author Dalila
 */

//Calcule et affiche les metriques de la sequence ARN (deja validee precedemment).
public class AfficherMetriques {

    //Variables qui representent le nombre de chaque type d'atome.
    public static int nbAtomeCarbone = 0;
    public static int nbAtomeHydrogene = 0;
    public static int nbAtomeAzote = 0;
    public static int nbAtomeOxygene = 0;
    public static double masseMolaireTotale = 0.00;

    //Calcule et affiche les metriques de la sequence ARN.
    //@param entree La chaine entree par l'utilisateur.
    public static void calculerMetriquesARN(String entree){

        for (int i = 0; i < entree.length(); i++){
            nbAtomeCarbone += InfoNucleotides.compterNbCarbone(entree.charAt(i));
            nbAtomeHydrogene += InfoNucleotides.compterNbHydrogene(entree.charAt(i));
            nbAtomeAzote += InfoNucleotides.compterNbAzote(entree.charAt(i));
            nbAtomeOxygene += InfoNucleotides.compterNbOxygene(entree.charAt(i));
            masseMolaireTotale += InfoNucleotides.calculerMasseMolaire(entree.charAt(i));
        }
        afficherMetriquesARN();
    }

    //Affiche les metriques de la sequence ARN.
    public static void afficherMetriquesARN(){
        System.out.println("Nombre d'atomes de Carbone: " + nbAtomeCarbone);
        System.out.println("Nombre d'atomes d'Hydrogène: " + nbAtomeHydrogene);
        System.out.println("Nombre d'atomes d'Azote: " + nbAtomeAzote);
        System.out.println("Nombre d'atomes d'Oxygène: " + nbAtomeOxygene);
        System.out.println("Masse molaire totale du ARN: " + masseMolaireTotale + " g/mol");
    }
}
