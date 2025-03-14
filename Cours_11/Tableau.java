public class Tableau {

    public static void main(String[] args){
        int[] tab = {1, 2, 3, 4};

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);

        System.out.println("**************************");

        for(int i = 0; i < tab.length; i++){
            tab[i]++;

            System.out.println(tab[i]);
        }
    }
}