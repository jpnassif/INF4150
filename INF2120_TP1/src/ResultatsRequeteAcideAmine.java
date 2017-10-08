package tp1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dalila
 */

//Genere les resultats pour les requetes d'acides amines
public class ResultatsRequeteAcideAmine {

    //Gere les differents cas de recherche et affiche les resultats.
    //@param entree La sequence d'ARN entree.
    //@param acideAmine L'acide amine entre.
    public static void afficherResultatsRequeteAcideAmine (String entree, String acideAmine) {

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        ArrayList<Integer> t4 = new ArrayList<>();
        ArrayList<Integer> t5 = new ArrayList<>();
        ArrayList<Integer> t6 = new ArrayList<>();

        switch (acideAmine) {

            case "Ala":
                t1 = calculerResultatsAcideAmine(entree, "GCU");
                t2 = calculerResultatsAcideAmine(entree, "GCC");
                t3 = calculerResultatsAcideAmine(entree, "GCA");
                t4 = calculerResultatsAcideAmine(entree, "GCG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                afficherEtClasser(t1);
                break;

            case "Arg":
                t1 = calculerResultatsAcideAmine(entree, "CGU");
                t2 = calculerResultatsAcideAmine(entree, "CGC");
                t3 = calculerResultatsAcideAmine(entree, "CGA");
                t4 = calculerResultatsAcideAmine(entree, "CGG");
                t5 = calculerResultatsAcideAmine(entree, "AGA");
                t6 = calculerResultatsAcideAmine(entree, "AGG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                t1.addAll(t5);
                t1.addAll(t6);
                afficherEtClasser(t1);
                break;

            case "Asn":
                t1 = calculerResultatsAcideAmine(entree, "AAU");
                t2 = calculerResultatsAcideAmine(entree, "AAC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Asp":
                t1 = calculerResultatsAcideAmine(entree, "GAU");
                t2 = calculerResultatsAcideAmine(entree, "GAC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Cys":
                t1 = calculerResultatsAcideAmine(entree, "UGU");
                t2 = calculerResultatsAcideAmine(entree, "UGC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Glu":
                t1 = calculerResultatsAcideAmine(entree, "GAA");
                t2 = calculerResultatsAcideAmine(entree, "GAG");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Gln":
                t1 = calculerResultatsAcideAmine(entree, "CAA");
                t2 = calculerResultatsAcideAmine(entree, "CAG");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Gly":
                t1 = calculerResultatsAcideAmine(entree, "GGU");
                t2 = calculerResultatsAcideAmine(entree, "GGC");
                t3 = calculerResultatsAcideAmine(entree, "GGA");
                t4 = calculerResultatsAcideAmine(entree, "GGG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                afficherEtClasser(t1);
                break;

            case "His":
                t1 = calculerResultatsAcideAmine(entree, "CAU");
                t2 = calculerResultatsAcideAmine(entree, "CAC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Ile":
                t1 = calculerResultatsAcideAmine(entree, "AUU");
                t2 = calculerResultatsAcideAmine(entree, "AUC");
                t3 = calculerResultatsAcideAmine(entree, "AUA");
                t1.addAll(t2);
                t1.addAll(t3);
                afficherEtClasser(t1);
                break;

            case "Leu":
                t1 = calculerResultatsAcideAmine(entree, "UUA");
                t2 = calculerResultatsAcideAmine(entree, "UUG");
                t3 = calculerResultatsAcideAmine(entree, "CUU");
                t4 = calculerResultatsAcideAmine(entree, "CUC");
                t5 = calculerResultatsAcideAmine(entree, "CUA");
                t6 = calculerResultatsAcideAmine(entree, "CUG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                t1.addAll(t5);
                t1.addAll(t6);
                afficherEtClasser(t1);
                break;

            case "Lys":
                t1 = calculerResultatsAcideAmine(entree, "AAA");
                t2 = calculerResultatsAcideAmine(entree, "AAG");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Met":
                t1 = calculerResultatsAcideAmine(entree, "AUG");
                afficherEtClasser(t1);
                break;

            case "Phe":
                t1 = calculerResultatsAcideAmine(entree, "UUU");
                t2 = calculerResultatsAcideAmine(entree, "UUC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Pro":
                t1 = calculerResultatsAcideAmine(entree, "CCU");
                t2 = calculerResultatsAcideAmine(entree, "CCC");
                t3 = calculerResultatsAcideAmine(entree, "CCA");
                t4 = calculerResultatsAcideAmine(entree, "CCG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                afficherEtClasser(t1);
                break;

            case "Pyl":
                t1 = calculerResultatsAcideAmine(entree, "AUG");
                afficherEtClasser(t1);
                break;

            case "Sec":
                t1 = calculerResultatsAcideAmine(entree, "UGA");
                afficherEtClasser(t1);
                break;

            case "Ser":
                t1 = calculerResultatsAcideAmine(entree, "UCU");
                t2 = calculerResultatsAcideAmine(entree, "UCC");
                t3 = calculerResultatsAcideAmine(entree, "UCA");
                t4 = calculerResultatsAcideAmine(entree, "UCG");
                t5 = calculerResultatsAcideAmine(entree, "AGU");
                t6 = calculerResultatsAcideAmine(entree, "AGC");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                t1.addAll(t5);
                t1.addAll(t6);
                afficherEtClasser(t1);
                break;

            case "Thr":
                t1 = calculerResultatsAcideAmine(entree, "ACU");
                t2 = calculerResultatsAcideAmine(entree, "ACC");
                t3 = calculerResultatsAcideAmine(entree, "ACA");
                t4 = calculerResultatsAcideAmine(entree, "ACG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                afficherEtClasser(t1);
                break;

            case "Trp":
                t1 = calculerResultatsAcideAmine(entree, "UGG");
                afficherEtClasser(t1);
                break;

            case "Tyr":
                t1 = calculerResultatsAcideAmine(entree, "UAU");
                t2 = calculerResultatsAcideAmine(entree, "UAC");
                t1.addAll(t2);
                afficherEtClasser(t1);
                break;

            case "Val":
                t1 = calculerResultatsAcideAmine(entree, "GUU");
                t2 = calculerResultatsAcideAmine(entree, "GUC");
                t3 = calculerResultatsAcideAmine(entree, "GUA");
                t4 = calculerResultatsAcideAmine(entree, "GUG");
                t1.addAll(t2);
                t1.addAll(t3);
                t1.addAll(t4);
                afficherEtClasser(t1);
                break;
        }
    }

    //Trouve les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    //@param entree La sequence d'ARN entree.
    //@param acideAmine L'acide amine entre.
    //@return Un ArrayList d'entiers representant les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    public static ArrayList<Integer> calculerResultatsAcideAmine(String entree, String acideAmine) {

        ArrayList<Integer> indices = new ArrayList<>();

        for(int i=0; i < entree.length(); i+=3){

            if( (entree.indexOf(acideAmine, i)) != -1){
                indices.add((entree.indexOf(acideAmine, i)) +1);
            }
        }
        return indices;
    }

    //Classeen ordre croissant et affiche (separes de virgules) les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    //@param t Un ArrayList contenant les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    public static void afficherEtClasser (ArrayList<Integer> t) {
        if ( t.size() == 0){
            System.out.println("Aucun élément trouvé.");
        } else{
            Collections.sort(t);
            System.out.print("résultat : " );
            for( int i = 0; i<t.size(); ++i) {
                System.out.print(t.get(i));
                if (i < t.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
