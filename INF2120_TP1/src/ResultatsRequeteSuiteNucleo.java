package tp1;

import java.util.ArrayList;

/**
 *
 * @author Dalila
 */


public class ResultatsRequeteSuiteNucleo {

    char[] tR = {'A', 'G'};
    char[] tY = {'C', 'U'};
    char[] tS = {'C', 'G'};
    char[] tW = {'A', 'U'};
    char[] tK = {'G', 'U'};
    char[] tM = {'A', 'C'};
    char[] tB = {'C', 'G', 'U'};
    char[] tD = {'A', 'G', 'U'};
    char[] tH = {'A', 'C', 'U'};
    char[] tV = {'A', 'C', 'G'};
    char[] tN = {'A', 'C', 'G', 'U'};

    public static void afficherResultatsRequeteSuiteNucleo (String entree, String suiteNucleo){


    }

    public static ArrayList<Character> transformerEnArrayList (String suiteNucleo){

        ArrayList<Character> listeNucleo =  new ArrayList<>();

        for( int i = 0; i < suiteNucleo.length(); ++i){

            listeNucleo.add(suiteNucleo.charAt(i));
        }
        return listeNucleo;
    }

    public static ArrayList<Integer> calculerResultatsSuiteNucleo (ArrayList<Character> listeNucleo, String suiteNucleo) {

        ArrayList<Integer> indices = new ArrayList<>();

        for(int i=0; i < listeNucleo.size(); i+=3){


        }
        return indices;
    }
}
