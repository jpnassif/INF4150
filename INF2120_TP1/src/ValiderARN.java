package tp1;

import java.util.ArrayList;
/**
 *
 * @author Jay
 * @author Dalila
 */

public class ValiderARN extends ArrayList {

    //Verifie si la chaine entree par l'utilisateur est bien une chaine ARN.
    //@param entree La chaine entree par l'utilisateur.
    //@return true si la chaine est une chaine ARN ou false si elle ne l'est pas.

    public static boolean estARN(String entree){

        boolean ARNValide = true;
        char c = 'x';
        if (entree.length()<6 || entree.length() % 3 != 0){
            ARNValide = false;
        } else{
            for (int i = 0 ; i < entree.length() ; i++){
                c = entree.charAt(i);
                if (c!='A' && c!='C' && c!='G' && c!='U'){
                    ARNValide = false;
                    i = entree.length();
                    System.err.println("Une chaîne ARN doit être uniquement composée des lettres A, C, G et U.");
                    System.exit(1);
                }
            }
        }
        return ARNValide;
        }
}

