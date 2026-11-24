package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        List<Character> characters = new ArrayList<>();

        // =====================================
        // SAMPLE CHARACTER DATA
        // =====================================

        addCharacter(manager, characters,
                new Character("Arjuna", CharacterType.WARRIOR, 5));

        addCharacter(manager, characters,
                new Character("Merlin", CharacterType.MAGE, 3));

        addCharacter(manager, characters,
                new Character("Athena", CharacterType.ARCHER, 4));

        addCharacter(manager, characters,
                new Character("Gatotkaca", CharacterType.WARRIOR, 7));

        addCharacter(manager, characters,
                new Character("Morgana", CharacterType.MAGE, 1));

        addCharacter(manager, characters,
                new Character("Robin Hood", CharacterType.ARCHER, 6));

        addCharacter(manager, characters,
                new Character("Leonidas", CharacterType.WARRIOR, 9));

        addCharacter(manager, characters,
                new Character("Luna", CharacterType.MAGE, 2));

        // =====================================
        // RUN APPLICATION
        // =====================================

        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(characters);

            window.setVisible(true);
        });
    }

    private static void addCharacter(
            CharacterManager manager,
            List<Character> characters,
            Character character
    ) {

        manager.addCharacter(character);
        characters.add(character);
    }
}