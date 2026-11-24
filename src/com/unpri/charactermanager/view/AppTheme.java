package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.unpri.charactermanager.model.CharacterType;

public final class AppTheme {

    // Mencegah class dibuat menjadi object
    private AppTheme() {
    }

    // ==============================
    // COLORS
    // ==============================

    public static final Color BG_MAIN = new Color(19, 19, 31);
    public static final Color BG_CARD = new Color(35, 35, 52);

    public static final Color TEXT_MAIN = new Color(223, 230, 233);
    public static final Color TEXT_LIGHT = Color.WHITE;
    public static final Color GOLD = new Color(253, 203, 110);

    public static final Color WARRIOR_COLOR = new Color(214, 48, 49);
    public static final Color MAGE_COLOR = new Color(9, 132, 227);
    public static final Color ARCHER_COLOR = new Color(0, 184, 148);

    // ==============================
    // FONTS
    // ==============================

    public static final Font FONT_TITLE =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font FONT_NORMAL =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 13);

    public static final Font FONT_HIGHLIGHT =
            FONT_NORMAL.deriveFont(Font.BOLD);

    // ==============================
    // BORDERS
    // ==============================

    public static final Border CARD_BORDER =
            BorderFactory.createEmptyBorder(12, 15, 12, 15);

    public static final Border PANEL_BORDER =
            BorderFactory.createEmptyBorder(15, 15, 15, 15);

    public static final Border NO_BORDER =
            BorderFactory.createEmptyBorder();

    // ==============================
    // CONSTANT
    // ==============================

    public static final int HIGH_LEVEL_LIMIT = 5;

    // ==============================
    // ROLE COLOR
    // ==============================

    public static Color colorFor(CharacterType type) {

        if (type == null) {
            return BG_CARD;
        }

        switch (type) {
            case WARRIOR:
                return WARRIOR_COLOR;

            case MAGE:
                return MAGE_COLOR;

            case ARCHER:
                return ARCHER_COLOR;

            default:
                return BG_CARD;
        }
    }

    // ==============================
    // ROLE BORDER
    // ==============================

    public static Border borderFor(CharacterType type) {

        return new LineBorder(colorFor(type), 2, true);
    }
}