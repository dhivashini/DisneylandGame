import greenfoot.*;

public class HurdleBall  extends Hurdle
{

    public HurdleBall()
    {
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act() 
    {

        setLocationForHurdle();
        move(6);
        up();
        down();
        removeHurdle();
    } 

    public void move(int distance)
    {
        double angle = Math.toRadians( getRotation());   
        int y = (int) Math.round(getY() + Math.cos(angle) * distance);
        int x = (int) Math.round(getX() + Math.sin(angle) * distance);
        setLocation(x, y);
    }

    private void up(){
       
        if(getY()<=48)
        {
            setRotation(0);
        }

    }

    private void down(){

 
        if(getY()==438)
        {
            setRotation(180);
        }

    }


}
