package test.day05;

public class Q1 {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted
  /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulkeler:food
             ) {

            for (String yemekler:ulkeler) {
                System.out.println(yemekler);

            }
            System.out.println("------------------");

        }
    }
}
