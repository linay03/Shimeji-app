import models.AnimationState;
import models.Shimeji;
import ui.ShimejiWindow;
import ui.WalkBehavior;

import javax.swing.*;

void main() {
    System.out.println("Démarrage...");

    Map<AnimationState, String> spritePaths = new HashMap<>();

    spritePaths.put(AnimationState.IDLE, "assets/shimeji-idle-right.png");
    spritePaths.put(AnimationState.WALK_LEFT1, "assets/walk/shimeji-walk1-left.png");
    spritePaths.put(AnimationState.WALK_LEFT2, "assets/walk/shimeji-walk2-left.png");
    spritePaths.put(AnimationState.WALK_RIGHT1, "assets/walk/shimeji-walk1-right.png");
    spritePaths.put(AnimationState.WALK_RIGHT2, "assets/walk/shimeji-walk2-right.png");

    Shimeji shimeji = new Shimeji("Shimeji test", spritePaths,360, 500, 500, 2, 0);
    SwingUtilities.invokeLater(() -> {
        ShimejiWindow window = new ShimejiWindow(shimeji);
        window.setVisible(true);
    });

    System.out.println("Shimeji lancé !");
}