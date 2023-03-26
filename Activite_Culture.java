import java.util.*;

public class Activite_Culture{

    private String nom;
    private List <Integer> semaines;
    private int cout_annuel;

    // Le constructeur :

    public Activite_Culture(String nom, List <Integer> semaines, int cout_annuel){
        this.nom = nom;
        this.semaines = semaines;
        this.cout_annuel = cout_annuel;
    }

    public String getNom(){
        return this.nom;
    }

    public int getCoutAnnuel(){
        return this.cout_annuel;
    }

}