import gui_main.GUI;
import gui_fields.GUI_Player;

class Player {
    private static GUI_Player player;

    Player(GUI gui) {
        String playerName = gui.getUserString("Indtast et navn");
        player = new GUI_Player(playerName,0);
        gui.addPlayer(player);
    }

    GUI_Player export() {
        return player;
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
