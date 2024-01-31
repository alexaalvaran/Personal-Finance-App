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

public class MainMenuController implements ActionListener{
    
    private MainMenuView mainMenuView;
    
    public MainMenuController(MainMenuView view)
    {
        this.mainMenuView = view;
        
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
                mainMenuView.dispose();
                CurrentMonthView currentMonthView = new CurrentMonthView();
                CurrentMonthModel currentMonthModel = new CurrentMonthModel(currentMonthView);
                CurrentMonthController currentMonthController = new CurrentMonthController(currentMonthView, currentMonthModel);
                currentMonthView.display();
                break;
            
            case "new month":
                
                break;
                
            case "records":
                
                break;
                
            case "budget":
                mainMenuView.dispose();
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
