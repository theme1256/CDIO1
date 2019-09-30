import java.util.Random;

public class Dice {
    private static Random rand;

    public static void main(String[] args){
    }

    void setup(){
        rand = new Random();
    }

    int roll() {
        return 1 + rand.nextInt(5);
    }
}
