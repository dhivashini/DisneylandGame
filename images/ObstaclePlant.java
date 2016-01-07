import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ObstaclePlant extends Obstacle
{
    int x;
    ObstaclePlant(){
        x=2;
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act() 
    {

        setLocationForObstacle();
        removeObstacle();       
    }    

    /*private void setLocationForObstacle(){
    setLocation(getX()-this.speed,getY());
    }

    private void removeObstacle(){

    if(getX()==0)
    {
    getWorld().removeObject(this);
    }
    }*/
}
