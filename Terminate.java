import greenfoot.*; 

public class Terminate extends Actor
{  
   
    public Terminate( )
    {
        setImage(new GreenfootImage(" Useless fellow ",100,Color.BLACK,Color.WHITE));
        
    }
    public void act()
    {
        ScoreBoard Score =new ScoreBoard();
        Score.youwin();
        Greenfoot.stop();
    }
}
