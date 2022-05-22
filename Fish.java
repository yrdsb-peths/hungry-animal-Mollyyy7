import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class Fish extends Actor
{
    String name1;
    public Fish(String name)
    {
        name1 = name;
    }
    /**
     * Act - do whatever the Coffee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        //Remove chip if fish eats it
        eat();
    }
    
    /**
     * Eat the chip and spawn new chip if a chip is eaten and update score
     * Eat the castle and spawn new castle if a castle is eaten and update score
     */
    public void eat()
    {
        if(isTouching(Chip.class))
        {
            removeTouching(Chip.class);
            MyWorld world = (MyWorld) getWorld();
            world.createChip();
            world.increaseScore();
        }
        
        if(isTouching(Castle.class))
        {
            removeTouching(Castle.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCastle();
            world.decreaseScore();
            if(world.score < 0)
            {
                world.gameOver();
            }
        }
    }
}
