import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends World
{
    PlayButton button = new PlayButton();
    

    /**
     * Constructor for objects of class Welcome.
     * 
     */
    public Welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(button, 495, 474);
        act();
        
    }

    public boolean checkClick(){
        if (button.click()) {
            return true;
        } else {
            return false;
        }
    }

     public void act() {
        checkClick();
        if (checkClick()) {
            Greenfoot.setWorld(new World2());
        }
    }
}