package ch.bbw;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int valA = 0;
        int valB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================" + "\n");

        valA = 10;
        valB = 20;
        System.out.println(valA + " + " + valB + " = " + calculator.sum(valA,valB));
    }
}
