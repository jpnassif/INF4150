package tp1;

/**
 *
 * @author Jay
 * @author Dalila
 */

public class ValiderRequete {

    //Tableau contenant tous les acides amines possibles.
    final private static String[] ACIDE_AMINE = {"Ala", "Arg", "Asn", "Asp", "Cys",
            "Glu", "Gln", "Gly", "His", "Ile",
            "Leu", "Lys", "Met", "Phe", "Pro",
            "Pyl", "Sec", "Ser", "Thr", "Trp",
            "Tyr", "Val"};

    //Chaine de caracteres formee de toutes les nucleotides et de toutes les lettres qui representent un ensemble de nucleotides.
    final private static String NUCLEOTIDES = "ABCDGHKMNRSUVWY";

    //Verifie si la requete de recherche est valide et affiche un essage d'erreur si elle ne l'est pas.
    //@param entree La chaine de caractere entree.
    public static void estRequeteDeRecherche (String entree){
        if (estRequeteAcideAmine(entree) || estRequeteSuiteNucleo(entree)) {
            System.out.println("Ok.");
        } else {
            System.out.println("Erreur! Vous devez entrer un acide aminé ou une suite de lettres majuscules dont la longueur est un multiple de 3.");
            System.exit(2);
        }
    }

    //Verifie si c'est une requete de recherche d'acide anime.
    //@param entree La chaine de caractere entree.
    //@return true si c'est une requete de recherche d'acide anime ou false si ca ne l'est pas.
    public static boolean estRequeteAcideAmine(String entree){
        boolean requeteAcideAmine = false;
        for (int i = 0; i < ACIDE_AMINE.length; i++){
            if (entree.equals(ACIDE_AMINE[i])){
                requeteAcideAmine = true;
                i = ACIDE_AMINE.length;
            }
        }
        return requeteAcideAmine;
    }

    //Verifie si c'est une requete de recherche de suite de nucleotides.
    //@param entree La chaine de caractere entree.
    //@return true si c'est une requete de recherche de suite de nucleotides ou false si ca ne l'est pas.
    public static boolean estRequeteSuiteNucleo(String entree){
        boolean requeteSuiteNucleo = true;
        if (entree.length() == 0 || entree.length() % 3 != 0){
            requeteSuiteNucleo = false;
        } else{
            for (int i = 0; i < entree.length(); i++){
                if (!NUCLEOTIDES.contains(""+entree.charAt(i))){
                    requeteSuiteNucleo = false;
                    i = entree.length();
                }
            }
        }
        return requeteSuiteNucleo;
    }

}
