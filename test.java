import java.util.Arrays;
import java.util.List;

public class test {
    
    public static void test_parcelle(Parcelle parcelle){
        System.out.println(parcelle);
        for (Activite_Culture act : parcelle.getActivites()){
            System.out.println("Activité : "+ act.getNom());
            System.out.println("Aide :" + parcelle.calcul_aide(act));
            System.out.println("Quantité d'eau : " + parcelle.quantite_eau(act));
        }
        System.out.println("Cout max pour : " + parcelle.cout_max(parcelle.getActivites()).getNom());
        System.out.println("Nombre total d'activites : " + parcelle.nb_activites("Activite_Culture"));
        System.out.println("Nombre d'activites récolte : " + parcelle.nb_activites("Activite_Recolte"));
        System.out.println("Nombre d'activites anti-insectes : " + parcelle.nb_activites("Activite_Anti_Insectes"));


    }
   

    

    public static void main(String[] args){
        Integer[] array = {2, 36, 52};
        List<Integer> list =Arrays.asList(array);
        Activite_Culture[] activites;
        activites = new Activite_Culture[3];
        activites[0] = new Activite_Recolte("récolte de bananes",list , 6000, "après-midi", "faucheuse");
        activites[1] = new Activite_Anti_Insectes("traitement parasite", list, 10000, "parasite", "very feroce");
        activites[2] = new Activite_Recolte("récolte de fraises", list, 500, "déjeuner", "taille haie");
        Parcelle parcelle;
        parcelle = new Parcelle("section", 1, 400, Arrays.asList(activites));
        test_parcelle(parcelle);
    }
}
