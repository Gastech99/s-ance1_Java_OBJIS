public class Voiture{

    String marque;
    int annee;

    public Voiture(String marque, int annee){

        this.marque = marque;
        this.annee = annee;

        System.out.println("Ce " + this.marque + " est de " + this.annee);
    }
}