package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class DragAndDrop {

    public DragAndDrop(ShimejiWindow shimejiWindow) {
        enableDragAndDrop(shimejiWindow);
    }

    public void enableDragAndDrop(ShimejiWindow shimejiWindow) {
        JLabel sprite = shimejiWindow.getSpriteLabel();
        Point initialClick = new Point();

        sprite.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick.setLocation(e.getPoint());
            }
        });
        sprite.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point dragPoint = new Point(e.getX(), e.getY());
                Point newLocation = new Point(
                        shimejiWindow.getLocation().x + dragPoint.x - initialClick.x,
                        shimejiWindow.getLocation().y + dragPoint.y - initialClick.y
                );
                shimejiWindow.setLocation(newLocation);
            }
        });
    }
}
