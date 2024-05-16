import java.util.Random;

public class DovWhile {

    public static void main(String[] args) {
        boolean atendeu = false;

        do {
            atendeu = tocando();
            System.out.println("Atendeu? " + atendeu);
        } while (!atendeu);

        System.out.println("Finalmente atendeu!");
    }

    private static boolean tocando() {
        return new Random().nextInt(3) == 1;
    }
}
