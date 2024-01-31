/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 *
 * @author alei
 */
public class BudgetModel {
    
    //Variables 
    private BudgetView view;
    
    //Money (double) variables
    private double income;
    private double necessities;
    private double spending;
    private double food;
    private double holiday;
    private double savings;
    
    public BudgetModel(BudgetView view)
    {
       this.view = view;
    }
    
    public void setIncome(double income)
    {
             this.income = income;
    }
    private double calculateNecessities()
    {
        this.necessities = income * 0.2;
        return necessities;
    }
    
    private double calculateSpending()
    {
        this.spending = income * 0.1;
        return spending;
    }
    
    private double calculateFood()
    {
        this.food = income * 0.2;
        return food;
    }
    
    private double calculateHoliday()
    {
        this.holiday = income * 0.3;
        return holiday;
    }
    
    private double calculateSavings()
    {
        this.savings = income * 0.2;
        return savings;
    }
    
    public String getNecessities()
    {
        return String.valueOf(this.calculateNecessities());
    }
    
    public String getFood()
    {
        return String.valueOf(this.calculateFood());
    }
    
    public String getHoliday()
    {
        return String.valueOf(this.calculateHoliday());
    }
    
    public String getSpending()
    {
        return String.valueOf(this.calculateSpending());
    }
    
    public String getSavings()
    {
        return String.valueOf(this.calculateSavings());
    }
    
    
    public void displayCalculations()
    {
        view.getBudgetPanel().add(view.getNecessitiesLabel());
        view.getBudgetPanel().add(view.getFoodLabel());
        view.getBudgetPanel().add(view.getSpendingLabel());
        view.getBudgetPanel().add(view.getHolidayLabel());
        view.getBudgetPanel().add(view.getSavingsLabel());
        
        view.getBudgetPanel().setVisible(true);
        view.getBudgetPanel().setLayout(new GridLayout(0, 1));
        view.getBudgetFrame().add(view.getBudgetPanel(), BorderLayout.CENTER);

      
        
    }
    
}
