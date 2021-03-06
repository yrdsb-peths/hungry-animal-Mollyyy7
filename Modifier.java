import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Modifier here. For the player to modify game level
 * 
 * @author Molly Wu
 * @version May 2022
 */
public class Modifier extends World
{
    public ButtonOne buttonOne;
    public ButtonTwo buttonTwo;
    public ButtonThr buttonThr;
    
    /**
     * Constructor for objects of class Modifier.
     * 
     */
    public Modifier()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label instruction = new Label("Press \u2192 to Start Game", 30);
        addObject(instruction, 400, 350);
        Label title = new Label("Modifier", 60);
        addObject(title, 300, 70);
        Label levelOne = new Label("Level 1", 50);
        addObject(levelOne, 100, 150);
        Label levelTwo = new Label("Level 2", 50);
        addObject(levelTwo, 300, 150);
        Label levelThr = new Label("Level 3", 50);
        addObject(levelThr, 500, 150);
        Label gameInstruction = new Label("Eat Chip or Pearl to Gain 1 Point, Eat Castle or Bomb to Lose 1 Point.", 18);
        addObject(gameInstruction, 300, 270);
        Label gameInst = new Label("If you miss the chip you lose.", 18);
        addObject(gameInst, 300, 300);
        
        buttonOne = new ButtonOne();
        addObject(buttonOne, 100, 210);
        buttonTwo = new ButtonTwo();
        addObject(buttonTwo, 300, 210);
        buttonThr = new ButtonThr();
        addObject(buttonThr, 500, 210);
    }
    
    public void act()
    {
        //Start the game if the user presses right key
        if(Greenfoot.isKeyDown("right"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        /**
         * add difficulty of my game
         * level 1: fish speed:1 chip/pearl/castle/bomb initial speed:1
         * level 2: fish speed:2 chip/pearl/castle/bomb initial speed:2
         * level 3: fish speed:3 chip/pearl/castle/bomb initial speed:3
         */
        if(Greenfoot.mouseClicked(buttonOne))
        {
            Bomb.setSpeed(1);
            Castle.setSpeed(1);
            Pearl.setSpeed(1);
            Chip.setSpeed(1);
            Fish.setSpeed(1);
        }
        
        if(Greenfoot.mouseClicked(buttonTwo))
        {
            Bomb.setSpeed(2);
            Castle.setSpeed(2);
            Pearl.setSpeed(2);
            Chip.setSpeed(2);
            Fish.setSpeed(2);
        }
        
        if(Greenfoot.mouseClicked(buttonThr))
        {
            Bomb.setSpeed(3);
            Castle.setSpeed(3);
            Pearl.setSpeed(3);
            Chip.setSpeed(3);
            Fish.setSpeed(3);
        }
    }
}
