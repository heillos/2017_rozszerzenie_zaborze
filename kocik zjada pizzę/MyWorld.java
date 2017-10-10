import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kocik kocik = new Kocik();
        addObject(kocik,376,535);
    }

    public void act()
    {
        int los = Greenfoot.getRandomNumber( 100 );
        if( los <= 2 )
        {
            int szerokosc = getWidth();
            int x = Greenfoot.getRandomNumber( szerokosc );
            Pizza pizza = new Pizza();
            addObject(pizza, x, 0 );
        }
    } 

} //koniec klasy myWorld()
