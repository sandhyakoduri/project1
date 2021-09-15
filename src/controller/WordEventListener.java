package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import model.Words;
import view.WordGuess;

public class WordEventListener implements ActionListener {
    private WordGuess wordGuess;
    public WordEventListener(WordGuess wordGuess){
        this.wordGuess = wordGuess;
    }
    public void actionPerformed(ActionEvent paramActionEvent) {
        JButton jButton = (JButton)paramActionEvent.getSource();
        if (jButton == wordGuess.getnewButton()) {

            for (JButton jButton1 : wordGuess.getKeys())
                jButton1.setEnabled(true);

            Words.setWords();
            String str1 = Words.getWords();
            wordGuess.getGameKey().setText(str1);

            String str2 = "";
            for (byte b = 0; b < str1.length(); b++)
                str2 = str2 + ".";

            wordGuess.getProgressStatus().setText(str2);
            wordGuess.setLifeCount(5);
            wordGuess.setStatus(0);
            wordGuess.setGameOver(false);

        } else {

            jButton.setEnabled(false);

            char c = jButton.getText().charAt(0);
            char[] arrayOfChar = wordGuess.getProgressStatus().getText().toCharArray();
            String str = wordGuess.getGameKey().getText();
            boolean bool = false;
            for (byte b = 0; b < str.length(); b++) {
                if (c == str.charAt(b)) {
                    arrayOfChar[b] = c;
                    bool = true;
                }
            }
            if (bool) {
                wordGuess.getProgressStatus().setText(new String(arrayOfChar));
                if (!wordGuess.getProgressStatus().getText().contains(".")) {
                    wordGuess.setStatus(1);
                    wordGuess.setGameOver(true);
                }
            } else {
                wordGuess.setLifeCount(wordGuess.getLifeCount() -1);
                if (wordGuess.getLifeCount() == 0) {
                    wordGuess.setStatus(2);
                    wordGuess.setGameOver(true);
                }
            }
        }
        wordGuess.repaint();
    }
}
