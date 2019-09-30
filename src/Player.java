import gui_fields.GUI_Field;
import gui_main.GUI;
import gui_fields.GUI_Player;

public class Player {
    private static GUI_Player player;

    public static void main(String[] args) {
    }

    void setup(GUI gui) {
        String spillernavn = gui.getUserString("Indtast et navn");
        player = new GUI_Player(spillernavn,0);
        gui.addPlayer(player);
    }

    void addToScore(int added) {
        int temp = player.getBalance();
        player.setBalance(temp + added);
    }

    int getScore() {
        return player.getBalance();
    }

    String getName() {
        return player.getName();
    }
}
