import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Main {
    private static Shaker shaker;
    private static Player[] players;
    private static int numberOfPlayers = 2;
    private static int numberOfDices = 2;
    private static int winningScore = 40;

    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[0];
        GUI gui = new GUI(fields);

        players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(gui);
        }

        shaker = new Shaker(numberOfDices);

        boolean winnerFound = false;
        while(!winnerFound) {
            for(int i = 0; i < numberOfPlayers; i++) {
                System.out.println(players[0]);
                System.out.println(players[0].getName());
                System.out.println(players[1]);
                System.out.println(players[1].getName());
                gui.showMessage("Nu er det " + players[i].getName() + "'s tur. "+i);
                gui.getUserButtonPressed("Klar til at rulle?", "Rul!");

                int[] result = shaker.shake();

                gui.setDice(result[0], result[1]);
                players[i].addToScore(result[0]);
                players[i].addToScore(result[1]);

                if(winningScore <= players[i].getScore()) {
                    gui.showMessage("Der er fundet en vinder, det blev: " + players[i].getName());
                    winnerFound = true;
                }
            }
        }
        gui.close();
    }
}
