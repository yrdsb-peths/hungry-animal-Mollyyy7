import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coffee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends Actor
{
    String name1;
    public Coffee(String name)
    {
        name1 = name;
    }
    /**
     * Act - do whatever the Coffee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
    }
}
