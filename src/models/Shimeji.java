package models;

import java.util.Map;

public class Shimeji {

    public String name;
    public Map<AnimationState, String> spritePaths;
    public int size;
    public int x;
    public int y;
    public int velocityX;
    public int velocityY;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpritePaths(Map<AnimationState, String> spritePaths) {
        this.spritePaths = spritePaths;
    }

    public void setName(String name) {
        this.name = name;
    }
}
