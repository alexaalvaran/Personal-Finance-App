/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alei
 */
public class BudgetController implements ActionListener{
    
    //Variables
    private BudgetView view;
    private BudgetModel model;
    
    public BudgetController(BudgetView view, BudgetModel model)
    {
        this.view = view;
        this.model= model;
        
        view.addComputeListener(this);
    }
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        switch(command)
        {
            case "compute":
                if(view.getIncome() != 0)
                {
                    model.setIncome(view.getIncome());
                    view.setLabels(model.getNecessities(), model.getSpending(), model.getFood(), model.getHoliday(), model.getSavings());
                    model.displayCalculations();
                }
                
        }
    }
}
