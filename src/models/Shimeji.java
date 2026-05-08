package models;

import ui.ShimejiWindow;
import javax.swing.*;

public class Shimeji {
    public static void launch() {
        SwingUtilities.invokeLater(() -> {
            ShimejiWindow window = new ShimejiWindow();
            window.setVisible(true);
        });
    }
}
