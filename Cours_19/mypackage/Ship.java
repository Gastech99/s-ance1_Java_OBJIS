package mypackage;

public class Ship extends Vehicule{
    public Ship(){
        this.movementSpeed = 16;
    }

    public void moveXY(int x, int y){
        System.out.println("Le navire brasse les flots et se deplace en " + x + ", " + y);
    }
}