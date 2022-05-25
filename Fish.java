import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class Fish extends Actor
{
    GreenfootSound fishSound = new GreenfootSound("bling.wav");
    GreenfootSound castleSound = new GreenfootSound("explode.wav");
    
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] idleRight = new GreenfootImage[8];
    
    //Direction the fish is facing
    boolean facingLeft = true;
    SimpleTimer animationTimer = new SimpleTimer();
    public static int fishSpeed = 3;
    
    /**
     * Constructor
     */

    public Fish()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/Fish"+i+".png");
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/Fish"+i+".png");
            idleRight[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        
        //Initial fish image
        setImage(idleLeft[0]);
    }
    
    /*
     * Animate the fish
     */
    int imageIndex = 0;
    public void animateFish()
    {
        if(animationTimer.millisElapsed() < 80)
        {
            return;
        }
        animationTimer.mark();
        if(facingLeft)
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        else
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
    }
    
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            facingLeft = true;
            move(-2-fishSpeed);
            animateFish();
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            facingLeft = false;
            move(2+fishSpeed);
            animateFish();
        }
        
        //Remove chip if fish eats it
        eat();
    }
    
    public static void setSpeed(int spd)
    {
        fishSpeed = spd;
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
            fishSound.play();
        }
        
        if(isTouching(Pearl.class))
        {
            removeTouching(Pearl.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPearl();
            world.increaseScore();
            fishSound.play();
        }
        
        if(isTouching(Castle.class))
        {
            removeTouching(Castle.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCastle();
            world.decreaseScore();
            castleSound.play();
            if(world.score < 0)
            {
                world.gameOver();
            }
        }
        
        if(isTouching(Bomb.class))
        {
            removeTouching(Bomb.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBomb();
            world.decreaseScore();
            castleSound.play();
            if(world.score < 0)
            {
                world.gameOver();
            }
        }
    }
}
