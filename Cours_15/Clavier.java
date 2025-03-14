import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clavier {
    /**
     * BufferReader -> synchrone
     *                  thread-safe
     *                  lecture de chaine de caractères (String)
     * 
     * Scanner -> asynchrone
     *              not thread-safe
     *              lecture de donnée + parsing
     * 
     */
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("What is your name ?: ");
    }
}