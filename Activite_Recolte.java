import java.util.*;

class Activite_Recolte extends Activite_Culture{
    
    private String favorable;
    private String materiel;

    public Activite_Recolte(String nom, List <Integer> semaines, int cout_annuel, String favorable, String materiel){
        super(nom, semaines, cout_annuel);
        this.favorable = favorable;
        this.materiel = materiel;
    }
}