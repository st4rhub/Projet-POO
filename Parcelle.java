import java.util.*;

//On définit la classe Parcelle

public class Parcelle{
    // On donne ses attributs
    private String section;
    private int num_parcelle;
    private double superficie;
    private List <Activite_Culture> activites;

    // Le constructeur

    public Parcelle(String section, int num_parcelle, double superficie, List <Activite_Culture> activites){
        this.section = section;
        this.num_parcelle = num_parcelle;
        this.superficie = superficie;
        this.activites = activites;
    }

    // Exception pour parcelle négative

    class ParcelleException extends Exception{
        public ParcelleException(){
            System.out.println("Ne pas mettre de numéro négatif pour les parcelles !");
        }
    }

    // Getters/Setters :

    public List<Activite_Culture> getActivites(){
        return this.activites;
    }

    public void setNum(int num_parc) throws ParcelleException{
       if (num_parc < 0){
        throw new ParcelleException();
       }
       else{
        this.num_parcelle = num_parc;
       }
    }

    // Méthodes autres :

    public double calcul_aide(Activite_Culture act){
            if (act.getClass().getName()== "Activite_Recolte"){
                return(1000*this.superficie);
            }
            else{
                if (act.getClass().getName()== "Activite_Anti_Insectes"){
                return(2000 + 1000*this.superficie);
                }
            }
            return 0;
        }

    public double quantite_eau(Activite_Culture act){
        if (act.getClass().getName()== "Activite_Recolte"){
            return(200*this.superficie);
        }
        else{
            if (act.getClass().getName()== "Activite_Anti_Insectes"){
                return(100*this.superficie);
            }
        }
        return 0;
    }

    public Activite_Culture cout_max(List<Activite_Culture> activites){
        int max = 0;
        List<Integer> semaines = new ArrayList <Integer> ();
        Activite_Culture act_max = new Activite_Culture("", semaines, 0);
        for (Activite_Culture act : activites){
            if (act.getCoutAnnuel() > max){
                max = act.getCoutAnnuel();
                act_max = act;
            }
        }
        return act_max;
    }

    public int nb_activites(String nom_activite){
        int compteur_activites = 0;
        if (nom_activite =="Activite_Culture"){
            compteur_activites = activites.size();
        }
        else{
            for (Activite_Culture act : activites){
                if (act.getClass().getName() == nom_activite){
                    compteur_activites += 1;
                }
            }
        }
        return compteur_activites;
    }

    public String toString(){
        return "Parcelle : Section : " + this.section + ", Numéro : " + this.num_parcelle;
    }

}