import greenfoot.*;

public class SpeedObserver extends Actor implements SpeedObserverIfc
{
//    protected int globalSpeed =1;
    int speed=-1;
    //SpeedNotifier speedNotifier;
    
    /*public SpeedObserver(SpeedNotifier speedNotifier)
    {
        this.speedNotifier = speedNotifier;
    }*/

   public void updateSpeed(int speed)
    {
       this.speed  = speed;
    }
    
    public void showSpeed(int speed)
    {
        //System.out.println( "Current speed = " + speed );
    }
    
    public void move() {
         
            //System.out.println("X is: "+getX());
            //setLocation(getX()-1,getY());
            
            move(this.speed);
        
    }
}
