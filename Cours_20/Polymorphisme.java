import personne.*;

public class Polymorphisme {
    public static void main(String[] args){
        Jeune j = new Jeune();
        j.Parler();

        Adulte a = new Adulte();
        a.Parler();

        Ado ad = new Ado();
        ad.Parler();
    }
}