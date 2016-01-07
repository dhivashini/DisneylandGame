
public class HurdleFire extends Hurdle
{

 
    public HurdleFire()
    {
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act()
    {
        setLocationForHurdle();
        setRotation(getRotation()+2);
        removeHurdle();

    }
}
