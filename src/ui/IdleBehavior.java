package ui;

import models.Shimeji;

public class IdleBehavior extends Behavior{

    public IdleBehavior(Shimeji shimeji) {
        super(shimeji);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void update() {

    }
}
