import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Donnez votre année de naissance : ");
            int yearOfBirth = sc.nextInt();
            System.out.println("Vous etes né en " + yearOfBirth);
        }catch(InputMismatchException e){
            System.out.println("Veuillez saisir un entier svp!");
        }
    }
}