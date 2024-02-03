import greenfoot.*; 

public class MyWorld extends World
{
    
    ScoreBoard sb = new ScoreBoard( );
   
    public MyWorld()
    {  
        super(1000, 600, 1); 
        prepare();
    }

  
    private void prepare( )
    {

        Missile m1 = new Missile( );
        addObject(m1,100,300);

        RedBalloon rb1 = new RedBalloon();
        addObject(rb1,520,300);
        
        RedBalloon rb2 = new RedBalloon();
        addObject(rb2,770,130);
        
        RedBalloon rb3 = new RedBalloon();
        addObject(rb3,770,430);
        
        BlueBalloon bb1 = new BlueBalloon();
        addObject(bb1,770,290);
        
        BlueBalloon bb2 = new BlueBalloon();
        addObject(bb2,640,210);
        
        BlueBalloon bb3 = new BlueBalloon();
        addObject(bb3,650,370);
        
        BlueBalloon bb4 = new BlueBalloon();
        addObject(bb4,950,220);
        
        BlueBalloon bb5 = new BlueBalloon();
        addObject(bb5,950,370);      
        
        addObject(sb,900,570);
    }
     int b;
    public void YyouWin()
    {
           
           addObject(new YouWin(),300,300);
           Greenfoot.stop();
    }
    public ScoreBoard getScoreBoard( )
    {
        return sb;
    }
}
