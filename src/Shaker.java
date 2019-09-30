public class Shaker {
    private static Dice[] dices;

    public static void main(String[] args) {
    }

    void setup(int count) {
        dices = new Dice[count];
        for (int i = 0; i < count; i++) {
            dices[i] = new Dice();
            dices[i].setup();
        }
    }
    
    int[] shake() {
        int[] out = new int[dices.length];
        for(int i = 0; i < dices.length; i++) {
            out[i] = dices[i].roll();
        }
        return out;
    }
}
