
package com.unpri.charactermanager.model;

import java.util.Locale;
import java.util.Objects;

public class Character {

    // Character attributes
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Shared counter for all Character objects
    private static int totalCharacterCreated = 0;

    // Constructor for new character
    public Character(String name, CharacterType type, int level) {
        setName(name);
        setType(type);
        setLevel(level);

        this.mana = 0;

        totalCharacterCreated++;
    }

    // Constructor for complete character data
    public Character(
            int id,
            String name,
            CharacterType type,
            int level,
            int hitPoints,
            int attackPower
    ) {
        this(name, type, level);

        this.id = id;
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
    }

    // Copy constructor
    public Character(Character other) {
        this(
                other.id,
                other.name,
                other.type,
                other.level,
                other.hitPoints,
                other.attackPower
        );

        this.mana = other.mana;
    }

    // ID getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty."
            );
        }

        this.name = name.trim();
    }

    // Type getter and setter
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = Objects.requireNonNull(
                type,
                "Character type cannot be null."
        );
    }

    // Level getter and setter
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                    "Level must be at least 1."
            );
        }

        this.level = level;
        this.hitPoints = level * 100;
        this.attackPower = level * 10;
    }

    // Hit points getter and setter
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                    "Hit points cannot be negative."
            );
        }

        this.hitPoints = hitPoints;
    }

    // Attack power getter and setter
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower < 0) {
            throw new IllegalArgumentException(
                    "Attack power cannot be negative."
            );
        }

        this.attackPower = attackPower;
    }

    // Mana getter and setter
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                    "Mana cannot be negative."
            );
        }

        this.mana = mana;
    }

    // Check character status
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Increase character level
    public void levelUp() {
        setLevel(level + 1);
    }

    // Get total created Character objects
    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    // Compare characters by name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name.equalsIgnoreCase(other.name);
    }

    // Generate hash code based on name
    @Override
    public int hashCode() {
        return name.toLowerCase(Locale.ROOT).hashCode();
    }

    // Display character information
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                ", isAlive=" + isAlive() +
                '}';
    }
}
