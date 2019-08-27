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

public class HabitInterface {
    //this class should contain the code for the gui
 public static void main(String[] args){   
    //create  windows dimensions
    final int window_height = 500;
    final int window_width = 500;
    
    //creates JFRAME
    JFrame window = new JFrame();
    
    //set title
    window.setTitle("HabitApp");
    
    //set window size
    window.setSize(window_height, window_width);
    
    //close window
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    window.setVisible(true);
    
 }
}
