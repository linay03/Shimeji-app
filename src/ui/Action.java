package ui;

import models.Shimeji;

public abstract class Action {

    protected Shimeji shimeji;
    protected  int x;
    protected  int y;
    protected  int duration;

    public Action(Shimeji shimeji, int x, int y) {
        this.shimeji = shimeji;
        this.x = x;
        this.y = y;
    }

    public Action(Shimeji shimeji, int x, int y, int duration) {
        this.shimeji = shimeji;
        this.x = x;
        this.y = y;
        this.duration = duration;
    }

    public abstract void update();

}
