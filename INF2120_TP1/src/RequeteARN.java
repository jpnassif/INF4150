/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay
 */
public class RequeteARN {
    final private static String[] AMINO_ACID = {"Ala", "Arg", "Asn", "Asp", "Cys", 
                                                "Glu", "Gln", "Gly", "His", "Ile", 
                                                "Leu", "Lys", "Met", "Phe", "Pro", 
                                                "Pyl", "Sec", "Ser", "Thr", "Trp", 
                                                "Tyr", "Val"};
    
    final private static String NUCLEOTIDES = "ABCDGHKMNRSUVWY";
    
    public static boolean isAminoAcidRequest(String s){
        boolean aminoAcidRequest = false;
        for (int i = 0; i < AMINO_ACID.length; i++){
            if (s.equals(AMINO_ACID[i])){
                aminoAcidRequest = true;
                i = AMINO_ACID.length;
            }
        }
        return aminoAcidRequest;
    }
    
    public static boolean isNucleoSuiteRequest(String s){
        boolean nucleoSuiteRequest = true;
        if (s.length() == 0 || s.length() % 3 != 0){
            nucleoSuiteRequest = false;
        } else{
            for (int i = 0; i < s.length(); i++){
                if (!NUCLEOTIDES.contains(""+s.charAt(i))){
                    nucleoSuiteRequest = false;
                    i = s.length();
                }
            }
        }
        return nucleoSuiteRequest;
    }
    
    public static boolean isRNARequest (String s){
        return isAminoAcidRequest(s) || isNucleoSuiteRequest(s);          
    }
    
    public static void searchRNA (String s){
        if (isRNARequest(s)){
            System.out.println("Do RNA Search");
        } else{
            System.out.println("You have not entered a valid search!");
            System.exit(2);
        }    
    }     
}
