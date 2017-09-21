import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ludzik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ludzik extends Actor
{
    // właściwości 
    int kierunek = 1;
    /**
     * Act - do whatever the Ludzik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move( kierunek );
        if( isAtEdge() ) kierunek = kierunek * (-1);
    }    
}
