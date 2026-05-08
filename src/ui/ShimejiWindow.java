package ui;

import javax.swing.*;
import java.awt.*;

public class ShimejiWindow extends JWindow {
    private JLabel spriteLabel;

    public ShimejiWindow() {
        initShimejiWindow();
        new DragAndDrop(this);
    }

    public void initShimejiWindow() {
        setBackground(new Color(0, 0, 0, 0));
        setSize(128, 128);
        setLocation(500, 500);

        ImageIcon icon = new ImageIcon("assets/shimeji1.png");
        Image scaled = icon.getImage().getScaledInstance(128, 128, Image.SCALE_SMOOTH);
        spriteLabel = new JLabel(new ImageIcon(scaled));
        add(spriteLabel);
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }
}