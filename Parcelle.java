import java.util.*;

//On définit la classe Parcelle

public class Parcelle{
    // On donne ses attributs
    private String section;
    private int num_parcelle;
    private double superficie;
    private ArrayList <Activite_Culture> activites;

    // Le constructeur

    public Parcelle(String section, int num_parcelle, double superficie, ArrayList <Activite_Culture> activites){
        this.section = section;
        this.num_parcelle = num_parcelle;
        this.superficie = superficie;
        this.activites = activites;
    }

    // Les méthodes :

    public void setNum(int num_parc){ // MARCHE PAS LA CONNE DE SES MORTS
        try{
            this.num_parcelle = num_parc;
        } catch (num_parc < 0){
            System.out.println("Ne pas mettre de numéro négatif poir les parcelles !");
        }
    }

    public double calcul_aide(Activite_Culture act){
            if (act.getNom() == "recolte"){
                return(1000*this.superficie);
            }
            else{
                if (act.getNom() == "anti-insectes"){
                return(2000 + 1000*this.superficie);
                }
            }
        }

    public double quantite_eau(Activite_Culture act){
        if (act.getNom() == "recolte"){
            return(200*this.superficie);
        }
        else{
            if (act.getNom() == "anti-insectes"){
                return(100*this.superficie);
            }
        }
    }

}