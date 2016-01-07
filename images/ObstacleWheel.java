
public class ObstacleWheel extends Obstacle
{

 
    public ObstacleWheel()
    {
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act()
    {
        //     setLocation(getX()-2,getY());
        // setLocation(getX()-this.speed,getY());
        setLocationForObstacle();
        setRotation(getRotation()+2);
        removeObstacle();

        /*if(getX()==0){
        getWorld().removeObject(this);
        }*/
    }
}
