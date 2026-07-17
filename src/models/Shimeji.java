package models;

import javax.swing.*;
import java.util.Map;

public class Shimeji {

    private String name;
    private Map<AnimationState, String> spritePaths;
    private int size;
    private int x;
    private int y;
    private double velocityX = 40.0;
    private double velocityY = 0.0;
    private double deltaTime;
    private JLabel currentSprite;
    private boolean isDragging = false;

    public Shimeji (String name, Map<AnimationState, String> spritePaths, int size, int x, int y) {
        this.name = name;
        this.spritePaths = spritePaths;
        this.size = size;
        this.x = x;
        this.y = y;
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

    public double getVelocityX() {
        return velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public  double getDeltaTime() {
        return deltaTime;
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

    public void setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
    }

    public boolean isDragging() {
        return isDragging;
    }

    public void setDragging(boolean dragging) {
        isDragging = dragging;
    }

}
