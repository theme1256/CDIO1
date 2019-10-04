import gui_main.GUI;
import gui_fields.GUI_Player;

class Player {
    private static GUI_Player player;

    Player(GUI gui) {
        String playerName = gui.getUserString("Indtast et navn");
        this.player = new GUI_Player(playerName,0);
        gui.addPlayer(this.player);
    }

    GUI_Player export() {
        return this.player;
    }

    void addToScore(int added) {
        int temp = this.player.getBalance();
        this.player.setBalance(temp + added);
    }

    int getScore() {
        return this.player.getBalance();
    }

    String getName() {
        return this.player.getName();
    }
}
