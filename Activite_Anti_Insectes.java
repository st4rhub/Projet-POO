import java.util.*;

class Activite_Recolte extends Activite_Culture{

    private String insecte;
    private int ferocite;

    public Activite_Recolte(String nom, ArrayList <Integer> semaines, int cout_annuel){
        super(nom, semaines, cout_annuel);
        this.insecte = insecte;
        this.ferocite = ferocite;
    }
}