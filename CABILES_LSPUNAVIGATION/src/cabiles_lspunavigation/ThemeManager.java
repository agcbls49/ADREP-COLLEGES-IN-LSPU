/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabiles_lspunavigation;

/**
 *
 * @author Amazing
 */

import java.awt.Color;

public class ThemeManager {
    public static boolean themeApplied = false;
    public static int currentTheme = 1;

    public static Color backgroundColor = Color.WHITE;
    public static Color headerColor = Color.BLUE;
    public static Color footerColor = Color.BLUE;
    public static Color labelColor = Color.BLUE;

    // Go to the next theme in sequence
    public static void nextTheme() {
        currentTheme++;

        if (currentTheme > 4) {
            currentTheme = 1; // back to first theme
        }

        switch (currentTheme) {
            case 1:
                // Blue Theme
                backgroundColor = new Color(210, 230, 255);   // pale blue
                headerColor = new Color(0, 102, 204);         // strong ocean blue
                footerColor = new Color(0, 102, 204);
                labelColor = new Color(20, 20, 60);           // dark navy text
                break;
            case 2:
                // Orange Theme
                backgroundColor = new Color(255, 230, 200);   // soft peach
                headerColor = new Color(255, 140, 0);         // deep orange
                footerColor = new Color(255, 140, 0);
                labelColor = new Color(70, 30, 0);            // dark brown text
                break;
            case 3:
                // Green Theme
                backgroundColor = new Color(220, 255, 220);   // mint green
                headerColor = new Color(0, 102, 51);          // dark forest green
                footerColor = new Color(0, 102, 51);
                labelColor = new Color(0, 51, 25);            // very dark green text
                break;
            case 4:
                // Pink Theme
                backgroundColor = new Color(255, 182, 193); // light pink
                headerColor     = new Color(255, 105, 180); // hot pink
                footerColor     = new Color(199, 21, 133);  // medium violet red
                labelColor      = Color.WHITE;              // white labels
                break;
        }
    }
}
