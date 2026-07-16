package models;

import javax.swing.*;
import java.util.Map;

public class Shimeji {

    private String name;
    private Map<AnimationState, String> spritePaths;
    private int size;
    private int x;
    private int y;
    private int velocityX;
    private int velocityY;
    private JLabel currentSprite;

    public Shimeji (String name, Map<AnimationState, String> spritePaths, int size, int x, int y, int velocityX, int velocityY) {
        this.name = name;
        this.spritePaths = spritePaths;
        this.size = size;
        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public String getName() {
        return name;
    }

    public  Map<AnimationState, String> getSpritePaths() {
        return spritePaths;
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public Map<AnimationState, String> getSpritePathsMap() {
        return spritePaths;
    }

    public JLabel getCurrentSprite() { return currentSprite; }

    public void setCurrentSprite(JLabel currentSprite) { this.currentSprite = currentSprite; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
