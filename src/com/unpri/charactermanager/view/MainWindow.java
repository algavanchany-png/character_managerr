
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;
import java.util.Locale;

public class MainWindow extends JFrame {

    private final CharacterManager manager;

    private JPanel characterPanel;
    private JLabel averageLevelLabel;
    private JLabel totalCharacterLabel;

    public MainWindow(CharacterManager manager) {
        this.manager = manager;

        initializeWindow();
        initializeComponents();
        refreshCharacterList();
    }

    private void initializeWindow() {
        setTitle("Character Manager - Sprint #3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(450, 350));
        setLayout(new BorderLayout(10, 10));
    }

    private void initializeComponents() {

        // Header
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(new EmptyBorder(15, 15, 10, 15));

        JLabel titleLabel = new JLabel("CHARACTER MANAGER");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));

        JLabel subtitleLabel = new JLabel("Character List & Statistics");
        subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));

        JPanel titleContainer = new JPanel();
        titleContainer.setLayout(new BoxLayout(titleContainer, BoxLayout.Y_AXIS));
        titleContainer.add(titleLabel);
        titleContainer.add(Box.createVerticalStrut(5));
        titleContainer.add(subtitleLabel);

        headerPanel.add(titleContainer, BorderLayout.WEST);

        add(headerPanel, BorderLayout.NORTH);

        // Character list
        characterPanel = new JPanel();
        characterPanel.setLayout(
                new BoxLayout(characterPanel, BoxLayout.Y_AXIS)
        );
        characterPanel.setBorder(new EmptyBorder(10, 15, 10, 15));

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Character List"));
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        add(scrollPane, BorderLayout.CENTER);

        // Statistics
        JPanel statisticsPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        statisticsPanel.setBorder(new EmptyBorder(10, 15, 15, 15));

        totalCharacterLabel = new JLabel("Total Character: 0");
        averageLevelLabel = new JLabel("Rata-rata Level: 0.00");

        totalCharacterLabel.setFont(
                new Font("SansSerif", Font.BOLD, 14)
        );

        averageLevelLabel.setFont(
                new Font("SansSerif", Font.BOLD, 14)
        );

        statisticsPanel.add(totalCharacterLabel);
        statisticsPanel.add(averageLevelLabel);

        add(statisticsPanel, BorderLayout.SOUTH);
    }

    public void refreshCharacterList() {

        characterPanel.removeAll();

        List<Character> characters = manager.getAllCharacters();

        int totalLevel = 0;

        for (Character character : characters) {

            JPanel card = createCharacterCard(character);

            characterPanel.add(card);
            characterPanel.add(Box.createVerticalStrut(8));

            totalLevel += character.getLevel();
        }

        updateStatistics(characters.size(), totalLevel);

        characterPanel.revalidate();
        characterPanel.repaint();
    }

    private JPanel createCharacterCard(Character character) {

        JPanel card = new JPanel(new GridLayout(0, 1, 3, 3));

        card.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.LIGHT_GRAY),
                        new EmptyBorder(10, 12, 10, 12)
                )
        );

        card.setBackground(new Color(245, 245, 245));

        JLabel nameLabel = new JLabel(
                character.getName()
        );

        nameLabel.setFont(
                new Font("SansSerif", Font.BOLD, 16)
        );

        JLabel typeLabel = new JLabel(
                "Type: " + character.getType()
        );

        JLabel levelLabel = new JLabel(
                "Level: " + character.getLevel()
        );

        JLabel hpLabel = new JLabel(
                "Hit Points: " + character.getHitPoints()
        );

        JLabel attackLabel = new JLabel(
                "Attack Power: " + character.getAttackPower()
        );

        card.add(nameLabel);
        card.add(typeLabel);
        card.add(levelLabel);
        card.add(hpLabel);
        card.add(attackLabel);

        card.setMaximumSize(
                new Dimension(Integer.MAX_VALUE, 125)
        );

        return card;
    }

    private void updateStatistics(int total, int totalLevel) {

        totalCharacterLabel.setText(
                "Total Character: " + total
        );

        double averageLevel = total == 0
                ? 0.0
                : (double) totalLevel / total;

        averageLevelLabel.setText(
                String.format(
                        Locale.US,
                        "Rata-rata Level: %.2f",
                        averageLevel
                )
        );
    }
}
