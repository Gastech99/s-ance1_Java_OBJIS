public class Encapsulation {
    /**
     * [ACCESSEURS]
     *      getters : accès à un attribut (Lecture)
     *      setters : modification d'un attribut
     */

    public Encapsulation(int date){
        this.encapsulation = date;
        System.out.println("Enregistrement du produit, validé jusqu'en " + this.encapsulation);
    }

    public int encapsulation;
}