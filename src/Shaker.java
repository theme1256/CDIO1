class Shaker {
    private static Dice[] dices;

    Shaker(int count) {
        dices = new Dice[count];
        for (int i = 0; i < count; i++) {
            dices[i] = new Dice();
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
