package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    private final List<Character> characters;

    private JPanel characterPanel;

    private JLabel totalLabel;
    private JLabel warriorLabel;
    private JLabel mageLabel;
    private JLabel archerLabel;

    // =====================================
    // CONSTRUCTOR
    // =====================================

    public MainWindow(List<Character> characters) {

        this.characters = characters;

        initializeWindow();
        initializeComponents();
        displayCharacters();
    }

    // =====================================
    // WINDOW
    // =====================================

    private void initializeWindow() {

        setTitle("Character Manager v0.5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(650, 400));
    }

    // =====================================
    // MAIN COMPONENTS
    // =====================================

    private void initializeComponents() {

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        mainPanel.setBackground(AppTheme.BG_MAIN);
        mainPanel.setBorder(AppTheme.PANEL_BORDER);

        JPanel headerPanel = createHeaderPanel();
        JScrollPane scrollPane = createCharacterScrollPane();
        JPanel legendPanel = createLegendPanel();
        JPanel statusPanel = createStatusPanel();

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(legendPanel, BorderLayout.EAST);
        mainPanel.add(statusPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);

        pack();
        setMinimumSize(new Dimension(650, 400));
        setLocationRelativeTo(null);
    }

    // =====================================
    // HEADER
    // =====================================

    private JPanel createHeaderPanel() {

        JPanel headerPanel = new JPanel(new BorderLayout(5, 10));

        headerPanel.setBackground(AppTheme.BG_MAIN);

        JLabel titleLabel = new JLabel("CHARACTER MANAGER");

        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.GOLD);

        JPanel statisticsPanel = new JPanel(
                new GridLayout(2, 2, 10, 8)
        );

        statisticsPanel.setBackground(AppTheme.BG_MAIN);

        totalLabel = createStatisticLabel();
        warriorLabel = createStatisticLabel();
        mageLabel = createStatisticLabel();
        archerLabel = createStatisticLabel();

        statisticsPanel.add(totalLabel);
        statisticsPanel.add(warriorLabel);
        statisticsPanel.add(mageLabel);
        statisticsPanel.add(archerLabel);

        headerPanel.add(titleLabel, BorderLayout.NORTH);
        headerPanel.add(statisticsPanel, BorderLayout.SOUTH);

        return headerPanel;
    }

    private JLabel createStatisticLabel() {

        JLabel label = new JLabel();

        label.setFont(AppTheme.FONT_NORMAL);
        label.setForeground(AppTheme.TEXT_MAIN);

        return label;
    }

    private void updateStatistics() {

        int warrior = countByType(CharacterType.WARRIOR);
        int mage = countByType(CharacterType.MAGE);
        int archer = countByType(CharacterType.ARCHER);

        totalLabel.setText("Total Characters: " + characters.size());
        warriorLabel.setText("Warrior: " + warrior);
        mageLabel.setText("Mage: " + mage);
        archerLabel.setText("Archer: " + archer);
    }

    private int countByType(CharacterType type) {

        int count = 0;

        for (Character character : characters) {

            if (character.getType() == type) {
                count++;
            }
        }

        return count;
    }

    // =====================================
    // CHARACTER SCROLL PANE
    // =====================================

    private JScrollPane createCharacterScrollPane() {

        characterPanel = new JPanel(
                new GridLayout(0, 2, 12, 12)
        );

        characterPanel.setBackground(AppTheme.BG_MAIN);
        characterPanel.setBorder(AppTheme.PANEL_BORDER);

        JPanel wrapperPanel = new JPanel(new BorderLayout());

        wrapperPanel.setBackground(AppTheme.BG_MAIN);

        wrapperPanel.add(characterPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(wrapperPanel);

        scrollPane.setPreferredSize(new Dimension(600, 400));

        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        scrollPane.getViewport().setBackground(AppTheme.BG_MAIN);

        return scrollPane;
    }

    // =====================================
    // DISPLAY CHARACTERS
    // =====================================

    private void displayCharacters() {

        characterPanel.removeAll();

        for (Character character : characters) {

            characterPanel.add(createCharacterCard(character));
        }

        updateStatistics();

        characterPanel.revalidate();
        characterPanel.repaint();
    }

    // =====================================
    // CHARACTER CARD
    // =====================================

    private JPanel createCharacterCard(Character character) {

        JPanel card = new JPanel(new GridLayout(0, 1, 5, 5));

        card.setBackground(
                AppTheme.colorFor(character.getType())
        );

        card.setOpaque(true);

        card.setBorder(
                AppTheme.borderFor(character.getType())
        );

        JLabel nameLabel = new JLabel(character.getName());

        JLabel roleLabel = new JLabel(
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

        JLabel[] labels = {
            nameLabel,
            roleLabel,
            levelLabel,
            hpLabel,
            attackLabel
        };

        for (JLabel label : labels) {

            label.setFont(AppTheme.FONT_NORMAL);
            label.setForeground(AppTheme.TEXT_LIGHT);

            card.add(label);
        }

        if (character.getLevel() >= AppTheme.HIGH_LEVEL_LIMIT) {

            nameLabel.setForeground(AppTheme.GOLD);
            nameLabel.setFont(AppTheme.FONT_HIGHLIGHT);

            levelLabel.setForeground(AppTheme.GOLD);
            levelLabel.setFont(AppTheme.FONT_HIGHLIGHT);
        }

        card.setToolTipText(
                character.getName()
                + " | HP: " + character.getHitPoints()
                + " | ATK: " + character.getAttackPower()
        );

        return card;
    }

    // =====================================
    // ROLE LEGEND
    // =====================================

    private JPanel createLegendPanel() {

        JPanel legendPanel = new JPanel();

        legendPanel.setLayout(
                new BoxLayout(legendPanel, BoxLayout.Y_AXIS)
        );

        legendPanel.setBackground(AppTheme.BG_CARD);
        legendPanel.setBorder(AppTheme.CARD_BORDER);

        JLabel titleLabel = new JLabel("ROLE LEGEND");

        titleLabel.setFont(AppTheme.FONT_NORMAL);
        titleLabel.setForeground(AppTheme.GOLD);

        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        legendPanel.add(titleLabel);
        legendPanel.add(Box.createVerticalStrut(15));

        for (CharacterType type : CharacterType.values()) {

            JLabel roleLabel = new JLabel("●  " + type.name());

            roleLabel.setFont(AppTheme.FONT_NORMAL);
            roleLabel.setForeground(AppTheme.colorFor(type));

            roleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            legendPanel.add(roleLabel);
            legendPanel.add(Box.createVerticalStrut(12));
        }

        legendPanel.add(Box.createVerticalGlue());

        legendPanel.setPreferredSize(new Dimension(150, 250));

        return legendPanel;
    }

    // =====================================
    // STATUS BAR
    // =====================================

    private JPanel createStatusPanel() {

        JPanel statusPanel = new JPanel(new BorderLayout());

        statusPanel.setBackground(AppTheme.BG_CARD);
        statusPanel.setBorder(AppTheme.CARD_BORDER);

        JLabel statusLabel = new JLabel(
                "Character Manager is running"
        );

        JLabel versionLabel = new JLabel("v0.5");

        statusLabel.setFont(AppTheme.FONT_NORMAL);
        statusLabel.setForeground(AppTheme.TEXT_MAIN);

        versionLabel.setFont(AppTheme.FONT_MONO);
        versionLabel.setForeground(AppTheme.GOLD);

        statusPanel.add(statusLabel, BorderLayout.WEST);
        statusPanel.add(versionLabel, BorderLayout.EAST);

        return statusPanel;
    }
}