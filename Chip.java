import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for my fish
 * 
 * @author Molly Wu
 * @version May 2022
 */
public class Chip extends Actor
{
    public static int speed = 1;
    
    public Chip()
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
        
        // Remove chip and draw game over when chip gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
