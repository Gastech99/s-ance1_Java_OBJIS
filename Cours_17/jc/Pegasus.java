package jc;

public class Pegasus extends Horse {  // Ajout de l'héritage
    private int posZ;

    public Pegasus(String name) {
        super(name); // Appel du constructeur de Horse
        this.posZ = 100;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y); // Appel à la méthode move() de Horse
        System.out.println("Le Pégase " + this.name + " se déplace gracieusement.");
    }

    public void fly(int z) {
        this.posZ = z;
        System.out.println("Le Pégase " + this.name + " s'élève à (z = " + this.posZ + ")");
    }
}