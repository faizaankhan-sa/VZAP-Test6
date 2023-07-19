package vzap.general;

import com.vzap.Player;
import com.vzap.PlayerException;

public class PlayerTest {
    public static void main(String[] args) throws PlayerException {

        try {
            Player player1 = new Player("");
        } catch (PlayerException e) {
            System.out.println("exception caught" + e.getMessage());
        }

        Player player2 = new Player("John");
        System.out.println("player name " + player2.getName());

        try {
            player2.addToScore(20);
            System.out.println("Player score " + player2.getScore());

            player2.addToScore(-30);
        } catch (PlayerException e) {
            System.out.println("exception caught" + e.getMessage());
        }
    }
}