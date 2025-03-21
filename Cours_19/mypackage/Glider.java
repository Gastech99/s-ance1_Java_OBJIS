package mypackage;

public class Glider extends Vehicule{
    public Glider(){
        this.movementSpeed = 28;
    }

    public void moveXY(int x, int y){
        System.out.println("Le planeur fend l'air vers " + x + ", " + y);
    }
}