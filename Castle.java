import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Castle here.
 * a type of falling object that the fish should not eat
 * when the fish eats a castle, the player will lose one point
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class Castle extends Actor
{
    public static int speed = 1;
    public Castle()
    {
    }
    /**
     * Act - do whatever the castle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.createCastle();
            world.removeObject(this);
        }
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
