import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends SpeedObserver
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void updateSpeed(int speed)
    {
       this.speed  = -speed;
    }
    
    public void act(){
    
    setLocationForObstacle();
    removeObstacle();
    
    }
    
    public void setLocationForObstacle(){
    
        setLocation(getX()+this.speed,getY());
    }
    
    public void removeObstacle(){
    
        if(getX()==0){
        getWorld().removeObject(this);
        }
    }
   
}
