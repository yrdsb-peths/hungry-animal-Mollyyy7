import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        GreenfootImage bg = new GreenfootImage("underwater.jpg"); // adjust filename as needed
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        Fish fish = new Fish();
        addObject(fish, 100, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createChip();
        createCastle();
        createBomb();
        createPearl();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        Greenfoot.stop();
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level ++;
        }
    }
    
    /**
     * Increase score
     */
    public void decreaseScore()
    {
        if(score % 5 == 0)
        {
            level --;
        }
        
        score--;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create a new chip at random location at top of screen
     */
    public void createChip()
    {
        Chip chip = new Chip();
        chip.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(chip, x, y);
    }
    
    /**
     * Create a new castle at random location at top of screen
     */
    public void createCastle()
    {
        Castle castle = new Castle();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(castle, x, y);
    }
    
    /**
     * Create a new bomb at random location at top of screen
     */
    public void createBomb()
    {
        Bomb bomb = new Bomb();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bomb, x, y);
    }
    
    public void createPearl()
    {
        Pearl pearl = new Pearl();
        pearl.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pearl, x, y);
    }
}
