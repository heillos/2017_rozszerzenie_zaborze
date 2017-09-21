import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Potworek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potworek extends Actor
{
    private void klawisze()
    {
        if( Greenfoot.isKeyDown("right") ) move(5);

        if( Greenfoot.isKeyDown("left") ) move(-5);     

        if( Greenfoot.isKeyDown("up") ) 
        {
            turn( -90 );
            move( 5 );  
            turn( 90 );            
        }

        if( Greenfoot.isKeyDown("down") ) 
        {
            turn( -90 );
            move( -5 );  
            turn( 90 );            
        }                
    }

    private void zjadanie()
    {
        // jeżeli dotykam obiektu klasy Ludzik, to usuń ten obiekt
        if( isTouching( Ludzik.class ) ) 
            removeTouching( Ludzik.class );
    }

    /**
     * Act - do whatever the Potworek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        klawisze();
        zjadanie();

    }    
}
