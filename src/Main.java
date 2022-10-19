public class Main {
    public static void main(String[] args) {
        double total = 0;

        int max = 100;
        for (double i = 1; i <= max; i++) {
            total += i;
        }
        System.out.println("Arithmetic mean " + (total / max));

    }
}