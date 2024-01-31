/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alei
 */
public class CurrentMonthView 
{
    
    //Screen dimension variables
    private final Toolkit kit = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = kit.getScreenSize();
    private final int screenWidth = screenSize.width;
    private final int screenHeight = screenSize.height;
    private final int frameWidth = screenWidth/3;
    private final int frameHeight = screenHeight / 2;
    
    //Main Frame
    private JFrame monthFrame;
    
    //Title Panel
    private JPanel headingPanel = new JPanel();
    private JLabel monthName = new JLabel("january24");
    private JButton returnMenu = new JButton("return to menu");
            
    //Expenses Panel
    private JPanel expensesPanel = new JPanel();
    private JLabel expenseTitle = new JLabel("expense");
    private JButton addExpense = new JButton("add an expense");

    String[][] title = {{"item", "price", "category"}};
    String[] col = {"item", "price", "category"};
        private DefaultTableModel model = new DefaultTableModel(title, col);
    private JTable expenseTable = new JTable(model);
//
//    @Override
//    public boolean isCellEditable(int row, int column) {
//       //all cells false
//       return false;
//    }
;;
         
    //Total Panel
    private JPanel totalPanel = new JPanel();
    private JLabel totalExpense = new JLabel("total: $");
    private JButton calculateTotal = new JButton("calculate total");
    
    
    //Add expense frame 
    private JFrame addExpenseFrame = new JFrame("Add new expense");
    
    private JPanel itemPanel= new JPanel();
    private JLabel itemLabel = new JLabel("Item: ");
    private JTextField itemPrompt = new JTextField(6);
    
    private JPanel pricePanel = new JPanel();
    private JLabel priceLabel = new JLabel("Price: ");
    private JTextField pricePrompt = new JTextField(6);
    
    private JPanel categoryPanel = new JPanel();
    private JLabel categoryLabel = new JLabel("Category: ");
    private JTextField categoryPrompt = new JTextField(6);
    
    private JPanel expenseButtons = new JPanel();
    private JButton submitExpense = new JButton("submit");
    private JButton cancelExpense = new JButton("cancel");
            
            
    //Default Constructor
    public CurrentMonthView()
    {
        this.monthFrame = new JFrame("Monthly Expenses");
        
        headingPanel.add(monthName);
        headingPanel.add(returnMenu);
     

//        expensesPanel.add(expenseTitle);

        expensesPanel.add(addExpense);
        expensesPanel.add(expenseTable);
   
                
        totalPanel.add(totalExpense);
        totalPanel.add(calculateTotal);
    }
    
    //Display
    public void display()
    { 
        monthFrame.add(headingPanel);
        monthFrame.add(expensesPanel);
        monthFrame.add(totalPanel);
        
       
        
        monthFrame.setLayout(new GridLayout(0, 1));
        
       
        monthFrame.setBounds(frameWidth, frameHeight, frameWidth,frameHeight);
        monthFrame.setLocationRelativeTo(null);
        monthFrame.setVisible(true);
    }
    
    public void expenseFrame()
    {
        
        itemPanel.add(itemLabel);
        itemPanel.add(itemPrompt);
        
        pricePanel.add(priceLabel);
        pricePanel.add(pricePrompt);
        
        categoryPanel.add(categoryLabel);
        categoryPanel.add(categoryPrompt);
        
        expenseButtons.add(submitExpense);
        expenseButtons.add(cancelExpense);
        
        addExpenseFrame.add(itemPanel);
        addExpenseFrame.add(pricePanel);
        addExpenseFrame.add(categoryPanel);
        addExpenseFrame.add(expenseButtons);
        
        addExpenseFrame.setLayout(new GridLayout(0, 1));
        addExpenseFrame.setBounds(frameWidth/2, frameWidth/2, frameWidth/2, frameHeight/2);
        addExpenseFrame.setLocationRelativeTo(null);
        addExpenseFrame.setVisible(true);
        
    }
    
    //Dispose
    public void dispose()
    {
        this.monthFrame.dispose();
    }
    
    public void cancelNewExpense()
    {
        itemPrompt.setText("");
        pricePrompt.setText("");
        categoryPrompt.setText("");
        this.addExpenseFrame.dispose();
    }
    
    public boolean checkEmptyPrompt()
    {
       if(itemPrompt.getText().isEmpty() || pricePrompt.getText().isEmpty() || categoryPrompt.getText().isEmpty())
       {
           return false;
       }
       
       return true;
    }
    
    public String getItem()
    {
        return itemPrompt.getText();
    }
    
    public String getPrice()
    {
        return pricePrompt.getText();
    }
    
    public String getCategory()
    {
        return categoryPrompt.getText();
    }
    
    public int getRowNo()
    {
        return model.getRowCount();
    }
    //Action Listeners for buttons
    public void addreturnMenuListener(ActionListener listener)
    {
        returnMenu.addActionListener(listener);
    }
    
    public void addExpenseListener(ActionListener listener)
    {
        addExpense.addActionListener(listener);
    }
    
    
    public void addCancelExpenseListener(ActionListener listener)
    {
        cancelExpense.addActionListener(listener);
    }
    
    public void addSubmitExpenseListener(ActionListener listener)
    {
        submitExpense.addActionListener(listener);
    }
    
   public DefaultTableModel getExpenseTable()
   {
       return this.model;
   }
}
