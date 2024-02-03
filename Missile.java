import greenfoot.*;  

public class Missile extends Actor
{    
    public Missile( )
    {
        Bullet.count = 0;
    }

    public void act() 
    {           
        move( );
        shoot( );   
        terminate( );
    }    

    public void move( )
    {
        if(Greenfoot.isKeyDown("Up"))
            setLocation(getX(),getY()-5);        

        if(Greenfoot.isKeyDown("Down"))
            setLocation(getX(),getY()+5);

        if(Greenfoot.isKeyDown("Right"))
            setLocation(getX()+5,getY());

        if(Greenfoot.isKeyDown("Left"))
            setLocation(getX()-5,getY());
    }    

    boolean add=true;
    public void shoot( )
    {
        if(Greenfoot.isKeyDown("Space") && Bullet.count<300 &&add)
        {              
            getWorld().addObject(new Bullet(),getX()+50,getY());          
            Bullet.count++;  
            add=false;
        } 
        else if(!Greenfoot.isKeyDown("Space")&&Bullet.count<300)
        {
            add=true; 
        }
    } 

    public void terminate( )
    {
        if(isTouching(RedBalloon.class))
            getWorld().addObject(new Terminate(),500,300);        
    }

}