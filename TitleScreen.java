import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Fish", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 210, 80);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Go to modifier if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            Modifier modifier = new Modifier();
            Greenfoot.setWorld(modifier);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish,476,76);
        Label label = new Label("Use \u2190 and \u2192 to Move", 39);
        addObject(label,289,191);
        Label label2 = new Label("Press <space> to Start", 35);
        addObject(label2,294,268);
    }
}
