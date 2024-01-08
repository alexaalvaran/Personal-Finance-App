/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author alei
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingController implements ActionListener{
    
    private StartingView view;
    
    public StartingController(StartingView view)
    {
        this.view = view;
        
        view.addBudgetListener(this);
        view.addCurrentMonthListener(this);
        view.addNewMonthListener(this);
        view.addQuitListener(this);
        view.addRecordsListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        switch(command){
            
            case "current month":
                
                break;
            
            case "new month":
                
                break;
                
            case "records":
                
                break;
                
            case "budget":
                BudgetView budgetView = new BudgetView();
                budgetView.display();
                BudgetModel budgetModel = new BudgetModel(budgetView);
                BudgetController budgetController = new BudgetController(budgetView, budgetModel);
                budgetModel.displayCalculations();
                break;
                
                
            case "quit":
                System.exit(0);
                break;
        }
        
    }
    
}
