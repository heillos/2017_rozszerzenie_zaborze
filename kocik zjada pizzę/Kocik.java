import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    int SIEDZACY = 0;
    int W_PRAWO_1 = 1;
    int W_PRAWO_2 = 2;
    int W_LEWO_1 = 3;
    int W_LEWO_2 = 4;
    int stanKota = SIEDZACY;

    int punkty = 0;
    boolean tanczyc = false;  
    
    public void klawisze()
    {
        if( !Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("left") )
            stanKota = SIEDZACY;

        if( Greenfoot.isKeyDown("right") ) 
        {
            //jeżeli był W_PRAWO_1 to ustaw W_PRAWO_2
            //a jeżeli nie był W_PRAWO_1 to ustaw W_PRAWO_1
            if( stanKota == W_PRAWO_1 ) stanKota = W_PRAWO_2;
            else stanKota = W_PRAWO_1;
            move(3);
        }

        if( Greenfoot.isKeyDown("left") ) 
        {
            if( stanKota == W_LEWO_1 ) stanKota = W_LEWO_2;
            else stanKota = W_LEWO_1;
            move(-3);
        }
    }

    public void wyglad()
    {
        // ustawianie obrazków
        if( stanKota == W_PRAWO_1 ) setImage("cat-walk-right.png");
        if( stanKota == W_PRAWO_2 ) setImage("cat-walk-right2.png");        
        if( stanKota == W_LEWO_1 )  setImage("cat-walk-left.png");
        if( stanKota == W_LEWO_2 )  setImage("cat-walk-left2.png");        
        if( stanKota == SIEDZACY )  setImage("cat-sit.png"); 
    }
    
    public void zjadaniePizzy()
    {
        if( isTouching(Pizza.class) )
        {
            removeTouching(Pizza.class);
            punkty++;
            if( punkty %5 == 0 ) tanczyc = true;
        }
    }
    
    public void pokazPunkty()
    {
        getWorld().showText("Punkty: " + punkty, 100, 30 );
    }
    
    public void taniec()
    {
        if( tanczyc )
        {
            tanczyc = false;
            setImage("cat-dance.png");
            Greenfoot.delay( 50 );
            setImage("cat-dance-2.png");
            Greenfoot.delay( 50 );
            setImage("cat-sit.png"); 
        }
    }
    
    public void act() 
    {
        this.wyglad();
        this.klawisze();
        this.zjadaniePizzy();
        pokazPunkty();
        taniec();
    }    
}
