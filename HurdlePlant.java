import greenfoot.*; 

public class HurdlePlant extends Hurdle
{
    int x;
    HurdlePlant(){
        x=2;
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act() 
    {

        setLocationForHurdle();
        removeHurdle();       
    }    


}
