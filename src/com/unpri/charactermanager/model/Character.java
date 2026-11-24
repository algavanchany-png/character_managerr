package com.unpri.charactermanager.model;

public class Character {

    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor 1: Membuat karakter baru
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
        this.mana = 0;
    }

    // Constructor 2: Mengambil data karakter lengkap
    public Character(
            int id,
            String name,
            CharacterType type,
            int level,
            int hitPoints,
            int attackPower
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.mana = 0;
    }

    // Getter dan Setter ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter Type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter dan Setter Level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                    "Level harus minimal 1."
            );
        }

        this.level = level;
        this.hitPoints = level * 100;
        this.attackPower = level * 10;
    }

    // Getter dan Setter Hit Points
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                    "Hit points tidak boleh negatif."
            );
        }

        this.hitPoints = hitPoints;
    }

    // Getter dan Setter Attack Power
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower < 0) {
            throw new IllegalArgumentException(
                    "Attack power tidak boleh negatif."
            );
        }

        this.attackPower = attackPower;
    }

    // Mini-Challenge: Getter dan Setter Mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                    "Mana tidak boleh negatif."
            );
        }

        this.mana = mana;
    }

    // Mini-Challenge: Memeriksa status karakter
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menaikkan level karakter
    public void levelUp() {
        setLevel(level + 1);
    }

    // Menampilkan informasi karakter
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