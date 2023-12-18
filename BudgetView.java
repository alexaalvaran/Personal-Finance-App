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
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BudgetView
{
    //Screen dimension variables
    private final Toolkit kit = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = kit.getScreenSize();
    private final int screenWidth = screenSize.width;
    private final int screenHeight = screenSize.height;
    private final int frameWidth = screenWidth/4;
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
    
    public BudgetView(){
        this.budgetFrame = new JFrame("budget");
        this.incomePanel = new JPanel();
        this.budgetPanel = new JPanel();
    }
    
    public void display(){
        incomePanel.add(incomePrompt);
        incomePanel.add(inputIncome);
        incomePanel.add(compute);
        
        budgetFrame.add(incomePanel);
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
    
   public JPanel getBudgetPanel()
   {
       return this.budgetPanel;
   }
   
   public int getIncome()
   {
       return Integer.parseInt(this.inputIncome.getText());
   }
}
