
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Initial character data
        manager.addCharacter(
                new Character("Arthur", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
                new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
                new Character("Robin", CharacterType.ARCHER, 4)
        );

        manager.addCharacter(
                new Character("Morgana", CharacterType.MAGE, 6)
        );

        manager.addCharacter(
                new Character("Athena", CharacterType.ARCHER, 7)
        
        );
        manager.addCharacter(
    new Character("Morgana", CharacterType.MAGE, 6)
);

manager.addCharacter(
    new Character("Athena", CharacterType.ARCHER, 7)
);

        // Run GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(manager);

            window.pack();
            window.setLocationRelativeTo(null);
            window.setVisible(true);

        });
    }
}
