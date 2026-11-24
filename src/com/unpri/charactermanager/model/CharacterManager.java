
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private final ArrayList<Character> characters;

    // Constructor
    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // =====================================
    // CREATE
    // =====================================

    public boolean addCharacter(Character character) {

        if (character == null) {
            throw new IllegalArgumentException(
                    "Character cannot be null."
            );
        }

        if (characters.contains(character)) {
            System.out.println(
                    "[REJECTED] Character " +
                    character.getName() +
                    " already exists."
            );

            return false;
        }

        characters.add(character);

        System.out.println(
                "[SUCCESS] Character " +
                character.getName() +
                " added successfully."
        );

        return true;
    }

    // =====================================
    // READ
    // =====================================

    public Character findByName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return null;
        }

        for (Character character : characters) {

            if (character.getName().equalsIgnoreCase(name.trim())) {
                return character;
            }
        }

        return null;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    // Return a defensive copy of character list
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // =====================================
    // DELETE
    // =====================================

    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character == null) {
            System.out.println(
                    "[FAILED] Character not found."
            );

            return false;
        }

        characters.remove(character);

        System.out.println(
                "[SUCCESS] Character " +
                character.getName() +
                " removed successfully."
        );

        return true;
    }

    // =====================================
    // MINI CHALLENGE 1
    // AVERAGE LEVEL
    // =====================================

    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0.0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    // =====================================
    // MINI CHALLENGE 2
    // FIND BY TYPE
    // =====================================

    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character character : characters) {

            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    // =====================================
    // CUSTOM FEATURE
    // COUNT BY TYPE
    // =====================================

    /**
     * Counts characters based on their type.
     *
     * @param type character type to count
     * @return number of characters with the specified type
     */
    public int countByType(CharacterType type) {

        if (type == null) {
            return 0;
        }

        int count = 0;

        for (Character character : characters) {

            if (character.getType() == type) {
                count++;
            }
        }

        return count;
    }
}
