public class ValeurAbsolue {
    public static void main(String[] args){
        double val = 90;

        double angleRadient = Math.toRadians(val);
        double cosinusVal = Math.cos(angleRadient);
        System.out.println("Le Cosinus de " + val + " est de " + cosinusVal);
    }

    public Produit(String nom, int prixUnitaire, String id){
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.id = id;
    }

        public Produit(int quantite, String marque, String fabriquant){
        this.quantite = quantite;
        this.marque = marque;
        this.fabriquant = fabriquant;
    }
}