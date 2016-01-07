import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstacleBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleBrick extends Obstacle
{
    /**
     * Act - do whatever the ObstacleBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x;
    ObstacleBrick(){

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
    //        setLocation(getX()-this.x,getY());
    setLocation(getX()-this.speed,getY());
    }

    private void removeObstacle(){

    if(getX()==0)
    {
    getWorld().removeObject(this);
    }
    }*/
}
