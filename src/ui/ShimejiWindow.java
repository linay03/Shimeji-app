package ui;

import models.AnimationState;
import models.Shimeji;

import javax.swing.*;
import java.awt.*;

public class ShimejiWindow extends JWindow {
    private JLabel spriteLabel;
    private final Shimeji shimeji;
    private double lastUpdateTime;
    private Behavior currentBehavior;

    public ShimejiWindow(Shimeji shimeji) {
        this.shimeji = shimeji;
        initShimejiWindow();
        new DragAndDrop(this);
    }

    public void initShimejiWindow() {
        setBackground(new Color(0, 0, 0, 0));
        setSize(this.shimeji.getSize(), this.shimeji.getSize());
        setLocation(500, 500);
        ImageIcon icon = new ImageIcon(this.shimeji.getSpritePaths().get(AnimationState.IDLE));
        Image scaled = icon.getImage().getScaledInstance(83, 200, Image.SCALE_SMOOTH);
        spriteLabel = new JLabel(new ImageIcon(scaled));
        add(spriteLabel);

        lastUpdateTime = System.currentTimeMillis();

        WalkBehavior walkBehavior = new WalkBehavior(this.shimeji);
        currentBehavior = walkBehavior;

        Timer timer = new Timer(300, e -> {

            long now = System.currentTimeMillis();
            double deltaTime = (now - lastUpdateTime) / 1000.0;
            lastUpdateTime = now;

            shimeji.setDeltaTime(deltaTime);

            currentBehavior.update();
            setLocation(this.shimeji.getX(), this.shimeji.getY());
            spriteLabel.setIcon(this.shimeji.getCurrentSprite().getIcon());
            if (currentBehavior.isFinished()) {
                currentBehavior = getRandomBehavior();
            }
        });

        timer.start();
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }

    public Behavior getRandomBehavior() {
        return new IdleBehavior(this.shimeji);
    }

    public Shimeji getShimeji() {
        return this.shimeji;
    }
}