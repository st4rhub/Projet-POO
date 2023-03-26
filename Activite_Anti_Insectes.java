import java.util.*;

class Activite_Anti_Insectes extends Activite_Culture{

    private String insecte;
    private String ferocite;

    public Activite_Anti_Insectes(String nom, List <Integer> semaines, int cout_annuel, String insecte, String ferocite){
        super(nom, semaines, cout_annuel);
        this.insecte = insecte;
        this.ferocite = ferocite;
    }
}