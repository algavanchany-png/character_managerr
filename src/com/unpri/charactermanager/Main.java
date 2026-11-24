
package com.unpri.charactermanager;

import java.util.ArrayList;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        System.out.println("========================================");
        System.out.println("       CHARACTER MANAGER - TP5");
        System.out.println("========================================");

        // =====================================
        // 1. CREATE CHARACTERS
        // =====================================

        System.out.println("\n[1] CREATE CHARACTERS");

        Character arthur = new Character(
                "Arthur", CharacterType.WARRIOR, 5
        );

        Character merlin = new Character(
                "Merlin", CharacterType.MAGE, 8
        );

        Character robin = new Character(
                "Robin", CharacterType.ARCHER, 4
        );

        Character morgana = new Character(
                "Morgana", CharacterType.MAGE, 6
        );

        manager.addCharacter(arthur);
        manager.addCharacter(merlin);
        manager.addCharacter(robin);
        manager.addCharacter(morgana);

        // =====================================
        // 2. DUPLICATE VALIDATION
        // =====================================

        System.out.println("\n[2] DUPLICATE VALIDATION");

        Character duplicate = new Character(
                "ARTHUR", CharacterType.MAGE, 3
        );

        manager.addCharacter(duplicate);

        // =====================================
        // 3. DISPLAY ALL CHARACTERS
        // =====================================

        System.out.println("\n[3] ALL CHARACTERS");

        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }

        // =====================================
        // 4. FIND CHARACTER
        // =====================================

        System.out.println("\n[4] FIND CHARACTER");

        Character found = manager.findByName("Merlin");

        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Character not found.");
        }

        // =====================================
        // 5. REMOVE CHARACTER
        // =====================================

        System.out.println("\n[5] REMOVE CHARACTER");

        manager.removeCharacter("Robin");

        System.out.println(
                "Total characters: " +
                manager.getTotalCharacters()
        );

        // =====================================
        // 6. AVERAGE LEVEL
        // =====================================

        System.out.println("\n[6] AVERAGE LEVEL");

        System.out.println(
                "Average level: " +
                manager.getAverageLevel()
        );

        // =====================================
        // 7. FIND BY TYPE
        // =====================================

        System.out.println("\n[7] FIND BY TYPE: MAGE");

        ArrayList<Character> mages =
                manager.findByType(CharacterType.MAGE);

        for (Character mage : mages) {
            System.out.println(mage);
        }

        // =====================================
        // 8. CUSTOM FEATURE
        // =====================================

        System.out.println("\n[8] COUNT BY TYPE");

        System.out.println(
                "Warrior: " +
                manager.countByType(CharacterType.WARRIOR)
        );

        System.out.println(
                "Mage: " +
                manager.countByType(CharacterType.MAGE)
        );

        System.out.println(
                "Archer: " +
                manager.countByType(CharacterType.ARCHER)
        );

        // =====================================
        // 9. DEFENSIVE COPY EXPERIMENT
        // =====================================

        System.out.println("\n[9] DEFENSIVE COPY EXPERIMENT");

        ArrayList<Character> copiedList =
                manager.getAllCharacters();

        System.out.println(
                "Original list before clear: " +
                manager.getTotalCharacters()
        );

        copiedList.clear();

        System.out.println(
                "Original list after clear: " +
                manager.getTotalCharacters()
        );

        // =====================================
        // 10. OBJECT REFERENCE EXPERIMENT
        // =====================================

        System.out.println("\n[10] OBJECT REFERENCE");

        Character a = new Character(
                "ReferenceHero",
                CharacterType.WARRIOR,
                5
        );

        Character b = a;

        b.setLevel(8);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("Level b: " + b.getLevel());
        System.out.println("a == b: " + (a == b));

        // =====================================
        // 11. INDEPENDENT OBJECT EXPERIMENT
        // =====================================

        System.out.println("\n[11] COPY CONSTRUCTOR");

        Character c = new Character(a);

        c.setLevel(10);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("Level c: " + c.getLevel());
        System.out.println("a == c: " + (a == c));

        // =====================================
        // 12. EMPTY LIST EXPERIMENT
        // =====================================

        System.out.println("\n[12] EMPTY LIST EXPERIMENT");

        CharacterManager emptyManager =
                new CharacterManager();

        System.out.println(
                "Empty average level: " +
                emptyManager.getAverageLevel()
        );

        // =====================================
        // 13. STATIC COUNTER
        // =====================================

        System.out.println("\n[13] STATIC COUNTER");

        System.out.println(
                "Total objects created: " +
                Character.getTotalCharacterCreated()
        );

        // =====================================
        // END PROGRAM
        // =====================================

        System.out.println("\n========================================");
        System.out.println("          PROGRAM FINISHED");
        System.out.println("========================================");
    }
}
