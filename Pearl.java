import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chip here.
 * a type of food for the fish
 * when the fish eats a pearl, the player will gain one point
 * 
 * @author Molly Wu
 * @version May 2022
 */
public class Pearl extends Actor
{
    public static int speed = 1;
    
    public Pearl()
    {
    }
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Chip falls downwards
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.createPearl();
            world.removeObject(this);
        }
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
