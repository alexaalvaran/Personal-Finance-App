/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author alei
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenuView {

    //Screen dimension variables
    private final Toolkit kit = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = kit.getScreenSize();
    private final int screenWidth = screenSize.width;
    private final int screenHeight = screenSize.height;
    private final int frameWidth = screenWidth/3;
    private final int frameHeight = screenHeight / 2;

    //Starting frame variables
    private JFrame startingFrame;
    private JPanel titlePanel;
    private JPanel buttonPanel;
    private JButton startingTitle = new JButton("alei's finanaces");
    private JButton currentMonth = new JButton("current month");
    private JButton newMonth = new JButton("new month");
    private JButton records = new JButton("records");
    private JButton budget = new JButton("budget");
    private JButton quit = new JButton("quit");

    public MainMenuView() {
        this.startingFrame = new JFrame("finance tracker");
        this.titlePanel = new JPanel();
        this.buttonPanel = new JPanel();
    }

    public void display() {

        titlePanel.add(startingTitle);
        createButtonPanel();

        startingFrame.add(titlePanel);
        startingFrame.add(buttonPanel);

        startingFrame.setBounds(frameWidth, frameHeight, frameWidth, frameHeight);
        startingFrame.setLocationRelativeTo(null);
        startingFrame.setVisible(true);

    }

    public void dispose() {
        this.startingFrame.dispose();
    }

    private void createButtonPanel() {
        buttonPanel.add(currentMonth); 
        buttonPanel.add(newMonth);
        buttonPanel.add(records);
        buttonPanel.add(budget);
        buttonPanel.add(quit);
    }
    
    public void addCurrentMonthListener(ActionListener listener)
    {
        currentMonth.addActionListener(listener);
    }
    
    public void addNewMonthListener(ActionListener listener)
    {
        newMonth.addActionListener(listener);
    }
    
    public void addRecordsListener(ActionListener listener)
    {
        records.addActionListener(listener);
    }
    
    public void addBudgetListener(ActionListener listener)
    {
        budget.addActionListener(listener);
    }
    
    public void addQuitListener(ActionListener listener)
    {
        quit.addActionListener(listener);
    }

}
