/**
 * 
 *  == égal à
 *  === égal et de meme type que
 *  != différent de 
 *  < strictement inférieur à
 *  <= inférieur ou égal à
 *  > Strictement supérieur à
 *  >= supérieur ou égal à
 *  
 *  && ET
 *  || OU
 */

public class Condition {
    public static void main(String[] args){

        int value = 25;

        if(value < 0)
            System.out.println("Valeur négative");
        else if(value > 100)
            System.out.println("Valeur > 100");
        else
            System.out.println("Value ne vaut ni 24 ni 16");

        

        String option = "y";
        switch(option){
            case "y":
                System.out.println("Option = 1");
                break;
            case "n":
                System.out.println("NO");
                break;
            default:
                System.out.println("Option != 1");
                break;
        }
    }
}