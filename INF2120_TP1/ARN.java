/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jay
 */
public class ARN extends ArrayList<Nucleotide>{
    public static int nbCarbones = 0;
    public static int nbHydrogenes = 0;
    public static int nbAzotes = 0;
    public static int nbOxygenes = 0;
    public static double masseMolaireTotale = 0.00;
    
    private static boolean estARN(String entreeARN){
        boolean valideARN= true;
        char c = 'x';
        if (entreeARN.length()<6 || entreeARN.length() % 3 != 0){
            valideARN = false;
            System.err.println("La longueur d'une chaîne ARN doit être minimalement 6 et un multiple de 3.");
            System.exit(1);
        } else{
            for (int i = 0 ; i < entreeARN.length() ; i++){
                c = entreeARN.charAt(i);
                if (c!='A' && c!='C' && c!='G' && c!='U'){
                    valideARN = false;
                    i = entreeARN.length();
                    System.err.println("Une chaîne ARN doit être uniquement composée des lettres A, C, G, et U.");
                    System.exit(2);
                }
            }
        }
        return valideARN;
    }
    
    public static ARN construireARN(String entreeARN){
        ARN chaineARN = new ARN();
        if (estARN(entreeARN)){
            for(int i=0; i < entreeARN.length(); i++){
               chaineARN.add(new Nucleotide(entreeARN.charAt(i)));
            }
            System.out.println();
        }
        return chaineARN;
    }
    
    public static void calculerStatsARN (String entreeARN){
        ARN chaineARN = construireARN(entreeARN);
        for(int i=0; i < entreeARN.length(); i++){
            nbCarbones += chaineARN.get(i).getNbCarbone();
            nbHydrogenes += chaineARN.get(i).getNbHydrogene();
            nbAzotes += chaineARN.get(i).getNbAzote();
            nbOxygenes += chaineARN.get(i).getNbOxygene();
            masseMolaireTotale += chaineARN.get(i).getMasseMolaire();
        }
    }
    
    public static void afficherStatsARN(String entreeARN){
        calculerStatsARN(entreeARN);
        System.out.println("Nombre d'atomes de Carbone: " + nbCarbones);
        System.out.println("Nombre d'atomes d'Hydrogène: " + nbHydrogenes);
        System.out.println("Nombre d'atomes d'Azote: " + nbAzotes);
        System.out.println("Nombre d'atomes d'Oxygène: " + nbOxygenes);
        System.out.println("Masse molaire totale du ARN: " + masseMolaireTotale + " g/mol");
    } 
}
