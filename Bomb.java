import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    static public int speed = 1;
    public Bomb()
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
            world.createBomb();
            world.removeObject(this);
        }
        
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
