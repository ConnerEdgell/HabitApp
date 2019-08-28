/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habittracker;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author conne
 */
public class HabitTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        System.out.println("Hello World");
        System.out.println("habit");
        System.out.println("woo baby");
        System.out.println("yeee");
        
         final int height = 1000;
     final int width = 1000;
     
     JFrame frame = new JFrame("HabitApp");
     
     frame.setSize(height,width);
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
     
     
     //Adding Menu Bar
     JMenuBar menu = new JMenuBar();
     
     JMenu m1 = new JMenu("FILE");
     
     menu.add(m1);
     
     JMenuItem habit = new JMenuItem("Habits");
     JMenuItem schedule = new JMenuItem("Schedule");
     JMenuItem analytics = new JMenuItem("Analytics");
     
     m1.add(habit);
     m1.add(schedule);
     m1.add(analytics);
     
     frame.getContentPane().add(BorderLayout.NORTH, menu);
     frame.setVisible(true);
        
        
        
        
    }

}