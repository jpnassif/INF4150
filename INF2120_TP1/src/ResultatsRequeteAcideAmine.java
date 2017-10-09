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
    public static String choisirRequeteAcideAmine (String chaineARN, String acideAmine) {
        String choixAcideAmine = "";    
        switch (acideAmine) {
            case "Ala":
                choixAcideAmine = ("GCU,GCC,GCA,GCG");
                break;

            case "Arg":
                choixAcideAmine = ("CGU,CGC,CGA,CGG,AGA,AGG");
                break;

            case "Asn":
                choixAcideAmine = ("AAU,AAC");
                break;

            case "Asp":
                choixAcideAmine = ("GAU,GAC");
                break;

            case "Cys":
                choixAcideAmine = ("UGU,UGC");
                break;

            case "Glu":
                choixAcideAmine = ("GAA,GAG");
                break;

            case "Gln":
                choixAcideAmine = ("CAA,CAG");
                break;

            case "Gly":
                choixAcideAmine = ("GGU,GGC,GGA,GGG");
                break;

            case "His":
                choixAcideAmine = ("CAU,CAC");
                break;

            case "Ile":
                choixAcideAmine = ("AUU,AUC,AUA");
                break;

            case "Leu":
                choixAcideAmine = ("UUA,UUG,CUU,CUC,CUA,CUG");
                break;

            case "Lys":
                choixAcideAmine = ("AAA,AAG");
                break;

            case "Met":
                choixAcideAmine = ("AUG");
                break;

            case "Phe":
                choixAcideAmine = ("UUU,UUC");
                break;

            case "Pro":
                choixAcideAmine = ("CCU,CCC,CCA,CCG");
                break;

            case "Pyl":
                choixAcideAmine = ("UAG");
                break;

            case "Sec":
                choixAcideAmine = ("UGA");
                break;

            case "Ser":
                choixAcideAmine = ("UCU,UCC,UCA,UCG,AGU,AGC");
                break;

            case "Thr":
                choixAcideAmine = ("ACU,ACC,ACA,ACG");
                break;

            case "Trp":
                choixAcideAmine = ("UGG");
                break;

            case "Tyr":
                choixAcideAmine = ("UAU,UAC");
                break;

            case "Val":
                choixAcideAmine = ("GUU,GUC,GUA,GUG");
                break;
        }
        return choixAcideAmine;
    }

    //Trouve les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    //@param entree La sequence d'ARN entree.
    //@param acideAmine L'acide amine entre.
    //@return Un ArrayList d'entiers representant les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    public static ArrayList<Integer> effectuerRequeteAcideAmine(String chaineARN, String acideAmine) {
        String choixAcideAmine = choisirRequeteAcideAmine(chaineARN, acideAmine);
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0; i < chaineARN.length(); i+=3){
            if (choixAcideAmine.contains(chaineARN.substring(i,i+2))){
                indices.add(i);
            }
        }
        return indices;
    }

    //Classe en ordre croissant et affiche (separes de virgules) les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    //@param t Un ArrayList contenant les indices ou l'on retrouve l'acide amine demande dans la sequence d'ARN.
    public static void requeteAcideAmine (String chaineARN, String acideAmine) {
        ArrayList<Integer> t = effectuerRequeteAcideAmine (chaineARN, acideAmine);
        if ( t.size() == 0){
            System.out.println("Aucun élément trouvé.");
        } else{
            //Collections.sort(t);
            System.out.print("résultat : " );
            for( int i = 0; i<t.size(); ++i) {
                System.out.print((t.get(i)+1) + " ");
            }
        }
    }
}
