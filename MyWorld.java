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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Fish fish = new Fish("hi");
        addObject(fish, 100, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createChip();
        createCastle();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Increase score
     */
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create a new chip at random location at top of screen
     */
    public void createChip()
    {
        Chip chip = new Chip();
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
}
