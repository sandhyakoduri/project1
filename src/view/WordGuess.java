package view;

import controller.WordEventListener;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordGuess extends JFrame {

  private  JButton[] keys;

  private  JButton newButton;

  private  JTextField gameKey;

  private  JTextField progressStatus;

  private int lifeCount;

  private int status;

  private final WordCanvas canvas;


  private boolean gameOver = true;

  public WordGuess() {
    Container container = getContentPane();
    
    JPanel southPanel = new JPanel();
    southPanel.setLayout(new GridLayout(4, 7));
    this.keys = new JButton[26];
    WordEventListener observer = new WordEventListener(this);
    byte b = 0;
    for (char c = 'a'; c <= 'z'; c = (char)(c + 1)) {
      this.keys[b] = new JButton("" + c);
      this.keys[b].addActionListener(observer);
      this.keys[b].setEnabled(false);
      southPanel.add(this.keys[b]);
      b++;
    }
    this.newButton = new JButton("New");
    this.newButton.addActionListener(observer);
    southPanel.add(this.newButton);

    Font font = new Font("Courier New", 1, 20);
    this.gameKey = new JTextField();
    this.gameKey.setFont(font);
    this.gameKey.setForeground(Color.red);
    this.gameKey.setEditable(false);
    this.progressStatus = new JTextField();
    this.progressStatus.setFont(font);
    this.progressStatus.setEditable(false);

    JPanel northPanel = new JPanel();
    northPanel.setLayout(new GridLayout(2, 1));
    northPanel.add(this.gameKey);
    northPanel.add(this.progressStatus);

    this.canvas = new WordCanvas(this);

    this.canvas.setPreferredSize(new Dimension(500, 500));
    container.add(northPanel, "North");
    container.add(southPanel, "South");
    container.add(this.canvas, "Center");
  }

  public JButton[] getKeys() {
    return keys;
  }

  public void setKeys(JButton[] keys) {
    this.keys = keys;
  }

  public JButton getnewButton() {
    return newButton;
  }

  public void setnewButton(JButton newButton) {
    this.newButton = newButton;
  }

  public JTextField getGameKey() {
    return gameKey;
  }

  public void setGameKey(JTextField gameKey) {
    this.gameKey = gameKey;
  }

  public JTextField getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(JTextField progressStatus) {
    this.progressStatus = progressStatus;
  }

  public WordCanvas getCanvas() {
    return canvas;
  }

  public int getLifeCount() {
    return lifeCount;
  }

  public void setLifeCount(int lifeCount) {
    this.lifeCount = lifeCount;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }


  public boolean isGameOver() {
    return gameOver;
  }

  public void setGameOver(boolean gameOver) {
    this.gameOver = gameOver;
  }
}
