/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay
 */
public class Nucleotide {
    
    public static int getCarbonNb (char n){
        int carbonNb = 0;
        if (n == 'A' || n == 'G'){
            carbonNb = 5;
        } else if (n == 'C' || n == 'U'){
            carbonNb = 4;
        }
        return carbonNb;
    }
    
    public static int getHydrogenNb (char n){
        int hydrogenNb = 0;
        if (n == 'A' || n == 'C' || n == 'G'){
            hydrogenNb = 5;
        } else if(n == 'U'){
            hydrogenNb = 4;
        }
        return hydrogenNb;
    }
    
    public static int getNitrogenNb (char n){
        int nitrogenNb = 0;
        if (n == 'A' || n == 'G'){
            nitrogenNb = 5;
        } else if (n == 'C'){
            nitrogenNb = 3;
        } else if (n == 'U'){
            nitrogenNb = 2;
        }
        return nitrogenNb;
    }
    
    public static int getOxygenNb (char n){
        int oxygenNb = 0;
        if (n == 'A'){
            oxygenNb = 0;
        } else if (n == 'C' || n == 'G'){
            oxygenNb = 1;
        } else if (n == 'U'){
            oxygenNb = 2;
        }
        return oxygenNb;
    }
    
    public static double getMolarMass (char n){
        double molarMass = 0.00;
        if (n == 'A') 
            molarMass = 135.13;
        else if (n == 'C') 
            molarMass = 111.10;
        else if (n == 'G')
            molarMass = 151.13;
        else if (n == 'U')
            molarMass = 112.09;
        return molarMass;
    }
}
