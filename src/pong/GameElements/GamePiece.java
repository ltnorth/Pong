package pong.GameElements;

import javax.swing.*;
import java.awt.*;

public class GamePiece extends JPanel {

    private int xPosition;
    private int yPosition;

    public GamePiece(){
        this.setOpaque(true);
        this.setBackground(Color.BLACK);
    }

    public void setSize(Dimension d){
        this.setPreferredSize(d);
    }

    public void setPosition(int x, int y){
        setXPosition(x);
        setYPosition(y);
    }

    public void setXPosition(int pos){
        xPosition = pos;
    }

    public void setYPosition(int pos){
        yPosition = pos;
    }

    public void moveUp(){
        yPosition--;
    }

    public void moveDown(){
        yPosition++;
    }

    public void moveRight(){
        xPosition++;
    }

    public void moveLeft(){
        xPosition--;
    }
}
