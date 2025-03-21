package monpacket;

abstract public class Species{
    protected String name;

    public String whoAmI(){
        return name;
    }

    abstract public void eat();
    abstract public void speak();
}