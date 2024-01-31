/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author alei
 */
public class CurrentMonthModel {
    
    CurrentMonthView currentMonthView = new CurrentMonthView();
    
    public CurrentMonthModel(CurrentMonthView view)
    {
        this.currentMonthView = view;
    }
    
    //Calculating total expense
    /*
    public double calculateTotalExpense(String month)
    {
    try{
    statement.executeQuery("SELECT SUM(expenses)
                            FROM month;);
    }catch(SQLException ex){
    System.out.println(ex.getMessage());
    }
    }
    */
    
    //Add new expense
    
    public void addExpense()
    {
      currentMonthView.getExpenseTable().insertRow(currentMonthView.getRowNo(), new Object[]{currentMonthView.getItem(), currentMonthView.getItem(), currentMonthView.getCategory()});

    }
    
}
