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
    protected char typeNucleo;
    protected int nbC;
    protected int nbH;
    protected int nbA;
    protected int nbO;
    protected double masseMolaire;
    
    public Nucleotide (char typeN){
        switch (typeN){
            case 'A':   
                typeNucleo = 'A';
                nbC = 5;
                nbH = 5;
                nbA = 5;
                nbO = 0;
                masseMolaire = 135.13;
                break;
            case 'C' :
                typeNucleo = 'C';
                nbC = 4;
                nbH = 5;
                nbA = 3;
                nbO = 1;
                masseMolaire = 111.10;
                break;
            case 'G' :
                typeNucleo = 'G';
                nbC = 5;
                nbH = 5;
                nbA = 5;
                nbO = 1;
                masseMolaire = 151.13;
                break;
            case 'U' :
                typeNucleo = 'U';
                nbC = 4;
                nbH = 4;
                nbA = 2;
                nbO = 2;
                masseMolaire = 112.09;
                break;
        }
    }
    
    public char getTypeNucleo(){
        return typeNucleo;
    }
    
    public int getNbCarbone (){
        return nbC;
    }
    
    public int getNbHydrogene (){
        return nbH;
    }
    
    public int getNbAzote (){
        return nbA;
    }
    
    public int getNbOxygene (){
        return nbO;
    }
    
    public double getMasseMolaire (){
        return masseMolaire;
    }
}
