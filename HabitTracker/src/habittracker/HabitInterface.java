/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habittracker;

/**
 *
 * @author jacob
 */

import javax.swing.*;
import java.awt.*;

public class HabitInterface extends HabitTracker {
    //this class should contain the code for the gui
    
    final int height = 1500;
    final int width = 1500;
    JFrame frame = new JFrame();
    
    
    public HabitInterface(){
        
        frame.setTitle("HabitApp");
        frame.setSize(height,width);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void buildJMenu(){
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
    
 public static void main(String[] args){   
    //create  windows dimensions
    
  
  
 }
}
