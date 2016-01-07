import greenfoot.*;  


public class HurdleFence extends Hurdle
{
    

    int x;
    HurdleFence(){
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
