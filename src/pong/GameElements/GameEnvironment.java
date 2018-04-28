package pong.GameElements;

import javax.swing.*;
import java.awt.*;

public class GameEnvironment extends JPanel {

    private Player playerOne;
    private Player playerTwo;
    private Puck puck;

    public GameEnvironment(){
        this.setPreferredSize(new Dimension(900, 600));
        this.setLayout(null);
        playerOne = new Player(25,200);
        playerTwo = new Player(825,200);
        puck = new Puck(430,280);
        this.add(playerOne);
        this.add(playerTwo);
        this.add(puck);
    }
}
