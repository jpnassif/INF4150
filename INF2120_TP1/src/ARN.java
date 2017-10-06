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
public class ARN extends ArrayList{
    public static int carbonAtomNb = 0;
    public static int hydrogenAtomNb = 0;
    public static int nitrogenAtomNb = 0;
    public static int oxygenAtomNb = 0;
    public static double totalMolarMass = 0.00;
    
    private static boolean isRNA(String s){
        boolean validRNA = true;
        char c = 'x';
        if (s.length()<6 || s.length() % 3 != 0){
            validRNA = false;
        } else{
            for (int i = 0 ; i < s.length() ; i++){
                c = s.charAt(i);
                if (c!='A' && c!='C' && c!='G' && c!='U'){
                    validRNA = false;
                    i = s.length();
                }
            }
        }
        return validRNA;
    }
    
    public static void getStatsRNA(String s){
        if (isRNA(s)){
            for (int i = 0; i < s.length(); i++){
                carbonAtomNb += Nucleotide.getCarbonNb(s.charAt(i));
                hydrogenAtomNb += Nucleotide.getHydrogenNb(s.charAt(i));
                nitrogenAtomNb += Nucleotide.getNitrogenNb(s.charAt(i));
                oxygenAtomNb += Nucleotide.getOxygenNb(s.charAt(i));
                totalMolarMass += Nucleotide.getMolarMass(s.charAt(i));
            }
            printStatsRNA();
        } else{
            System.out.println("You are fucked");
            System.exit(1);
        }
    }
    
    public static void printStatsRNA(){
        System.out.println("Nombre d'atomes de Carbone: " + carbonAtomNb);
        System.out.println("Nombre d'atomes d'Hydrogène: " + hydrogenAtomNb);
        System.out.println("Nombre d'atomes d'Azote: " + nitrogenAtomNb);
        System.out.println("Nombre d'atomes d'Oxygène: " + oxygenAtomNb);
        System.out.println("Masse molaire totale du ARN: " + totalMolarMass + " g/mol");
    } 
}
