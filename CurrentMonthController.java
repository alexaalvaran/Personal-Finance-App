/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alei
 */
public class CurrentMonthController implements ActionListener
{
    private CurrentMonthView currentMonthView;
    private CurrentMonthModel currentMonthModel;
    
    public CurrentMonthController(CurrentMonthView view, CurrentMonthModel model)
    {
        this.currentMonthView = view;
        this.currentMonthModel = model;
        
        view.addreturnMenuListener(this);
        view.addExpenseListener(this);
        view.addCancelExpenseListener(this);
        view.addSubmitExpenseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        switch(command){
            case "calculate total":
                break;
                
            case "add an expense":
                 currentMonthView.expenseFrame(); 
                break;
            
            case "cancel":
                currentMonthView.cancelNewExpense();
                break;
                
            case "submit":
                if(currentMonthView.checkEmptyPrompt())
                {
                currentMonthModel.addExpense();
                }
                break;
                
            case "return to menu":
                currentMonthView.dispose();
                MainMenuView mainMenuView = new MainMenuView();
                MainMenuController mainMenuController = new MainMenuController(mainMenuView);
                mainMenuView.display();
                break;
                
            
        }
    }
    
}
