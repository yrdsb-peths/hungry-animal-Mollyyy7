import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * a type of falling object that the fish should not eat
 * when the fish eats a bomb, the player will lose one point
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class Bomb extends Actor
{
    static public int speed = 1;
    public Bomb()
    {
    }
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.createBomb();
            world.removeObject(this);
        }
        
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
