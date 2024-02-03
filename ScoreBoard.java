import greenfoot.*;  

public class ScoreBoard extends Actor
{

    static int score=0; 
    static int score1=0;
    public ScoreBoard( )
    {
        score = 0 ;
        setImage(new GreenfootImage(" Score : "+score,30,Color.GREEN,Color.WHITE));        
    }

    public void act() 
    {
        setImage(new GreenfootImage(" Score : "+score,30,Color.GREEN,Color.WHITE));

    }  

    public void increment( )
    {
        score++;
    }

    public void youwin()
    {
        MyWorld MyWorld = new MyWorld();
        if(score>score1){
            score1=score;
            MyWorld.YyouWin();
            
        }
    }

    public void decrement( )
    {
        score--;
    }
}
