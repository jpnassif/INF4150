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
        String RNAString = userInput.next();
        ARN.getStatsRNA(RNAString);
        System.out.print( "Veuillez spécifier une requête de recherche: " );
        String RNARequest = userInput.next();
        RequeteARN.searchRNA(RNARequest);
    }
    
}
