import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.awt.Desktop;
import java.net.URI;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author Arin Manohar 
 * @version 1.0
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 

        prepare();
        act();
        
    }
    
    public void act() 
    {
         
        
        if(Greenfoot.mouseClicked(this)){
            if (prepare().getPeriod() == 1) {
                System.out.print("Jesus");
           }
           
        }
        
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
    private periodToggle prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.
        
        
        periodToggle button = new periodToggle();
        addObject(button, 4,5);
        
        return button;
        
        

    }  
    
    public periodToggle buttonAccessor(periodToggle buttonObject) {
        return buttonObject;
    }
}
