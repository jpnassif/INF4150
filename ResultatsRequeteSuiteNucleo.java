package tp1;

import java.util.ArrayList;

/**
 *
 * @author Dalila
 */


public class ResultatsRequeteSuiteNucleo {
    
    public static String choisirNucleotides (char code) {
        String choixNucleotides = "";    
        switch (code) {
            case 'A':
                choixNucleotides = ("A");
                break;
            case 'C':
                choixNucleotides = ("C");
                break;
            case 'G':
                choixNucleotides = ("G");
                break;
            case 'U':
                choixNucleotides = ("U");
                break;
            case 'R':
                choixNucleotides = ("A,G");
                break;

            case 'Y':
                choixNucleotides = ("C,U");
                break;
                
            case 'S':
                choixNucleotides = ("C,G");
                break;
            
            case 'W':
                choixNucleotides = ("A,U");
                break;

            case 'K':
                choixNucleotides = ("G,U");
                break;
                
            case 'M':
                choixNucleotides = ("A,C");
                break;
            
            case 'B':
                choixNucleotides = ("C,G,U");
                break;

            case 'D':
                choixNucleotides = ("A,G,U");
                break;
                
            case 'H':
                choixNucleotides = ("A,C,U");
                break;
            
            case 'V':
                choixNucleotides = ("A,C,G");
                break;

            case 'N':
                choixNucleotides = ("A,C,G,U");
                break;
        }
        return choixNucleotides;
    }
    
    public static ArrayList<Integer> effectuerRequeteNucleotides(String chaineARN, String requeteNucleotides) {
        ArrayList<Integer> indices = new ArrayList<>();
        boolean requeteTrouvee;
        for(int i=0; i < chaineARN.length()- requeteNucleotides.length(); i+=3){
            requeteTrouvee = true;
            for(int j = 0; j < requeteNucleotides.length(); j++){
                if (!choisirNucleotides(requeteNucleotides.charAt(j)).contains("" + chaineARN.charAt(i+j))){
                    requeteTrouvee = false;
                } 
            }
            if (requeteTrouvee){
                indices.add(i);
            }
        }
        return indices;
    }

    public static void requeteSuiteNucleo (String chaineARN, String requeteNucleotides) {
        ArrayList<Integer> t = effectuerRequeteNucleotides (chaineARN, requeteNucleotides);
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
