package ui;

import models.AnimationState;
import models.Shimeji;

import javax.swing.*;
import java.awt.*;

public class ShimejiWindow extends JWindow {
    private JLabel spriteLabel;
    private final Shimeji shimeji;
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

        WalkBehavior walkBehavior = new WalkBehavior(this.shimeji, 16);
        currentBehavior = walkBehavior;

        Timer timer = new Timer(300, e -> {
            currentBehavior.update();
            setLocation(this.shimeji.getX(), this.shimeji.getY());
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
}