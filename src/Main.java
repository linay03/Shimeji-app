import models.AnimationState;
import models.Shimeji;
import ui.ShimejiWindow;
import ui.WalkBehavior;

import javax.swing.*;

void main() {
    System.out.println("Démarrage...");

    Map<AnimationState, String> spritePaths = new HashMap<>();

    spritePaths.put(AnimationState.IDLE, "assets/shimeji1.png");

    Shimeji shimeji = new Shimeji("Shimeji test", spritePaths,128, 500, 500, 2, 0);
    SwingUtilities.invokeLater(() -> {
        ShimejiWindow window = new ShimejiWindow(shimeji);
        window.setVisible(true);
    });

    System.out.println("Shimeji lancé !");
}