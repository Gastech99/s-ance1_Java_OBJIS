package mypackage;

public class Cottage extends Bulding{
    public Cottage(){
        System.out.println("Parcelle en place...");
    }

    public void build(String material){
        System.out.println("Construction du batiment en " + material);
    }
}