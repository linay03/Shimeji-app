package ui;

import models.Shimeji;

public class IdleBehavior extends Behavior{

    public IdleBehavior(Shimeji shimeji) {
        super(shimeji);
    }

    public IdleBehavior(Shimeji shimeji, Boolean isInit) {
        super(shimeji);
        initIdle();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void update() {
    }

    private void initIdle() {
        this.shimeji.setX(500);
        this.shimeji.setY(500);
    }
}
