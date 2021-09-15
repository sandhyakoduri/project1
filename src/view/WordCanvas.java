package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JPanel;

class WordCanvas extends JPanel {
    private WordGuess wordGuess;

    public WordCanvas(WordGuess wordGuess){
        this.wordGuess = wordGuess;
    }
    public void paintComponent(Graphics paramGraphics) {
        Graphics2D graphics2D = (Graphics2D)paramGraphics;
        if (!wordGuess.isGameOver()) {
            graphics2D.setColor(Color.blue);
            graphics2D.setFont(new Font("Courier New", 1, 40));
            graphics2D.drawString("Health Level", 50, 50);
            for (byte b = 0; b < wordGuess.getLifeCount(); b++)
                graphics2D.fill(new Rectangle2D.Double((50 + b * 50), 70.0D, 45.0D, 50.0D));
        } else {
            graphics2D.setColor(Color.blue);
            graphics2D.setFont(new Font("Courier New", 1, 30));
            graphics2D.drawString("Press <New> to Start", 50, 150);
        }
        switch (wordGuess.getStatus()) {
            case 1:
                graphics2D.setColor(Color.red);
                graphics2D.drawString("YOU WON !!!", 50, 100);
                for (JButton jButton : wordGuess.getKeys())
                    jButton.setEnabled(false);
                break;
            case 2:
                graphics2D.setColor(Color.red);
                graphics2D.drawString("YOU LOST !!!", 50, 100);
                for (JButton jButton : wordGuess.getKeys())
                    jButton.setEnabled(false);
                break;
        }
    }
}
