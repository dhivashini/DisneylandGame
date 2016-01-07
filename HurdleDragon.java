import greenfoot.*;  


public class HurdleDragon extends Hurdle
{
    
    int x;
    HurdleDragon(){

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
