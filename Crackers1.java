import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crackers1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crackers1 extends SpeedObserver
{
    //CloudSpeedObserver cloudSpeedObserver;
    int speed =1;
    public void act() 
    {
        moveCrackers1();
        if(getX()==getWorld().getWidth()-1)
        {
            setLocation(0,100);

        } 
        
    } 
    
    /*public Crackers1(CloudSpeedObserver cloudSpeedObserver)
    {
        this.cloudSpeedObserver = cloudSpeedObserver;
    }*/
    
    /*public Crackers1(SpeedNotifier speedNotifier)
    {
        super(speedNotifier);
    }*/
   
    public void updateSpeed(int speed)
    {
       this.speed = speed;
       showSpeed(this.speed);
    }
    
   private void moveCrackers1()
   {
       setRotation(0);
       move(speed);
   }
}
