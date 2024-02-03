import greenfoot.*;

public class BlueBalloon extends Actor
{ 
    public void act( )
    {
        move(-2);     
        
        World w = getWorld();
        
        if( isAtEdge( ) )
        {            
            w.removeObject(this);
            w.addObject(new BlueBalloon( ),950,Greenfoot.getRandomNumber(600));
        }
            
    }
}