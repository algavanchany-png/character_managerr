package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     CHARACTER MANAGER TP3");
        System.out.println("================================");

        // Membuat tiga karakter
        Character arthur = new Character(
                "Arthur",
                CharacterType.WARRIOR,
                5
        );

        Character merlin = new Character(
                "Merlin",
                CharacterType.MAGE,
                3
        );

        Character robin = new Character(
                "Robin",
                CharacterType.ARCHER,
                4
        );

        // Menampilkan karakter
        System.out.println("\n--- DAFTAR KARAKTER ---");

        System.out.println(arthur);
        System.out.println(merlin);
        System.out.println(robin);

        // Demo level up
        System.out.println("\n--- LEVEL UP ---");

        arthur.levelUp();

        System.out.println("Arthur naik level!");
        System.out.println(arthur);

        // Mini-Challenge: Mana dan isAlive()
        System.out.println("\n--- MINI CHALLENGE ---");

        Character necro = new Character(
                "Shadow",
                CharacterType.ASSASSIN,
                6
        );

        necro.setMana(150);

        System.out.println("Nama       : " + necro.getName());
        System.out.println("Mana       : " + necro.getMana());
        System.out.println("Status     : " + necro.isAlive());

        System.out.println("\n--- DETAIL KARAKTER ---");
        System.out.println(necro);

        System.out.println("\n================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("================================");
    }
}