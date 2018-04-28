package pong.GameElements;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pong");
        GameEnvironment gameEnv = new GameEnvironment();
        this.getContentPane().add(gameEnv);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}

