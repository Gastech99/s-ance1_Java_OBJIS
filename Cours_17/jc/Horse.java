package jc;

public class Horse {
    protected String name;  // Modifié de private à protected
    protected int posX;     // Modifié de private à protected
    protected int posY;     // Modifié de private à protected

    public Horse(String name) {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println("Le cheval " + this.name + " se déplace (x = " + this.posX + ", y = " + this.posY + ")");
    }
}
