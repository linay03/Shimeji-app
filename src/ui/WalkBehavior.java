package ui;

import models.AnimationState;
import models.Shimeji;

import javax.swing.*;
import java.awt.*;

public class WalkBehavior extends Behavior{

    private int steps = 0;
    private int animationChangeFrame = 0;
    private final int animationSpeed = 1;

    public WalkBehavior(Shimeji shimeji) {
        super(shimeji);
    }

    @Override
    public boolean isFinished() {
        return steps > 40;
    }

    @Override
    public void update() {

        if (shimeji.isDragging()){
            return;
        }

        this.shimeji.setX(
                (int) (this.shimeji.getX() + this.shimeji.getVelocityX() * shimeji.getDeltaTime())
        );

        this.shimeji.setY(
                (int) (this.shimeji.getY() + this.shimeji.getVelocityY() * shimeji.getDeltaTime())
        );

        // Frame change by steps
        animationChangeFrame++;

        if (animationChangeFrame > 3) {
            animationChangeFrame = 0;
        }

        updateSprite();

        steps ++;
    }

    /**
     * Updates the sprite of the Shimeji based on the current direction and animation frame.
     * Change between idle and walking sprites based on the animationChangeFrame.
     */
    private void updateSprite() {
        AnimationState state;

        if (animationChangeFrame == 0) {
            state = AnimationState.IDLE;
        } else if (animationChangeFrame == 1) {
            state = AnimationState.WALK_RIGHT1;
        } else if (animationChangeFrame == 2) {
            state = AnimationState.IDLE;
        } else {
            state = AnimationState.WALK_RIGHT2;
        }

        ImageIcon icon = new ImageIcon(shimeji.getSpritePaths().get(state));

        int width;
        if (state == AnimationState.IDLE){
            width = 83;
        } else {
            width = 100;
        }

        Image scaled = icon.getImage().getScaledInstance(
                width,
                200,
                Image.SCALE_SMOOTH
        );

        shimeji.setCurrentSprite(new JLabel(new ImageIcon(scaled)));
    }
}
