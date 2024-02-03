import greenfoot.*;

public class Bullet extends Actor
{     
    static int count;    
    boolean aad =true;
    public void act( )
    {
        move(3);        
      
        Actor a1 = this.getOneIntersectingObject(RedBalloon.class);
        Actor a2 = this.getOneIntersectingObject(BlueBalloon.class);
        
        MyWorld w = (MyWorld) getWorld();
           
        if( isAtEdge() ) 
        {
            w.removeObject(this);
        }
        else if(a1 != null)
        {
            w.removeObject(this); 
            w.removeObject(a1);           
            w.addObject(new RedBalloon(),950,Greenfoot.getRandomNumber(600));  
            w.getScoreBoard().decrement();
            Greenfoot.playSound("BlastSound.wav");
        }
        else if(a2 != null)
        {
            w.removeObject(this);
            w.removeObject(a2);
            w.addObject(new BlueBalloon(),950,Greenfoot.getRandomNumber(600));
            w.getScoreBoard().increment();
            Greenfoot.playSound("BlastSound.wav");
        }
    }    
}