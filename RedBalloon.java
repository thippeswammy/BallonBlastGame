import greenfoot.*;  

public class RedBalloon extends Actor
{    
    public void act() 
    {        
         move(-2); 
         
         World w = getWorld();
         
        if( isAtEdge() )
        {   
            w.removeObject(this);
            w.addObject(new RedBalloon(),990,Greenfoot.getRandomNumber(600)); 
        }        
    }     
}   
   