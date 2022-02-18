package one.calculatingwithnumbers;

public class CalculationInSteps {
    public static void main(String[] args) {

        int first = (1 + 1);
        System.out.println(first + " first ligne 6");
        int second = first + 3 * (2 + 5);
        System.out.println(second + " second ligne 8");

        first = 5;
        System.out.println(first + " first ligne 10, réaffectation");

        int third = first + second;
        System.out.println(second + " second ligne 10, réaffectation");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
