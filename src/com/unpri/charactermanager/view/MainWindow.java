package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    private final CharacterManager manager;

    private JPanel mainPanel;
    private JPanel characterPanel;

    private JLabel totalLabel;
    private JLabel averageLabel;

    public MainWindow(CharacterManager manager) {

        this.manager = manager;

        initializeWindow();
        initializeComponents();
        displayCharacters();
    }

    // ==============================
    // WINDOW CONFIGURATION
    // ==============================

    private void initializeWindow() {

        setTitle("Character Manager v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(420, 300));

        setBackground(AppTheme.BG_MAIN);
        setLocationRelativeTo(null);
    }

    // ==============================
    // COMPONENT INITIALIZATION
    // ==============================

    private void initializeComponents() {

        mainPanel = new JPanel(new BorderLayout(10, 15));
        mainPanel.setBackground(AppTheme.BG_MAIN);
        mainPanel.setBorder(AppTheme.PANEL_BORDER);

        // Header
        JLabel titleLabel = new JLabel("CHARACTER MANAGER");
        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.GOLD);

        // Statistics
        JPanel statisticsPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        statisticsPanel.setBackground(AppTheme.BG_MAIN);

        totalLabel = new JLabel();
        averageLabel = new JLabel();

        totalLabel.setFont(AppTheme.FONT_NORMAL);
        averageLabel.setFont(AppTheme.FONT_NORMAL);

        totalLabel.setForeground(AppTheme.TEXT_MAIN);
        averageLabel.setForeground(AppTheme.TEXT_MAIN);

        statisticsPanel.add(totalLabel);
        statisticsPanel.add(averageLabel);

        // Header container
        JPanel headerPanel = new JPanel(new BorderLayout(5, 10));
        headerPanel.setBackground(AppTheme.BG_MAIN);

        headerPanel.add(titleLabel, BorderLayout.NORTH);
        headerPanel.add(statisticsPanel, BorderLayout.SOUTH);

        // Character cards
        characterPanel = new JPanel(new GridLayout(0, 2, 12, 12));
        characterPanel.setBackground(AppTheme.BG_MAIN);
        characterPanel.setBorder(AppTheme.PANEL_BORDER);

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        scrollPane.setBorder(AppTheme.NO_BORDER);
        scrollPane.getViewport().setBackground(AppTheme.BG_MAIN);
        scrollPane.setPreferredSize(new Dimension(650, 400));

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);

        pack();
    }

    // ==============================
    // DISPLAY CHARACTERS
    // ==============================

    private void displayCharacters() {

        characterPanel.removeAll();

        ArrayList<Character> characters = manager.getAllCharacters();

        for (Character character : characters) {

            JPanel card = createCharacterCard(character);

            characterPanel.add(card);
        }

        updateStatistics();

        characterPanel.revalidate();
        characterPanel.repaint();
    }

    // ==============================
    // CREATE CHARACTER CARD
    // ==============================

    private JPanel createCharacterCard(Character character) {

        JPanel card = new JPanel(new GridLayout(0, 1, 5, 5));

        // Background berdasarkan role
        card.setBackground(AppTheme.colorFor(character.getType()));

        // Wajib agar warna background JPanel terlihat
        card.setOpaque(true);

        // Border berdasarkan role
        card.setBorder(AppTheme.borderFor(character.getType()));

        // Informasi karakter
        JLabel nameLabel = new JLabel(character.getName());
        JLabel typeLabel = new JLabel(
                "Role: " + character.getType()
        );

        JLabel levelLabel = new JLabel(
                "Level: " + character.getLevel()
        );

        JLabel hpLabel = new JLabel(
                "HP: " + character.getHitPoints()
        );

        JLabel attackLabel = new JLabel(
                "ATK: " + character.getAttackPower()
        );

        // Mengatur tampilan label
        JLabel[] labels = {
            nameLabel,
            typeLabel,
            levelLabel,
            hpLabel,
            attackLabel
        };

        for (JLabel label : labels) {

            label.setForeground(AppTheme.TEXT_LIGHT);
            label.setFont(AppTheme.FONT_NORMAL);

            card.add(label);
        }

        // Mini Challenge:
        // Level minimal 5 mendapatkan highlight emas
        if (character.getLevel() >= AppTheme.HIGH_LEVEL_LIMIT) {

            nameLabel.setForeground(AppTheme.GOLD);
            nameLabel.setFont(AppTheme.FONT_HIGHLIGHT);

            levelLabel.setForeground(AppTheme.GOLD);
            levelLabel.setFont(AppTheme.FONT_HIGHLIGHT);
        }

        // Properti tambahan 1:
        // Tooltip berisi informasi karakter
        card.setToolTipText(
                character.getName()
                + " | HP: " + character.getHitPoints()
                + " | ATK: " + character.getAttackPower()
        );

        // Properti tambahan 2:
        // Cursor menunjukkan kartu sebagai elemen interaktif
        card.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        return card;
    }

    // ==============================
    // UPDATE STATISTICS
    // ==============================

    private void updateStatistics() {

        totalLabel.setText(
                "Total Characters: " + manager.getTotalCharacters()
        );

        averageLabel.setText(
                String.format(
                        "Average Level: %.2f",
                        manager.getAverageLevel()
                )
        );
    }
}