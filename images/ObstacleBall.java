import greenfoot.*;

public class ObstacleBall  extends Obstacle
{

    /**
     * Constructor for objects of class ObstacleBall
     */
    public ObstacleBall()
    {
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act() 
    {

        //         setLocation(getX()-1,getY());
        //setLocation(getX()-this.speed,getY());
        setLocationForObstacle();
        move(6);
        up();
        down();
        removeObstacle();
    } 

    public void move(int distance)
    {
        double angle = Math.toRadians( getRotation());   
        int y = (int) Math.round(getY() + Math.cos(angle) * distance);
        int x = (int) Math.round(getX() + Math.sin(angle) * distance);
        setLocation(x, y);
    }

    private void up(){
        //System.out.println("Y for ball: "+getY());
        if(getY()<=48)
        {
            setRotation(0);
        }

    }

    private void down(){

        //System.out.println("Y for ball: "+getY());
        if(getY()==438)
        {
            setRotation(180);
        }

    }

/*    private void removeObstacle(){

        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }
*/
}
