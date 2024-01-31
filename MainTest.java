/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author alei
 */
public class MainTest 
{
    
    public static void main(String[] args) {
        MainMenuView startingView = new MainMenuView();
        MainMenuController startingController = new MainMenuController(startingView);
        startingView.display();
    }
    
}
