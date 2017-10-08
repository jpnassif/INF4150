package tp1;

/**
 *
 * @author Jay
 * @author Dalila
 */

//Compter les nucleotides et calculer la masse molaire totale d'une ARN.
public class InfoNucleotides {

    //Compter le nombre de nucleotides de carbone.
    //@param n Le charatere dans la chaine ARN en question.
    //@return Le nombre de nucleotides de carbone.
    public static int compterNbCarbone (char n){
        int nbCarbone = 0;
        if (n == 'A' || n == 'G'){
            nbCarbone = 5;
        } else {
            nbCarbone = 4;
        }
        return nbCarbone;
    }

    //Compter le nombre de nucleotides d'hydrogene.
    //@param n Le charatere dans la chaine ARN en question.
    //@return Le nombre de nucleotides d'hydrogene.
    public static int compterNbHydrogene (char n){
        int nbHydrogene = 0;
        if (n == 'A' || n == 'C' || n == 'G'){
            nbHydrogene = 5;
        } else {
            nbHydrogene = 4;
        }
        return nbHydrogene;
    }

    //Compter le nombre de nucleotides d'azote.
    //@param n Le charatere dans la chaine ARN en question.
    //@return Le nombre de nucleotides d'azote.
    public static int compterNbAzote (char n){
        int nbAzote = 0;
        if (n == 'A' || n == 'G'){
            nbAzote = 5;
        } else if (n == 'C'){
            nbAzote = 3;
        } else {
            nbAzote = 2;
        }
        return nbAzote;
    }

    //Compter le nombre de nucleotides d'oxygene.
    //@param n Le charatere dans la chaine ARN en question.
    //@return Le nombre de nucleotides d'oxygene.
    public static int compterNbOxygene (char n){
        int nbOxygene = 0;
        if (n == 'C' || n == 'G'){
            nbOxygene = 1;
        } else if (n == 'U'){
            nbOxygene = 2;
        }
        return nbOxygene;
    }

    //Calculer la masse molaire totale.
    //@param n Le charatere dans la chaine ARN en question.
    //@return La masse molaire totale.
    public static double calculerMasseMolaire (char n){
        double masseMolaire = 0.00;
        if (n == 'A') {
            masseMolaire = 135.13;
        }
        else if (n == 'C') {
            masseMolaire = 111.10;
        }
        else if (n == 'G') {
            masseMolaire = 151.13;
        }
        else {
            masseMolaire = 112.09;
        }    
        return masseMolaire;
    }

}
