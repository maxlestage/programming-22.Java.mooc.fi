package one.variables;

public class Recipe {

    public static void main(String[] args) {

        System.out.println("Chicken: ");
        int chicken = 9000;
        System.out.println(chicken);

        System.out.println("Bacon (kg)");
        double bacon = 0.1;
        System.out.println(bacon);

        System.out.println("Tractor: ");
        String tractor = "Terminator";
        System.out.println(tractor);

        System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);

    }
}

/*
 * Output Exemple :
 * 
 * Chicken: 9000 Bacon (kg): 0.1 Tractor: Zetor
 * 
 * And finally, a summary: 9000 0.1 Zetor
 */
