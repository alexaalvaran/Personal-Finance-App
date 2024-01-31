/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author alei
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BudgetView
{
    //Screen dimension variables
    private final Toolkit kit = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = kit.getScreenSize();
    private final int screenWidth = screenSize.width;
    private final int screenHeight = screenSize.height;
    private final int frameWidth = screenWidth/3;
    private final int frameHeight = screenHeight / 2;
    
    //Budget view variables 
    private JFrame budgetFrame;
    
     //Income panel : user input for income
    private JPanel incomePanel;
    private JLabel incomePrompt = new JLabel("Input income");
    private JTextField inputIncome = new JTextField(6);
    private JButton compute = new JButton("compute");
    
     //Budget panel : displaying budget breakdown 
    private JPanel budgetPanel;
    private JLabel necessitiesLabel = new JLabel("");
    private JLabel spendingLabel = new JLabel("");
    private JLabel foodLabel = new JLabel("");
    private JLabel holidayLabel = new JLabel("");
    private JLabel savingsLabel = new JLabel("");
    
    
    //Return button
    private JButton returnMenu = new JButton("main menu");
    private boolean mainMenu = false;
    
    public BudgetView(){
        this.budgetFrame = new JFrame("budget");
        this.incomePanel = new JPanel();
        this.budgetPanel = new JPanel();
    }
    
    public void display(){
        incomePanel.add(incomePrompt);
        incomePanel.add(inputIncome);
        incomePanel.add(compute);
        incomePanel.add(returnMenu);
        
        budgetFrame.add(incomePanel, BorderLayout.PAGE_START);
        budgetFrame.setBounds(frameWidth, frameHeight, frameWidth, frameHeight);
        budgetFrame.setLocationRelativeTo(null);
        budgetFrame.setVisible(true);
        
    }
    
    public void dispose(){
        this.budgetFrame.dispose();
    }
    
    public void addComputeListener(ActionListener listener)
    {
        compute.addActionListener(listener);
    }
    
    public void addReturnListener(ActionListener listener)
    {
        returnMenu.addActionListener(listener);
    }
    
   public JPanel getBudgetPanel()
   {
       return this.budgetPanel;
   }
   
   public double getIncome()
   {
       return Double.parseDouble(this.inputIncome.getText());
   }
   
   public void setLabels(String necessities, String spending, String food, String holiday, String savings)
   {
       this.necessitiesLabel.setText("necessities: $" + necessities);
       this.spendingLabel.setText("spending: $" + spending);
       this.foodLabel.setText("food: $" + food);
       this.holidayLabel.setText("holiday: $" + holiday);
       this.savingsLabel.setText("savings: $" +savings);
   }

    public JLabel getIncomePrompt() {
        return incomePrompt;
    }

    public JLabel getNecessitiesLabel() {
        return necessitiesLabel;
    }

    public JLabel getSpendingLabel() {
        return spendingLabel;
    }

    public JLabel getFoodLabel() {
        return foodLabel;
    }

    public JLabel getHolidayLabel() {
        return holidayLabel;
    }

    public JLabel getSavingsLabel() {
        return savingsLabel;
    }
   
   public JFrame getBudgetFrame()
   {
       return this.budgetFrame;
   }
   
   public void setMainMenu(boolean menu)
   {
       this.mainMenu = menu;
   }
   
   public boolean getMainMenu()
   {
       return this.mainMenu;
   }
}

