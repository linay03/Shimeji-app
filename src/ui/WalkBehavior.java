package ui;

import models.Shimeji;

public class WalkBehavior extends Behavior{

    private int steps = 0;
    private int deltaTime;

    public WalkBehavior(Shimeji shimeji, int deltaTime) {
        super(shimeji);
        this.deltaTime = deltaTime;
    }

    public int getDeltaX (int x) {
         return x * this.deltaTime / 1000;
    }

    public int getDeltaY (int x) {
        return x * this.deltaTime / 1000;
    }

    @Override
    public boolean isFinished() {
        return steps > 20;
    }

    @Override
    public void update() {
        this.shimeji.setX(
                this.shimeji.getX() + this.shimeji.getVelocityX() * getDeltaX(this.shimeji.getX())
        );

        this.shimeji.setY(
                this.shimeji.getY() + this.shimeji.getVelocityY() * getDeltaY(this.shimeji.getY())
        );

        steps ++;
    }
}
