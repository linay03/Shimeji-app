package ui;

import models.Shimeji;

public abstract class Behavior {

    protected Shimeji shimeji;

    public Behavior(Shimeji shimeji) {
        this.shimeji = shimeji;
    }

    public abstract boolean isFinished();

    public abstract void update();
}
