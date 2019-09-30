import java.util.Random;

class Dice {
    private static Random rand;

    Dice() {
        rand = new Random();
    }

    int roll() {
        return 1 + rand.nextInt(5);
    }
}
